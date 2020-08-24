package com.backend.models;

import java.util.List;

import com.backend.entity.Loan;

public class PagedResponseDto {
	
	private List<Loan> items;
	private PageDTO pageDto;
	
	public List<Loan> getItems() {
		return items;
	}
	public void setItems(List<Loan> items) {
		this.items = items;
	}
	public PageDTO getPageDto() {
		return pageDto;
	}
	public void setPageDto(PageDTO pageDto) {
		this.pageDto = pageDto;
	}
	
	
	
	

}
