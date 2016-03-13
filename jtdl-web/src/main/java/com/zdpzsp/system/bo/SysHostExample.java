package com.zdpzsp.system.bo;

import java.util.ArrayList;
import java.util.List;

public class SysHostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysHostExample() {
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

        public Criteria andSys_host_idIsNull() {
            addCriterion("sys_host_id is null");
            return (Criteria) this;
        }

        public Criteria andSys_host_idIsNotNull() {
            addCriterion("sys_host_id is not null");
            return (Criteria) this;
        }

        public Criteria andSys_host_idEqualTo(Long value) {
            addCriterion("sys_host_id =", value, "sys_host_id");
            return (Criteria) this;
        }

        public Criteria andSys_host_idNotEqualTo(Long value) {
            addCriterion("sys_host_id <>", value, "sys_host_id");
            return (Criteria) this;
        }

        public Criteria andSys_host_idGreaterThan(Long value) {
            addCriterion("sys_host_id >", value, "sys_host_id");
            return (Criteria) this;
        }

        public Criteria andSys_host_idGreaterThanOrEqualTo(Long value) {
            addCriterion("sys_host_id >=", value, "sys_host_id");
            return (Criteria) this;
        }

        public Criteria andSys_host_idLessThan(Long value) {
            addCriterion("sys_host_id <", value, "sys_host_id");
            return (Criteria) this;
        }

        public Criteria andSys_host_idLessThanOrEqualTo(Long value) {
            addCriterion("sys_host_id <=", value, "sys_host_id");
            return (Criteria) this;
        }

        public Criteria andSys_host_idIn(List<Long> values) {
            addCriterion("sys_host_id in", values, "sys_host_id");
            return (Criteria) this;
        }

        public Criteria andSys_host_idNotIn(List<Long> values) {
            addCriterion("sys_host_id not in", values, "sys_host_id");
            return (Criteria) this;
        }

        public Criteria andSys_host_idBetween(Long value1, Long value2) {
            addCriterion("sys_host_id between", value1, value2, "sys_host_id");
            return (Criteria) this;
        }

        public Criteria andSys_host_idNotBetween(Long value1, Long value2) {
            addCriterion("sys_host_id not between", value1, value2, "sys_host_id");
            return (Criteria) this;
        }

        public Criteria andSys_host_nameIsNull() {
            addCriterion("sys_host_name is null");
            return (Criteria) this;
        }

        public Criteria andSys_host_nameIsNotNull() {
            addCriterion("sys_host_name is not null");
            return (Criteria) this;
        }

        public Criteria andSys_host_nameEqualTo(String value) {
            addCriterion("sys_host_name =", value, "sys_host_name");
            return (Criteria) this;
        }

        public Criteria andSys_host_nameNotEqualTo(String value) {
            addCriterion("sys_host_name <>", value, "sys_host_name");
            return (Criteria) this;
        }

        public Criteria andSys_host_nameGreaterThan(String value) {
            addCriterion("sys_host_name >", value, "sys_host_name");
            return (Criteria) this;
        }

        public Criteria andSys_host_nameGreaterThanOrEqualTo(String value) {
            addCriterion("sys_host_name >=", value, "sys_host_name");
            return (Criteria) this;
        }

        public Criteria andSys_host_nameLessThan(String value) {
            addCriterion("sys_host_name <", value, "sys_host_name");
            return (Criteria) this;
        }

        public Criteria andSys_host_nameLessThanOrEqualTo(String value) {
            addCriterion("sys_host_name <=", value, "sys_host_name");
            return (Criteria) this;
        }

        public Criteria andSys_host_nameLike(String value) {
            addCriterion("sys_host_name like", value, "sys_host_name");
            return (Criteria) this;
        }

        public Criteria andSys_host_nameNotLike(String value) {
            addCriterion("sys_host_name not like", value, "sys_host_name");
            return (Criteria) this;
        }

        public Criteria andSys_host_nameIn(List<String> values) {
            addCriterion("sys_host_name in", values, "sys_host_name");
            return (Criteria) this;
        }

        public Criteria andSys_host_nameNotIn(List<String> values) {
            addCriterion("sys_host_name not in", values, "sys_host_name");
            return (Criteria) this;
        }

