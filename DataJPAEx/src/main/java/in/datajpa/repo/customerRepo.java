package in.datajpa.repo;

import org.springframework.data.repository.CrudRepository;

import in.datajpa.entities.customer;

public interface customerRepo extends CrudRepository<customer, Integer> {
	

}
