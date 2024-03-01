package in.datajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.datajpa.service.service;

@SpringBootApplication
public class DataJpaExApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DataJpaExApplication.class, args);
		
		service s1 = context.getBean(service.class);
		s1.saveStudent();
		
		
	}

}
