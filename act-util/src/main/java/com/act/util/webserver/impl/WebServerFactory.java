package com.act.util.webserver.impl;

import com.act.util.exceptions.ServerFactoryException;
import com.act.util.server.ServerUtils;

public class WebServerFactory {
	
	public static ServerUtils buildFactory(WebServerType serverType) throws ServerFactoryException {
		if(WebServerType.Tomcat.equals(serverType)) {
			return new TomcatUtils();
		} else if(WebServerType.Jboss.equals(serverType) || WebServerType.Wildfly.equals(serverType)) {
			return new JbossUtils();
		} else if(WebServerType.Websphere.equals(serverType)) {
			return new WebsphereUtils();
		} else if(WebServerType.Glassfish.equals(serverType)) {
			return new GlassfishUtils();
		}
		throw new ServerFactoryException("Server adapter missing for type "+ serverType);
	}
}
