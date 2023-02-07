package dev.mwhyte.spring.sec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

	@GetMapping(value = {"/","/login"})
	public String getLogin() {
		return "login";
	}
	
	@GetMapping("/admin")
	public String getAdminPanel() {
		return "admin";
	}
	
	@GetMapping("/user")
	public String getUser() {
		return "user";
	}
	
	
	
	
}
