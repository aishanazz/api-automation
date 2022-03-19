package student.pojos.responses.auth;

import com.google.gson.annotations.SerializedName;

public class LoginResponse{

	@SerializedName("data")
	private Data data;

	@SerializedName("success")
	private boolean success;

	@SerializedName("message")
	private String message;

	public void setData(Data data){
		this.data = data;
	}

	public Data getData(){
		return data;
	}

	public void setSuccess(boolean success){
		this.success = success;
	}

	public boolean isSuccess(){
		return success;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

}

class Data{

	@SerializedName("completion_percentage")
	private int completionPercentage;

	@SerializedName("basic_profile_complete")
	private boolean basicProfileComplete;

	@SerializedName("new_user")
	private boolean newUser;

	@SerializedName("auth_token")
	private String authToken;

	public void setCompletionPercentage(int completionPercentage){
		this.completionPercentage = completionPercentage;
	}

	public int getCompletionPercentage(){
		return completionPercentage;
	}

	public void setBasicProfileComplete(boolean basicProfileComplete){
		this.basicProfileComplete = basicProfileComplete;
	}

	public boolean isBasicProfileComplete(){
		return basicProfileComplete;
	}

	public void setNewUser(boolean newUser){
		this.newUser = newUser;
	}

	public boolean isNewUser(){
		return newUser;
	}

	public void setAuthToken(String authToken){
		this.authToken = authToken;
	}

	public String getAuthToken(){
		return authToken;
	}
}