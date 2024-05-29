package in.rest.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="WELCOME-API")
public interface welcomeApiFeignClient {
	
	@GetMapping("/welcome")
	public String invokeWelcomeApi();

}
