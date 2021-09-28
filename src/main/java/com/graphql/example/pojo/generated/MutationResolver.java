package com.graphql.example.pojo.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-09-18T15:40:23+0300"
)
public interface MutationResolver {

    /**
     * delete data from the table: "users"
     */
    Users_mutation_response delete_users(@javax.validation.constraints.NotNull Users_bool_exp where) throws Exception;

    /**
     * insert data into the table: "users"
     */
    Users_mutation_response insert_users(@javax.validation.constraints.NotNull java.util.List<Users_insert_input> objects, Users_on_conflict on_conflict) throws Exception;

    /**
     * update data of the table: "users"
     */
    Users_mutation_response update_users(Users_set_input _set, @javax.validation.constraints.NotNull Users_bool_exp where) throws Exception;

}
