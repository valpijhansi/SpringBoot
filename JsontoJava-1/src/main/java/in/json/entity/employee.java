package in.json.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

public class employee {
	
	private String name;
	private int salary;
	private boolean married;
	
	
	public employee() {
		
		
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	public boolean isMarried() {
		return married;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}
	
	

}
