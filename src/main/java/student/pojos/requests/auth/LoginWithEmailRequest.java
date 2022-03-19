package student.pojos.requests.auth;

import com.google.gson.annotations.SerializedName;

public class LoginWithEmailRequest {

    @SerializedName("referred_by")
    String referredBy;

    @SerializedName("email")
    String email;

    @SerializedName("google_id_tk")
    String googleIdToken;

    public String getReferredBy() {
        return referredBy;
    }

    public void setReferredBy(String referredBy) {
        this.referredBy = referredBy;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGoogleIdToken() {
        return googleIdToken;
    }

    public void setGoogleIdToken(String googleIdToken) {
        this.googleIdToken = googleIdToken;
    }
}
