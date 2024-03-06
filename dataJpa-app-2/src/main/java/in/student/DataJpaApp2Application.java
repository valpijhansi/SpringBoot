package in.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.student.service.studentService;

@SpringBootApplication
public class DataJpaApp2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DataJpaApp2Application.class, args);
		
		studentService s = context.getBean(studentService.class);
		//s.saveData();
		
		// s.getAllStudent();
		
		// s.getAllStudentSort();
		
//		s.getAllSortById();
		s.getDetailsByPagination();
		s.getAllWithFilter();
		
		
	}

}
