package com.wintig.bean;

import org.springframework.stereotype.Component;

@Component
public class Student {

	private String userName = "wintig";

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
