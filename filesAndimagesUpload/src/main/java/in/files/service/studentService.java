package in.files.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.files.entity.Student;
import in.files.repo.studentRepo;


@Service
public class studentService {
	@Autowired
	private studentRepo repo;
	

		
			public boolean saveStudent(Student student) {
		      Student saveData = repo.save(student);
			  return true;
				
			}
			
			public Optional<Student> findById(Integer id) {
				return repo.findById(id);
				
			}
			
			public List<Student> getAllStudents(){
				return repo.findAll();
				
			}
		 
	 }


