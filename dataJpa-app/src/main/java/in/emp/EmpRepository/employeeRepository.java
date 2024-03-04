package in.emp.EmpRepository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.emp.entity.Employee;

public interface employeeRepository extends CrudRepository<Employee,Integer>{

	@Query("from Employee")
	List<Employee>getAllHQL();
	
	
	@Query("from Employee where ename = ename")
	
	List<Employee>getByEname(String ename);
	
	
	@Query(value="select * from Employee where eid = eid" ,nativeQuery = true)
	List<Employee>getAllEmpSQL();
	
	
	List<Employee> findByEsalary(double esalary);


	
	
	

}
