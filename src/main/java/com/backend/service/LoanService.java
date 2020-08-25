package com.backend.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.backend.entity.Loan;
import com.backend.entity.User;

public interface LoanService {

	Page<Loan> findByUserId(User userId, Pageable pageable);

	Page<Loan> findAll(Pageable pages);

	
	

}
