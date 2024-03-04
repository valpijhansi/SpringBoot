package in.emp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.emp.Service.empService;

@SpringBootApplication
public class DataJpaAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DataJpaAppApplication.class, args);
		
		empService emp = context.getBean(empService.class);
		
		emp.storeData();
		
		emp.callCustomQuries();
		emp.findByEsalary(40000.00);
		
		emp.findByName("Ramya");
	}

}
