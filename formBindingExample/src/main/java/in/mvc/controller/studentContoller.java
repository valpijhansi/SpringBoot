package in.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import in.mvc.binding.Student;

@Controller
public class studentContoller {
	@GetMapping("/Student")
	public ModelAndView loadform() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("studentobj", new Student());
		mv.setViewName("studentView");
		return mv;
		
	}
	@PostMapping("/Student")
	public ModelAndView requestHandler(Student student) {
		System.out.println(student);
		ModelAndView  mv = new ModelAndView();
		mv.addObject("msg", "data saved successful..");
		mv.setViewName("Success");
		return mv;
		
		
		
	}


}
