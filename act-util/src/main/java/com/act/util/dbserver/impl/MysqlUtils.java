package com.act.util.dbserver.impl;

import java.io.IOException;

import com.act.util.exceptions.ServerOperationException;
import com.act.util.server.ServerUtils;

public class MysqlUtils implements ServerUtils {
	
	@Override
	public void startServer(String path) throws ServerOperationException {
		try {
			Runtime.getRuntime().exec(path + "bin/mysqld");
		} catch (IOException e) {
			throw new ServerOperationException("DB Server startup failed!!", e);
		}
	}

	@Override
	public void stopServer(String path) throws ServerOperationException {
		try {
			Runtime.getRuntime().exec(path + "bin/mysqladmin -u root -p shutdown");
		} catch (IOException e) {
			throw new ServerOperationException("DB Server shutdown failed!!", e);
		}
	}

}
