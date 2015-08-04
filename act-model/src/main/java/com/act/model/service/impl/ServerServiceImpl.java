package com.act.model.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.act.core.beans.ServerBean;
import com.act.model.service.ServerService;
import com.act.util.exceptions.ServerFactoryException;
import com.act.util.exceptions.ServerOperationException;
import com.act.util.server.ServerFactory;
import com.act.util.server.ServerType;
import com.act.util.server.ServerUtils;

public class ServerServiceImpl implements ServerService {

	@Override
	public List<ServerBean> getAllServers() {
		List<ServerBean> servers = new ArrayList<ServerBean>();
		ServerBean server = new ServerBean();
		server.setId((long) 1);
		server.setServerLocation("D:/Work/apache-tomcat-7.0.61/");
		server.setServerName("QA Server");
		server.setServerStatus("Stopped");
		server.setServerHost("127.0.0.1");
		server.setServerType(ServerType.TOMCAT);
		server.setServerVersion("7.0");
		servers.add(server);
		server = new ServerBean();
		server.setId((long) 2);
		server.setServerLocation("C:/Program Files/Wildfly/");
		server.setServerName("SIT Server");
		server.setServerStatus("Running");
		server.setServerHost("192.168.0.3");
		server.setServerType(ServerType.JBOSS);
		server.setServerVersion("8.0");
		servers.add(server);
		server = new ServerBean();
		server.setId((long) 3);
		server.setServerLocation("C:/Program Files/IBM/Websphere/");
		server.setServerName("Production Server");
		server.setServerStatus("Stopped");
		server.setServerHost("192.168.0.4");
		server.setServerType(ServerType.WEBSPHERE);
		server.setServerVersion("8.5");
		servers.add(server);
		server = new ServerBean();
		server.setId((long) 4);
		server.setServerLocation("D:/Servers/Glassfish/");
		server.setServerName("Sandbox");
		server.setServerStatus("Running");
		server.setServerHost("127.0.0.1");
		server.setServerType(ServerType.GLASSFISH);
		server.setServerVersion("8.0");
		servers.add(server);
		return servers;
	}

	@Override
	public void startServer(ServerBean serverBean) throws ServerFactoryException, ServerOperationException {
		ServerUtils utils = ServerFactory.buildFactory(serverBean.getServerType());
		utils.startServer(serverBean.getServerLocation());
	}

}
