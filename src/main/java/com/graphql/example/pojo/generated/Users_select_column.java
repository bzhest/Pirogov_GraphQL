package com.graphql.example.pojo.generated;

/**
 * select columns of table "users"
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-09-18T15:40:23+0300"
)
public enum Users_select_column {

    /**
     * column name
     */
    id("id"),
    /**
     * column name
     */
    name("name"),
    /**
     * column name
     */
    rocket("rocket"),
    /**
     * column name
     */
    timestamp("timestamp"),
    /**
     * column name
     */
    twitter("twitter");

    private final String graphqlName;

    private Users_select_column(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
