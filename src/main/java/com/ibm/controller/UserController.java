package com.ibm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.bean.User;
import com.ibm.service.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	IUserService service;
	@PostMapping("/signIn")
	public User signIn(@RequestBody User user) {
	return service.signIn(user);
		
	}

	@PostMapping("/signOut")
	public User signOut(@RequestBody User user) {
		return service.signOut(user);
	}

	@PutMapping("/changePassword/{id}")
	public User changePassword(@PathVariable long id, @RequestBody User user) {
		return service.changePassword(id, user);
	}
	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
		return service.addUser(user);	
	}
	@DeleteMapping("/deleteUser/{id}")
	public ResponseEntity<Object> deleteUser(@PathVariable("id") long id) {
		try {
			service.removeUser(id);
			return ResponseEntity.accepted().build();
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	
	}

