package com.fse.projmanager.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.fse.projmanager.entity.User;

public interface UserDao extends JpaRepository<User, Long>{


}
