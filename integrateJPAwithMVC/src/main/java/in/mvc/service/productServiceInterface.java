package in.mvc.service;

import java.util.List;

import in.mvc.entity.Product;

public interface productServiceInterface {
	public boolean saveProduct(Product p);
	public List<Product> getAllProducts();

}
