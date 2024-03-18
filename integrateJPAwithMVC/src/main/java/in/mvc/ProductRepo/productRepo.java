package in.mvc.ProductRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.mvc.entity.Product;

public interface productRepo extends JpaRepository<Product,Integer> {

}
