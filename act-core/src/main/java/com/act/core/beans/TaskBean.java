package com.act.core.beans;

import java.io.Serializable;
import java.sql.Timestamp;

import org.kie.api.task.model.Task;

import com.act.util.bpm.RequestType;
import com.act.util.bpm.TaskStatus;
import com.act.util.converter.BeanEntityConverter;

public class TaskBean implements Serializable, BeanEntityConverter<Task, TaskBean> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -146084662458229153L;
	
	private long id;
	private long taskProcessInstanceId;
	private String taskName;
	private String taskDescription;
	private String taskUser;
	private TaskStatus taskStatus;
	private RequestType taskRequestType;
	private Timestamp taskAssigned;
	private Timestamp taskStarted;
	private Timestamp taskCompleted;
	private String taskComments;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getTaskProcessInstanceId() {
		return taskProcessInstanceId;
	}

	public void setTaskProcessInstanceId(long taskProcessInstanceId) {
		this.taskProcessInstanceId = taskProcessInstanceId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskDescription() {
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	public String getTaskUser() {
		return taskUser;
	}

	public void setTaskUser(String taskUser) {
		this.taskUser = taskUser;
	}

	public TaskStatus getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(TaskStatus taskStatus) {
		this.taskStatus = taskStatus;
	}

	public RequestType getTaskRequestType() {
		return taskRequestType;
	}

	public void setTaskRequestType(RequestType taskRequestType) {
		this.taskRequestType = taskRequestType;
	}

	public Timestamp getTaskAssigned() {
		return taskAssigned;
	}

	public void setTaskAssigned(Timestamp taskAssigned) {
		this.taskAssigned = taskAssigned;
	}

	public Timestamp getTaskStarted() {
		return taskStarted;
	}

	public void setTaskStarted(Timestamp taskStarted) {
		this.taskStarted = taskStarted;
	}

	public Timestamp getTaskCompleted() {
		return taskCompleted;
	}

	public void setTaskCompleted(Timestamp taskCompleted) {
		this.taskCompleted = taskCompleted;
	}

	public String getTaskComments() {
		return taskComments;
	}

	public void setTaskComments(String taskComments) {
		this.taskComments = taskComments;
	}

	@Override
	public TaskBean convertEntityToBean() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Task convertBeanToEntity() {
		// TODO Auto-generated method stub
		return null;
	}
}
