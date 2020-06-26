package com.fse.projmanager.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fse.projmanager.entity.Project;

public interface ProjectDao extends JpaRepository<Project, Long>{

}
