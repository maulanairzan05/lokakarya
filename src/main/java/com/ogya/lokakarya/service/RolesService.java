package com.ogya.lokakarya.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Service;

import com.ogya.lokakarya.entity.Roles;
import com.ogya.lokakarya.repository.RolesRepository;
import com.ogya.lokakarya.wrapper.RolesWrapper;

@Service
@Transactional
public class RolesService {
	@Autowired
	RolesRepository rolesRepository;
	

	private RolesWrapper toWrapper(Roles entity) {
		RolesWrapper wrapper = new RolesWrapper();
		wrapper.setRoleId(entity.getRoleId());
		wrapper.setNama(entity.getNama());
		wrapper.setProgramName(entity.getProgramName());
		wrapper.setCreatedDate(entity.getCreatedDate());
		wrapper.setCreatedBy(entity.getCreatedBy());
		wrapper.setUpdatedDate(entity.getUpdatedDate());
		wrapper.setUpdatedBy(entity.getUpdatedBy());
		return wrapper;
	}

	private List<RolesWrapper> toWrapperList(List<Roles> entityList) {
		List<RolesWrapper> wrapperList = new ArrayList<RolesWrapper>();
		for (Roles entity : entityList) {
			RolesWrapper wrapper = toWrapper(entity);
			wrapperList.add(wrapper);
		}
		return wrapperList;
	}

	public List<RolesWrapper> findAll() {
		List<Roles> userList = rolesRepository.findAll(Sort.by(Order.by("roleId")).ascending());
		return toWrapperList(userList);
	}

	private Roles toEntity(RolesWrapper wrapper) {
		Roles entity = new Roles();
		if (wrapper.getRoleId() != null) {
			entity = rolesRepository.getReferenceById(wrapper.getRoleId());
		}
		entity.setNama(wrapper.getNama());
		entity.setProgramName(wrapper.getProgramName());
		entity.setCreatedDate(wrapper.getCreatedDate());
		entity.setCreatedBy(wrapper.getCreatedBy());
		entity.setUpdatedDate(wrapper.getUpdatedDate());
		entity.setUpdatedBy(wrapper.getUpdatedBy());
		return entity;
	}

	public RolesWrapper save(RolesWrapper wrapper) {
		Roles roles = rolesRepository.save(toEntity(wrapper));
		return toWrapper(roles);
	}

	public void delete(Long id) {
		rolesRepository.deleteById(id);
	}
}