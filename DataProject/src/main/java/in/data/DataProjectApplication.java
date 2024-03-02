package in.data;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.data.service.projectService;

@SpringBootApplication
public class DataProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DataProjectApplication.class, args);
		
		projectService p = context.getBean(projectService.class);
		
	
		p.projectSave();
		p.findById(101);
		p.getDetails(Arrays.asList(101,102,103));
		p.callfindByMethods();
	}

}
