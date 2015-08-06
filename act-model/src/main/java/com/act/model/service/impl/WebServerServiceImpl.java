package com.act.model.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.act.core.beans.WebServerBean;
import com.act.model.service.WebServerService;
import com.act.util.exceptions.ServerFactoryException;
import com.act.util.exceptions.ServerOperationException;
import com.act.util.server.ServerUtils;
import com.act.util.webserver.impl.WebServerFactory;
import com.act.util.webserver.impl.WebServerType;

public class WebServerServiceImpl implements WebServerService {

	@Override
	public List<WebServerBean> getAllServers() {
		List<WebServerBean> servers = new ArrayList<WebServerBean>();
		WebServerBean server = new WebServerBean();
		server.setId((long) 1);
		server.setServerLocation("D:/Work/apache-tomcat-7.0.61/");
		server.setServerName("QA");
		server.setServerStatus("Stopped");
		server.setServerHost("127.0.0.1");
		server.setServerType(WebServerType.Tomcat);
		server.setServerVersion("7.0");
		server.setServerDescription("This server runs in the QA environment. Set up to fulfil all requirements of Quality Assurance.");
		servers.add(server);
		server = new WebServerBean();
		server.setId((long) 2);
		server.setServerLocation("C:/Program Files/Wildfly/");
		server.setServerName("SIT");
		server.setServerStatus("Running");
		server.setServerHost("192.168.0.3");
		server.setServerType(WebServerType.Wildfly);
		server.setServerVersion("8.0");
		server.setServerDescription("This server runs in the SIT environment. Set up to fulfil all requirements of System Integration Testing.");
		servers.add(server);
		server = new WebServerBean();
		server.setId((long) 3);
		server.setServerLocation("C:/Program Files/IBM/Websphere/");
		server.setServerName("Production");
		server.setServerStatus("Stopped");
		server.setServerHost("192.168.0.4");
		server.setServerType(WebServerType.Websphere);
		server.setServerVersion("8.5");
		server.setServerDescription("This server runs in the Production environment. Set up to fulfil all requirements of the Production environment.");
		servers.add(server);
		server = new WebServerBean();
		server.setId((long) 4);
		server.setServerLocation("D:/Servers/Glassfish/");
		server.setServerName("Sandbox");
		server.setServerStatus("Stopped");
		server.setServerHost("127.0.0.1");
		server.setServerType(WebServerType.Glassfish);
		server.setServerVersion("8.0");
		server.setServerDescription("This server runs in the Sandbox environment.");
		servers.add(server);
		return servers;
	}

	@Override
	public void startServer(WebServerBean serverBean) throws ServerFactoryException, ServerOperationException {
		ServerUtils utils = WebServerFactory.buildFactory(serverBean.getServerType());
		utils.startServer(serverBean.getServerLocation());
	}

}
