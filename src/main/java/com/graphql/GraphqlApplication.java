package com.graphql;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
//@EnableJpaRepositories("com.graphql.repositories")
//@EntityScan("com.graphql.models")
public class GraphqlApplication {
	public static void main(String[] args) {
		SpringApplication.run(GraphqlApplication.class, args);
		System.out.println("This is a GraphQL implementation");
	}

}
