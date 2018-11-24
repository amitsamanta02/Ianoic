package org.amit.invman.Ianoic.model;

import org.springframework.stereotype.Component;

@Component
public class UserSignUPDetail {
	
	private String userId;
	private String userPass;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

}
