package com.act.util.server;

import com.act.util.exceptions.ServerFactoryException;

public class ServerFactory {
	
	public static ServerUtils buildFactory(ServerType serverType) throws ServerFactoryException {
		if(ServerType.TOMCAT.value().equals(serverType.value())) {
			return new TomcatUtils();
		} else if(ServerType.JBOSS.value().equals(serverType.value())) {
			return new JbossUtils();
		} else if(ServerType.WEBSPHERE.value().equals(serverType.value())) {
			return new WebsphereUtils();
		} else if(ServerType.GLASSFISH.value().equals(serverType.value())) {
			return new GlassfishUtils();
		}
		throw new ServerFactoryException("Server adaptor missing for type "+ serverType.value());
	}
}
