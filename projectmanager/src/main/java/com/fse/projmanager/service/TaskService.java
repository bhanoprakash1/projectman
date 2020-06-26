package com.fse.projmanager.service;

import java.util.List;

import com.fse.projmanager.entity.Parent;
import com.fse.projmanager.entity.Task;
import com.fse.projmanager.model.TaskModel;

public interface TaskService {
	List<TaskModel> getAllTask();

	List<Parent> getAllParentTask();

	TaskModel addTask(TaskModel task);

	Parent addParent(Task parentTask);

	TaskModel getTaskById(Long taskId);

	TaskModel editTask(TaskModel taskModel, Long taskId);

	TaskModel endTask(Long taskId);

}
