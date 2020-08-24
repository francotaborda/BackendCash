package com.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.backend.entity.Loan;
import com.backend.repository.LoanRepository;

@Service
public class LoanServiceImp implements LoanService {
	
	@Autowired
	private LoanRepository loanRepo;



	@Override
	public Page<Loan> findByUserId(Long userId, Pageable pageable) {
		//return loanRepo.findAllByUserId(userId, pageable);
		return loanRepo.findLoanByuserId(userId, pageable);
	}



	@Override
	public Page<Loan> findAll(Pageable pages) {
		
		Page<Loan> lst = loanRepo.findAll(pages);
		lst.getContent();
		return lst;
	}



	@Override
	public List<Loan> findByUserId(Long userId) {
		return loanRepo.findAllByUserId(userId);
	}


	


	

}
