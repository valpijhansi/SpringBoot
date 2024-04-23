package in.restApi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.restApi.binding.Ticket;

public interface ticketRepository extends JpaRepository<Ticket,Integer> {

}
