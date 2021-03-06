package com.graphql.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    Long author_id;
    
    String firstName;
    String lastName;
    
    public Author() {
    	
    }

    public Author(Long author_id) {
        this.author_id = author_id;
    }

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getId() {
        return author_id;
    }

    public void setId(Long author_id) {
        this.author_id = author_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return author_id.equals(author.author_id);
    }

    @Override
    public int hashCode() {
        return author_id.hashCode();
    }

	@Override
	public String toString() {
		return "Author [author_id=" + author_id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	
}
