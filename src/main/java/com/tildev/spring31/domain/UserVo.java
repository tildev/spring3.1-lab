package com.tildev.spring31.domain;

/**
 * @author tildev
 * @date 2019. 7. 28.
 */
public class UserVo {

	private String userId;

	private String userName;

	private String userPassword;

	public UserVo() {
		super();
	}

	public UserVo(String userId, String userName, String userPassword) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	@Override
	public String toString() {
		return "UserVo [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword + "]";
	}

}
