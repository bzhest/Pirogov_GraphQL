package com.graphql.example.pojo.generated;

/**
 * Resolver for users_aggregate_fields
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-09-18T15:40:23+0300"
)
public interface Users_aggregate_fieldsResolver {

    Integer count(Users_aggregate_fields users_aggregate_fields, @javax.validation.constraints.NotNull java.util.List<Users_select_column> columns, Boolean distinct) throws Exception;

}
