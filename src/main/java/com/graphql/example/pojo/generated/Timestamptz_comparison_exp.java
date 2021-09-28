package com.graphql.example.pojo.generated;

/**
 * expression to compare columns of type timestamptz. All fields are combined with logical 'AND'.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-09-18T15:40:23+0300"
)
public class Timestamptz_comparison_exp implements java.io.Serializable {

    private String _eq;
    private String _gt;
    private String _gte;
    @javax.validation.constraints.NotNull
    private java.util.List<String> _in;
    private Boolean _is_null;
    private String _lt;
    private String _lte;
    private String _neq;
    @javax.validation.constraints.NotNull
    private java.util.List<String> _nin;

    public Timestamptz_comparison_exp() {
    }

    public Timestamptz_comparison_exp(String _eq, String _gt, String _gte, java.util.List<String> _in, Boolean _is_null, String _lt, String _lte, String _neq, java.util.List<String> _nin) {
        this._eq = _eq;
        this._gt = _gt;
        this._gte = _gte;
        this._in = _in;
        this._is_null = _is_null;
        this._lt = _lt;
        this._lte = _lte;
        this._neq = _neq;
        this._nin = _nin;
    }

    public String get_eq() {
        return _eq;
    }
    public void set_eq(String _eq) {
        this._eq = _eq;
    }

    public String get_gt() {
        return _gt;
    }
    public void set_gt(String _gt) {
        this._gt = _gt;
    }

    public String get_gte() {
        return _gte;
    }
    public void set_gte(String _gte) {
        this._gte = _gte;
    }

    public java.util.List<String> get_in() {
        return _in;
    }
    public void set_in(java.util.List<String> _in) {
        this._in = _in;
    }

    public Boolean get_is_null() {
        return _is_null;
    }
    public void set_is_null(Boolean _is_null) {
        this._is_null = _is_null;
    }

    public String get_lt() {
        return _lt;
    }
    public void set_lt(String _lt) {
        this._lt = _lt;
    }

    public String get_lte() {
        return _lte;
    }
    public void set_lte(String _lte) {
        this._lte = _lte;
    }

    public String get_neq() {
        return _neq;
    }
    public void set_neq(String _neq) {
        this._neq = _neq;
    }

    public java.util.List<String> get_nin() {
        return _nin;
    }
    public void set_nin(java.util.List<String> _nin) {
        this._nin = _nin;
    }



    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String _eq;
        private String _gt;
        private String _gte;
        private java.util.List<String> _in;
        private Boolean _is_null;
        private String _lt;
        private String _lte;
        private String _neq;
        private java.util.List<String> _nin;

        public Builder() {
        }

        public Builder set_eq(String _eq) {
            this._eq = _eq;
            return this;
        }

        public Builder set_gt(String _gt) {
            this._gt = _gt;
            return this;
        }

        public Builder set_gte(String _gte) {
            this._gte = _gte;
            return this;
        }

        public Builder set_in(java.util.List<String> _in) {
            this._in = _in;
            return this;
        }

        public Builder set_is_null(Boolean _is_null) {
            this._is_null = _is_null;
            return this;
        }

        public Builder set_lt(String _lt) {
            this._lt = _lt;
            return this;
        }

        public Builder set_lte(String _lte) {
            this._lte = _lte;
            return this;
        }

        public Builder set_neq(String _neq) {
            this._neq = _neq;
            return this;
        }

        public Builder set_nin(java.util.List<String> _nin) {
            this._nin = _nin;
            return this;
        }


        public Timestamptz_comparison_exp build() {
            return new Timestamptz_comparison_exp(_eq, _gt, _gte, _in, _is_null, _lt, _lte, _neq, _nin);
        }

    }
}
