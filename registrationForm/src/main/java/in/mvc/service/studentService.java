package in.mvc.service;

import in.mvc.entity.Student;

public interface studentService {
	
 public boolean saveStudent(Student student);
	
	public Student getDetails(String email,String pwd);

	public Student findByEmail(String email);
	public Student findByPwd(String pwd);

	// public Student createPasswordResetTokenForUser(Student student, String resetToken);

//	public Student createPasswordResetTokenForUser(Student student, String resetToken);
//
//	public Student getPasswordResetToken(String token);
//
//	public Student updatePassword(String email, String newPassword);
//
//	public Student deletePasswordResetToken(Student resetToken);
//
//	//public Student createPasswordResetTokenForUser(Student student, String resetToken);
	
	

}
