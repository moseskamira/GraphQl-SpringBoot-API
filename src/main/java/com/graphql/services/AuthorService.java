package com.graphql.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.graphql.models.Author;
import com.graphql.repositories.AuthorRepository;

@Service
public class AuthorService {
	
	@Autowired
	private AuthorRepository authorRepository;
	
	@Transactional
	public Author createNewAuthor(String firstName, String lastName) {
		Author author = new Author();
        author.setFirstName(firstName);
        author.setLastName(lastName);
        authorRepository.save(author);
        return author;
    }
	
	public Iterable<Author> listAllAuthors() {
		return authorRepository.findAll();
	}
	
	public long countAllAuthors() {
        return authorRepository.count();
    }

}
