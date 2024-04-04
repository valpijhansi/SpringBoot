package in.files.controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import in.files.entity.Student;
import in.files.service.studentService;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class studentController {
	@Autowired
	private studentService service;
	
	@GetMapping("/student")
	public String getDetails(Model model) {
		List<Student>list = service.getAllStudents();
		model.addAttribute("student", new Student());
		return "index";
	}
	@PostMapping("/upload")
	public String fileUpload(@RequestParam("file") MultipartFile file,Model model) throws IOException {
		Student s = new Student();
		String fileName = file.getOriginalFilename();
		s.setImagedata(file.getBytes());
		s.setFiledata(file.getBytes());
		service.saveStudent(s);
		model.addAttribute("student", "Data saved successfully...");
		
		return"index";
		
		
		
	}
	
	@GetMapping("/download")
	public void downloadFile(@Param("id") Integer id,Model model,HttpServletResponse response) throws IOException {
		Optional<Student> temp = service.findById(id);
		if(temp!=null) {
			Student std = temp.get();
			response.setContentType("application/octect-stream");
			String headerKey = "Content-Disposition";
			String headerValue = "attachment; filename ="+std.getImagedata();
			String headerValue1 = "attachment; filename ="+std.getFiledata();
			response.setHeader(headerKey, headerValue);
			response.setHeader(headerKey, headerValue1);
			ServletOutputStream stream = response.getOutputStream();
			stream.write(std.getImagedata());
			stream.write(std.getFiledata());
			stream.close();
		}
	}
		@PostMapping("/showimage")
		public void showImage(@Param("id") Integer id,HttpServletResponse response,Optional<Student> student) throws IOException {
			
			student = service.findById(id);
			response.setContentType("image/jpeg,image/jpg,image/png, image/pdf");
			response.getOutputStream().write(student.get().getImagedata());
			response.getOutputStream().close();
			
		}
		
	

}
