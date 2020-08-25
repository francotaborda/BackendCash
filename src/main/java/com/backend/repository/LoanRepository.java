package com.backend.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.backend.entity.Loan;
import com.backend.entity.User;


public interface LoanRepository extends JpaRepository<Loan, Long>{
	

	/*@Query(
			  value = "SELECT * FROM Loans  WHERE user_id = ? \n-- #pageable\n",
			  countQuery = "SELECT count(*) FROM Loans",
			  nativeQuery = true)
	Page<Loan> findByUser(User user, Pageable pageable);
	*/
	
	List<Loan> findByUser(User user);
	//Page<Loan> findLoanAll(Pageable pageable);
	
	Page<Loan> findByUser(User user, Pageable pageable);
	
	

	
	
	
	

}
