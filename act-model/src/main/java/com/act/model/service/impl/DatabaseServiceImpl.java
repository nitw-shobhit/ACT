package com.act.model.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.act.core.beans.DatabaseBean;
import com.act.model.service.DatabaseService;
import com.act.util.dbserver.impl.DatabaseFactory;
import com.act.util.dbserver.impl.DatabaseType;
import com.act.util.exceptions.DatabaseFactoryException;
import com.act.util.exceptions.ServerOperationException;
import com.act.util.server.ServerUtils;

public class DatabaseServiceImpl implements DatabaseService {

	@Override
	public List<DatabaseBean> getAllDbServers() {
		List<DatabaseBean> returnList = new ArrayList<DatabaseBean>();
		DatabaseBean bean = new DatabaseBean();
		bean.setDbDescription("This database server runs in the Production environment. Set up to fulfil all requirements of Production.");
		bean.setDbName("Production");
		bean.setDbStatus("Running");
		bean.setDbType(DatabaseType.MySQL);
		bean.setId((long)1);
		bean.setDbPath("D:/Work/mysql-5.6.24-winx64/");
		returnList.add(bean);
		bean = new DatabaseBean();
		bean.setDbDescription("This database server runs in the Development environment. Set up to fulfil all requirements of Development.");
		bean.setDbName("Development");
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
}
