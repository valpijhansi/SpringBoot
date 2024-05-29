package in.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.rest.clients.welcomeApiFeignClient;

@RestController
public class GreetMsg {
	
	
	@Autowired
	private welcomeApiFeignClient client;

	@GetMapping("/greet")
	public String greetMsg() {
		
		String response = client.invokeWelcomeApi();
		
		String greetResponse = "Good morning ,"; 
		
		return greetResponse + response;
	}
}
