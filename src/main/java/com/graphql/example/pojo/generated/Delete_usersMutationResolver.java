package com.graphql.example.pojo.generated;

/**
 * delete data from the table: "users"
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-09-18T15:40:23+0300"
)
public interface Delete_usersMutationResolver {

    /**
     * delete data from the table: "users"
     */
    Users_mutation_response delete_users(@javax.validation.constraints.NotNull Users_bool_exp where) throws Exception;

}
