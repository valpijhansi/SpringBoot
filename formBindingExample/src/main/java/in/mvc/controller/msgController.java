package in.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import in.mvc.binding.Student;
import in.mvc.binding.user;

@Controller
public class msgController {
	
	@GetMapping("/user")
	public ModelAndView loadForm() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("userobj", new user());
		mv.setViewName("index");
		return mv;
		
		
	}
	@PostMapping("/user")
	public ModelAndView handleRequest(user user) {
		System.out.println(user);
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", "user form successful..");
		mv.setViewName("Success");
		return mv;
		
		
	}
	
}
