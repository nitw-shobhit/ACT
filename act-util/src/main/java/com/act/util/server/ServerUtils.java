package com.act.util.server;

import com.act.util.exceptions.ServerOperationException;


public interface ServerUtils {

	void startServer(String path) throws ServerOperationException;
	
	void stopServer(String path) throws ServerOperationException;
}
