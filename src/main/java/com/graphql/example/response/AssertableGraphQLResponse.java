package com.graphql.example.response;

import com.fasterxml.jackson.annotation.JsonRootName;
import io.restassured.response.Response;
import org.hamcrest.Matcher;

public class AssertableGraphQLResponse {

    private final Response response;

    public AssertableGraphQLResponse(Response response) {
        this.response = response;
    }

    public AssertableGraphQLResponse body(String jsonPath, Matcher<?> matcher) {
        response.then().body(jsonPath, matcher);
        return this;
    }

    public <T> T asPojo(Class<T> tClass) {
        return response.then().extract().jsonPath().getObject(getJsonPath(tClass), tClass);
    }

    private String getJsonPath(Class<?> tClass) {
        JsonRootName rootName = tClass.getAnnotation(JsonRootName.class);
        String name = "data";
        if (rootName != null) {
            name += "." + rootName.value();
        } else {
            name += "." + tClass.getSimpleName().toLowerCase();
        }
        return name;

    }
}
