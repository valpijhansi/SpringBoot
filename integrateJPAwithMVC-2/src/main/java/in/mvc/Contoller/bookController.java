package in.mvc.Contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.mvc.entity.Book;
import in.mvc.service.bookService;
import jakarta.persistence.EntityNotFoundException;

@Controller
public class bookController {
	@Autowired
	private bookService service;
	
	@GetMapping("/")
	public ModelAndView loadForm() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("bookObj", new Book());
		mv.setViewName("index");
		return mv;
	}
	@PostMapping("/book")
	public ModelAndView getDetails(Book obj) {
		ModelAndView mv = new ModelAndView();
		boolean status = service.saveBook(obj);
		if(status) {
			mv.addObject("smsg", "Data saved successfully.....!");
			}else {
				mv.addObject("emsg","Failed to Save");
			}
		
		mv.addObject("bookObj", new Book());
		mv.setViewName("index");
		return mv;
	}
	@GetMapping("/books")
	public ModelAndView viewBooks() {
		List<Book> book = service.getAllBooks();
		ModelAndView mv = new ModelAndView();
		mv.addObject("list",book);
		mv.setViewName("data");
		return mv;
	}
	
	@GetMapping("/deleteBook")
	public String deleteBook(Integer id){
		service.deleteBook(id);
		return  "redirect:/books";


	}
	@GetMapping("/updateForm")
	public ModelAndView showUpdateForm(Integer id,Book book){
		ModelAndView mv = new ModelAndView("updateBook.html");
		Book book1 = service.findById(id);
		
		if(book1==null) {
			throw new EntityNotFoundException("Entity with id"+id+"not found");
		    }else {
			book1.setId(book.getId());
		    book1.setName(book.getName());
		    book1.setPrice(book.getPrice());
		    book1.setAuthor(book.getAuthor());
		    service.saveBook(book1);
			
		}
	
		mv.addObject("obj",book);
		return mv;
	}

	
	
	

}
