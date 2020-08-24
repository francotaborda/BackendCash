package com.backend.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.entity.Loan;

public interface LoanRepository extends JpaRepository<Loan, Long>{

	Page<Loan> findLoanByuserId(Long userId, Pageable pageable);

	List<Loan> findAllByUserId(Long userId);
	
	
	
	

}
