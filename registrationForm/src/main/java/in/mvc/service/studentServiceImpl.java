package in.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.mvc.entity.Student;
import in.mvc.repo.studentRepo;
import in.mvc.utils.emailUtil;
@Service
public class studentServiceImpl implements studentService {
	@Autowired
	private studentRepo repo;
	@Autowired
	private emailUtil  util;
	

	@Override
	public boolean saveStudent(Student student) {
      Student saveData = repo.save(student);
		if(saveData.getSid()!=null) {
			String subject="Your Account is created successfully...";
			String body = "Congratulations, welcome to board..";
			util.sendEmail(student.getEmail(), subject, body);
		}
		
		
		return true;
		
	}

	@Override
	public Student getDetails(String email, String pwd) {
		// TODO Auto-generated method stub
		return repo.findByEmailAndPwd(email,pwd);
	}

	@Override
	public Student findByEmail(String email) {
		// TODO Auto-generated method stub
		return repo.findByEmail(email);
	}

	@Override
	public Student findByPwd(String pwd) {
		// TODO Auto-generated method stub
		return repo.findByPwd(pwd);
	}

	

	
	

}
