package in.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeMsg {
	
	@GetMapping("/welcome")
	public String welcomeMsg() {
		String msg = " Welcome to this world...!";
		return msg;
	}

}
