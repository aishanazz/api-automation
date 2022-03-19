package student.enpoints;

import student.StudentDDTConstants;
import student.utils.DataUtils;

public class StudentAPIConstants {

    // Config
    public static String BASE_URL = DataUtils.student().getTestData(StudentDDTConstants.config, StudentDDTConstants.api_base_url, StudentDDTConstants.value);
    // Common constants
    public static int OTP_LENGTH = 4;
    // Auth Endpoints
    public static String GENERATE_OTP = "v1/auth/generate-otp";
    public static String LOGIN = "v1/auth/login";
    public static String USER_INFO = "v1/users/info";


}
