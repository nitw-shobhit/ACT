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
		server.setId((long) 1);
		server.setServerLocation("D:/Work/apache-tomcat-7.0.61/");
		server.setServerName("Tomcat QA Server");
		server.setServerStatus("Stopped");
		server.setServerHost("127.0.0.1");
		servers.add(server);
		server = new ServerBean();
		server.setId((long) 2);
		server.setServerLocation("C:/Program Files/Wildfly/");
		server.setServerName("SIT Server");
		server.setServerStatus("Running");
		server.setServerHost("192.168.0.3");
		servers.add(server);
		server = new ServerBean();
		server.setId((long) 3);
		server.setServerLocation("C:/Program Files/IBM/Websphere/");
		server.setServerName("Production Server");
		server.setServerStatus("Stopped");
		server.setServerHost("192.168.0.4");
		servers.add(server);
		server = new ServerBean();
		server.setId((long) 4);
		server.setServerLocation("D:/Servers/Glassfish/");
		server.setServerName("Sandbox");
		server.setServerStatus("Running");
		server.setServerHost("127.0.0.1");
		servers.add(server);
		return servers;
	}

}
