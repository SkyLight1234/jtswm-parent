package com.zdpzsp.system.bo;

import java.util.ArrayList;
import java.util.List;

public class SysJtgxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysJtgxExample() {
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

        public Criteria andSysJtgxIdIsNull() {
            addCriterion("sys_jtgx_id is null");
            return (Criteria) this;
        }

        public Criteria andSysJtgxIdIsNotNull() {
            addCriterion("sys_jtgx_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysJtgxIdEqualTo(Long value) {
            addCriterion("sys_jtgx_id =", value, "sysJtgxId");
            return (Criteria) this;
        }

        public Criteria andSysJtgxIdNotEqualTo(Long value) {
            addCriterion("sys_jtgx_id <>", value, "sysJtgxId");
            return (Criteria) this;
        }

        public Criteria andSysJtgxIdGreaterThan(Long value) {
            addCriterion("sys_jtgx_id >", value, "sysJtgxId");
            return (Criteria) this;
        }

        public Criteria andSysJtgxIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sys_jtgx_id >=", value, "sysJtgxId");
            return (Criteria) this;
        }

        public Criteria andSysJtgxIdLessThan(Long value) {
            addCriterion("sys_jtgx_id <", value, "sysJtgxId");
            return (Criteria) this;
        }

        public Criteria andSysJtgxIdLessThanOrEqualTo(Long value) {
            addCriterion("sys_jtgx_id <=", value, "sysJtgxId");
            return (Criteria) this;
        }

        public Criteria andSysJtgxIdIn(List<Long> values) {
            addCriterion("sys_jtgx_id in", values, "sysJtgxId");
            return (Criteria) this;
        }

        public Criteria andSysJtgxIdNotIn(List<Long> values) {
            addCriterion("sys_jtgx_id not in", values, "sysJtgxId");
            return (Criteria) this;
        }

        public Criteria andSysJtgxIdBetween(Long value1, Long value2) {
            addCriterion("sys_jtgx_id between", value1, value2, "sysJtgxId");
            return (Criteria) this;
        }

        public Criteria andSysJtgxIdNotBetween(Long value1, Long value2) {
            addCriterion("sys_jtgx_id not between", value1, value2, "sysJtgxId");
            return (Criteria) this;
        }

        public Criteria andSysJtgxNameIsNull() {
            addCriterion("sys_jtgx_name is null");
            return (Criteria) this;
        }

        public Criteria andSysJtgxNameIsNotNull() {
            addCriterion("sys_jtgx_name is not null");
            return (Criteria) this;
        }

        public Criteria andSysJtgxNameEqualTo(String value) {
            addCriterion("sys_jtgx_name =", value, "sysJtgxName");
            return (Criteria) this;
        }

        public Criteria andSysJtgxNameNotEqualTo(String value) {
            addCriterion("sys_jtgx_name <>", value, "sysJtgxName");
            return (Criteria) this;
        }

        public Criteria andSysJtgxNameGreaterThan(String value) {
            addCriterion("sys_jtgx_name >", value, "sysJtgxName");
            return (Criteria) this;
        }

        public Criteria andSysJtgxNameGreaterThanOrEqualTo(String value) {
            addCriterion("sys_jtgx_name >=", value, "sysJtgxName");
            return (Criteria) this;
        }

        public Criteria andSysJtgxNameLessThan(String value) {
            addCriterion("sys_jtgx_name <", value, "sysJtgxName");
            return (Criteria) this;
        }

        public Criteria andSysJtgxNameLessThanOrEqualTo(String value) {
            addCriterion("sys_jtgx_name <=", value, "sysJtgxName");
            return (Criteria) this;
        }

        public Criteria andSysJtgxNameLike(String value) {
            addCriterion("sys_jtgx_name like", value, "sysJtgxName");
            return (Criteria) this;
        }

        public Criteria andSysJtgxNameNotLike(String value) {
            addCriterion("sys_jtgx_name not like", value, "sysJtgxName");
            return (Criteria) this;
        }

        public Criteria andSysJtgxNameIn(List<String> values) {
            addCriterion("sys_jtgx_name in", values, "sysJtgxName");
            return (Criteria) this;
        }

        public Criteria andSysJtgxNameNotIn(List<String> values) {
            addCriterion("sys_jtgx_name not in", values, "sysJtgxName");
            return (Criteria) this;
        }

        public Criteria andSysJtgxNameBetween(String value1, String value2) {
            addCriterion("sys_jtgx_name between", value1, value2, "sysJtgxName");
            return (Criteria) this;
        }

        public Criteria andSysJtgxNameNotBetween(String value1, String value2) {
            addCriterion("sys_jtgx_name not between", value1, value2, "sysJtgxName");
            return (Criteria) this;
        }

        public Criteria andSysJtgxRemarkIsNull() {
            addCriterion("sys_jtgx_remark is null");
            return (Criteria) this;
        }

        public Criteria andSysJtgxRemarkIsNotNull() {
            addCriterion("sys_jtgx_remark is not null");
            return (Criteria) this;
        }

        public Criteria andSysJtgxRemarkEqualTo(String value) {
            addCriterion("sys_jtgx_remark =", value, "sysJtgxRemark");
            return (Criteria) this;
        }

