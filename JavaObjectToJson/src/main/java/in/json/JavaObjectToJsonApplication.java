package in.json;

import java.io.File;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class JavaObjectToJsonApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaObjectToJsonApplication.class, args);
		
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			employee emp = readValue(new File("data/data.json"),employee.class);
			
			System.out.println("Employee name:"+emp.getName());
			System.out.println("salary"+emp.getSalary());
			
			
			
		} catch (StreamReadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DatabindException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static employee readValue(File file, Class<employee> class1) throws StreamReadException, DatabindException, IOException {
		
		ObjectMapper mapper = new ObjectMapper();
        // Read JSON from file and map it to an instance of Employee class
        employee emp = mapper.readValue(file, class1);
        return emp;
	}

}
