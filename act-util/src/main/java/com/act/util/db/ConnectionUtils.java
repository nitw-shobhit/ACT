package com.act.util.db;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.act.util.dbserver.impl.DatabaseType;

public class ConnectionUtils {

	public static Connection getConnection(String url, String user, String password, DatabaseType type) throws SQLException {
		DriverManager.registerDriver(getDriver(type));
		return DriverManager.getConnection(url, user, password);
	}

	private static Driver getDriver(DatabaseType type) throws SQLException {
		if(type.equals(DatabaseType.MySQL)) {
			return new com.mysql.jdbc.Driver();
		}
		return null;
	}
	
	public static String getUrl(DatabaseType type, String host, long port, String dbName) {
		if(type.equals(DatabaseType.MySQL)) {
			StringBuffer url = new StringBuffer("jdbc:mysql://").append(host).append(":").append(port).append("/").append(dbName);
			return url.toString();
		}
		return null;
	}
}

