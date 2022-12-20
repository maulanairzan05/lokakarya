package com.ogya.lokakarya.repository.usermanagement;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ogya.lokakarya.entity.usermanagement.Roles;

public interface RolesRepository extends JpaRepository<Roles, Long>{
	
}