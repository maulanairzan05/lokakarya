package com.ogya.lokakarya.repository.usermanagement;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ogya.lokakarya.entity.usermanagement.RoleMenu;

public interface RoleMenuRepository extends JpaRepository<RoleMenu, Long>{
	
}