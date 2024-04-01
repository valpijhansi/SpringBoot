package in.json.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.json.entity.user;

@RestController
public class userController {
	@GetMapping("/user")
	public List<user> getUser(){
		ArrayList<user> user = new ArrayList<user>();
		user.add(new user(121,"Jhansi","jhansi@gmail.com","1234"));
		user.add(new user(122,"Lokesh","lokesh@gmail.com","23456"));
		user.add(new user(120,"Ramya","ramya@gmail.com","23456"));
		
		return user;
		
		
	}

}
