package in.mvc.service;

import java.util.*;

//import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.mvc.entity.Book;
import in.mvc.repo.bookRepo;
@Service
public class bookServiceImpl implements bookService {
	@Autowired
	private bookRepo repo;



	@Override
	public boolean saveBook(Book b) {
		Book saveBook = repo.save(b);
		return saveBook.getId()!=null;
	}

	@Override
	public List<Book> getAllBooks() {
		
		return repo.findAll();
	}
	public void deleteBook(Integer id) {
		repo.deleteById(id);
	}


	public Book findById(Integer id) {
	    Optional<Book> list1 = repo.findById(id);

	    if (list1.isPresent()) {
	        Book book = list1.get();
	        System.out.println(book);
	        return book;
	    } else {
	        System.out.println("Record not found for id: " + id);
	        return null;
	    }
	}

}
