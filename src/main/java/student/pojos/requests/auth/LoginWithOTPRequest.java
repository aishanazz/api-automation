package student.pojos.requests.auth;

import com.google.gson.annotations.SerializedName;

public class LoginWithOTPRequest {

    @SerializedName("phone")
    String phone;

    @SerializedName("country_code")
    String countryCode;

    @SerializedName("otp")
    String otp;

    @SerializedName("referred_by")
    String referredBy;

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

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

    public String getReferredBy() {
        return referredBy;
    }

    public void setReferredBy(String referredBy) {
        this.referredBy = referredBy;
    }
}
