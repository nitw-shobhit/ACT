package com.act.web.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.act.core.beans.UserBean;
import com.act.model.service.UserService;
import com.act.util.exceptions.InternalApplicationException;
import com.act.util.spring.JsonUtils;
import com.google.gson.Gson;

@Controller
@RequestMapping("/actUser")
public class UserController {
	
	@Resource
	private UserService userService;
	
	@RequestMapping(method = RequestMethod.POST, value="/updateUserProfile")
	public String updateUserProfile(@RequestParam("userBean") String jsonObj) throws InternalApplicationException {
		UserBean userBean = null;
		try {
			userBean = (UserBean) JsonUtils.toPojo(jsonObj, UserBean.class);
			userService.updateUserProfile(userBean);
		} catch(Exception e) {
			throw new InternalApplicationException("Something went wrong with the application", e);
		}
		return new Gson().toJson(userBean);
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
