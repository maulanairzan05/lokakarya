package com.ogya.lokakarya.controller.usermanagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ogya.lokakarya.service.usermanagement.UsersService;
import com.ogya.lokakarya.util.DataResponse;
import com.ogya.lokakarya.util.DataResponseList;
import com.ogya.lokakarya.wrapper.usermanagement.UsersWrapper;


@RestController
@RequestMapping(value = "/users")
@CrossOrigin()
public class UsersController {
	@Autowired
	UsersService userService;
	
	
	@GetMapping(path = "/findAllPlan")
	public List<UsersWrapper> findAllPlan() {
		return userService.findAll();
	}
	
	@GetMapping(path = "/findAll")
	public DataResponseList<UsersWrapper> findAll() {
		return new DataResponseList<UsersWrapper>(userService.findAll());
	}
	
	@PostMapping(path = "/")
	public DataResponse<UsersWrapper> save(@RequestBody UsersWrapper wrapper){
		return new DataResponse<UsersWrapper>(userService.save(wrapper));
	}
	
	@PutMapping(path = "/")
	public DataResponse<UsersWrapper> update(@RequestBody UsersWrapper wrapper){
		return new DataResponse<UsersWrapper>(userService.save(wrapper));
	}
	
	
	@DeleteMapping(path = "/deleteById")
	public void deleteId(@RequestParam("id")  Long userId) {
		userService.delete(userId);
	}
	
	
}
