package in.mvc.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.mvc.entity.Student;
import in.mvc.service.studentService;

@Controller
public class studentController {
	
	
	@Autowired
	private studentService studentService;
	
	@GetMapping("/login")
	public String getLogin(Model model) {
		model.addAttribute("student", new Student());
		return "index";
	}
	@PostMapping("/login")
	public String loginHandler(Student student,Model model) {
		Student std = studentService.getDetails(student.getEmail(), student.getPwd());
		if(std==null) {
			model.addAttribute("emsg","Invalid Credentials");
			return "index";
		}else {
			model.addAttribute("msg", std.getSname()+", Welcome to your world...");
			return "dashboard";
		}
		
	}
	
	@GetMapping("/register")
	public String registerForm(Model model) {
		
		model.addAttribute("student", new Student());
		return "registerView";
	}
	
	@PostMapping("/register")
	public String registerHandler(Student student,Model model) {
		boolean status = studentService.saveStudent(student);
		if(status) {
			model.addAttribute("smsg", "Student Registered");
			
		}else {
			model.addAttribute("msg", "Student Registration failed..");
		}
		return "registerView";
	}
	
	@GetMapping("/logout")
	public String logout(Model model) {
		model.addAttribute("student", new Student());
		return "index";
	}
	
	


	
	
	

}
