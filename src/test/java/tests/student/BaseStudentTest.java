package tests.student;

import base.BaseTest;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;
import student.enpoints.StudentAPIConstants;
import student.payload.auth.StudentAuthPayloads;

public class BaseStudentTest extends BaseTest {

    protected RequestSpecification repoSpec;
    protected StudentAuthPayloads requestPayload = new StudentAuthPayloads();

    @BeforeClass
    protected void setUpConfiguration() {
        repoSpec = new RequestSpecBuilder().setBaseUri(StudentAPIConstants.BASE_URL)
                .setAccept("application/json")
                .setContentType("application/json").build().log().all();
    }

}
