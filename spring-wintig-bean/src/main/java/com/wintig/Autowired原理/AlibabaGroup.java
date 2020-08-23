package com.wintig.Autowired原理;

import org.springframework.beans.factory.annotation.Autowired;

public class AlibabaGroup {

	@Autowired
	private User userWintig;

	public User getUserWintig() {
		return userWintig;
	}

	public void setUserWintig(User userWintig) {
		this.userWintig = userWintig;
	}
}
