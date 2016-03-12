package com.zdpzsp.system.bo;

import java.util.ArrayList;
import java.util.List;

public class SysLabelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysLabelExample() {
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

        public Criteria andSysLabelIdIsNull() {
            addCriterion("sys_label_id is null");
            return (Criteria) this;
        }

        public Criteria andSysLabelIdIsNotNull() {
            addCriterion("sys_label_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysLabelIdEqualTo(Long value) {
            addCriterion("sys_label_id =", value, "sysLabelId");
            return (Criteria) this;
        }

        public Criteria andSysLabelIdNotEqualTo(Long value) {
            addCriterion("sys_label_id <>", value, "sysLabelId");
            return (Criteria) this;
        }

        public Criteria andSysLabelIdGreaterThan(Long value) {
            addCriterion("sys_label_id >", value, "sysLabelId");
            return (Criteria) this;
        }

        public Criteria andSysLabelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sys_label_id >=", value, "sysLabelId");
            return (Criteria) this;
        }

        public Criteria andSysLabelIdLessThan(Long value) {
            addCriterion("sys_label_id <", value, "sysLabelId");
            return (Criteria) this;
        }

        public Criteria andSysLabelIdLessThanOrEqualTo(Long value) {
            addCriterion("sys_label_id <=", value, "sysLabelId");
            return (Criteria) this;
        }

        public Criteria andSysLabelIdIn(List<Long> values) {
            addCriterion("sys_label_id in", values, "sysLabelId");
            return (Criteria) this;
        }

        public Criteria andSysLabelIdNotIn(List<Long> values) {
            addCriterion("sys_label_id not in", values, "sysLabelId");
            return (Criteria) this;
        }

        public Criteria andSysLabelIdBetween(Long value1, Long value2) {
            addCriterion("sys_label_id between", value1, value2, "sysLabelId");
            return (Criteria) this;
        }

        public Criteria andSysLabelIdNotBetween(Long value1, Long value2) {
            addCriterion("sys_label_id not between", value1, value2, "sysLabelId");
            return (Criteria) this;
        }

        public Criteria andSysLabelNameIsNull() {
            addCriterion("sys_label_name is null");
            return (Criteria) this;
        }

        public Criteria andSysLabelNameIsNotNull() {
            addCriterion("sys_label_name is not null");
            return (Criteria) this;
        }

        public Criteria andSysLabelNameEqualTo(String value) {
            addCriterion("sys_label_name =", value, "sysLabelName");
            return (Criteria) this;
        }

        public Criteria andSysLabelNameNotEqualTo(String value) {
            addCriterion("sys_label_name <>", value, "sysLabelName");
            return (Criteria) this;
        }

        public Criteria andSysLabelNameGreaterThan(String value) {
            addCriterion("sys_label_name >", value, "sysLabelName");
            return (Criteria) this;
        }

        public Criteria andSysLabelNameGreaterThanOrEqualTo(String value) {
            addCriterion("sys_label_name >=", value, "sysLabelName");
            return (Criteria) this;
        }

        public Criteria andSysLabelNameLessThan(String value) {
            addCriterion("sys_label_name <", value, "sysLabelName");
            return (Criteria) this;
        }

        public Criteria andSysLabelNameLessThanOrEqualTo(String value) {
            addCriterion("sys_label_name <=", value, "sysLabelName");
            return (Criteria) this;
        }

        public Criteria andSysLabelNameLike(String value) {
            addCriterion("sys_label_name like", value, "sysLabelName");
            return (Criteria) this;
        }

        public Criteria andSysLabelNameNotLike(String value) {
            addCriterion("sys_label_name not like", value, "sysLabelName");
            return (Criteria) this;
        }

        public Criteria andSysLabelNameIn(List<String> values) {
            addCriterion("sys_label_name in", values, "sysLabelName");
            return (Criteria) this;
        }

        public Criteria andSysLabelNameNotIn(List<String> values) {
            addCriterion("sys_label_name not in", values, "sysLabelName");
            return (Criteria) this;
        }

        public Criteria andSysLabelNameBetween(String value1, String value2) {
            addCriterion("sys_label_name between", value1, value2, "sysLabelName");
            return (Criteria) this;
        }

        public Criteria andSysLabelNameNotBetween(String value1, String value2) {
            addCriterion("sys_label_name not between", value1, value2, "sysLabelName");
            return (Criteria) this;
        }

        public Criteria andSysLabelRemarkIsNull() {
            addCriterion("sys_label_remark is null");
            return (Criteria) this;
        }

        public Criteria andSysLabelRemarkIsNotNull() {
            addCriterion("sys_label_remark is not null");
            return (Criteria) this;
        }

        public Criteria andSysLabelRemarkEqualTo(String value) {
            addCriterion("sys_label_remark =", value, "sysLabelRemark");
            return (Criteria) this;
        }

        public Criteria andSysLabelRemarkNotEqualTo(String value) {
            addCriterion("sys_label_remark <>", value, "sysLabelRemark");
            return (Criteria) this;
        }

