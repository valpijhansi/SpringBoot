package in.mvc.service;

import in.mvc.entity.Student;

public interface studentService {
	
 public boolean saveStudent(Student student);
	
	public Student getDetails(String email,String pwd);
	
	

}
