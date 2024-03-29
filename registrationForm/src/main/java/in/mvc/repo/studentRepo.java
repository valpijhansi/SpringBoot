package in.mvc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.mvc.entity.Student;

public interface studentRepo extends JpaRepository<Student,Integer> {

	Student findByEmailAndPwd(String email, String pwd);
	Student findByEmail(String email);
	

}
