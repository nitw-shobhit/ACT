package com.act.model.service;

import java.util.List;

import com.act.core.beans.WebServerBean;

public interface WebServerService {

	List<WebServerBean> getAllServers();
	
	void startServer(WebServerBean serverBean) throws Exception;
}
