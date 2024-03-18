package in.mvc.service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

//import in.data.entities.Project;
import in.mvc.ProductRepo.productRepo;
import in.mvc.entity.Product;

@Service
public class productService {
	@Autowired
	private productRepo repo;
	
	public productService(productRepo repo) {
		this.repo = repo;
	}
	
	public void saveData() {
		Product p = new Product();
		p.setName("Mobile");
		p.setCategory("Vivo");
		p.setPrice(30000.00);
		
		Product p1 = new Product();
		p1.setName("SmartWatch");
		p1.setCategory("Noise");
		p1.setPrice(3000.00);
		
		Product p2 = new Product();
		p2.setName("Mobile");
		p2.setCategory("Realme");
		p2.setPrice(40000.00);
		
		Product p3 = new Product();
		p3.setName("Buds");
		p3.setCategory("Boat");
		p3.setPrice(1500.00);
		
		List<Product> list = Arrays.asList(p,p1,p2,p3);
		
		repo.saveAll(list);
		
		System.out.println("Data saved successfully.........!");
		
	}
	//@GetMapping("/return")
	public  List<Product> getAllDetails(){
		return repo.findAll();
	}
}