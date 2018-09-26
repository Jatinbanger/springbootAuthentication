package com.database.WillLearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	
	@Autowired
	UserService userService;
	
	@PostMapping(value = "/register")
	public String createNewUser(@RequestBody UserData userValues ) {
		String response ;
		response = userService.registerUser(userValues);
		return response;
	}
	
	@PostMapping(value = "/login")
	public String validateUser(@RequestBody UserData userValues ) {
		String response ;
		response = userService.validateCredentials(userValues);
		return response;
	}
	
	@PostMapping(value = "/reset")
	public String resetPassword(@RequestBody UserData userValues ) {
		String response ;
		response = userService.resetPassword(userValues);
		return response;
	}
	
	
	
	
}
