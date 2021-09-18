package com.graphql.example.tests.client;

import com.graphql.example.GQLUtils;
import com.graphql.example.client.GraphQlClient;
import com.graphql.example.client.GraphQlQuery;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static com.graphql.example.GQLUtils.gql;
import static com.graphql.example.GQLUtils.readGql;

public class FirstGraphQLTestWithClient {

    private final GraphQlClient graphQlClient = new GraphQlClient("https://api.spacex.land/graphql/");

    @Test
    public void firstTest(){

        List<Object> list = graphQlClient.executeGql("users.gql")
                .then().extract().jsonPath().getList("data.users");
        Assertions.assertEquals(list.size(), 111);
        //.body("data.company.ceo", Matchers.equalTo("Elon Musk"));

    }

    @Test
    public void testWithVariables(){
        Map<String, ?> variables = Map.of("number", 2);

        List<Object> list = graphQlClient.executeGql("users.gql", variables)
                .then().extract().jsonPath().getList("data.users");
        Assertions.assertEquals(list.size(), 2);

    }

    @Test
    public void testCanGetUserByName(){
        Map<?, ?> variables = Map.of("where", Map.of("name", Map.of("_like", "Akak%")));

        List<Object> list = graphQlClient.executeGql("user_by_condition.gql", variables)
                .then().extract().jsonPath().getList("data.users");
        Assertions.assertEquals(list.size(), 2);

    }
}
