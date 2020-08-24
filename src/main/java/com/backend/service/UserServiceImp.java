package com.backend.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.backend.entity.User;
import com.backend.repository.UserRepository;


@Service
public class UserServiceImp implements UserService {
	
	@Autowired
	private UserRepository userRepo;

	@Override
	@Transactional(readOnly = true)
	public User findById(Long id) {
		return userRepo.findById(id).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public List<User> findAll() {
		return userRepo.findAll() ;
	}

	@Override
	@Transactional
	public User save(@Valid User userNew) {

		return userRepo.save(userNew);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		userRepo.deleteById(id);
		
	}


	

}
