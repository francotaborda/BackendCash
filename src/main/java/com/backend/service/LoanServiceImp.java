package com.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.backend.entity.Loan;
import com.backend.entity.User;
import com.backend.repository.LoanRepository;

@Service
public class LoanServiceImp implements LoanService {
	
	@Autowired
	private LoanRepository loanRepo;



	@Override
	@Transactional(readOnly = true)
	public Page<Loan> findByUserId(User userId, Pageable pageable) {
		return loanRepo.findByUser(userId, pageable);
	}



	@Override
	@Transactional(readOnly = true)
	public Page<Loan> findAll(Pageable pages) {
		return loanRepo.findAll(pages);
	}
	

}
