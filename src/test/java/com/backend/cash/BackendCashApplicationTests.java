package com.backend.cash;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.backend.controller.UserController;

@SpringBootTest
class BackendCashApplicationTests {
	
	@Autowired
	private UserController userController;

	@Test
	void contextLoads() {
		assertThat(userController).isNotNull();
	}
	
	
	/*
	 @Test
	    public void saveUser() {
	        User user = new User();
	        UserRequest request = new UserRequest("Lionel", "Messi", "lionelmessi@barcelona.es");
	        user.setLastName(request.getLastName());
			user.setFirstName(request.getFirstName());
			user.setEmail(request.getEmail());
			user = userRepo.save(user);
	        userRepo.save(user);
	    }
	    */

}
