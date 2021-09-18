package com.graphql.example.client;

import com.graphql.example.GQLUtils;
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Condition;

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

    public Response executeQuery(GraphQlQuery query){
        return requestSpecification
                .body(query)
                .post(url);
    }

    public Response executeGql(String fileName){
        var graphQlQuery = GQLUtils.readGql(fileName);
        return executeQuery(graphQlQuery);
    }

    public Response executeGql(String fileName, Object variables){
        var graphQlQuery = GQLUtils.readGql(fileName, variables);
        return executeQuery(graphQlQuery);
    }
}
