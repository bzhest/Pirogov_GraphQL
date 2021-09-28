package com.graphql.example.client;

import com.graphql.example.GQLUtils;
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import com.graphql.example.response.GraphQLResponse;

public class GraphQlClient {

    private final String url;

    private final RequestSpecification requestSpecification = RestAssured.given()
            .contentType(ContentType.JSON)
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter());

    public GraphQlClient(String url) {
        this.url = url;
    }

    public Response executeQuery(String query){
        return requestSpecification
                .body(query)
                .post(url);
    }

    public GraphQLResponse executeQuery(GraphQlQuery query){
        return new GraphQLResponse(requestSpecification
                .body(query)
                .post(url));
    }

    public GraphQLResponse executeGql(String fileName){
        var graphQlQuery = GQLUtils.readGql(fileName);
        return executeQuery(graphQlQuery);
    }

    public GraphQLResponse executeGql(String fileName, Object variables){
        var graphQlQuery = GQLUtils.readGql(fileName, variables);
        return executeQuery(graphQlQuery);
    }
}
