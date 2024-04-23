package in.restApi.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.restApi.binding.Ticket;
import in.restApi.binding.passenger;
import in.restApi.service.ticketService;

@RestController
public class ticketRestController {
	
	@Autowired
	private ticketService service;
	
	@PostMapping(
			value="/ticket",
			consumes = "application/json",
			produces = "application/json"
			)
	public ResponseEntity<Ticket> bookTicket(@RequestBody passenger p){
		Ticket status = service.bookTicket(p);
		return new ResponseEntity<>(status,HttpStatus.CREATED);
	}
	
	@GetMapping(
			value = "get-ticket/{id}",
			produces = "application/json"
			)
	public ResponseEntity<Ticket> getTicket(@PathVariable("id") Integer id){
		Ticket res = service.getById(id);
		
		return new ResponseEntity<>(res,HttpStatus.OK);
	}
	
	@GetMapping(
			value = "get-tickets",
			produces = "application/json"
			)
	public ResponseEntity<List<Ticket>> getAllTickets(){
		
		List<Ticket> list = service.getAllTickets();
		
		return new ResponseEntity<>(list,HttpStatus.OK);
	}

}
