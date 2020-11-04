package com.wintig.service.impl;

import com.wintig.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public String queryUser(String userId) {
		return "查询到记录 ->" + userId;
	}
}
