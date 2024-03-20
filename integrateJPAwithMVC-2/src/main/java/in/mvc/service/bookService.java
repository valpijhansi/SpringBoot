package in.mvc.service;

import java.util.List;

import in.mvc.entity.Book;



public interface bookService {
	public boolean saveBook(Book b);
	public List<Book> getAllBooks();
	public Book findById(Integer id);
	public void deleteBook(Integer id);
	
	}


