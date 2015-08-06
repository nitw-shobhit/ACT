package com.act.util.dbserver.impl;

import com.act.util.exceptions.DatabaseFactoryException;
import com.act.util.server.ServerUtils;

public class DatabaseFactory {

	public static ServerUtils buildFactory(DatabaseType dbType) throws DatabaseFactoryException {
		
		if(DatabaseType.MySQL.equals(dbType)) {
			return new MysqlUtils();
		} else if(DatabaseType.Oracle.equals(dbType)) {
			return new OracleUtils();
		} else if(DatabaseType.DB2.equals(dbType)) {
			return new Db2Utils();
		} else if(DatabaseType.HSQL.equals(dbType)) {
			return new HsqlUtils();
		} else if(DatabaseType.PostgreSQL.equals(dbType)) {
			return new PostgresUtils();
		}
		
		throw new DatabaseFactoryException("Database adapter missing for type "+ dbType);
	}
}
