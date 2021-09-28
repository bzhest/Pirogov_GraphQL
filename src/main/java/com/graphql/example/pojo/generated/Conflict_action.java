package com.graphql.example.pojo.generated;

/**
 * conflict action
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-09-18T15:40:23+0300"
)
public enum Conflict_action {

    /**
     * ignore the insert on this row
     */
    ignore("ignore"),
    /**
     * update the row with the given values
     */
    update("update");

    private final String graphqlName;

    private Conflict_action(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
