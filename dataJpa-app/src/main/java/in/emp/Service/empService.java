package in.emp.Service;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.emp.EmpRepository.employeeRepository;
import in.emp.entity.Employee;

@Service
public class empService {
	@Autowired
	private employeeRepository empRepo;
	public empService(employeeRepository empRepo) {
        this.empRepo = empRepo;
    }
	
	public void storeData() {
		Employee e = new Employee(1,"Jhansi",40000.00,"IT");
		Employee e1 = new Employee(2,"Lokesh",50000.00,"Staffing");
		Employee e2 = new Employee(3,"Ramya",60000.00,"Software");
		
		List<Employee> list = Arrays.asList(e,e1,e2);
		empRepo.saveAll(list);
		
		System.out.println("Records saved...");
		
	}
	
	public void callCustomQuries() {
		//List<Employee> emps = empRepo.getAllHQL();
		//emps.forEach(System.out::println);
		
		List<Employee> emps1 = empRepo.getAllEmpSQL();
		emps1.forEach(System.out::println);
	}
	
	public void findByEsalary(double esalary) {
		List<Employee> list1 = empRepo.findByEsalary(esalary);
		if(list1.isEmpty()) {
			System.out.println("No records found...");
		}else {
			Employee emp1= list1.get(0);
			System.out.print(emp1);
		}
	}
	
	public void findByName(String ename) {
		List<Employee> list2 = empRepo.getByEname(ename);
		if(list2.isEmpty()) {
			System.out.println("Record not found......");
		}else {
			Employee emp2 = list2.get(1);
			System.out.println(emp2);
		}
		
	}
	
	

}
