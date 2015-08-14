package com.act.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.act.core.beans.UserBean;
import com.act.core.beans.TaskBean;
import com.act.model.service.WorklistService;
import com.google.gson.Gson;

@Controller
@RequestMapping("/actWorklist")
public class WorklistController {
	
	@Resource
	private WorklistService worklistService;
	
	@RequestMapping(method = RequestMethod.GET, value="/getWorklist")
	public @ResponseBody String getWorklist(@ModelAttribute("UserBean") UserBean userBean) {
		List<TaskBean> worklist = worklistService.getWorklist(userBean.getUserId());
		return new Gson().toJson(worklist);
	}
	
	public WorklistService getWorklistService() {
		return worklistService;
	}

	public void setWorklistService(WorklistService worklistService) {
		this.worklistService = worklistService;
	}
}
