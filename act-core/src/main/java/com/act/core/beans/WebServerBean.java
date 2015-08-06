package com.act.core.beans;

import java.io.Serializable;

import com.act.util.webserver.impl.WebServerType;
import com.inspiresoftware.lib.dto.geda.annotations.Dto;
import com.inspiresoftware.lib.dto.geda.annotations.DtoField;

@Dto
public class WebServerBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5257170079540540025L;
	@DtoField
	private Long id;
	@DtoField
	private String serverName;
	@DtoField
	private String serverLocation;
	@DtoField
	private String serverStatus;
	@DtoField
	private String serverHost;
	@DtoField
	private WebServerType serverType;
	@DtoField
	private String serverVersion;
	@DtoField
	private String serverDescription;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getServerName() {
		return serverName;
	}
	public void setServerName(String serverName) {
		this.serverName = serverName;
	}
	public String getServerLocation() {
		return serverLocation;
	}
	public void setServerLocation(String serverLocation) {
		this.serverLocation = serverLocation;
	}
	public String getServerStatus() {
		return serverStatus;
	}
	public void setServerStatus(String serverStatus) {
		this.serverStatus = serverStatus;
	}
	public String getServerHost() {
		return serverHost;
	}
	public void setServerHost(String serverHost) {
		this.serverHost = serverHost;
	}
	public WebServerType getServerType() {
		return serverType;
	}
	public void setServerType(WebServerType serverType) {
		this.serverType = serverType;
	}
	public String getServerVersion() {
		return serverVersion;
	}
	public void setServerVersion(String serverVersion) {
		this.serverVersion = serverVersion;
	}
	public String getServerDescription() {
		return serverDescription;
	}
	public void setServerDescription(String serverDescription) {
		this.serverDescription = serverDescription;
	}
}
