package com.graphql.example.tests;

import com.graphql.example.client.GraphQlQuery;
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

public class FirstGraphQLTest {

    @Test
    public void firstTest(){

        var query = new GraphQlQuery("{\"query\": \"{ company { ceo coo cto }}\"}");

        RestAssured.given()
                .contentType(ContentType.JSON)
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .body(query)
                .when()
                .post("https://api.spacex.land/graphql/")
                .then()
                .assertThat()
                .body("data.company.ceo", Matchers.equalTo("Elon Musk"));

    }
}
