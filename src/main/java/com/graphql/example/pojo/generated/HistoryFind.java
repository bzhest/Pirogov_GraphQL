package com.graphql.example.pojo.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-09-18T15:40:23+0300"
)
public class HistoryFind implements java.io.Serializable {

    private String end;
    private Integer flight_number;
    private String id;
    private String start;

    public HistoryFind() {
    }

    public HistoryFind(String end, Integer flight_number, String id, String start) {
        this.end = end;
        this.flight_number = flight_number;
        this.id = id;
        this.start = start;
    }

    public String getEnd() {
        return end;
    }
    public void setEnd(String end) {
        this.end = end;
    }

    public Integer getFlight_number() {
        return flight_number;
    }
    public void setFlight_number(Integer flight_number) {
        this.flight_number = flight_number;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getStart() {
        return start;
    }
    public void setStart(String start) {
        this.start = start;
    }



    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String end;
        private Integer flight_number;
        private String id;
        private String start;

        public Builder() {
        }

        public Builder setEnd(String end) {
            this.end = end;
            return this;
        }

        public Builder setFlight_number(Integer flight_number) {
            this.flight_number = flight_number;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setStart(String start) {
            this.start = start;
            return this;
        }


        public HistoryFind build() {
            return new HistoryFind(end, flight_number, id, start);
        }

    }
}
