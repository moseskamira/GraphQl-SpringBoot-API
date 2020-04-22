package com.graphql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;
	
	@Transactional
	public Book createNewBook(String title, String isbn, Integer pageCount, Long authorId) {
		Book book = new Book();
	    book.setAuthor(new Author(authorId));
	    book.setTitle(title);
	    book.setIsbn(isbn);
	    book.setPageCount(pageCount != null ? pageCount : 0);

	    bookRepository.save(book);
	    return book;
	}
	@Transactional
	public boolean deleteSingleBook(Long id) {
		bookRepository.deleteById(id);
		return true;
		
	}
	    
	public Iterable<Book> listAllBooks() {
	    return bookRepository.findAll();
	}
	    
	public long countAllBooks() {
		return bookRepository.count();
	}
	    
//	    public Book updateBookPageCount(Integer pageCount, Long id) {
//	        Book book = bookRepository.findOne(id);
//	        book.setPageCount(pageCount);
	//
//	        bookRepository.save(book);
	//
//	        return book;
//	    }

}
