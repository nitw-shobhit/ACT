package com.act.util.server;

import org.apache.catalina.startup.Bootstrap;

public class TomcatUtils implements ServerUtils {

	@Override
	public void startServer() throws Exception {
		Bootstrap bootstrap=new Bootstrap();
		bootstrap.setCatalinaHome("D:/apache-tomcat-5.5.28");
		bootstrap.start();
	}

	@Override
	public void stopServer() throws Exception {
		Bootstrap bootstrap=new Bootstrap();
		bootstrap.setCatalinaHome("D:/apache-tomcat-5.5.28");
		bootstrap.stop();
	}

}
