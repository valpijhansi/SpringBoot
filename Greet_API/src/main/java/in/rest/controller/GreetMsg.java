package in.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetMsg {

	@GetMapping("/")
	public String greetMsg() {
		String msg = "Good Morning...!";
		
		return msg;
	}
}
