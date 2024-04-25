package in.restApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.restApi.binding.studentDetails;
import in.restApi.service.productService;

@Controller
public class detailsRestController {
	
	@Autowired
	private productService service;
//	
//	@GetMapping("/")
//	public String index(Model model) {
//		 service.getDetails();
//		
//		 return "index";
	
	@GetMapping("/details")
	 public String getDetails(@RequestParam("name") String name,Model model) {
		studentDetails res = service.getproductById(name);
		model.addAttribute("s", res);
		 
		 return "index";
		 
	 }
	}
    
	
	


