package com.graphql.example.pojo.generated;

/**
 * fetch data from the table: "users" using primary key columns
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-09-18T15:40:23+0300"
)
public interface Users_by_pkSubscriptionResolver {

    /**
     * fetch data from the table: "users" using primary key columns
     */
    Users users_by_pk(@javax.validation.constraints.NotNull String id) throws Exception;

}
