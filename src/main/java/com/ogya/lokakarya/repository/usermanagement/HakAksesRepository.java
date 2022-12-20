package com.ogya.lokakarya.repository.usermanagement;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ogya.lokakarya.entity.usermanagement.HakAkses;

public interface HakAksesRepository extends JpaRepository<HakAkses, Long>{
	
}