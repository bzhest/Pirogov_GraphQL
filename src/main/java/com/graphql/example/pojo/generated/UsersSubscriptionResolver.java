package com.graphql.example.pojo.generated;

/**
 * fetch data from the table: "users"
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-09-18T15:40:23+0300"
)
public interface UsersSubscriptionResolver {

    /**
     * fetch data from the table: "users"
     */
    @javax.validation.constraints.NotNull
    java.util.List<Users> users(@javax.validation.constraints.NotNull java.util.List<Users_select_column> distinct_on, Integer limit, Integer offset, @javax.validation.constraints.NotNull java.util.List<Users_order_by> order_by, Users_bool_exp where) throws Exception;

}
