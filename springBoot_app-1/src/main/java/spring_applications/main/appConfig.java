package spring_applications.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class appConfig {

	public appConfig() {
		System.out.println("appConfig::Constructor");
	}
	@Bean
	public appConfig save() {
		appConfig con = new appConfig();
		return con;
	}

}
