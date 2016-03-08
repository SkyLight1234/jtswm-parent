package com.zdpzsp.frame.bo;

import java.util.ArrayList;
import java.util.List;

public class View_paramExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public View_paramExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCode_typeIsNull() {
            addCriterion("code_type is null");
            return (Criteria) this;
        }

        public Criteria andCode_typeIsNotNull() {
            addCriterion("code_type is not null");
            return (Criteria) this;
        }

        public Criteria andCode_typeEqualTo(String value) {
            addCriterion("code_type =", value, "code_type");
            return (Criteria) this;
        }

        public Criteria andCode_typeNotEqualTo(String value) {
            addCriterion("code_type <>", value, "code_type");
            return (Criteria) this;
        }

        public Criteria andCode_typeGreaterThan(String value) {
            addCriterion("code_type >", value, "code_type");
            return (Criteria) this;
        }

        public Criteria andCode_typeGreaterThanOrEqualTo(String value) {
            addCriterion("code_type >=", value, "code_type");
            return (Criteria) this;
        }

        public Criteria andCode_typeLessThan(String value) {
            addCriterion("code_type <", value, "code_type");
            return (Criteria) this;
        }

        public Criteria andCode_typeLessThanOrEqualTo(String value) {
            addCriterion("code_type <=", value, "code_type");
            return (Criteria) this;
        }

        public Criteria andCode_typeLike(String value) {
            addCriterion("code_type like", value, "code_type");
            return (Criteria) this;
        }

        public Criteria andCode_typeNotLike(String value) {
            addCriterion("code_type not like", value, "code_type");
            return (Criteria) this;
        }

        public Criteria andCode_typeIn(List<String> values) {
            addCriterion("code_type in", values, "code_type");
            return (Criteria) this;
        }

        public Criteria andCode_typeNotIn(List<String> values) {
            addCriterion("code_type not in", values, "code_type");
            return (Criteria) this;
        }

        public Criteria andCode_typeBetween(String value1, String value2) {
            addCriterion("code_type between", value1, value2, "code_type");
            return (Criteria) this;
        }

        public Criteria andCode_typeNotBetween(String value1, String value2) {
            addCriterion("code_type not between", value1, value2, "code_type");
            return (Criteria) this;
        }

        public Criteria andCode_valueIsNull() {
            addCriterion("code_value is null");
            return (Criteria) this;
        }

        public Criteria andCode_valueIsNotNull() {
            addCriterion("code_value is not null");
            return (Criteria) this;
        }

        public Criteria andCode_valueEqualTo(String value) {
            addCriterion("code_value =", value, "code_value");
            return (Criteria) this;
        }

        public Criteria andCode_valueNotEqualTo(String value) {
            addCriterion("code_value <>", value, "code_value");
            return (Criteria) this;
        }

        public Criteria andCode_valueGreaterThan(String value) {
            addCriterion("code_value >", value, "code_value");
            return (Criteria) this;
        }

        public Criteria andCode_valueGreaterThanOrEqualTo(String value) {
            addCriterion("code_value >=", value, "code_value");
            return (Criteria) this;
        }

        public Criteria andCode_valueLessThan(String value) {
            addCriterion("code_value <", value, "code_value");
            return (Criteria) this;
        }

        public Criteria andCode_valueLessThanOrEqualTo(String value) {
            addCriterion("code_value <=", value, "code_value");
            return (Criteria) this;
        }

        public Criteria andCode_valueLike(String value) {
            addCriterion("code_value like", value, "code_value");
            return (Criteria) this;
        }

        public Criteria andCode_valueNotLike(String value) {
            addCriterion("code_value not like", value, "code_value");
            return (Criteria) this;
        }

        public Criteria andCode_valueIn(List<String> values) {
            addCriterion("code_value in", values, "code_value");
            return (Criteria) this;
        }

        public Criteria andCode_valueNotIn(List<String> values) {
            addCriterion("code_value not in", values, "code_value");
            return (Criteria) this;
        }

        public Criteria andCode_valueBetween(String value1, String value2) {
            addCriterion("code_value between", value1, value2, "code_value");
            return (Criteria) this;
        }

        public Criteria andCode_valueNotBetween(String value1, String value2) {
            addCriterion("code_value not between", value1, value2, "code_value");
            return (Criteria) this;
        }

        public Criteria andCode_nameIsNull() {
            addCriterion("code_name is null");
            return (Criteria) this;
        }

        public Criteria andCode_nameIsNotNull() {
            addCriterion("code_name is not null");
            return (Criteria) this;
        }

        public Criteria andCode_nameEqualTo(String value) {
            addCriterion("code_name =", value, "code_name");
            return (Criteria) this;
        }

        public Criteria andCode_nameNotEqualTo(String value) {
            addCriterion("code_name <>", value, "code_name");
            return (Criteria) this;
        }

        public Criteria andCode_nameGreaterThan(String value) {
            addCriterion("code_name >", value, "code_name");
            return (Criteria) this;
        }

        public Criteria andCode_nameGreaterThanOrEqualTo(String value) {
            addCriterion("code_name >=", value, "code_name");
            return (Criteria) this;
        }

        public Criteria andCode_nameLessThan(String value) {
            addCriterion("code_name <", value, "code_name");
            return (Criteria) this;
        }

        public Criteria andCode_nameLessThanOrEqualTo(String value) {
            addCriterion("code_name <=", value, "code_name");
            return (Criteria) this;
        }

        public Criteria andCode_nameLike(String value) {
            addCriterion("code_name like", value, "code_name");
            return (Criteria) this;
        }

        public Criteria andCode_nameNotLike(String value) {
            addCriterion("code_name not like", value, "code_name");
            return (Criteria) this;
        }

        public Criteria andCode_nameIn(List<String> values) {
            addCriterion("code_name in", values, "code_name");
            return (Criteria) this;
        }

        public Criteria andCode_nameNotIn(List<String> values) {
            addCriterion("code_name not in", values, "code_name");
            return (Criteria) this;
        }

        public Criteria andCode_nameBetween(String value1, String value2) {
            addCriterion("code_name between", value1, value2, "code_name");
            return (Criteria) this;
        }

        public Criteria andCode_nameNotBetween(String value1, String value2) {
            addCriterion("code_name not between", value1, value2, "code_name");
            return (Criteria) this;
        }

        public Criteria andCode_descIsNull() {
            addCriterion("code_desc is null");
            return (Criteria) this;
        }

        public Criteria andCode_descIsNotNull() {
            addCriterion("code_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCode_descEqualTo(String value) {
            addCriterion("code_desc =", value, "code_desc");
            return (Criteria) this;
        }

        public Criteria andCode_descNotEqualTo(String value) {
            addCriterion("code_desc <>", value, "code_desc");
            return (Criteria) this;
        }

        public Criteria andCode_descGreaterThan(String value) {
            addCriterion("code_desc >", value, "code_desc");
            return (Criteria) this;
        }

        public Criteria andCode_descGreaterThanOrEqualTo(String value) {
            addCriterion("code_desc >=", value, "code_desc");
            return (Criteria) this;
        }

        public Criteria andCode_descLessThan(String value) {
            addCriterion("code_desc <", value, "code_desc");
            return (Criteria) this;
        }

        public Criteria andCode_descLessThanOrEqualTo(String value) {
            addCriterion("code_desc <=", value, "code_desc");
            return (Criteria) this;
        }

        public Criteria andCode_descLike(String value) {
            addCriterion("code_desc like", value, "code_desc");
            return (Criteria) this;
        }

        public Criteria andCode_descNotLike(String value) {
            addCriterion("code_desc not like", value, "code_desc");
            return (Criteria) this;
        }

        public Criteria andCode_descIn(List<String> values) {
            addCriterion("code_desc in", values, "code_desc");
            return (Criteria) this;
        }

        public Criteria andCode_descNotIn(List<String> values) {
            addCriterion("code_desc not in", values, "code_desc");
            return (Criteria) this;
        }

        public Criteria andCode_descBetween(String value1, String value2) {
            addCriterion("code_desc between", value1, value2, "code_desc");
            return (Criteria) this;
        }

        public Criteria andCode_descNotBetween(String value1, String value2) {
            addCriterion("code_desc not between", value1, value2, "code_desc");
            return (Criteria) this;
        }

        public Criteria andParent_valueIsNull() {
            addCriterion("parent_value is null");
            return (Criteria) this;
        }

        public Criteria andParent_valueIsNotNull() {
            addCriterion("parent_value is not null");
            return (Criteria) this;
        }

        public Criteria andParent_valueEqualTo(String value) {
            addCriterion("parent_value =", value, "parent_value");
            return (Criteria) this;
        }

        public Criteria andParent_valueNotEqualTo(String value) {
            addCriterion("parent_value <>", value, "parent_value");
            return (Criteria) this;
        }

        public Criteria andParent_valueGreaterThan(String value) {
            addCriterion("parent_value >", value, "parent_value");
            return (Criteria) this;
        }

        public Criteria andParent_valueGreaterThanOrEqualTo(String value) {
            addCriterion("parent_value >=", value, "parent_value");
            return (Criteria) this;
        }

        public Criteria andParent_valueLessThan(String value) {
            addCriterion("parent_value <", value, "parent_value");
            return (Criteria) this;
        }

        public Criteria andParent_valueLessThanOrEqualTo(String value) {
            addCriterion("parent_value <=", value, "parent_value");
            return (Criteria) this;
        }

        public Criteria andParent_valueLike(String value) {
            addCriterion("parent_value like", value, "parent_value");
            return (Criteria) this;
        }

        public Criteria andParent_valueNotLike(String value) {
            addCriterion("parent_value not like", value, "parent_value");
            return (Criteria) this;
        }

        public Criteria andParent_valueIn(List<String> values) {
            addCriterion("parent_value in", values, "parent_value");
            return (Criteria) this;
        }

        public Criteria andParent_valueNotIn(List<String> values) {
            addCriterion("parent_value not in", values, "parent_value");
            return (Criteria) this;
        }

        public Criteria andParent_valueBetween(String value1, String value2) {
            addCriterion("parent_value between", value1, value2, "parent_value");
            return (Criteria) this;
        }

        public Criteria andParent_valueNotBetween(String value1, String value2) {
            addCriterion("parent_value not between", value1, value2, "parent_value");
            return (Criteria) this;
        }

        public Criteria andParent_typeIsNull() {
            addCriterion("parent_type is null");
            return (Criteria) this;
        }

        public Criteria andParent_typeIsNotNull() {
            addCriterion("parent_type is not null");
            return (Criteria) this;
        }

        public Criteria andParent_typeEqualTo(String value) {
            addCriterion("parent_type =", value, "parent_type");
            return (Criteria) this;
        }

        public Criteria andParent_typeNotEqualTo(String value) {
            addCriterion("parent_type <>", value, "parent_type");
            return (Criteria) this;
        }

        public Criteria andParent_typeGreaterThan(String value) {
            addCriterion("parent_type >", value, "parent_type");
            return (Criteria) this;
        }

        public Criteria andParent_typeGreaterThanOrEqualTo(String value) {
            addCriterion("parent_type >=", value, "parent_type");
            return (Criteria) this;
        }

        public Criteria andParent_typeLessThan(String value) {
            addCriterion("parent_type <", value, "parent_type");
            return (Criteria) this;
        }

        public Criteria andParent_typeLessThanOrEqualTo(String value) {
            addCriterion("parent_type <=", value, "parent_type");
            return (Criteria) this;
        }

        public Criteria andParent_typeLike(String value) {
            addCriterion("parent_type like", value, "parent_type");
            return (Criteria) this;
        }

        public Criteria andParent_typeNotLike(String value) {
            addCriterion("parent_type not like", value, "parent_type");
            return (Criteria) this;
        }

        public Criteria andParent_typeIn(List<String> values) {
            addCriterion("parent_type in", values, "parent_type");
            return (Criteria) this;
        }

        public Criteria andParent_typeNotIn(List<String> values) {
            addCriterion("parent_type not in", values, "parent_type");
            return (Criteria) this;
        }

        public Criteria andParent_typeBetween(String value1, String value2) {
            addCriterion("parent_type between", value1, value2, "parent_type");
            return (Criteria) this;
        }

        public Criteria andParent_typeNotBetween(String value1, String value2) {
            addCriterion("parent_type not between", value1, value2, "parent_type");
            return (Criteria) this;
        }

        public Criteria andCode_type_aliasIsNull() {
            addCriterion("code_type_alias is null");
            return (Criteria) this;
        }

        public Criteria andCode_type_aliasIsNotNull() {
            addCriterion("code_type_alias is not null");
            return (Criteria) this;
        }

        public Criteria andCode_type_aliasEqualTo(String value) {
            addCriterion("code_type_alias =", value, "code_type_alias");
            return (Criteria) this;
        }

        public Criteria andCode_type_aliasNotEqualTo(String value) {
            addCriterion("code_type_alias <>", value, "code_type_alias");
            return (Criteria) this;
        }

        public Criteria andCode_type_aliasGreaterThan(String value) {
            addCriterion("code_type_alias >", value, "code_type_alias");
            return (Criteria) this;
        }

        public Criteria andCode_type_aliasGreaterThanOrEqualTo(String value) {
            addCriterion("code_type_alias >=", value, "code_type_alias");
            return (Criteria) this;
        }

        public Criteria andCode_type_aliasLessThan(String value) {
            addCriterion("code_type_alias <", value, "code_type_alias");
            return (Criteria) this;
        }

        public Criteria andCode_type_aliasLessThanOrEqualTo(String value) {
            addCriterion("code_type_alias <=", value, "code_type_alias");
            return (Criteria) this;
        }

        public Criteria andCode_type_aliasLike(String value) {
            addCriterion("code_type_alias like", value, "code_type_alias");
            return (Criteria) this;
        }

        public Criteria andCode_type_aliasNotLike(String value) {
            addCriterion("code_type_alias not like", value, "code_type_alias");
            return (Criteria) this;
        }

        public Criteria andCode_type_aliasIn(List<String> values) {
            addCriterion("code_type_alias in", values, "code_type_alias");
            return (Criteria) this;
        }

        public Criteria andCode_type_aliasNotIn(List<String> values) {
            addCriterion("code_type_alias not in", values, "code_type_alias");
            return (Criteria) this;
        }

        public Criteria andCode_type_aliasBetween(String value1, String value2) {
            addCriterion("code_type_alias between", value1, value2, "code_type_alias");
            return (Criteria) this;
        }

        public Criteria andCode_type_aliasNotBetween(String value1, String value2) {
            addCriterion("code_type_alias not between", value1, value2, "code_type_alias");
            return (Criteria) this;
        }

        public Criteria andSort_idIsNull() {
            addCriterion("sort_id is null");
            return (Criteria) this;
        }

        public Criteria andSort_idIsNotNull() {
            addCriterion("sort_id is not null");
            return (Criteria) this;
        }

        public Criteria andSort_idEqualTo(String value) {
            addCriterion("sort_id =", value, "sort_id");
            return (Criteria) this;
        }

        public Criteria andSort_idNotEqualTo(String value) {
            addCriterion("sort_id <>", value, "sort_id");
            return (Criteria) this;
        }

        public Criteria andSort_idGreaterThan(String value) {
            addCriterion("sort_id >", value, "sort_id");
            return (Criteria) this;
        }

        public Criteria andSort_idGreaterThanOrEqualTo(String value) {
            addCriterion("sort_id >=", value, "sort_id");
            return (Criteria) this;
        }

        public Criteria andSort_idLessThan(String value) {
            addCriterion("sort_id <", value, "sort_id");
            return (Criteria) this;
        }

        public Criteria andSort_idLessThanOrEqualTo(String value) {
            addCriterion("sort_id <=", value, "sort_id");
            return (Criteria) this;
        }

        public Criteria andSort_idLike(String value) {
            addCriterion("sort_id like", value, "sort_id");
            return (Criteria) this;
        }

        public Criteria andSort_idNotLike(String value) {
            addCriterion("sort_id not like", value, "sort_id");
            return (Criteria) this;
        }

        public Criteria andSort_idIn(List<String> values) {
            addCriterion("sort_id in", values, "sort_id");
            return (Criteria) this;
        }

        public Criteria andSort_idNotIn(List<String> values) {
            addCriterion("sort_id not in", values, "sort_id");
            return (Criteria) this;
        }

        public Criteria andSort_idBetween(String value1, String value2) {
            addCriterion("sort_id between", value1, value2, "sort_id");
            return (Criteria) this;
        }

        public Criteria andSort_idNotBetween(String value1, String value2) {
            addCriterion("sort_id not between", value1, value2, "sort_id");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andExtend_codeIsNull() {
            addCriterion("extend_code is null");
            return (Criteria) this;
        }

        public Criteria andExtend_codeIsNotNull() {
            addCriterion("extend_code is not null");
            return (Criteria) this;
        }

        public Criteria andExtend_codeEqualTo(String value) {
            addCriterion("extend_code =", value, "extend_code");
            return (Criteria) this;
        }

        public Criteria andExtend_codeNotEqualTo(String value) {
            addCriterion("extend_code <>", value, "extend_code");
            return (Criteria) this;
        }

        public Criteria andExtend_codeGreaterThan(String value) {
            addCriterion("extend_code >", value, "extend_code");
            return (Criteria) this;
        }

        public Criteria andExtend_codeGreaterThanOrEqualTo(String value) {
            addCriterion("extend_code >=", value, "extend_code");
            return (Criteria) this;
        }

        public Criteria andExtend_codeLessThan(String value) {
            addCriterion("extend_code <", value, "extend_code");
            return (Criteria) this;
        }

        public Criteria andExtend_codeLessThanOrEqualTo(String value) {
            addCriterion("extend_code <=", value, "extend_code");
            return (Criteria) this;
        }

        public Criteria andExtend_codeLike(String value) {
            addCriterion("extend_code like", value, "extend_code");
            return (Criteria) this;
        }

        public Criteria andExtend_codeNotLike(String value) {
            addCriterion("extend_code not like", value, "extend_code");
            return (Criteria) this;
        }

        public Criteria andExtend_codeIn(List<String> values) {
            addCriterion("extend_code in", values, "extend_code");
            return (Criteria) this;
        }

        public Criteria andExtend_codeNotIn(List<String> values) {
            addCriterion("extend_code not in", values, "extend_code");
            return (Criteria) this;
        }

        public Criteria andExtend_codeBetween(String value1, String value2) {
            addCriterion("extend_code between", value1, value2, "extend_code");
            return (Criteria) this;
        }

        public Criteria andExtend_codeNotBetween(String value1, String value2) {
            addCriterion("extend_code not between", value1, value2, "extend_code");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}