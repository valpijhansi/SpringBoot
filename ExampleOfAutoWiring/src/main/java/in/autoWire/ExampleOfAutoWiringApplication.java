package in.autoWire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ExampleOfAutoWiringApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(ExampleOfAutoWiringApplication.class, args);
		
	Robot robo = context.getBean(Robot.class);
		robo.doWork();
		
		
	}

}
