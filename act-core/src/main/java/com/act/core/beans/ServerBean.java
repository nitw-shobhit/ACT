package com.act.core.beans;

import java.io.Serializable;

import com.act.util.server.ServerType;
import com.inspiresoftware.lib.dto.geda.annotations.Dto;
import com.inspiresoftware.lib.dto.geda.annotations.DtoField;

@Dto
public class ServerBean implements Serializable {

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
	private ServerType serverType;
	@DtoField
	private String serverVersion;
	
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
	public ServerType getServerType() {
		return serverType;
	}
	public void setServerType(ServerType serverType) {
		this.serverType = serverType;
	}
	public String getServerVersion() {
		return serverVersion;
	}
	public void setServerVersion(String serverVersion) {
		this.serverVersion = serverVersion;
	}
}
