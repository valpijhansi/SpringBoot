package in.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.mvc.service.productService;

@SpringBootApplication
public class IntegrateJpAwithMvcApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(IntegrateJpAwithMvcApplication.class, args);
		
		productService ps = context.getBean(productService.class);
		//ps.saveData();
		//System.out.println(ps.getAllDetails());
	}

}
