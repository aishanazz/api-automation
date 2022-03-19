package student.pojos.requests.auth;

import com.google.gson.annotations.SerializedName;

public class GenerateOTPRequest {

    @SerializedName("phone")
    String phone;

    @SerializedName("country_code")
    String countryCode;

    @SerializedName("attempt_count")
    int attemptCount;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public int getAttemptCount() {
        return attemptCount;
    }

    public void setAttemptCount(int attemptCount) {
        this.attemptCount = attemptCount;
    }

}
