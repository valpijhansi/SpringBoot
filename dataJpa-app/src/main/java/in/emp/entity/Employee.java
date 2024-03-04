package in.emp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	int eid;
	String ename;
	double esalary;
	String dept;
	public int getEid() {
		return eid;
	}
	public String getEname() {
		return ename;
	}
	public double getSalary() {
		return esalary;
	}
	public String getDept() {
		return dept;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setSalary(double salary) {
		this.esalary = salary;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "employeeEntity [eid=" + eid + ", ename=" + ename + ", salary=" + esalary + ", dept=" + dept + "]";
	}
	
	public Employee() {
		
	}
	public Employee(int eid,String ename,double salary,String dept) {
		this.eid = eid;
		this.ename = ename;
		this.esalary = salary;
		this.dept = dept;
	}

}
