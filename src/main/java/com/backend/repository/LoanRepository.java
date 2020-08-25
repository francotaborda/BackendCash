package com.backend.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.backend.entity.Loan;


public interface LoanRepository extends JpaRepository<Loan, Long>{
	
	@Query(
			  value = "SELECT * FROM Loans  WHERE user_id = ? \n-- #pageable\n",
			  countQuery = "SELECT count(*) FROM Loans",
			  nativeQuery = true)
	Page<Loan> findLoanByuserId(Long userId, Pageable pageable);

	@Query(
			  value = "SELECT * FROM Loans \n-- #pageable\n",
			  countQuery = "SELECT count(*) FROM Loans",
			  nativeQuery = true)
	Page<Loan> findLoanAll(Pageable pageable);
	
	

	
	
	
	

}
