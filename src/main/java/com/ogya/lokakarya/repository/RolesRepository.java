package com.ogya.lokakarya.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ogya.lokakarya.entity.Roles;

public interface RolesRepository extends JpaRepository<Roles, Long>{
	
}