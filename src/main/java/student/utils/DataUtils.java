package student.utils;

import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DataUtils {

    public String filePath;

    public DataUtils(String filePath) {
        this.filePath = filePath;
    }

    private static final Logger Log = LogManager.getLogger(DataUtils.class.getName());

    public String getTestData(String sheetName, String id, String field) {
        String value = null;
        try {

            Fillo fillo = new Fillo();
            Log.info("Fillo filepath is:" + filePath);
            Connection connection = fillo.getConnection(filePath);
            String strQuery = "Select * from " + sheetName + " " + "where ID='" + id + "'";
            Recordset recordset;

            recordset = connection.executeQuery(strQuery);

            while (recordset.next()) {
                value = recordset.getField(field);
            }

            recordset.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
            Log.error("unable to read data from file");
        }
        return value;
    }

    public void insertData(String sheetName, String columnName, String value) {
        try {
            Fillo fillo = new Fillo();
            Connection connection = fillo.getConnection(filePath);
            String strQuery = "INSERT INTO " + sheetName + "(" + columnName + ") VALUES('" + value + "')";
            Log.info("Insert Data Query is" + strQuery);
            connection.executeUpdate(strQuery);

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
            Log.error("unable to insert data in file");
        }
    }


    // Test Data file instance for student api.
    public static DataUtils student() {
        String studentDatafilePath = System.getProperty("user.dir") + "/resources/student/" + "StudentTestData.xlsx";
        return new DataUtils(studentDatafilePath);
    }
}