        public Criteria andSysJtgxRemarkNotEqualTo(String value) {
            addCriterion("sys_jtgx_remark <>", value, "sysJtgxRemark");
            return (Criteria) this;
        }

        public Criteria andSysJtgxRemarkGreaterThan(String value) {
            addCriterion("sys_jtgx_remark >", value, "sysJtgxRemark");
            return (Criteria) this;
        }

        public Criteria andSysJtgxRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("sys_jtgx_remark >=", value, "sysJtgxRemark");
            return (Criteria) this;
        }

        public Criteria andSysJtgxRemarkLessThan(String value) {
            addCriterion("sys_jtgx_remark <", value, "sysJtgxRemark");
            return (Criteria) this;
        }

        public Criteria andSysJtgxRemarkLessThanOrEqualTo(String value) {
            addCriterion("sys_jtgx_remark <=", value, "sysJtgxRemark");
            return (Criteria) this;
        }

        public Criteria andSysJtgxRemarkLike(String value) {
            addCriterion("sys_jtgx_remark like", value, "sysJtgxRemark");
            return (Criteria) this;
        }

        public Criteria andSysJtgxRemarkNotLike(String value) {
            addCriterion("sys_jtgx_remark not like", value, "sysJtgxRemark");
            return (Criteria) this;
        }

        public Criteria andSysJtgxRemarkIn(List<String> values) {
            addCriterion("sys_jtgx_remark in", values, "sysJtgxRemark");
            return (Criteria) this;
        }

        public Criteria andSysJtgxRemarkNotIn(List<String> values) {
            addCriterion("sys_jtgx_remark not in", values, "sysJtgxRemark");
            return (Criteria) this;
        }

        public Criteria andSysJtgxRemarkBetween(String value1, String value2) {
            addCriterion("sys_jtgx_remark between", value1, value2, "sysJtgxRemark");
            return (Criteria) this;
        }

        public Criteria andSysJtgxRemarkNotBetween(String value1, String value2) {
            addCriterion("sys_jtgx_remark not between", value1, value2, "sysJtgxRemark");
            return (Criteria) this;
        }

        public Criteria andCreateAtIsNull() {
            addCriterion("create_at is null");
            return (Criteria) this;
        }

        public Criteria andCreateAtIsNotNull() {
            addCriterion("create_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreateAtEqualTo(Long value) {
            addCriterion("create_at =", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotEqualTo(Long value) {
            addCriterion("create_at <>", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThan(Long value) {
            addCriterion("create_at >", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThanOrEqualTo(Long value) {
            addCriterion("create_at >=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThan(Long value) {
            addCriterion("create_at <", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThanOrEqualTo(Long value) {
            addCriterion("create_at <=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtIn(List<Long> values) {
            addCriterion("create_at in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotIn(List<Long> values) {
            addCriterion("create_at not in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtBetween(Long value1, Long value2) {
            addCriterion("create_at between", value1, value2, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotBetween(Long value1, Long value2) {
            addCriterion("create_at not between", value1, value2, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNull() {
            addCriterion("create_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNotNull() {
            addCriterion("create_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateIdEqualTo(Long value) {
            addCriterion("create_id =", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotEqualTo(Long value) {
            addCriterion("create_id <>", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThan(Long value) {
            addCriterion("create_id >", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("create_id >=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThan(Long value) {
            addCriterion("create_id <", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThanOrEqualTo(Long value) {
            addCriterion("create_id <=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdIn(List<Long> values) {
            addCriterion("create_id in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotIn(List<Long> values) {
            addCriterion("create_id not in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdBetween(Long value1, Long value2) {
            addCriterion("create_id between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotBetween(Long value1, Long value2) {
            addCriterion("create_id not between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIsNull() {
            addCriterion("update_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIsNotNull() {
            addCriterion("update_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateAtEqualTo(Long value) {
            addCriterion("update_at =", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotEqualTo(Long value) {
            addCriterion("update_at <>", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtGreaterThan(Long value) {
            addCriterion("update_at >", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtGreaterThanOrEqualTo(Long value) {
            addCriterion("update_at >=", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtLessThan(Long value) {
            addCriterion("update_at <", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtLessThanOrEqualTo(Long value) {
            addCriterion("update_at <=", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIn(List<Long> values) {
            addCriterion("update_at in", values, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotIn(List<Long> values) {
            addCriterion("update_at not in", values, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtBetween(Long value1, Long value2) {
            addCriterion("update_at between", value1, value2, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotBetween(Long value1, Long value2) {
            addCriterion("update_at not between", value1, value2, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIsNull() {
            addCriterion("update_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIsNotNull() {
            addCriterion("update_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateIdEqualTo(Long value) {
            addCriterion("update_id =", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotEqualTo(Long value) {
            addCriterion("update_id <>", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdGreaterThan(Long value) {
            addCriterion("update_id >", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("update_id >=", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLessThan(Long value) {
            addCriterion("update_id <", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLessThanOrEqualTo(Long value) {
            addCriterion("update_id <=", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIn(List<Long> values) {
            addCriterion("update_id in", values, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotIn(List<Long> values) {
            addCriterion("update_id not in", values, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdBetween(Long value1, Long value2) {
            addCriterion("update_id between", value1, value2, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotBetween(Long value1, Long value2) {
            addCriterion("update_id not between", value1, value2, "updateId");
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