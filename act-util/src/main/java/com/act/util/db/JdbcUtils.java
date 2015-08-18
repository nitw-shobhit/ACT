package com.act.util.db;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.act.util.dbserver.impl.DatabaseType;

public class JdbcUtils {

	public static ResultSet getTables(String url, String user, String password, DatabaseType type) throws SQLException {
		Connection connection = null;
		ResultSet rs = null;
		try {
			connection = ConnectionUtils.getConnection(url, user, password, type);
			DatabaseMetaData metaData = connection.getMetaData();
			rs = metaData.getTables(null, null, "%", null);
		} finally {
			if(connection != null) {
				connection.close();
			}
		}
		return rs;
	}
}
