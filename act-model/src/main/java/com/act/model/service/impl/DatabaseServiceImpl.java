package com.act.model.service.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.act.core.beans.DatabaseBean;
import com.act.model.service.DatabaseService;
import com.act.util.db.ConnectionUtils;
import com.act.util.db.JdbcUtils;
import com.act.util.dbserver.impl.DatabaseFactory;
import com.act.util.dbserver.impl.DatabaseType;
import com.act.util.exceptions.DatabaseFactoryException;
import com.act.util.exceptions.DatabaseOperationException;
import com.act.util.exceptions.ServerOperationException;
import com.act.util.server.ServerUtils;

public class DatabaseServiceImpl implements DatabaseService {

	@Override
	public List<DatabaseBean> getAllDbServers() {
		List<DatabaseBean> returnList = new ArrayList<DatabaseBean>();
		DatabaseBean bean = new DatabaseBean();
		bean.setDbDescription("This database server runs in the Production environment. Set up to fulfil all requirements of Production.");
		bean.setDbDisplayName("Production");
		bean.setDbName("test");
		bean.setDbStatus("Running");
		bean.setDbType(DatabaseType.MySQL);
		bean.setId((long)1);
		bean.setDbPath("F:/Work/mysql-5.5.44-winx64/");
		bean.setDbUserName("bpsAdmin");
		bean.setDbPassword("bpsAdmin");
		bean.setDbHost("localhost");
		bean.setDbPort(3306);
		returnList.add(bean);
		bean = new DatabaseBean();
		bean.setDbDescription("This database server runs in the Development environment. Set up to fulfil all requirements of Development.");
		bean.setDbName("");
		bean.setDbDisplayName("Development");
		bean.setDbStatus("Stopped");
		bean.setDbType(DatabaseType.PostgreSQL);
		bean.setId((long)2);
		bean.setDbPath("C:/Program Files/PostgreSQL/9.4/");
		returnList.add(bean);
		return returnList;
	}

	@Override
	public void startDbServer(DatabaseBean dbBean) throws DatabaseFactoryException, ServerOperationException {
		ServerUtils utils = DatabaseFactory.buildFactory(dbBean.getDbType());
		utils.startServer(dbBean.getDbPath());
	}

	@Override
	public void stopDbServer(DatabaseBean dbBean)
			throws DatabaseFactoryException, ServerOperationException {
		ServerUtils utils = DatabaseFactory.buildFactory(dbBean.getDbType());
		utils.stopServer(dbBean.getDbPath());
	}

	@Override
	public List<String> getDbTables(DatabaseBean dbBean) throws DatabaseOperationException {
		List<String> tables = new ArrayList<String>();
		try {
			String url = ConnectionUtils.getUrl(dbBean.getDbType(), dbBean.getDbHost(), dbBean.getDbPort(), dbBean.getDbName());
			ResultSet rs = JdbcUtils.getTables(url, dbBean.getDbUserName(), dbBean.getDbPassword(), dbBean.getDbType());
			while(rs.next()) {
				tables.add(rs.getString("TABLE_NAME"));
			}
		} catch (SQLException e) {
			throw new DatabaseOperationException("Db fetch tables failed!", e);
		}
		
		return tables;
	}
	
}
