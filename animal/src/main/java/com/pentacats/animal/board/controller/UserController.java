package com.pentacats.animal.board.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pentacats.animal.board.entity.UserEntity;
import com.pentacats.animal.board.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/searchUser")
	public List<UserEntity> searchAll() {
		return userService.searchAll();
	}

	@PostMapping("/find/{id}")
	public UserEntity searchFindById(@PathVariable("id") String id) {
		return userService.searchById(id);
	}
}
