package in.files.Rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.files.binding.Customer;

@RestController
public class restControllerExmaple {
	@GetMapping("/")
	public String getMsg() {
		String msg = "Hello welcome to the world";
		return msg;
	}
	
	@PostMapping("/greet")
	public String greetMsg(@RequestParam("name") String name) {
		String msg = name+"Hello welcome to your world";
		return msg;
	}
	

}
