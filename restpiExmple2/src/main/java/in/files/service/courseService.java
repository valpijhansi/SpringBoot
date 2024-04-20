package in.files.service;

import java.util.List;

import in.files.binding.course;

public interface courseService {
	public String upsert(course c);
	//public String save();
	
	public List<course> getAllCourses();
	
	public course getById(Integer id);
	
	public String deleteById(Integer id);
	//public course updateByID(Integer id);
	


}
