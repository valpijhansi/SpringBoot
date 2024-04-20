package in.files.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import in.files.binding.Course;
import in.files.binding.course;
import in.files.service.courseService;

@RestController
public class courseRestController {
	@Autowired
	private courseService service;
	
	@PostMapping("/course")
	public ResponseEntity<String> createCourse(@RequestBody course c){
		String status = service.upsert(c);
		
		return new ResponseEntity<>(status,HttpStatus.CREATED);
		
	}
	
	
	@GetMapping("/Courses")
	public ResponseEntity<List<course>> getAllCourse(){
		List<course>list = service.getAllCourses();
		
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
	
	
	@GetMapping("/course/{id}")
	public ResponseEntity<course> getCourse(@PathVariable("id") Integer id){
		
		course res = service.getById(id);
		
		return new ResponseEntity<>(res,HttpStatus.OK);
	}
	
	
	
	@DeleteMapping("/course/{id}")
	public ResponseEntity<String> DeleteCourse(@PathVariable Integer id){
		String status = service.deleteById(id);
		
		return new ResponseEntity<>(status,HttpStatus.CREATED);
		
	}
	

}

