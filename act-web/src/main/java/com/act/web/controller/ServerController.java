package com.act.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.act.core.beans.ServerBean;
import com.act.model.service.ServerService;
import com.google.gson.Gson;

@Controller
@RequestMapping("/actServer")
public class ServerController {
	
	@Resource
	private ServerService serverService;
	
	@RequestMapping(method = RequestMethod.GET, value="/getAllServers")
	public @ResponseBody String getAllServers() {
		List<ServerBean> servers = serverService.getAllServers();
		return new Gson().toJson(servers);
	}

	public ServerService getServerService() {
		return serverService;
	}

	public void setServerService(ServerService serverService) {
		this.serverService = serverService;
	}
}
