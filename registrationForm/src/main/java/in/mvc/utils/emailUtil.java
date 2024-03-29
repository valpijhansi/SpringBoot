package in.mvc.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import in.mvc.entity.Student;

@Component
public class emailUtil {
	@Autowired
	private  JavaMailSender mailSender;

	public   boolean sendEmail(String to, String subject, String body) {
		
	try {
		SimpleMailMessage msg = new SimpleMailMessage();
		    msg.setTo(to);
			msg.setSubject(subject);
		    msg.setText(body);
 			mailSender.send(msg);
	}catch(Exception e) {
		e.printStackTrace();
		return true;
		}
		
		return false;
		
	}
	

}
