package com.graphql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AuthorService {
	
	@Autowired
	private AuthorRepository authorRepository;
	
//	public AuthorService(AuthorRepository authorRepository) {
//		this.authorRepository = authorRepository;
//		}
	
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
