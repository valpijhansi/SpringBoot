package in.data.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import in.data.entities.Project;

public interface projectRepo extends CrudRepository<Project, Integer>{
	
	List<Project> findBycost(double cost);

}
