package com.graphql.repositories;
import com.graphql.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> { 
	
}
