package in.restApi.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.restApi.binding.studentDetails;

@Service
public class productService {
//	
//	public void getDetails() {
//		String url = "https://reqres.in/api/users?page=2";
//		RestTemplate template = new RestTemplate();
//		
//		ResponseEntity<studentDetails[]> res = template.getForEntity(url, studentDetails[].class);
//		
//		int value = res.getStatusCode().value();
//		if(value==200) {
//			
//			 studentDetails[] detail = res.getBody();
//			for( studentDetails details: detail)
//			System.out.println(details);
//			
//		}
	
	 public studentDetails getproductById(String  name) {
		 String url = "https://reqres.in/api/users?page=2"+name;
		 RestTemplate template = new RestTemplate();
		 ResponseEntity<studentDetails> res = template.getForEntity(url, studentDetails.class);
		 
		 int value = res.getStatusCode().value();
		 if(value==200) {
			 return res.getBody();
			 
		 }
		 return null;
		 
	 }

	
		
	}


