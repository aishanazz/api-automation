package student.payload.auth;

import com.google.gson.Gson;
import student.pojos.requests.auth.GenerateOTPRequest;
import student.utils.data.generator.DummyDataGenerator;

public class StudentAuthPayloads {

    protected Gson gson = new Gson();

    protected DummyDataGenerator randomDataGenerator = DummyDataGenerator.getInstance();

    // ============================> Start of Auth test payloads <==========================
    public String getOtpGenerateRequestPayload(int attemptsCount) {
        GenerateOTPRequest generateOTPRequest = new GenerateOTPRequest();
        generateOTPRequest.setPhone(randomDataGenerator.getRandomPhoneNumber(10));
        generateOTPRequest.setCountryCode(randomDataGenerator.getCountryCode());
        generateOTPRequest.setAttemptCount(attemptsCount);
        return gson.toJson(generateOTPRequest);
    }

    // ============================> End of Auth test payloads <==========================

}
