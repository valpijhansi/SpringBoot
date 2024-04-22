package in.restApi.service;

import java.util.List;

import in.restApi.binding.IRCTCBooking;

public interface IRCTCService {
	
	public String bookTickets(IRCTCBooking booking);
	
	public List<IRCTCBooking> getAllTickets();
	
	public IRCTCBooking getById(Integer id);

}
