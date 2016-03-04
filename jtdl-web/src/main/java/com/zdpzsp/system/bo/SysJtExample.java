package com.zdpzsp.system.bo;

import java.util.ArrayList;
import java.util.List;

public class SysJtExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysJtExample() {
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

        public Criteria andJtIdIsNull() {
            addCriterion("jt_id is null");
            return (Criteria) this;
        }

        public Criteria andJtIdIsNotNull() {
            addCriterion("jt_id is not null");
            return (Criteria) this;
        }

        public Criteria andJtIdEqualTo(Long value) {
            addCriterion("jt_id =", value, "jtId");
            return (Criteria) this;
        }

        public Criteria andJtIdNotEqualTo(Long value) {
            addCriterion("jt_id <>", value, "jtId");
            return (Criteria) this;
        }

        public Criteria andJtIdGreaterThan(Long value) {
            addCriterion("jt_id >", value, "jtId");
            return (Criteria) this;
        }

        public Criteria andJtIdGreaterThanOrEqualTo(Long value) {
            addCriterion("jt_id >=", value, "jtId");
            return (Criteria) this;
        }

        public Criteria andJtIdLessThan(Long value) {
            addCriterion("jt_id <", value, "jtId");
            return (Criteria) this;
        }

        public Criteria andJtIdLessThanOrEqualTo(Long value) {
            addCriterion("jt_id <=", value, "jtId");
            return (Criteria) this;
        }

        public Criteria andJtIdIn(List<Long> values) {
            addCriterion("jt_id in", values, "jtId");
            return (Criteria) this;
        }

        public Criteria andJtIdNotIn(List<Long> values) {
            addCriterion("jt_id not in", values, "jtId");
            return (Criteria) this;
        }

        public Criteria andJtIdBetween(Long value1, Long value2) {
            addCriterion("jt_id between", value1, value2, "jtId");
            return (Criteria) this;
        }

        public Criteria andJtIdNotBetween(Long value1, Long value2) {
            addCriterion("jt_id not between", value1, value2, "jtId");
            return (Criteria) this;
        }

        public Criteria andJtNicknameIsNull() {
            addCriterion("jt_nickname is null");
            return (Criteria) this;
        }

        public Criteria andJtNicknameIsNotNull() {
            addCriterion("jt_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andJtNicknameEqualTo(String value) {
            addCriterion("jt_nickname =", value, "jtNickname");
            return (Criteria) this;
        }

        public Criteria andJtNicknameNotEqualTo(String value) {
            addCriterion("jt_nickname <>", value, "jtNickname");
            return (Criteria) this;
        }

        public Criteria andJtNicknameGreaterThan(String value) {
            addCriterion("jt_nickname >", value, "jtNickname");
            return (Criteria) this;
        }

        public Criteria andJtNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("jt_nickname >=", value, "jtNickname");
            return (Criteria) this;
        }

        public Criteria andJtNicknameLessThan(String value) {
            addCriterion("jt_nickname <", value, "jtNickname");
            return (Criteria) this;
        }

        public Criteria andJtNicknameLessThanOrEqualTo(String value) {
            addCriterion("jt_nickname <=", value, "jtNickname");
            return (Criteria) this;
        }

        public Criteria andJtNicknameLike(String value) {
            addCriterion("jt_nickname like", value, "jtNickname");
            return (Criteria) this;
        }

        public Criteria andJtNicknameNotLike(String value) {
            addCriterion("jt_nickname not like", value, "jtNickname");
            return (Criteria) this;
        }

        public Criteria andJtNicknameIn(List<String> values) {
            addCriterion("jt_nickname in", values, "jtNickname");
            return (Criteria) this;
        }

        public Criteria andJtNicknameNotIn(List<String> values) {
            addCriterion("jt_nickname not in", values, "jtNickname");
            return (Criteria) this;
        }

        public Criteria andJtNicknameBetween(String value1, String value2) {
            addCriterion("jt_nickname between", value1, value2, "jtNickname");
            return (Criteria) this;
        }

        public Criteria andJtNicknameNotBetween(String value1, String value2) {
            addCriterion("jt_nickname not between", value1, value2, "jtNickname");
            return (Criteria) this;
        }

        public Criteria andJtCityIsNull() {
            addCriterion("jt_city is null");
            return (Criteria) this;
        }

        public Criteria andJtCityIsNotNull() {
            addCriterion("jt_city is not null");
            return (Criteria) this;
        }

        public Criteria andJtCityEqualTo(String value) {
            addCriterion("jt_city =", value, "jtCity");
            return (Criteria) this;
        }

        public Criteria andJtCityNotEqualTo(String value) {
            addCriterion("jt_city <>", value, "jtCity");
            return (Criteria) this;
        }

        public Criteria andJtCityGreaterThan(String value) {
            addCriterion("jt_city >", value, "jtCity");
            return (Criteria) this;
        }

        public Criteria andJtCityGreaterThanOrEqualTo(String value) {
            addCriterion("jt_city >=", value, "jtCity");
            return (Criteria) this;
        }

