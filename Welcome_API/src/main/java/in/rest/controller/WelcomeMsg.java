package in.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeMsg {
	
	@Autowired
	private Environment env;
	
	@GetMapping("/welcome")
	public String welcomeMsg() {
		String port = env.getProperty("server.port");
		String msg = " Welcome to this world...!" + "(" +port+ ")";
		return msg;
	}

}
