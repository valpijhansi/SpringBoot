package in.mvc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.mvc.entity.Student;

public interface studentRepo extends JpaRepository<Student,Integer> {

	Student findByEmailAndPwd(String email, String pwd);
	Student findByEmail(String email);
	Student findByPwd(String pwd);
	//Student createPasswordResetTokenForUser(Student student, String resetToken);
		

}
