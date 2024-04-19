package in.files.binding;

public class Customer {
	private int id;
	private String name;
	private int salary;
	
	public Customer(int id, String name, int salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public Customer() {
		
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
	

}
