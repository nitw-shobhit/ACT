package com.act.model.service;

import java.util.List;

import com.act.core.beans.TaskBean;

public interface WorklistService {

	public List<TaskBean> getWorklist(String userId);
}
