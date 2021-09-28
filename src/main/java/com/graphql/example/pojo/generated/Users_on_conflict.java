package com.graphql.example.pojo.generated;

/**
 * on conflict condition type for table "users"
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-09-18T15:40:23+0300"
)
public class Users_on_conflict implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private Users_constraint constraint;
    @javax.validation.constraints.NotNull
    private java.util.List<Users_update_column> update_columns;

    public Users_on_conflict() {
    }

    public Users_on_conflict(Users_constraint constraint, java.util.List<Users_update_column> update_columns) {
        this.constraint = constraint;
        this.update_columns = update_columns;
    }

    public Users_constraint getConstraint() {
        return constraint;
    }
    public void setConstraint(Users_constraint constraint) {
        this.constraint = constraint;
    }

    public java.util.List<Users_update_column> getUpdate_columns() {
        return update_columns;
    }
    public void setUpdate_columns(java.util.List<Users_update_column> update_columns) {
        this.update_columns = update_columns;
    }



    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private Users_constraint constraint;
        private java.util.List<Users_update_column> update_columns;

        public Builder() {
        }

        public Builder setConstraint(Users_constraint constraint) {
            this.constraint = constraint;
            return this;
        }

        public Builder setUpdate_columns(java.util.List<Users_update_column> update_columns) {
            this.update_columns = update_columns;
            return this;
        }


        public Users_on_conflict build() {
            return new Users_on_conflict(constraint, update_columns);
        }

    }
}
