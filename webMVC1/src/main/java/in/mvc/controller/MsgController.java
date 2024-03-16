package in.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class MsgController {
	@GetMapping("/welcome")
	public ModelAndView getMsg() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg1", "Welcome to my world");
		mv.setViewName("index");
		return mv;
	}
	@GetMapping("/love")
	
	public ModelAndView getMsg1() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg2", "love you lokesh....!");
		mv.setViewName("index");
		return mv;
		
	}

}
