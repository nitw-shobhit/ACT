package com.act.util.server;

import org.apache.catalina.startup.Bootstrap;

import com.act.util.exceptions.ServerOperationException;

public class TomcatUtils implements ServerUtils {

	@Override
	public void startServer(String path) throws ServerOperationException {
		Bootstrap bootstrap=new Bootstrap();
		bootstrap.setCatalinaHome(path);
		try {
			bootstrap.start();
		} catch (Exception e) {
			throw new ServerOperationException("Server startup failed!!", e);
		}
	}

	@Override
	public void stopServer(String path) throws ServerOperationException {
		Bootstrap bootstrap=new Bootstrap();
		bootstrap.setCatalinaHome(path);
		try {
			bootstrap.stop();
		} catch (Exception e) {
			throw new ServerOperationException("Server shutdown failed!!", e);
		}
	}

}
