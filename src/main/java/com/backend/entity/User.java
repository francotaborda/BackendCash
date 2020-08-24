package com.backend.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;



@SuppressWarnings("serial")
@Entity
@Table(name = "users")
public class User implements Serializable{
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
	
	@Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @NotEmpty
	@Email(message = "No es un Email")
	@Column(nullable=false, unique=true)
	private String email;
    
    @OneToMany(cascade = CascadeType.ALL)
	private Set<Loan> loans = new HashSet<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<Loan> getLoans() {
		return loans;
	}

	public void setLoans(Set<Loan> loans) {
		this.loans = loans;
	}



	public User(Long id, String firstName, String lastName,
			@Email(message = " Formato de Email incorrecto") @Size(max = 60, message = "el tamaño puede mayor a 60 caracteres") String email,
			Set<Loan> loans) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.loans = loans;
	}

	public User(Long id, String firstName, String lastName,
			@Email(message = " Formato de Email incorrecto") @Size(max = 60, message = "el tamaño puede mayor a 60 caracteres") String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	
	}

	public User() {
		super();
	}
    
    
	

}
