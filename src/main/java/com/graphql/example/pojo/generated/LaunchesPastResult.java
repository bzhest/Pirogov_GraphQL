package com.graphql.example.pojo.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-09-18T15:40:23+0300"
)
public class LaunchesPastResult implements java.io.Serializable {

    private java.util.List<Launch> data;
    private Result result;

    public LaunchesPastResult() {
    }

    public LaunchesPastResult(java.util.List<Launch> data, Result result) {
        this.data = data;
        this.result = result;
    }

    public java.util.List<Launch> getData() {
        return data;
    }
    public void setData(java.util.List<Launch> data) {
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

        private java.util.List<Launch> data;
        private Result result;

        public Builder() {
        }

        public Builder setData(java.util.List<Launch> data) {
            this.data = data;
            return this;
        }

        public Builder setResult(Result result) {
            this.result = result;
            return this;
        }


        public LaunchesPastResult build() {
            return new LaunchesPastResult(data, result);
        }

    }
}
