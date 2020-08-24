package com.backend.service;

import java.util.List;

import javax.validation.Valid;

import com.backend.entity.User;

public interface UserService {
	
	User findById(Long id);

	List<User> findAll();

	User save(@Valid User userNew);

	void delete(Long id);


}
