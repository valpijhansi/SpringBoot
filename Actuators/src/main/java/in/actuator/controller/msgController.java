package in.actuator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class msgController {
	@GetMapping("/")
	@ResponseBody
	public String Message() {
		return "Welocome to your world";
	}

}
