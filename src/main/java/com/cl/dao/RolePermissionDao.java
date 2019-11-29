package com.cl.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cl.entity.RolePermission;

public interface RolePermissionDao extends JpaRepository<RolePermission, Integer>{

}
