package in.restApi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import in.restApi.binding.book;

@RepositoryRestResource(path = "books")
public interface bookRepository extends JpaRepository<book,Integer> {

}
