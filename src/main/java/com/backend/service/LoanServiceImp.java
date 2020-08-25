package com.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.backend.entity.Loan;
import com.backend.repository.LoanRepository;

@Service
public class LoanServiceImp implements LoanService {
	
	@Autowired
	private LoanRepository loanRepo;



	@Override
	@Transactional(readOnly = true)
	public Page<Loan> findByUserId(Long userId, Pageable pageable) {
		return loanRepo.findLoanByuserId(userId, pageable);
	}



	@Override
	@Transactional(readOnly = true)
	public Page<Loan> findAll(Pageable pages) {
		return loanRepo.findLoanAll(pages);
	}
	

}
