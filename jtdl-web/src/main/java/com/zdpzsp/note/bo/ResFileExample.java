package com.zdpzsp.note.bo;

import java.util.ArrayList;
import java.util.List;

public class ResFileExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResFileExample() {
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

        public Criteria andRes_idIsNull() {
            addCriterion("res_id is null");
            return (Criteria) this;
        }

        public Criteria andRes_idIsNotNull() {
            addCriterion("res_id is not null");
            return (Criteria) this;
        }

        public Criteria andRes_idEqualTo(Long value) {
            addCriterion("res_id =", value, "res_id");
            return (Criteria) this;
        }

        public Criteria andRes_idNotEqualTo(Long value) {
            addCriterion("res_id <>", value, "res_id");
            return (Criteria) this;
        }

        public Criteria andRes_idGreaterThan(Long value) {
            addCriterion("res_id >", value, "res_id");
            return (Criteria) this;
        }

        public Criteria andRes_idGreaterThanOrEqualTo(Long value) {
            addCriterion("res_id >=", value, "res_id");
            return (Criteria) this;
        }

        public Criteria andRes_idLessThan(Long value) {
            addCriterion("res_id <", value, "res_id");
            return (Criteria) this;
        }

        public Criteria andRes_idLessThanOrEqualTo(Long value) {
            addCriterion("res_id <=", value, "res_id");
            return (Criteria) this;
        }

        public Criteria andRes_idIn(List<Long> values) {
            addCriterion("res_id in", values, "res_id");
            return (Criteria) this;
        }

        public Criteria andRes_idNotIn(List<Long> values) {
            addCriterion("res_id not in", values, "res_id");
            return (Criteria) this;
        }

        public Criteria andRes_idBetween(Long value1, Long value2) {
            addCriterion("res_id between", value1, value2, "res_id");
            return (Criteria) this;
        }

        public Criteria andRes_idNotBetween(Long value1, Long value2) {
            addCriterion("res_id not between", value1, value2, "res_id");
            return (Criteria) this;
        }

        public Criteria andFile_urlIsNull() {
            addCriterion("file_url is null");
            return (Criteria) this;
        }

        public Criteria andFile_urlIsNotNull() {
            addCriterion("file_url is not null");
            return (Criteria) this;
        }

        public Criteria andFile_urlEqualTo(String value) {
            addCriterion("file_url =", value, "file_url");
            return (Criteria) this;
        }

        public Criteria andFile_urlNotEqualTo(String value) {
            addCriterion("file_url <>", value, "file_url");
            return (Criteria) this;
        }

        public Criteria andFile_urlGreaterThan(String value) {
            addCriterion("file_url >", value, "file_url");
            return (Criteria) this;
        }

        public Criteria andFile_urlGreaterThanOrEqualTo(String value) {
            addCriterion("file_url >=", value, "file_url");
            return (Criteria) this;
        }

        public Criteria andFile_urlLessThan(String value) {
            addCriterion("file_url <", value, "file_url");
            return (Criteria) this;
        }

        public Criteria andFile_urlLessThanOrEqualTo(String value) {
            addCriterion("file_url <=", value, "file_url");
            return (Criteria) this;
        }

        public Criteria andFile_urlLike(String value) {
            addCriterion("file_url like", value, "file_url");
            return (Criteria) this;
        }

        public Criteria andFile_urlNotLike(String value) {
            addCriterion("file_url not like", value, "file_url");
            return (Criteria) this;
        }

        public Criteria andFile_urlIn(List<String> values) {
            addCriterion("file_url in", values, "file_url");
            return (Criteria) this;
        }

        public Criteria andFile_urlNotIn(List<String> values) {
            addCriterion("file_url not in", values, "file_url");
            return (Criteria) this;
        }

        public Criteria andFile_urlBetween(String value1, String value2) {
            addCriterion("file_url between", value1, value2, "file_url");
            return (Criteria) this;
        }

        public Criteria andFile_urlNotBetween(String value1, String value2) {
            addCriterion("file_url not between", value1, value2, "file_url");
            return (Criteria) this;
        }

        public Criteria andFile_nameIsNull() {
            addCriterion("file_name is null");
            return (Criteria) this;
        }

        public Criteria andFile_nameIsNotNull() {
            addCriterion("file_name is not null");
            return (Criteria) this;
        }

        public Criteria andFile_nameEqualTo(String value) {
            addCriterion("file_name =", value, "file_name");
            return (Criteria) this;
        }

        public Criteria andFile_nameNotEqualTo(String value) {
            addCriterion("file_name <>", value, "file_name");
            return (Criteria) this;
        }

        public Criteria andFile_nameGreaterThan(String value) {
            addCriterion("file_name >", value, "file_name");
            return (Criteria) this;
        }

        public Criteria andFile_nameGreaterThanOrEqualTo(String value) {
            addCriterion("file_name >=", value, "file_name");
            return (Criteria) this;
        }

        public Criteria andFile_nameLessThan(String value) {
            addCriterion("file_name <", value, "file_name");
            return (Criteria) this;
        }

