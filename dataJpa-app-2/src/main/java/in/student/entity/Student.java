package in.student.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private int sid;
	private String sname;
	private String phno;
	
	public int getSid() {
		return sid;
	}
	public String getSname() {
		return sname;
	}
	public String getPhno() {
		return phno;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", phno=" + phno + "]";
	}
	
	public Student() {
		
	}
	
	public Student(int sid,String sname,String phno) {
		this.sid = sid;
		this.sname = sname;
		this.phno = phno;
	}
	
	

}
