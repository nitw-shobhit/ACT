package com.act.util.server;

public enum ServerType {
	
	TOMCAT("Tomcat"), JBOSS("Jboss"), WILDFLY("Wildfly"), GLASSFISH("Glassfish"), WEBSPHERE("Websphere");
	
	private String value;
	
	private ServerType(String value) {
		this.value = value;
	}
	
	public String value() {
		return this.value;
	}
}
