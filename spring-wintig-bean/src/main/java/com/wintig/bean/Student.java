package com.wintig.bean;

import com.wintig.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
public class Student {

	private String userName = "wintig";

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "Student{" +
				"userName='" + userName + '\'' +
				'}';
	}
}
