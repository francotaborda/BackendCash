package com.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.backend.entity.Loan;
import com.backend.entity.User;
import com.backend.models.PageDTO;
import com.backend.models.PagedResponseDto;
import com.backend.service.LoanService;
import com.backend.service.UserService;

@RestController
@RequestMapping("/loans")
public class LoanController {
	@Autowired
	private LoanService loanService;
	@Autowired
	private UserService userService;

	@GetMapping("")
	public ResponseEntity<?> getUsersPage(@RequestParam(defaultValue = "1") int page,
			@RequestParam(defaultValue = "10") int size, Long user_id) {

		Page<Loan> resultPage = null;
		if(user_id != null) {
		User user = userService.findById(user_id);
		resultPage = loanService.findByUserId(user, PageRequest.of(page, size));
		}
		else {
			resultPage = loanService.findAll(PageRequest.of(page, size));
		}
		

		PageDTO pageDto = new PageDTO();
		pageDto.setPage(resultPage.getTotalPages());
		pageDto.setSize(resultPage.getSize());
		pageDto.setTotal(resultPage.getTotalPages());
		PagedResponseDto response = new PagedResponseDto();
		response.setItems(resultPage.getContent());
		response.setPageDto(pageDto);

		return ResponseEntity.ok(response);
	}


}
