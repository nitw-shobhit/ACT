package com.act.model.service.impl;

import com.act.core.beans.UserBean;
import com.act.model.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public UserBean validateLogin(UserBean userBean) {
		userBean.setUserId("A10001");
		userBean.setUserEmail("abc@gmail.com");
		userBean.setUserType("Power");
		userBean.setUserPhone("982972099");
		userBean.setUserName("Shobhit Tyagi");
		return userBean;
	}

}