        public Criteria andJtCityLessThan(String value) {
            addCriterion("jt_city <", value, "jtCity");
            return (Criteria) this;
        }

        public Criteria andJtCityLessThanOrEqualTo(String value) {
            addCriterion("jt_city <=", value, "jtCity");
            return (Criteria) this;
        }

        public Criteria andJtCityLike(String value) {
            addCriterion("jt_city like", value, "jtCity");
            return (Criteria) this;
        }

        public Criteria andJtCityNotLike(String value) {
            addCriterion("jt_city not like", value, "jtCity");
            return (Criteria) this;
        }

        public Criteria andJtCityIn(List<String> values) {
            addCriterion("jt_city in", values, "jtCity");
            return (Criteria) this;
        }

        public Criteria andJtCityNotIn(List<String> values) {
            addCriterion("jt_city not in", values, "jtCity");
            return (Criteria) this;
        }

        public Criteria andJtCityBetween(String value1, String value2) {
            addCriterion("jt_city between", value1, value2, "jtCity");
            return (Criteria) this;
        }

        public Criteria andJtCityNotBetween(String value1, String value2) {
            addCriterion("jt_city not between", value1, value2, "jtCity");
            return (Criteria) this;
        }

        public Criteria andJtAddressIsNull() {
            addCriterion("jt_address is null");
            return (Criteria) this;
        }

        public Criteria andJtAddressIsNotNull() {
            addCriterion("jt_address is not null");
            return (Criteria) this;
        }

        public Criteria andJtAddressEqualTo(String value) {
            addCriterion("jt_address =", value, "jtAddress");
            return (Criteria) this;
        }

        public Criteria andJtAddressNotEqualTo(String value) {
            addCriterion("jt_address <>", value, "jtAddress");
            return (Criteria) this;
        }

        public Criteria andJtAddressGreaterThan(String value) {
            addCriterion("jt_address >", value, "jtAddress");
            return (Criteria) this;
        }

        public Criteria andJtAddressGreaterThanOrEqualTo(String value) {
            addCriterion("jt_address >=", value, "jtAddress");
            return (Criteria) this;
        }

        public Criteria andJtAddressLessThan(String value) {
            addCriterion("jt_address <", value, "jtAddress");
            return (Criteria) this;
        }

        public Criteria andJtAddressLessThanOrEqualTo(String value) {
            addCriterion("jt_address <=", value, "jtAddress");
            return (Criteria) this;
        }

        public Criteria andJtAddressLike(String value) {
            addCriterion("jt_address like", value, "jtAddress");
            return (Criteria) this;
        }

        public Criteria andJtAddressNotLike(String value) {
            addCriterion("jt_address not like", value, "jtAddress");
            return (Criteria) this;
        }

        public Criteria andJtAddressIn(List<String> values) {
            addCriterion("jt_address in", values, "jtAddress");
            return (Criteria) this;
        }

        public Criteria andJtAddressNotIn(List<String> values) {
            addCriterion("jt_address not in", values, "jtAddress");
            return (Criteria) this;
        }

        public Criteria andJtAddressBetween(String value1, String value2) {
            addCriterion("jt_address between", value1, value2, "jtAddress");
            return (Criteria) this;
        }

        public Criteria andJtAddressNotBetween(String value1, String value2) {
            addCriterion("jt_address not between", value1, value2, "jtAddress");
            return (Criteria) this;
        }

        public Criteria andJiNumIsNull() {
            addCriterion("ji_num is null");
            return (Criteria) this;
        }

        public Criteria andJiNumIsNotNull() {
            addCriterion("ji_num is not null");
            return (Criteria) this;
        }

        public Criteria andJiNumEqualTo(Integer value) {
            addCriterion("ji_num =", value, "jiNum");
            return (Criteria) this;
        }

        public Criteria andJiNumNotEqualTo(Integer value) {
            addCriterion("ji_num <>", value, "jiNum");
            return (Criteria) this;
        }

        public Criteria andJiNumGreaterThan(Integer value) {
            addCriterion("ji_num >", value, "jiNum");
            return (Criteria) this;
        }

        public Criteria andJiNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ji_num >=", value, "jiNum");
            return (Criteria) this;
        }

        public Criteria andJiNumLessThan(Integer value) {
            addCriterion("ji_num <", value, "jiNum");
            return (Criteria) this;
        }

        public Criteria andJiNumLessThanOrEqualTo(Integer value) {
            addCriterion("ji_num <=", value, "jiNum");
            return (Criteria) this;
        }

        public Criteria andJiNumIn(List<Integer> values) {
            addCriterion("ji_num in", values, "jiNum");
            return (Criteria) this;
        }

        public Criteria andJiNumNotIn(List<Integer> values) {
            addCriterion("ji_num not in", values, "jiNum");
            return (Criteria) this;
        }

        public Criteria andJiNumBetween(Integer value1, Integer value2) {
            addCriterion("ji_num between", value1, value2, "jiNum");
            return (Criteria) this;
        }

        public Criteria andJiNumNotBetween(Integer value1, Integer value2) {
            addCriterion("ji_num not between", value1, value2, "jiNum");
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