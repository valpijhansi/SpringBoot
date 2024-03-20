package in.mvc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.mvc.entity.Book;

public interface bookRepo extends JpaRepository<Book,Integer> {

}
