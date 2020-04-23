package com.graphql.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.graphql.models.Author;
import com.graphql.models.Book;
import com.graphql.repositories.AuthorRepository;

@Service
public class BookResolverService {
	
	@Autowired
	private AuthorRepository authorRepository;

    @Transactional(readOnly = true)
    public Optional<Author> getAuthorByBook(Book book) {
        return authorRepository.findById(book.getAuthor().getId());
    }

}
