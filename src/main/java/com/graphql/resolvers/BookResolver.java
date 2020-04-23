package com.graphql.resolvers;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.graphql.models.Author;
import com.graphql.models.Book;
import com.graphql.services.BookResolverService;


@Component
public class BookResolver implements GraphQLResolver<Book> {
	
	@Autowired
	private BookResolverService bookResolverService;


    public Optional<Author> getAuthor(Book book) {
        return bookResolverService.getAuthorByBook(book);
    }
}
