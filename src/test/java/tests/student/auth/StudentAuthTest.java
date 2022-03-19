package tests.student.auth;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;
import student.StudentDDTConstants;
import student.enpoints.StudentAPIConstants;
import student.payload.auth.StudentAuthPayloads;
import student.utils.DataUtils;
import student.utils.GsonUtils;
import tests.student.BaseStudentTest;

public class StudentAuthTest extends BaseStudentTest {

    @Test()
    public void testGenerateOTP() {
        Response response = RestAssured
                .given()
                .spec(repoSpec)
                .when()
                .body(GsonUtils.gson.toJson(StudentAuthPayloads.getOtpGenerateRequestPayload(0)))
                .post(StudentAPIConstants.GENERATE_OTP);

        assertActions.verifyStatusCode(response);
    }
}
