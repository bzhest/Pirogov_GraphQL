package com.graphql.example.tests.advanced;

import com.graphql.example.GQLUtils;
import com.graphql.example.client.GraphQlClient;
import com.graphql.example.pojo.generated.Info;
import com.graphql.example.pojo.generated.Users;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class AdvancedGraphQLTest {

    private final GraphQlClient graphQlClient = new GraphQlClient("https://api.spacex.land/graphql/");


    @Test
    public void testCanGetCompanyInfo() {
        var query =  GQLUtils.readGql("company.gql");
        graphQlClient.executeQuery(query).then().body("data.company.ceo", Matchers.equalTo("Elon Musk"));
    }

    @Test
    public void testCanGetCompanyInfoAsPojo() {
        Info companyInfo = graphQlClient.executeGql("company.gql").then().asPojo(Info.class);
        MatcherAssert.assertThat(companyInfo.getCeo(), Matchers.equalTo("Elon Musk"));
    }
}
