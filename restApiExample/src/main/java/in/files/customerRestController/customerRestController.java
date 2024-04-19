package in.files.customerRestController;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
//import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.files.binding.Customer;

@RestController
public class customerRestController {
	
	@GetMapping(value="/customers")
	public ResponseEntity<List<Customer>> getCustomers(){
		Customer c = new Customer(111,"Lokesh",15000);
		Customer c1 = new Customer(112,"Jhansi",50000);
		Customer c2 = new Customer(113,"Ramya",15000);
		Customer c3 = new Customer(114,"Rishi",25000);
		
		List<Customer> list = Arrays.asList(c,c1,c2,c3);
		return new ResponseEntity(list,HttpStatus.OK);
		
	}
	
	@GetMapping(value="/customer")
	public ResponseEntity<String> getCustomer(){
		Customer c = new Customer(111,"Lokesh",15000);
		return new ResponseEntity(c, HttpStatus.OK);
		
		
		
	}

}
