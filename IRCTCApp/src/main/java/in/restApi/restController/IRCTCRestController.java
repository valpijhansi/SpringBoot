package in.restApi.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import in.restApi.binding.IRCTCBooking;
import in.restApi.service.IRCTCService;

@RestController
public class IRCTCRestController {
	
	@Autowired
	private IRCTCService service;
	
	@PostMapping("/book-ticket")
	public ResponseEntity<String> bookTickets(@RequestBody IRCTCBooking Book){
		String status = service.bookTickets(Book);
		return new ResponseEntity<>(status,HttpStatus.CREATED);
	}
	
	@GetMapping("/get-tickets")
	public ResponseEntity<List<IRCTCBooking>> getAllTickets(){
		
		List<IRCTCBooking> list = service.getAllTickets();
		return new ResponseEntity<>(list,HttpStatus.OK);
		
	}
	
	@GetMapping("/get-ticket/{id}")
	public ResponseEntity<IRCTCBooking> getTicket(@PathVariable("id") Integer id){
		
		IRCTCBooking book = service.getById(id);
		
		return new ResponseEntity<>(book,HttpStatus.OK);
		
	}
	

}
