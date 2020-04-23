package com.graphql.resolvers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.graphql.models.Author;
import com.graphql.models.Book;
import com.graphql.services.AuthorService;
import com.graphql.services.BookService;

@Component
public class Query implements GraphQLQueryResolver {
	
	@Autowired
    private BookService bookService;
	
	@Autowired
    private AuthorService authorService;

    
    public Iterable<Book> findAllBooks() {
        return bookService.listAllBooks();
    }

    public Iterable<Author> findAllAuthors() {
        return authorService.listAllAuthors();
    }

    public long countBooks() {
        return bookService.countAllBooks();
    }
    public long countAuthors() {
        return authorService.countAllAuthors();
    }
}