        public Criteria andFile_nameLessThanOrEqualTo(String value) {
            addCriterion("file_name <=", value, "file_name");
            return (Criteria) this;
        }

        public Criteria andFile_nameLike(String value) {
            addCriterion("file_name like", value, "file_name");
            return (Criteria) this;
        }

        public Criteria andFile_nameNotLike(String value) {
            addCriterion("file_name not like", value, "file_name");
            return (Criteria) this;
        }

        public Criteria andFile_nameIn(List<String> values) {
            addCriterion("file_name in", values, "file_name");
            return (Criteria) this;
        }

        public Criteria andFile_nameNotIn(List<String> values) {
            addCriterion("file_name not in", values, "file_name");
            return (Criteria) this;
        }

        public Criteria andFile_nameBetween(String value1, String value2) {
            addCriterion("file_name between", value1, value2, "file_name");
            return (Criteria) this;
        }

        public Criteria andFile_nameNotBetween(String value1, String value2) {
            addCriterion("file_name not between", value1, value2, "file_name");
            return (Criteria) this;
        }

        public Criteria andFile_codeIsNull() {
            addCriterion("file_code is null");
            return (Criteria) this;
        }

        public Criteria andFile_codeIsNotNull() {
            addCriterion("file_code is not null");
            return (Criteria) this;
        }

        public Criteria andFile_codeEqualTo(String value) {
            addCriterion("file_code =", value, "file_code");
            return (Criteria) this;
        }

        public Criteria andFile_codeNotEqualTo(String value) {
            addCriterion("file_code <>", value, "file_code");
            return (Criteria) this;
        }

        public Criteria andFile_codeGreaterThan(String value) {
            addCriterion("file_code >", value, "file_code");
            return (Criteria) this;
        }

        public Criteria andFile_codeGreaterThanOrEqualTo(String value) {
            addCriterion("file_code >=", value, "file_code");
            return (Criteria) this;
        }

        public Criteria andFile_codeLessThan(String value) {
            addCriterion("file_code <", value, "file_code");
            return (Criteria) this;
        }

        public Criteria andFile_codeLessThanOrEqualTo(String value) {
            addCriterion("file_code <=", value, "file_code");
            return (Criteria) this;
        }

        public Criteria andFile_codeLike(String value) {
            addCriterion("file_code like", value, "file_code");
            return (Criteria) this;
        }

        public Criteria andFile_codeNotLike(String value) {
            addCriterion("file_code not like", value, "file_code");
            return (Criteria) this;
        }

        public Criteria andFile_codeIn(List<String> values) {
            addCriterion("file_code in", values, "file_code");
            return (Criteria) this;
        }

        public Criteria andFile_codeNotIn(List<String> values) {
            addCriterion("file_code not in", values, "file_code");
            return (Criteria) this;
        }

        public Criteria andFile_codeBetween(String value1, String value2) {
            addCriterion("file_code between", value1, value2, "file_code");
            return (Criteria) this;
        }

        public Criteria andFile_codeNotBetween(String value1, String value2) {
            addCriterion("file_code not between", value1, value2, "file_code");
            return (Criteria) this;
        }

        public Criteria andCreate_atIsNull() {
            addCriterion("create_at is null");
            return (Criteria) this;
        }

