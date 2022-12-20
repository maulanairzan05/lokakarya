package com.ogya.lokakarya.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ogya.lokakarya.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Long>{
	
}