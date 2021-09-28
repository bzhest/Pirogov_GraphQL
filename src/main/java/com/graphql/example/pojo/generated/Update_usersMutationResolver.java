package com.graphql.example.pojo.generated;

/**
 * update data of the table: "users"
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-09-18T15:40:23+0300"
)
public interface Update_usersMutationResolver {

    /**
     * update data of the table: "users"
     */
    Users_mutation_response update_users(Users_set_input _set, @javax.validation.constraints.NotNull Users_bool_exp where) throws Exception;

}
