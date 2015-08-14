package com.act.dao.bpm;

import java.util.List;
import java.util.Map;

import org.kie.api.task.model.Task;

public interface BpmDao {

	String startProcess(String processId);
	
	void cancelProcess(long processInstanceId);
	
	void startTask(long taskId, String userId);
	
	void stopTask(long taskId, String userId);
	
	void completeTask(long taskId, String userId);
	
	void reassignTask(long taskId, String userId, String newUserId);
	
	List<Task> getTaskList(String userId);
	
	Map<String, String> getProcessStatusGraphical(long processInstanceId);
	
}