        public Criteria andCreate_atIsNotNull() {
            addCriterion("create_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_atEqualTo(Long value) {
            addCriterion("create_at =", value, "create_at");
            return (Criteria) this;
        }

        public Criteria andCreate_atNotEqualTo(Long value) {
            addCriterion("create_at <>", value, "create_at");
            return (Criteria) this;
        }

        public Criteria andCreate_atGreaterThan(Long value) {
            addCriterion("create_at >", value, "create_at");
            return (Criteria) this;
        }

        public Criteria andCreate_atGreaterThanOrEqualTo(Long value) {
            addCriterion("create_at >=", value, "create_at");
            return (Criteria) this;
        }

        public Criteria andCreate_atLessThan(Long value) {
            addCriterion("create_at <", value, "create_at");
            return (Criteria) this;
        }

        public Criteria andCreate_atLessThanOrEqualTo(Long value) {
            addCriterion("create_at <=", value, "create_at");
            return (Criteria) this;
        }

        public Criteria andCreate_atIn(List<Long> values) {
            addCriterion("create_at in", values, "create_at");
            return (Criteria) this;
        }

        public Criteria andCreate_atNotIn(List<Long> values) {
            addCriterion("create_at not in", values, "create_at");
            return (Criteria) this;
        }

        public Criteria andCreate_atBetween(Long value1, Long value2) {
            addCriterion("create_at between", value1, value2, "create_at");
            return (Criteria) this;
        }

        public Criteria andCreate_atNotBetween(Long value1, Long value2) {
            addCriterion("create_at not between", value1, value2, "create_at");
            return (Criteria) this;
        }

        public Criteria andCreate_idIsNull() {
            addCriterion("create_id is null");
            return (Criteria) this;
        }

        public Criteria andCreate_idIsNotNull() {
            addCriterion("create_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_idEqualTo(Long value) {
            addCriterion("create_id =", value, "create_id");
            return (Criteria) this;
        }

        public Criteria andCreate_idNotEqualTo(Long value) {
            addCriterion("create_id <>", value, "create_id");
            return (Criteria) this;
        }

        public Criteria andCreate_idGreaterThan(Long value) {
            addCriterion("create_id >", value, "create_id");
            return (Criteria) this;
        }

        public Criteria andCreate_idGreaterThanOrEqualTo(Long value) {
            addCriterion("create_id >=", value, "create_id");
            return (Criteria) this;
        }

        public Criteria andCreate_idLessThan(Long value) {
            addCriterion("create_id <", value, "create_id");
            return (Criteria) this;
        }

        public Criteria andCreate_idLessThanOrEqualTo(Long value) {
            addCriterion("create_id <=", value, "create_id");
            return (Criteria) this;
        }

        public Criteria andCreate_idIn(List<Long> values) {
            addCriterion("create_id in", values, "create_id");
            return (Criteria) this;
        }

        public Criteria andCreate_idNotIn(List<Long> values) {
            addCriterion("create_id not in", values, "create_id");
            return (Criteria) this;
        }

        public Criteria andCreate_idBetween(Long value1, Long value2) {
            addCriterion("create_id between", value1, value2, "create_id");
            return (Criteria) this;
        }

        public Criteria andCreate_idNotBetween(Long value1, Long value2) {
            addCriterion("create_id not between", value1, value2, "create_id");
            return (Criteria) this;
        }

        public Criteria andUpdate_atIsNull() {
            addCriterion("update_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdate_atIsNotNull() {
            addCriterion("update_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdate_atEqualTo(Long value) {
            addCriterion("update_at =", value, "update_at");
            return (Criteria) this;
        }

        public Criteria andUpdate_atNotEqualTo(Long value) {
            addCriterion("update_at <>", value, "update_at");
            return (Criteria) this;
        }

        public Criteria andUpdate_atGreaterThan(Long value) {
            addCriterion("update_at >", value, "update_at");
            return (Criteria) this;
        }

        public Criteria andUpdate_atGreaterThanOrEqualTo(Long value) {
            addCriterion("update_at >=", value, "update_at");
            return (Criteria) this;
        }

        public Criteria andUpdate_atLessThan(Long value) {
            addCriterion("update_at <", value, "update_at");
            return (Criteria) this;
        }

        public Criteria andUpdate_atLessThanOrEqualTo(Long value) {
            addCriterion("update_at <=", value, "update_at");
            return (Criteria) this;
        }

        public Criteria andUpdate_atIn(List<Long> values) {
            addCriterion("update_at in", values, "update_at");
            return (Criteria) this;
        }

        public Criteria andUpdate_atNotIn(List<Long> values) {
            addCriterion("update_at not in", values, "update_at");
            return (Criteria) this;
        }

        public Criteria andUpdate_atBetween(Long value1, Long value2) {
            addCriterion("update_at between", value1, value2, "update_at");
            return (Criteria) this;
        }

        public Criteria andUpdate_atNotBetween(Long value1, Long value2) {
            addCriterion("update_at not between", value1, value2, "update_at");
            return (Criteria) this;
        }

        public Criteria andUpdate_idIsNull() {
            addCriterion("update_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdate_idIsNotNull() {
            addCriterion("update_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdate_idEqualTo(Long value) {
            addCriterion("update_id =", value, "update_id");
            return (Criteria) this;
        }

        public Criteria andUpdate_idNotEqualTo(Long value) {
            addCriterion("update_id <>", value, "update_id");
            return (Criteria) this;
        }

        public Criteria andUpdate_idGreaterThan(Long value) {
            addCriterion("update_id >", value, "update_id");
            return (Criteria) this;
        }

        public Criteria andUpdate_idGreaterThanOrEqualTo(Long value) {
            addCriterion("update_id >=", value, "update_id");
            return (Criteria) this;
        }

        public Criteria andUpdate_idLessThan(Long value) {
            addCriterion("update_id <", value, "update_id");
            return (Criteria) this;
        }

        public Criteria andUpdate_idLessThanOrEqualTo(Long value) {
            addCriterion("update_id <=", value, "update_id");
            return (Criteria) this;
        }

        public Criteria andUpdate_idIn(List<Long> values) {
            addCriterion("update_id in", values, "update_id");
            return (Criteria) this;
        }

        public Criteria andUpdate_idNotIn(List<Long> values) {
            addCriterion("update_id not in", values, "update_id");
            return (Criteria) this;
        }

        public Criteria andUpdate_idBetween(Long value1, Long value2) {
            addCriterion("update_id between", value1, value2, "update_id");
            return (Criteria) this;
        }

        public Criteria andUpdate_idNotBetween(Long value1, Long value2) {
            addCriterion("update_id not between", value1, value2, "update_id");
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

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
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