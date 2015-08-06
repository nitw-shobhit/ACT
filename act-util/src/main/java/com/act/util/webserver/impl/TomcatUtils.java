package com.act.util.webserver.impl;

import org.apache.catalina.startup.Bootstrap;

import com.act.util.exceptions.ServerOperationException;
import com.act.util.server.ServerUtils;

public class TomcatUtils implements ServerUtils {

	@Override
	public void startServer(String path) throws ServerOperationException {
		Bootstrap bootstrap=new Bootstrap();
		bootstrap.setCatalinaHome(path);
		try {
			bootstrap.start();
		} catch (Exception e) {
			throw new ServerOperationException("Web Server startup failed!!", e);
		}
	}

	@Override
	public void stopServer(String path) throws ServerOperationException {
		Bootstrap bootstrap=new Bootstrap();
		bootstrap.setCatalinaHome(path);
		try {
			bootstrap.stop();
		} catch (Exception e) {
			throw new ServerOperationException("Web Server shutdown failed!!", e);
		}
	}

}
