package com.backend.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.backend.entity.Loan;

public interface LoanService {

	Page<Loan> findByUserId(Long userId, Pageable pageable);

	Page<Loan> findAll(Pageable pages);

	
	

}
