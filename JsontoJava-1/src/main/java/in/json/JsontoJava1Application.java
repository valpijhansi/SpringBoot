package in.json;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.fasterxml.jackson.databind.ObjectMapper;

import in.json.entity.employee;

import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.File;
import java.io.IOException;

@SpringBootApplication
public class JsontoJava1Application {

    public static void main(String[] args) {   
        SpringApplication.run(JsontoJava1Application.class, args);

        ObjectMapper mapper = new ObjectMapper();

        try {
            employee emp = mapper.readValue(new File("data/data.json"), employee.class);
            System.out.println("Employee name: " + emp.getName());
            System.out.println("Salary: " + emp.getSalary());
        } catch (JsonMappingException e) {
            System.out.println("Error occurred while mapping JSON to Java object: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO Exception occurred: " + e.getMessage());
        }
    }
}




