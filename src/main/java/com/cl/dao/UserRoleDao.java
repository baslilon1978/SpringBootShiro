package com.cl.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cl.entity.UserRole;

public interface UserRoleDao extends JpaRepository<UserRole, Integer>{

}
