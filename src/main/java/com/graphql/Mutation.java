package com.graphql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

@Component
public class Mutation implements GraphQLMutationResolver {
	@Autowired
	BookService bookService;
	
	@Autowired
	AuthorService authorService;
	
	
	public Author newAuthor(String firstName, String lastName) {
        Author savedAuthor = authorService.createNewAuthor(firstName, lastName);
        return savedAuthor;
    }

    public Book newBook(String title, String isbn, Integer pageCount, Long authorId) {
        Book savedBook = bookService.createNewBook(title, isbn, pageCount, authorId);
        return savedBook;
    }
    
    public boolean deleteBook(Long id) {
    	bookService.deleteSingleBook(id);
        return true;
        
    }
    
//    public Book updateBookPageCount(Integer pageCount, Long id) {
//        Book book = bookRepository.findOne(id);
//        book.setPageCount(pageCount);
//
//        bookRepository.save(book);
//
//        return book;
//    }
    
    
}
