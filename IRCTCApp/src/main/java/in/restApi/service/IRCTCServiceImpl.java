package in.restApi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.restApi.binding.IRCTCBooking;
import in.restApi.repo.IRCTCRepository;

@Service
public class IRCTCServiceImpl implements IRCTCService {
	
	@Autowired
	private IRCTCRepository repo;

	@Override
	public String bookTickets(IRCTCBooking booking) {
		 repo.save(booking);
		 return "success";
	}

	@Override
	public List<IRCTCBooking> getAllTickets() {
	   return repo.findAll();
	}

	@Override
	public IRCTCBooking getById(Integer id) {
		Optional<IRCTCBooking> res = repo.findById(id);
		if(res.isPresent()) {
			return res.get();
		}
		return null;
	}

}
