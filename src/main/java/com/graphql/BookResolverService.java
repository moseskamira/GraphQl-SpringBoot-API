package com.graphql;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookResolverService {
	
	@Autowired
	private AuthorRepository authorRepository;

    @Transactional(readOnly = true)
    public Optional<Author> getAuthorByBook(Book book) {
        return authorRepository.findById(book.getAuthor().getId());
    }

}
