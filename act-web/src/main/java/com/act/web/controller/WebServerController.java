package com.act.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.act.core.beans.WebServerBean;
import com.act.model.service.WebServerService;
import com.act.util.exceptions.InternalApplicationException;
import com.act.util.spring.JsonUtils;
import com.google.gson.Gson;

@Controller
@RequestMapping("/actServer")
public class WebServerController {
	
	@Resource
	private WebServerService webServerService;
	
	@RequestMapping(method = RequestMethod.GET, value="/getAllServers")
	public @ResponseBody String getAllServers() {
		List<WebServerBean> servers = webServerService.getAllServers();
		return new Gson().toJson(servers);
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/startServer")
	public @ResponseBody String startServer(@RequestParam("serverBean") String jsonObj) throws InternalApplicationException {
		WebServerBean serverBean;
		try {
			serverBean = (WebServerBean) JsonUtils.toPojo(jsonObj, WebServerBean.class);
			webServerService.startServer(serverBean);
		} catch (Exception e) {
			throw new InternalApplicationException("Something went wrong with the application", e);
		}
		return null;
	}

	public WebServerService getWebServerService() {
		return webServerService;
	}

	public void setWebServerService(WebServerService webServerService) {
		this.webServerService = webServerService;
	}
}
