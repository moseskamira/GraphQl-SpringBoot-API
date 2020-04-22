package com.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.graphql.models.Author;
import com.graphql.models.Book;
import com.graphql.repositories.AuthorRepository;

public class BookResolver implements GraphQLResolver<Book> {
    private AuthorRepository authorRepository;

    public BookResolver(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author getAuthor(Book book) {
//        return authorRepository.findOne(book.getAuthor().getId());
    	return null;
    }
}
