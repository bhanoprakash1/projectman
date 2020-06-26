package com.fse.projmanager.service;

import java.util.List;
import java.util.Set;

import com.fse.projmanager.entity.Project;
import com.fse.projmanager.entity.Task;

public interface ProjectService {
	List<Project> getAllProjects();
	Project addProject(Project project);
	void suspendProject(Long projectId);
	 Set<Task> getTaskListByProject(Long projectId); 
	 int getCompletedTask(Long projectId);
}