        public Criteria andSys_host_nameBetween(String value1, String value2) {
            addCriterion("sys_host_name between", value1, value2, "sys_host_name");
            return (Criteria) this;
        }

        public Criteria andSys_host_nameNotBetween(String value1, String value2) {
            addCriterion("sys_host_name not between", value1, value2, "sys_host_name");
            return (Criteria) this;
        }

        public Criteria andSys_host_headIsNull() {
            addCriterion("sys_host_head is null");
            return (Criteria) this;
        }

        public Criteria andSys_host_headIsNotNull() {
            addCriterion("sys_host_head is not null");
            return (Criteria) this;
        }

        public Criteria andSys_host_headEqualTo(String value) {
            addCriterion("sys_host_head =", value, "sys_host_head");
            return (Criteria) this;
        }

        public Criteria andSys_host_headNotEqualTo(String value) {
            addCriterion("sys_host_head <>", value, "sys_host_head");
            return (Criteria) this;
        }

        public Criteria andSys_host_headGreaterThan(String value) {
            addCriterion("sys_host_head >", value, "sys_host_head");
            return (Criteria) this;
        }

        public Criteria andSys_host_headGreaterThanOrEqualTo(String value) {
            addCriterion("sys_host_head >=", value, "sys_host_head");
            return (Criteria) this;
        }

        public Criteria andSys_host_headLessThan(String value) {
            addCriterion("sys_host_head <", value, "sys_host_head");
            return (Criteria) this;
        }

        public Criteria andSys_host_headLessThanOrEqualTo(String value) {
            addCriterion("sys_host_head <=", value, "sys_host_head");
            return (Criteria) this;
        }

        public Criteria andSys_host_headLike(String value) {
            addCriterion("sys_host_head like", value, "sys_host_head");
            return (Criteria) this;
        }

        public Criteria andSys_host_headNotLike(String value) {
            addCriterion("sys_host_head not like", value, "sys_host_head");
            return (Criteria) this;
        }

        public Criteria andSys_host_headIn(List<String> values) {
            addCriterion("sys_host_head in", values, "sys_host_head");
            return (Criteria) this;
        }

        public Criteria andSys_host_headNotIn(List<String> values) {
            addCriterion("sys_host_head not in", values, "sys_host_head");
            return (Criteria) this;
        }

        public Criteria andSys_host_headBetween(String value1, String value2) {
            addCriterion("sys_host_head between", value1, value2, "sys_host_head");
            return (Criteria) this;
        }

