package com.example.webApp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {
	
	private AuthenticatioService authserv;
	
	@RequestMapping(value="login", method=RequestMethod.GET)
	public String EnterLogin() {
		return "login";
	}
	public LoginController(AuthenticatioService authserv) {
		super();
		this.authserv = authserv;
	}
	@RequestMapping(value="login", method=RequestMethod.POST)
	public String welcomeAfterLogin(@RequestParam String name, @RequestParam String password,ModelMap model) {
		if(authserv.authenticate(name, password)) {
		model.put("name", name);
		model.put("password", password);
		//authentication
		//name=hetvi
		//password=dummy
		
		return "Welcome";}
		model.put("error", "invalid credential");
		return "login";
	}
}