        public Criteria andSysLabelRemarkGreaterThan(String value) {
            addCriterion("sys_label_remark >", value, "sysLabelRemark");
            return (Criteria) this;
        }

        public Criteria andSysLabelRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("sys_label_remark >=", value, "sysLabelRemark");
            return (Criteria) this;
        }

        public Criteria andSysLabelRemarkLessThan(String value) {
            addCriterion("sys_label_remark <", value, "sysLabelRemark");
            return (Criteria) this;
        }

        public Criteria andSysLabelRemarkLessThanOrEqualTo(String value) {
            addCriterion("sys_label_remark <=", value, "sysLabelRemark");
            return (Criteria) this;
        }

        public Criteria andSysLabelRemarkLike(String value) {
            addCriterion("sys_label_remark like", value, "sysLabelRemark");
            return (Criteria) this;
        }

        public Criteria andSysLabelRemarkNotLike(String value) {
            addCriterion("sys_label_remark not like", value, "sysLabelRemark");
            return (Criteria) this;
        }

        public Criteria andSysLabelRemarkIn(List<String> values) {
            addCriterion("sys_label_remark in", values, "sysLabelRemark");
            return (Criteria) this;
        }

        public Criteria andSysLabelRemarkNotIn(List<String> values) {
            addCriterion("sys_label_remark not in", values, "sysLabelRemark");
            return (Criteria) this;
        }

        public Criteria andSysLabelRemarkBetween(String value1, String value2) {
            addCriterion("sys_label_remark between", value1, value2, "sysLabelRemark");
            return (Criteria) this;
        }

        public Criteria andSysLabelRemarkNotBetween(String value1, String value2) {
            addCriterion("sys_label_remark not between", value1, value2, "sysLabelRemark");
            return (Criteria) this;
        }

        public Criteria andSysUserIdIsNull() {
            addCriterion("sys_user_id is null");
            return (Criteria) this;
        }

        public Criteria andSysUserIdIsNotNull() {
            addCriterion("sys_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysUserIdEqualTo(Long value) {
            addCriterion("sys_user_id =", value, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdNotEqualTo(Long value) {
            addCriterion("sys_user_id <>", value, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdGreaterThan(Long value) {
            addCriterion("sys_user_id >", value, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sys_user_id >=", value, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdLessThan(Long value) {
            addCriterion("sys_user_id <", value, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdLessThanOrEqualTo(Long value) {
            addCriterion("sys_user_id <=", value, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdIn(List<Long> values) {
            addCriterion("sys_user_id in", values, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdNotIn(List<Long> values) {
            addCriterion("sys_user_id not in", values, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdBetween(Long value1, Long value2) {
            addCriterion("sys_user_id between", value1, value2, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdNotBetween(Long value1, Long value2) {
            addCriterion("sys_user_id not between", value1, value2, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysRoleNameIsNull() {
            addCriterion("sys_role_name is null");
            return (Criteria) this;
        }

        public Criteria andSysRoleNameIsNotNull() {
            addCriterion("sys_role_name is not null");
            return (Criteria) this;
        }

        public Criteria andSysRoleNameEqualTo(String value) {
            addCriterion("sys_role_name =", value, "sysRoleName");
            return (Criteria) this;
        }

        public Criteria andSysRoleNameNotEqualTo(String value) {
            addCriterion("sys_role_name <>", value, "sysRoleName");
            return (Criteria) this;
        }

        public Criteria andSysRoleNameGreaterThan(String value) {
            addCriterion("sys_role_name >", value, "sysRoleName");
            return (Criteria) this;
        }

        public Criteria andSysRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("sys_role_name >=", value, "sysRoleName");
            return (Criteria) this;
        }

        public Criteria andSysRoleNameLessThan(String value) {
            addCriterion("sys_role_name <", value, "sysRoleName");
            return (Criteria) this;
        }

        public Criteria andSysRoleNameLessThanOrEqualTo(String value) {
            addCriterion("sys_role_name <=", value, "sysRoleName");
            return (Criteria) this;
        }

        public Criteria andSysRoleNameLike(String value) {
            addCriterion("sys_role_name like", value, "sysRoleName");
            return (Criteria) this;
        }

        public Criteria andSysRoleNameNotLike(String value) {
            addCriterion("sys_role_name not like", value, "sysRoleName");
            return (Criteria) this;
        }

        public Criteria andSysRoleNameIn(List<String> values) {
            addCriterion("sys_role_name in", values, "sysRoleName");
            return (Criteria) this;
        }

        public Criteria andSysRoleNameNotIn(List<String> values) {
            addCriterion("sys_role_name not in", values, "sysRoleName");
            return (Criteria) this;
        }

        public Criteria andSysRoleNameBetween(String value1, String value2) {
            addCriterion("sys_role_name between", value1, value2, "sysRoleName");
            return (Criteria) this;
        }

        public Criteria andSysRoleNameNotBetween(String value1, String value2) {
            addCriterion("sys_role_name not between", value1, value2, "sysRoleName");
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