# GraphQl-SpringBoot-API
This Project is intended to implement GraphQl in Spring Boot using Java.

##### Used Technologies
- Spring Boot.
- Java as a Programming Language. 
- GraphQL.
- Maven
- Spring Data JPA
- PostgreSQL Driver

##### Why Use GraphQL Over REST API
- GraphQL allows the use of only a single end point to identify all resources unlike REST
- With GraphQL only desired data can be fetched from an object unlike REST that returns all data about an object.

##### Limitations With GraphQL
- The nested queries with multiple fields could lead to performance issues. 
- GraphQL queries must be carefully designed as the control is with client and it could ask anything.
- Web caching is Not easier due to a single end-point.
- Retrieving objects recursively (to infinite length) is not supported in GraphQL. One has to specify to what depth it needs the data to get the recursive data.

##### Some Definitions
- Schema: The contract between the GraphQL client and the GraphQL server
- Query: Similar to GET call in REST and used by the client to query the fields
- Mutations: It is similar to a POST/PUT call in REST and is used by the client for any insert/update operation.

##### Testing Hosted API
- Link: https://graphql-api-spring-boot.herokuapp.com/graphiql

##### Testing API Locally
- clone the repository at: https://github.com/moseskamira/GraphQl-SpringBoot-API.git
- Open the project in your favorite IDE though I prefer using STS.
- Run the maven Application
- Load http://localhost:8085/graphiql in your favorite browser
- Remember the server is listening on port 8085

##### Screenshots:

![Mutation](/images/mut.png)

![Query](/images/GraphQLTest.png)


