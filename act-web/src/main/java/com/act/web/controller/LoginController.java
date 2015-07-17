package com.act.web.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.act.core.beans.UserBean;
import com.act.model.service.UserService;
import com.act.util.exceptions.LoginValidationFailedException;

@Controller
@RequestMapping("/actLogin")
@SessionAttributes("UserBean")
public class LoginController {
	
	@Resource
	private UserService userService;
	
	@RequestMapping(method = RequestMethod.POST, value="/validateLogin")
	public ModelAndView validateLogin(@ModelAttribute("userBean")UserBean userBean) throws LoginValidationFailedException {
		UserBean userBeanRet = userService.validateLogin(userBean);
		if(userBeanRet == null) {
			throw new LoginValidationFailedException("Invalid Details");
		}
		ModelAndView mav = new ModelAndView("dashboard");
		mav.addObject("UserBean", userBean);
		return mav;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
