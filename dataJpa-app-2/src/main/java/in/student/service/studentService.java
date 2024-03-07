package in.student.service;
import java.util.*;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import in.student.entity.Student;
import in.student.repo.studentRepo;

@Service
public class studentService {
	
	private studentRepo stRepo;
	
	public studentService(studentRepo stRepo) {
		this.stRepo = stRepo;
	}
	
	public void saveData() {
		Student s = new Student(111,"Jhansi","7093169316");
		Student s1 = new Student(112,"Lokesh","9381429472");
		Student s2 = new Student(113,"Rishi","9618176252");
		Student s3 = new Student(114,"Dikshith","7093169318");
		Student s4 = new Student(115,"Chinni","9380890196");
		
		List<Student> li = Arrays.asList(s,s1,s2,s3,s4);
		stRepo.saveAll(li);

		System.out.print("Records inserted...");
		
	}
	
	public void getAllStudent() {
		List<Student> list = stRepo.findAll();
		
		list.forEach(e ->System.out.println(e));
		
	}
	
	public void getAllStudentSort() {
		Sort sort = Sort.by("sname").ascending();
		List<Student> list = stRepo.findAll(sort);
		
		list.forEach(e ->System.out.println(e));
		
	}
	public void getAllSortById() {
		Sort sort = Sort.by("sid").descending();
		List<Student> list = stRepo.findAll(sort);
		list.forEach(e ->System.out.println(e));
	}
	
	public void getDetailsByPagination() {
		int pageSize = 3;
		int pageNum = 2;
		PageRequest pg = PageRequest.of(pageNum-1, pageSize);
		
		Page<Student> page = stRepo.findAll(pg);
		
		List<Student> student = page.getContent();
		student.forEach(e->System.out.println(e));
	}
	
	public void getAllStudentWithFilter() {
		Student entity  = new Student();
		entity.setSname("Lokesh");
		entity.setSid(111);
		Example<Student> example = Example.of(entity);
		
		List<Student> student = stRepo.findAll(example);
		
		student.forEach(e -> System.out.println(e));
	}

}
