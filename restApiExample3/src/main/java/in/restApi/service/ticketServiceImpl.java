package in.restApi.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import in.restApi.binding.Ticket;
import in.restApi.binding.passenger;
import in.restApi.repo.ticketRepository;

@Service
public class ticketServiceImpl implements ticketService {
	
	@Autowired
	private ticketRepository repo;

	@Override
	public Ticket bookTicket( passenger p) {
	
		Ticket t = new Ticket();
		BeanUtils.copyProperties(p, t);
		t.setStatus("CONFIRMED");
		
		Ticket ticketSave = repo.save(t);
		return ticketSave;
	}

	@Override
	public Ticket getById(Integer id) {
		
		return repo.findById(id).orElseThrow();
	}

	@Override
	public List<Ticket> getAllTickets() {
		
		return repo.findAll();
	}

}
