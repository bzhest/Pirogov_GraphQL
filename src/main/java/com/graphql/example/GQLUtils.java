package com.graphql.example;

import com.graphql.example.client.GraphQlQuery;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.util.Objects;

public class GQLUtils {

    public static GraphQlQuery gql(String query) {
        return new GraphQlQuery(query);
    }

    public static GraphQlQuery gql(String query, Object variable) {
        return new GraphQlQuery(query, variable);
    }

    private static String readFile(String name){
        URL url = GQLUtils.class.getClassLoader().getResource(name);
        File file = new File(Objects.requireNonNull(url).getFile());
        try{
            return new String(Files.readAllBytes(file.toPath()));
        }catch (IOException ex){
            throw new RuntimeException("Unable to read name " + name);
        }
    }

    public static GraphQlQuery readGql(String name){
        return gql(readFile(name));
    }

    public static GraphQlQuery readGql(String name, Object variable){
        return gql(readFile(name), variable);
    }
}
