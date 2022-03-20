package tests.student.auth;

import actions.APIActions;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import student.enpoints.StudentAPIConstants;
import student.payload.auth.StudentAuthPayloads;
import student.pojos.requests.auth.GenerateOTPRequest;
import student.utils.GsonUtils;
import tests.student.BaseStudentTest;

public class StudentAuthTest extends BaseStudentTest {

    @Test()
    public void testGenerateOTP() {
        GenerateOTPRequest payload = StudentAuthPayloads.getOtpGenerateRequestPayload(0);

        Response response = RestAssured
                .given()
                .spec(repoSpec)
                .when()
                .body(GsonUtils.gson.toJson(payload))
                .post(StudentAPIConstants.GENERATE_OTP)
                .then()
                .log().all().extract().response();

        // Status Code validation
        int statusCode = response.getStatusCode();
        assertActions.verifyResponseBody(statusCode, 200, "Status code should be 200");

        // Success boolean validation in response
        boolean success = APIActions.getDataFromJsonPath(response, "success");
        assertActions.verifyResponseBody(success, true, "Response should give success = true");
    }
}
