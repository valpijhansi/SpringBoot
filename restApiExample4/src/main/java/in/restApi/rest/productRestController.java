package in.restApi.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.restApi.binding.product;
//import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class productRestController {
	
	
	@GetMapping(value="/product",
			produces = {"application/json" , "application/xml"}
			)
	
	public ResponseEntity<product> getProduct(product p){
		
		product p1 = new product(101,"Mobile","1500");
		
		return new ResponseEntity<>(p1,HttpStatus.OK);
	}
	
	@PostMapping(value = "add-prodcut",
			consumes = {"application/json","application/xml"},
			produces = "text/plain"
			)
	public ResponseEntity<String> addProduct( @RequestBody product p){
		System.out.println(p);
		return new ResponseEntity<>("product Added",HttpStatus.CREATED);
		
	}

}
