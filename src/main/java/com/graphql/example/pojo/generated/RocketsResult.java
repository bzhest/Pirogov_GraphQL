package com.graphql.example.pojo.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-09-18T15:40:23+0300"
)
public class RocketsResult implements java.io.Serializable {

    private java.util.List<Rocket> data;
    private Result result;

    public RocketsResult() {
    }

    public RocketsResult(java.util.List<Rocket> data, Result result) {
        this.data = data;
        this.result = result;
    }

    public java.util.List<Rocket> getData() {
        return data;
    }
    public void setData(java.util.List<Rocket> data) {
        this.data = data;
    }

    public Result getResult() {
        return result;
    }
    public void setResult(Result result) {
        this.result = result;
    }



    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private java.util.List<Rocket> data;
        private Result result;

        public Builder() {
        }

        public Builder setData(java.util.List<Rocket> data) {
            this.data = data;
            return this;
        }

        public Builder setResult(Result result) {
            this.result = result;
            return this;
        }


        public RocketsResult build() {
            return new RocketsResult(data, result);
        }

    }
}
