package com.liu.demo.entity;

import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	//@GeneratedValue   自动增长
	private String userID;
	private String name;
	private String userPWD;
	
	
	public User() {


	}


	public String getUserID() {
		return userID;
	}


	public void setUserID(String userID) {
		this.userID = userID;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getUserPWD() {
		return userPWD;
	}


	public void setUserPWD(String userPWD) {
		this.userPWD = userPWD;
	}



}
