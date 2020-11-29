package com.wintig.service.impl;

import com.wintig.service.UserService;
import org.springframework.stereotype.Service;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService {

	@Override
	public String queryUser(String userId) {
		return "查询到记录 ->" + userId;
	}

	@Override
	public String addUserInfo(String userId) {
		System.out.println("用户：" + userId + " 增加成功");
		return "增加了" + userId;
	}
}
