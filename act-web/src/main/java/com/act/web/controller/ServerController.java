package com.act.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.act.core.beans.ServerBean;
import com.act.model.service.ServerService;
import com.act.util.exceptions.InternalApplicationException;
import com.act.util.spring.CmdUtils;
import com.act.util.spring.JsonUtils;
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
	
	@RequestMapping(method = RequestMethod.POST, value="/startServer")
	public @ResponseBody String startServer(@RequestParam("serverBean") String jsonObj) throws InternalApplicationException {
		ServerBean serverBean;
		try {
			serverBean = (ServerBean) JsonUtils.toPojo(jsonObj, ServerBean.class);
			CmdUtils.executeBatchFile(serverBean.getServerLocation());
		} catch (Exception e) {
			throw new InternalApplicationException("Something went wrong with the application : "+e.getMessage());
		}
		return null;
	}

	public ServerService getServerService() {
		return serverService;
	}

	public void setServerService(ServerService serverService) {
		this.serverService = serverService;
	}
}
