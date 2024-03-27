package in.mvc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student_dtls")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sid;
	private String sname;
	private String email;
	private Long phno;
	private String pwd;
	public Integer getSid() {
		return sid;
	}
	public String getSname() {
		return sname;
	}
	public String getEmail() {
		return email;
	}
	public Long getPhno() {
		return phno;
	}
	public String getPwd() {
		return pwd;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhno(Long phno) {
		this.phno = phno;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	

}
