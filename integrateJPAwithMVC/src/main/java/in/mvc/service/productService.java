package in.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.mvc.ProductRepo.productRepo;
import in.mvc.entity.Product;
@Service

public class productService implements productServiceInterface {
	@Autowired
	 private productRepo repo;

	@Override
	public boolean saveProduct(Product p) {
		// TODO Auto-generated method stub
		Product savedProduct = repo.save(p);
		return savedProduct.getId()!=null;
		
		
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return repo.findAll();
		
	}

}
