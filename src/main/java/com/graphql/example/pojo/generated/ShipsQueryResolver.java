package com.graphql.example.pojo.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-09-18T15:40:23+0300"
)
public interface ShipsQueryResolver {

    java.util.List<Ship> ships(ShipsFind find, Integer limit, Integer offset, String order, String sort) throws Exception;

}
