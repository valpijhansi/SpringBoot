package in.json.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

public class user {
	private int id;
	private String name;
	private String email;
	private String pwd;
	
	public user(int id, String name, String email, String pwd) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.pwd = pwd;
	}
	
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	

}
