package com.act.model.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.act.core.beans.ServerBean;
import com.act.model.service.ServerService;

public class ServerServiceImpl implements ServerService {

	@Override
	public List<ServerBean> getAllServers() {
		List<ServerBean> servers = new ArrayList<ServerBean>();
		ServerBean server = new ServerBean();
		server.setServerLocation("[192.168.0.1]#C:/Program Files/Apache Tomcat/");
		server.setServerName("Tomcat QA Server");
		server.setServerStatus("Running");
		servers.add(server);
		server = new ServerBean();
		server.setServerLocation("[192.168.0.3]#C:/Program Files/Wildfly/");
		server.setServerName("SIT Server");
		server.setServerStatus("Running");
		servers.add(server);
		server = new ServerBean();
		server.setServerLocation("[192.168.0.4]#C:/Program Files/IBM/Websphere/");
		server.setServerName("Production Server");
		server.setServerStatus("Stopped");
		servers.add(server);
		server = new ServerBean();
		server.setServerLocation("[127.0.0.1]#D:/Servers/Glassfish/");
		server.setServerName("Sandbox");
		server.setServerStatus("Running");
		servers.add(server);
		return servers;
	}

}
