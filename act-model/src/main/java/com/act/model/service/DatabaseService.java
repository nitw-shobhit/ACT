package com.act.model.service;

import java.util.List;

import com.act.core.beans.DatabaseBean;
import com.act.util.exceptions.DatabaseFactoryException;
import com.act.util.exceptions.DatabaseOperationException;
import com.act.util.exceptions.ServerOperationException;

public interface DatabaseService {

	List<DatabaseBean> getAllDbServers();

	void startDbServer(DatabaseBean dbBean) throws DatabaseFactoryException, ServerOperationException;

	void stopDbServer(DatabaseBean dbBean) throws DatabaseFactoryException, ServerOperationException;

	List<String> getDbTables(DatabaseBean dbBean) throws DatabaseOperationException;
}
