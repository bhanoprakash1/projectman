package com.fse.projmanager.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fse.projmanager.entity.Task;

public interface TaskDao extends JpaRepository<Task, Long>{

}
