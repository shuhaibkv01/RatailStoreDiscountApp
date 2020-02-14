package com.xyz.retailstore.model;

public class User {
	
	private int userId;
	
	private UserType userType;
	
	private int joinedYear;
	
	public User(int userId, UserType userType,int joinedYear) {
		this.userId = userId;
		this.userType = userType;
		this.joinedYear = joinedYear;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public int getJoinedYear() {
		return joinedYear;
	}

	public void setJoinedYear(int joinedYear) {
		this.joinedYear = joinedYear;
	}

}
