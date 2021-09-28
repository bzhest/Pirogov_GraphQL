package com.graphql.example.pojo.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-09-18T15:40:23+0300"
)
public class Volume implements java.io.Serializable {

    private Integer cubic_feet;
    private Integer cubic_meters;

    public Volume() {
    }

    public Volume(Integer cubic_feet, Integer cubic_meters) {
        this.cubic_feet = cubic_feet;
        this.cubic_meters = cubic_meters;
    }

    public Integer getCubic_feet() {
        return cubic_feet;
    }
    public void setCubic_feet(Integer cubic_feet) {
        this.cubic_feet = cubic_feet;
    }

    public Integer getCubic_meters() {
        return cubic_meters;
    }
    public void setCubic_meters(Integer cubic_meters) {
        this.cubic_meters = cubic_meters;
    }



    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private Integer cubic_feet;
        private Integer cubic_meters;

        public Builder() {
        }

        public Builder setCubic_feet(Integer cubic_feet) {
            this.cubic_feet = cubic_feet;
            return this;
        }

        public Builder setCubic_meters(Integer cubic_meters) {
            this.cubic_meters = cubic_meters;
            return this;
        }


        public Volume build() {
            return new Volume(cubic_feet, cubic_meters);
        }

    }
}
