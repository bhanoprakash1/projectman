package com.fse.projmanager.serviceimpl;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fse.projmanager.dao.ProjectDao;
import com.fse.projmanager.dao.UserDao;
import com.fse.projmanager.entity.Project;
import com.fse.projmanager.entity.Task;
import com.fse.projmanager.entity.User;
import com.fse.projmanager.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService {
	
	@Autowired
	ProjectDao projectDao;
	
	@Autowired
	UserDao userDao;
	
	
	
	
	@Override
	public List<Project> getAllProjects() {
		List<Project> projects = this.projectDao.findAll();
		List<Project> prjList = new ArrayList<Project>();
		
		for (Project prj : projects) {
			prj.setNoOfTask(getTaskListByProject(prj.getProjectId()).size());
			prj.setNofCompTask(getCompletedTask(prj.getProjectId()));
			prjList.add(prj);
		}
		return prjList;
	}
	
	@Override
	public Project addProject(Project project) {
		this.projectDao.save(project);
		User user = project.getUser();
		
		
		this.userDao.save(user);
		return project;
	}
	
	@Override
	public void suspendProject(Long projectId) {
		Project project = new Project();
		project.setStatus("1");
		this.projectDao.deleteById(projectId);
		
	}
	
	
	  @Override public Set<Task> getTaskListByProject(Long projectId) { 
		  Project project = this.projectDao.findById(projectId).get(); 
		  Set<Task> taskList = new HashSet<Task>(); 
		  taskList = project.getTaskList();
		  project.setNoOfTask(taskList.size());
		  return taskList;
		  }
	 
	  @Override
	  
	  public int getCompletedTask(Long projectId) {
		  System.out.println("task for project - " +projectId);
		  Set<Task> taskList = new HashSet<Task>(); 
		  taskList = getTaskListByProject(projectId);
		  int completedTask = 0;
		  for (Task task : taskList) {
			 if( task.getStatus() != null)
				 completedTask++;
		  }
		  System.out.println("completed Task - " +completedTask);
		  return completedTask;
	  }
}
