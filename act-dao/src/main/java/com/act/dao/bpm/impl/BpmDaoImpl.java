package com.act.dao.bpm.impl;

import java.util.List;
import java.util.Map;

import org.kie.api.task.model.Task;

import com.act.dao.bpm.BpmDao;

public class BpmDaoImpl implements BpmDao {

	@Override
	public String startProcess(String processId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cancelProcess(long processInstanceId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void startTask(long taskId, String userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stopTask(long taskId, String userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void completeTask(long taskId, String userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reassignTask(long taskId, String userId, String newUserId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Task> getTaskList(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, String> getProcessStatusGraphical(long processInstanceId) {
		// TODO Auto-generated method stub
		return null;
	}
}
