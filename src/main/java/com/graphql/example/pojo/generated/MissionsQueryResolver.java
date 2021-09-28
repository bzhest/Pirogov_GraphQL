package com.graphql.example.pojo.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-09-18T15:40:23+0300"
)
public interface MissionsQueryResolver {

    java.util.List<Mission> missions(MissionsFind find, Integer limit, Integer offset) throws Exception;

}
