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
import in.mvc.service.productService;

@Controller

public class productController {
	@Autowired
	private productService service;
	
	@GetMapping("/")
	public ModelAndView loadForm() {
	ModelAndView mv = new ModelAndView();
	mv.addObject("productObj", new Product());
	mv.setViewName("index");
		return mv;
		
	}
	
	@PostMapping("/product")
	public ModelAndView getData(Product obj) {
		ModelAndView mv = new ModelAndView();
		boolean status = service.saveProduct(obj);
		if(status) {
		mv.addObject("smsg", "Data saved successfully.....!");
		}else {
			mv.addObject("emsg","Failed to Save");
		}
	 mv.addObject("productObj", new Product());
	  mv.setViewName("index");
		return mv;
		
	}
	@GetMapping("/products")
	public ModelAndView viewProducts() {
		List<Product> productsList = service.getAllProducts();
		ModelAndView mv = new ModelAndView();
		mv.addObject("list",productsList);
		mv.setViewName("data");
		return mv;
	}
	
	

}
