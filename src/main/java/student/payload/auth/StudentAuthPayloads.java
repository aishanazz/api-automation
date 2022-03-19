package student.payload.auth;

import com.google.gson.Gson;
import student.enpoints.StudentAPIConstants;
import student.pojos.requests.auth.GenerateOTPRequest;
import student.pojos.requests.auth.LoginWithEmailRequest;
import student.pojos.requests.auth.LoginWithOTPRequest;
import student.utils.data.generator.DummyDataGenerator;


public class StudentAuthPayloads {

    public static DummyDataGenerator randomDataGenerator = DummyDataGenerator.getInstance();

    // ============================> Start of Auth test payloads <==========================
    public static GenerateOTPRequest getOtpGenerateRequestPayload(int attemptsCount) {
        GenerateOTPRequest generateOTPRequest = new GenerateOTPRequest();
        generateOTPRequest.setPhone(randomDataGenerator.getRandomPhoneNumber(10));
        generateOTPRequest.setCountryCode(randomDataGenerator.getCountryCode());
        generateOTPRequest.setAttemptCount(attemptsCount);
        return generateOTPRequest;
    }

    public static LoginWithOTPRequest getLoginWithOtpRequestPayload(String phoneNUmber, String countryCode, String referredBy) {
        LoginWithOTPRequest loginWithOTPRequest = new LoginWithOTPRequest();
        loginWithOTPRequest.setPhone(phoneNUmber);
        loginWithOTPRequest.setCountryCode(countryCode);
        loginWithOTPRequest.setOtp(randomDataGenerator.getRandomMobileOtp(StudentAPIConstants.OTP_LENGTH));
        loginWithOTPRequest.setReferredBy(referredBy);
        return loginWithOTPRequest;
    }

    public static LoginWithEmailRequest getLoginWithEmailRequestPayload(String referredBy) {
        LoginWithEmailRequest loginWithEmailRequest = new LoginWithEmailRequest();
        loginWithEmailRequest.setEmail(randomDataGenerator.getRandomEmail());
        loginWithEmailRequest.setGoogleIdToken(randomDataGenerator.getGoogleIdToken());
        loginWithEmailRequest.setReferredBy(referredBy);
        return loginWithEmailRequest;
    }

    // ============================> End of Auth test payloads <==========================

}
