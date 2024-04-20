package in.files.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import in.files.binding.Course;
import in.files.binding.course;
import in.files.repo.courseRepository;

@Service
public class courseServiceImpl implements courseService {

	@Autowired
	private courseRepository repo;

	
	@Override
	public String upsert( course c) {
		repo.save(c);
		return "success";
	}

	
//	public String save() {
//		repo.saveAll()
//		return null;
//	}

	@Override
	public List<course> getAllCourses() {
		
		
		return repo.findAll();
	}

	@Override
	public course getById(Integer id) {
		Optional<course> res = repo.findById(id);
		if(res.isPresent()) {
			return res.get();
		}
		return null;
	}

	@Override
	public String deleteById(Integer id) {
		if(repo.existsById(id)) {
			repo.deleteById(id);
			return "deleted successfully";
		}else {
			return "No record found";
		}
	}


	
	


}
