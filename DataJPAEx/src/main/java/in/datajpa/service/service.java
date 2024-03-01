package in.datajpa.service;

import org.springframework.stereotype.Service;

import in.datajpa.entities.customer;
import in.datajpa.repo.customerRepo;

@Service
public class service {
	private customerRepo customerepo;
	
	public service(customerRepo studentrepo) {
		this.customerepo = studentrepo;
		
	}
	
	public void saveStudent() {
		System.out.println("Iml class:"+getClass().getName());
		customer c = new customer();
		c.setCid(102);
		c.setPhno(93814294);
		c.setPwd("lokesh@123");
		c.setUname("Rajesh");
		
		System.out.println("Records inserted....");
		
		
		
		customerepo.save(c);
		
		
	}
	

}
