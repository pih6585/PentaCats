package com.pentacats.animal.board.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pentacats.animal.board.entity.UserEntity;
import com.pentacats.animal.board.repository.UserRepository;

@Service
@Transactional(readOnly = true)
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<UserEntity> searchAll() {
		return userRepository.findAll();
	}

	public UserEntity searchById(String id) {
		return userRepository.findById(id).orElse(null);
	}
}