        public Criteria andSys_host_headNotBetween(String value1, String value2) {
            addCriterion("sys_host_head not between", value1, value2, "sys_host_head");
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

        public Criteria andHost_typeIsNull() {
            addCriterion("host_type is null");
            return (Criteria) this;
        }

        public Criteria andHost_typeIsNotNull() {
            addCriterion("host_type is not null");
            return (Criteria) this;
        }

        public Criteria andHost_typeEqualTo(String value) {
            addCriterion("host_type =", value, "host_type");
            return (Criteria) this;
        }

        public Criteria andHost_typeNotEqualTo(String value) {
            addCriterion("host_type <>", value, "host_type");
            return (Criteria) this;
        }

        public Criteria andHost_typeGreaterThan(String value) {
            addCriterion("host_type >", value, "host_type");
            return (Criteria) this;
        }

        public Criteria andHost_typeGreaterThanOrEqualTo(String value) {
            addCriterion("host_type >=", value, "host_type");
            return (Criteria) this;
        }

        public Criteria andHost_typeLessThan(String value) {
            addCriterion("host_type <", value, "host_type");
            return (Criteria) this;
        }

        public Criteria andHost_typeLessThanOrEqualTo(String value) {
            addCriterion("host_type <=", value, "host_type");
            return (Criteria) this;
        }

        public Criteria andHost_typeLike(String value) {
            addCriterion("host_type like", value, "host_type");
            return (Criteria) this;
        }

        public Criteria andHost_typeNotLike(String value) {
            addCriterion("host_type not like", value, "host_type");
            return (Criteria) this;
        }

        public Criteria andHost_typeIn(List<String> values) {
            addCriterion("host_type in", values, "host_type");
            return (Criteria) this;
        }

        public Criteria andHost_typeNotIn(List<String> values) {
            addCriterion("host_type not in", values, "host_type");
            return (Criteria) this;
        }

        public Criteria andHost_typeBetween(String value1, String value2) {
            addCriterion("host_type between", value1, value2, "host_type");
            return (Criteria) this;
        }

        public Criteria andHost_typeNotBetween(String value1, String value2) {
            addCriterion("host_type not between", value1, value2, "host_type");
            return (Criteria) this;
        }

        public Criteria andHost_ipIsNull() {
            addCriterion("host_ip is null");
            return (Criteria) this;
        }

        public Criteria andHost_ipIsNotNull() {
            addCriterion("host_ip is not null");
            return (Criteria) this;
        }

        public Criteria andHost_ipEqualTo(String value) {
            addCriterion("host_ip =", value, "host_ip");
            return (Criteria) this;
        }

        public Criteria andHost_ipNotEqualTo(String value) {
            addCriterion("host_ip <>", value, "host_ip");
            return (Criteria) this;
        }

        public Criteria andHost_ipGreaterThan(String value) {
            addCriterion("host_ip >", value, "host_ip");
            return (Criteria) this;
        }

        public Criteria andHost_ipGreaterThanOrEqualTo(String value) {
            addCriterion("host_ip >=", value, "host_ip");
            return (Criteria) this;
        }

        public Criteria andHost_ipLessThan(String value) {
            addCriterion("host_ip <", value, "host_ip");
            return (Criteria) this;
        }

        public Criteria andHost_ipLessThanOrEqualTo(String value) {
            addCriterion("host_ip <=", value, "host_ip");
            return (Criteria) this;
        }

        public Criteria andHost_ipLike(String value) {
            addCriterion("host_ip like", value, "host_ip");
            return (Criteria) this;
        }

        public Criteria andHost_ipNotLike(String value) {
            addCriterion("host_ip not like", value, "host_ip");
            return (Criteria) this;
        }

        public Criteria andHost_ipIn(List<String> values) {
            addCriterion("host_ip in", values, "host_ip");
            return (Criteria) this;
        }

        public Criteria andHost_ipNotIn(List<String> values) {
            addCriterion("host_ip not in", values, "host_ip");
            return (Criteria) this;
        }

        public Criteria andHost_ipBetween(String value1, String value2) {
            addCriterion("host_ip between", value1, value2, "host_ip");
            return (Criteria) this;
        }

        public Criteria andHost_ipNotBetween(String value1, String value2) {
            addCriterion("host_ip not between", value1, value2, "host_ip");
            return (Criteria) this;
        }

        public Criteria andHost_portIsNull() {
            addCriterion("host_port is null");
            return (Criteria) this;
        }

        public Criteria andHost_portIsNotNull() {
            addCriterion("host_port is not null");
            return (Criteria) this;
        }

        public Criteria andHost_portEqualTo(Integer value) {
            addCriterion("host_port =", value, "host_port");
            return (Criteria) this;
        }

        public Criteria andHost_portNotEqualTo(Integer value) {
            addCriterion("host_port <>", value, "host_port");
            return (Criteria) this;
        }

        public Criteria andHost_portGreaterThan(Integer value) {
            addCriterion("host_port >", value, "host_port");
            return (Criteria) this;
        }

        public Criteria andHost_portGreaterThanOrEqualTo(Integer value) {
            addCriterion("host_port >=", value, "host_port");
            return (Criteria) this;
        }

        public Criteria andHost_portLessThan(Integer value) {
            addCriterion("host_port <", value, "host_port");
            return (Criteria) this;
        }

        public Criteria andHost_portLessThanOrEqualTo(Integer value) {
            addCriterion("host_port <=", value, "host_port");
            return (Criteria) this;
        }

        public Criteria andHost_portIn(List<Integer> values) {
            addCriterion("host_port in", values, "host_port");
            return (Criteria) this;
        }

        public Criteria andHost_portNotIn(List<Integer> values) {
            addCriterion("host_port not in", values, "host_port");
            return (Criteria) this;
        }

        public Criteria andHost_portBetween(Integer value1, Integer value2) {
            addCriterion("host_port between", value1, value2, "host_port");
            return (Criteria) this;
        }

        public Criteria andHost_portNotBetween(Integer value1, Integer value2) {
            addCriterion("host_port not between", value1, value2, "host_port");
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