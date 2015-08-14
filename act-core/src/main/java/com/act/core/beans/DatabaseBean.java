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
	private String dbUrl;
	@DtoField
	private String dbPath;
	@DtoField
	private DatabaseType dbType;
	@DtoField
	private String dbStatus;
	@DtoField
	private String dbDescription;
	
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
}
