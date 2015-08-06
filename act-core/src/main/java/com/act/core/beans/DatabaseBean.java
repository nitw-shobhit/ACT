package com.act.core.beans;

import java.io.Serializable;

import com.act.util.dbserver.impl.DatabaseType;
import com.inspiresoftware.lib.dto.geda.annotations.Dto;
import com.inspiresoftware.lib.dto.geda.annotations.DtoField;

@Dto
public class DatabaseBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2986278542133236167L;
	@DtoField
	private Long id;
	@DtoField
	private String dbName;
	@DtoField
	private String dbUrl;
	@DtoField
	private String dbUserName;
	@DtoField
	private String dbPassword;
	@DtoField
	private DatabaseType dbType;
	@DtoField
	private String dbStatus;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDbName() {
		return dbName;
	}
	public void setDbName(String dbName) {
		this.dbName = dbName;
	}
	public String getDbUrl() {
		return dbUrl;
	}
	public void setDbUrl(String dbUrl) {
		this.dbUrl = dbUrl;
	}
	public String getDbUserName() {
		return dbUserName;
	}
	public void setDbUserName(String dbUserName) {
		this.dbUserName = dbUserName;
	}
	public String getDbPassword() {
		return dbPassword;
	}
	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
	}
	public DatabaseType getDbType() {
		return dbType;
	}
	public void setDbType(DatabaseType dbType) {
		this.dbType = dbType;
	}
	public String getDbStatus() {
		return dbStatus;
	}
	public void setDbStatus(String dbStatus) {
		this.dbStatus = dbStatus;
	}
}
