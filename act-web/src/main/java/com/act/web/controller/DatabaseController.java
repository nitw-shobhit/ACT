package com.act.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.act.core.beans.DatabaseBean;
import com.act.model.service.DatabaseService;
import com.google.gson.Gson;

@Controller
@RequestMapping("/actDb")
public class DatabaseController {
	
	@Resource
	private DatabaseService databaseService;
	
	@RequestMapping(method = RequestMethod.GET, value="/getAllDbServers")
	public @ResponseBody String getAllServers() {
		List<DatabaseBean> servers = databaseService.getAllDbServers();
		return new Gson().toJson(servers);
	}

	public DatabaseService getDatabaseService() {
		return databaseService;
	}

	public void setDatabaseService(DatabaseService databaseService) {
		this.databaseService = databaseService;
	}
}
