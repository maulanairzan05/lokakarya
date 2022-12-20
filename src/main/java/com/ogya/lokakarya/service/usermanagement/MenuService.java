package com.ogya.lokakarya.service.usermanagement;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Service;

import com.ogya.lokakarya.entity.usermanagement.Menu;
import com.ogya.lokakarya.repository.usermanagement.MenuRepository;
import com.ogya.lokakarya.wrapper.usermanagement.MenuWrapper;

@Service
@Transactional
public class MenuService {
	@Autowired
	MenuRepository menuRepository;
	

	private MenuWrapper toWrapper(Menu entity) {
		MenuWrapper wrapper = new MenuWrapper();
		wrapper.setMenuId(entity.getMenuId());
		wrapper.setNama(entity.getNama());
		wrapper.setIcon(entity.getIcon());
		wrapper.setUrl(entity.getUrl());
		wrapper.setProgramName(entity.getProgramName());
		wrapper.setCreatedDate(entity.getCreatedDate());
		wrapper.setCreatedBy(entity.getCreatedBy());
		wrapper.setUpdatedDate(entity.getUpdatedDate());
		wrapper.setUpdatedBy(entity.getUpdatedBy());
		return wrapper;
	}

	private List<MenuWrapper> toWrapperList(List<Menu> entityList) {
		List<MenuWrapper> wrapperList = new ArrayList<MenuWrapper>();
		for (Menu entity : entityList) {
			MenuWrapper wrapper = toWrapper(entity);
			wrapperList.add(wrapper);
		}
		return wrapperList;
	}

	public List<MenuWrapper> findAll() {
		List<Menu> menulist = menuRepository.findAll(Sort.by(Order.by("menuId")).ascending());
		return toWrapperList(menulist);
	}

	private Menu toEntity(MenuWrapper wrapper) {
		Menu entity = new Menu();
		if (wrapper.getMenuId() != null) {
			entity = menuRepository.getReferenceById(wrapper.getMenuId());
		}
		entity.setNama(wrapper.getNama());
		entity.setIcon(wrapper.getIcon());
		entity.setUrl(wrapper.getUrl());
		entity.setProgramName(wrapper.getProgramName());
		entity.setCreatedDate(wrapper.getCreatedDate());
		entity.setCreatedBy(wrapper.getCreatedBy());
		entity.setUpdatedDate(wrapper.getUpdatedDate());
		entity.setUpdatedBy(wrapper.getUpdatedBy());
		return entity;
	}

	public MenuWrapper save(MenuWrapper wrapper) {
		Menu menu = menuRepository.save(toEntity(wrapper));
		return toWrapper(menu);
	}

	public void delete(Long id) {
		menuRepository.deleteById(id);
	}
}