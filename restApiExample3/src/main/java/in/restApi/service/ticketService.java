package in.restApi.service;

import java.util.List;

import in.restApi.binding.Ticket;
import in.restApi.binding.passenger;

public interface ticketService {
	public Ticket bookTicket(passenger p);
	
	public Ticket getById(Integer id);
	
	public List<Ticket> getAllTickets();

}
