package com.example.webApp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticatioService {

	public boolean authenticate(String username, String password) {
		
		boolean usernameisvalid=username.equalsIgnoreCase("Hetvi");
		boolean Passwordisvalid=password.equalsIgnoreCase("dummy");
		return usernameisvalid && Passwordisvalid;
	}
}
