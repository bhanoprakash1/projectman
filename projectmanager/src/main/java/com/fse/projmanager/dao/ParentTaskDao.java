package com.fse.projmanager.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fse.projmanager.entity.Parent;

public interface ParentTaskDao extends JpaRepository<Parent, Long> {

}
