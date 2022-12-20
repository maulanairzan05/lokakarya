package com.ogya.lokakarya.repository.usermanagement;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ogya.lokakarya.entity.usermanagement.Menu;

public interface MenuRepository extends JpaRepository<Menu, Long>{
	
}