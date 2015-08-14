package com.act.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.act.core.beans.DatabaseBean;
import com.act.model.service.DatabaseService;
import com.act.util.exceptions.InternalApplicationException;
import com.act.util.spring.JsonUtils;
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

	@RequestMapping(method = RequestMethod.POST, value="/startDbServer")
	public @ResponseBody String startDbServer(@RequestParam("dbServerBean") String jsonObj) throws InternalApplicationException {
		DatabaseBean dbBean;
		try {
			dbBean = (DatabaseBean) JsonUtils.toPojo(jsonObj, DatabaseBean.class);
			databaseService.startDbServer(dbBean);
		} catch (Exception e) {
			throw new InternalApplicationException("Something went wrong with the application", e);
		}
		return null;
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/stopDbServer")
	public @ResponseBody String stopDbServer(@RequestParam("dbServerBean") String jsonObj) throws InternalApplicationException {
		DatabaseBean dbBean;
		try {
			dbBean = (DatabaseBean) JsonUtils.toPojo(jsonObj, DatabaseBean.class);
			databaseService.stopDbServer(dbBean);
		} catch (Exception e) {
			throw new InternalApplicationException("Something went wrong with the application", e);
		}
		return null;
	}
	
	public DatabaseService getDatabaseService() {
		return databaseService;
	}

	public void setDatabaseService(DatabaseService databaseService) {
		this.databaseService = databaseService;
	}
}
