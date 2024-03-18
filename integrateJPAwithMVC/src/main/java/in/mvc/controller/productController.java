package in.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import in.mvc.ProductRepo.productRepo;
import in.mvc.entity.Product;

@Controller

public class productController {
	
	@GetMapping("/entity")
	public ModelAndView loadForm() {
	ModelAndView mv = new ModelAndView();
		mv.addObject("productObj", new Product());
	mv.setViewName("index");
		return mv;
		
	}
	
	@PostMapping("/entity")
	public ModelAndView getData() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", "Data saved successfully.....!");
	mv.setViewName("success");
		return mv;
		
	}
	
	

}
