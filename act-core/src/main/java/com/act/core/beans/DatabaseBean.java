package com.act.core.beans;

import java.io.Serializable;

import com.act.util.converter.BeanEntityConverter;
import com.act.util.dbserver.impl.DatabaseType;
import com.inspiresoftware.lib.dto.geda.annotations.Dto;
import com.inspiresoftware.lib.dto.geda.annotations.DtoField;

@Dto
public class DatabaseBean implements Serializable, BeanEntityConverter<DatabaseBean, Object> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2986278542133236167L;
	@DtoField
	private Long id;
	@DtoField
	private String dbName;
	@DtoField
	private String dbDisplayName;
	@DtoField
	private String dbUserName;
	@DtoField
	private String dbPassword;
	@DtoField
	private String dbPath;
	@DtoField
	private DatabaseType dbType;
	@DtoField
	private String dbStatus;
	@DtoField
	private String dbDescription;
	@DtoField
	private String dbHost;
	@DtoField
	private long dbPort;
	
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
	public String getDbDescription() {
		return dbDescription;
	}
	public void setDbDescription(String dbDescription) {
		this.dbDescription = dbDescription;
	}
	public String getDbPath() {
		return dbPath;
	}
	public void setDbPath(String dbPath) {
		this.dbPath = dbPath;
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
	
	@Override
	public Object convertEntityToBean() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public DatabaseBean convertBeanToEntity() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getDbHost() {
		return dbHost;
	}
	public void setDbHost(String dbHost) {
		this.dbHost = dbHost;
	}
	public long getDbPort() {
		return dbPort;
	}
	public void setDbPort(long dbPort) {
		this.dbPort = dbPort;
	}
	public String getDbDisplayName() {
		return dbDisplayName;
	}
	public void setDbDisplayName(String dbDisplayName) {
		this.dbDisplayName = dbDisplayName;
	}
}
