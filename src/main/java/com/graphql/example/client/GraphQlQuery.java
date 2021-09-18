package com.graphql.example.client;

public class GraphQlQuery {

    private final String query;
    private Object variables;

    public GraphQlQuery(String query) {
        this.query = query;
    }

    public GraphQlQuery(String query, Object variables) {
        this.query = query;
        this.variables = variables;
    }

    public String getQuery() {
        return query;
    }

    public Object getVariables() {
        return variables;
    }
}
