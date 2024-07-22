package in.rest.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class circutRestController {
	
	@GetMapping("/data")
	@CircuitBreaker(fallbackMethod="getDataFromDb",name= "Jhansi")
	public String getDataFromRedis() {
		System.out.println("Redis Method...");
		//int x = 20/0;
		return "Data fetched from Redis Server"; 
		
	}
	
	public String getDataFromDB() {
		System.out.println("DB method Executed");
		return "Data fetch from DB server";
	}

}
