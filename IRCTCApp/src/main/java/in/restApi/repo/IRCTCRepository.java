package in.restApi.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.restApi.binding.IRCTCBooking;

public interface IRCTCRepository extends JpaRepository<IRCTCBooking,Serializable>{
	

}
