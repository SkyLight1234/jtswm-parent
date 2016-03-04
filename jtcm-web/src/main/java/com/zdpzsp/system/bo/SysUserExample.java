package com.zdpzsp.system.bo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysUserExample() {
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

        public Criteria andUser_idIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUser_idEqualTo(Long value) {
            addCriterion("user_id =", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThan(Long value) {
            addCriterion("user_id >", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThan(Long value) {
            addCriterion("user_id <", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idIn(List<Long> values) {
            addCriterion("user_id in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_codeIsNull() {
            addCriterion("user_code is null");
            return (Criteria) this;
        }

        public Criteria andUser_codeIsNotNull() {
            addCriterion("user_code is not null");
            return (Criteria) this;
        }

        public Criteria andUser_codeEqualTo(String value) {
            addCriterion("user_code =", value, "user_code");
            return (Criteria) this;
        }

        public Criteria andUser_codeNotEqualTo(String value) {
            addCriterion("user_code <>", value, "user_code");
            return (Criteria) this;
        }

        public Criteria andUser_codeGreaterThan(String value) {
            addCriterion("user_code >", value, "user_code");
            return (Criteria) this;
        }

        public Criteria andUser_codeGreaterThanOrEqualTo(String value) {
            addCriterion("user_code >=", value, "user_code");
            return (Criteria) this;
        }

        public Criteria andUser_codeLessThan(String value) {
            addCriterion("user_code <", value, "user_code");
            return (Criteria) this;
        }

        public Criteria andUser_codeLessThanOrEqualTo(String value) {
            addCriterion("user_code <=", value, "user_code");
            return (Criteria) this;
        }

        public Criteria andUser_codeLike(String value) {
            addCriterion("user_code like", value, "user_code");
            return (Criteria) this;
        }

        public Criteria andUser_codeNotLike(String value) {
            addCriterion("user_code not like", value, "user_code");
            return (Criteria) this;
        }

        public Criteria andUser_codeIn(List<String> values) {
            addCriterion("user_code in", values, "user_code");
            return (Criteria) this;
        }

        public Criteria andUser_codeNotIn(List<String> values) {
            addCriterion("user_code not in", values, "user_code");
            return (Criteria) this;
        }

        public Criteria andUser_codeBetween(String value1, String value2) {
            addCriterion("user_code between", value1, value2, "user_code");
            return (Criteria) this;
        }

        public Criteria andUser_codeNotBetween(String value1, String value2) {
            addCriterion("user_code not between", value1, value2, "user_code");
            return (Criteria) this;
        }

        public Criteria andUser_nameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUser_nameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUser_nameEqualTo(String value) {
            addCriterion("user_name =", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameGreaterThan(String value) {
            addCriterion("user_name >", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameLessThan(String value) {
            addCriterion("user_name <", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameLike(String value) {
            addCriterion("user_name like", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotLike(String value) {
            addCriterion("user_name not like", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameIn(List<String> values) {
            addCriterion("user_name in", values, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "user_name");
            return (Criteria) this;
        }

        public Criteria andLogin_pwdIsNull() {
            addCriterion("login_pwd is null");
            return (Criteria) this;
        }

        public Criteria andLogin_pwdIsNotNull() {
            addCriterion("login_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andLogin_pwdEqualTo(String value) {
            addCriterion("login_pwd =", value, "login_pwd");
            return (Criteria) this;
        }

        public Criteria andLogin_pwdNotEqualTo(String value) {
            addCriterion("login_pwd <>", value, "login_pwd");
            return (Criteria) this;
        }

        public Criteria andLogin_pwdGreaterThan(String value) {
            addCriterion("login_pwd >", value, "login_pwd");
            return (Criteria) this;
        }

        public Criteria andLogin_pwdGreaterThanOrEqualTo(String value) {
            addCriterion("login_pwd >=", value, "login_pwd");
            return (Criteria) this;
        }

        public Criteria andLogin_pwdLessThan(String value) {
            addCriterion("login_pwd <", value, "login_pwd");
            return (Criteria) this;
        }

        public Criteria andLogin_pwdLessThanOrEqualTo(String value) {
            addCriterion("login_pwd <=", value, "login_pwd");
            return (Criteria) this;
        }

        public Criteria andLogin_pwdLike(String value) {
            addCriterion("login_pwd like", value, "login_pwd");
            return (Criteria) this;
        }

        public Criteria andLogin_pwdNotLike(String value) {
            addCriterion("login_pwd not like", value, "login_pwd");
            return (Criteria) this;
        }

        public Criteria andLogin_pwdIn(List<String> values) {
            addCriterion("login_pwd in", values, "login_pwd");
            return (Criteria) this;
        }

        public Criteria andLogin_pwdNotIn(List<String> values) {
            addCriterion("login_pwd not in", values, "login_pwd");
            return (Criteria) this;
        }

        public Criteria andLogin_pwdBetween(String value1, String value2) {
            addCriterion("login_pwd between", value1, value2, "login_pwd");
            return (Criteria) this;
        }

        public Criteria andLogin_pwdNotBetween(String value1, String value2) {
            addCriterion("login_pwd not between", value1, value2, "login_pwd");
            return (Criteria) this;
        }

        public Criteria andUser_typeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUser_typeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUser_typeEqualTo(Integer value) {
            addCriterion("user_type =", value, "user_type");
            return (Criteria) this;
        }

        public Criteria andUser_typeNotEqualTo(Integer value) {
            addCriterion("user_type <>", value, "user_type");
            return (Criteria) this;
        }

        public Criteria andUser_typeGreaterThan(Integer value) {
            addCriterion("user_type >", value, "user_type");
            return (Criteria) this;
        }

        public Criteria andUser_typeGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_type >=", value, "user_type");
            return (Criteria) this;
        }

        public Criteria andUser_typeLessThan(Integer value) {
            addCriterion("user_type <", value, "user_type");
            return (Criteria) this;
        }

        public Criteria andUser_typeLessThanOrEqualTo(Integer value) {
            addCriterion("user_type <=", value, "user_type");
            return (Criteria) this;
        }

        public Criteria andUser_typeIn(List<Integer> values) {
            addCriterion("user_type in", values, "user_type");
            return (Criteria) this;
        }

        public Criteria andUser_typeNotIn(List<Integer> values) {
            addCriterion("user_type not in", values, "user_type");
            return (Criteria) this;
        }

        public Criteria andUser_typeBetween(Integer value1, Integer value2) {
            addCriterion("user_type between", value1, value2, "user_type");
            return (Criteria) this;
        }

        public Criteria andUser_typeNotBetween(Integer value1, Integer value2) {
            addCriterion("user_type not between", value1, value2, "user_type");
            return (Criteria) this;
        }

        public Criteria andUser_orgIsNull() {
            addCriterion("user_org is null");
            return (Criteria) this;
        }

        public Criteria andUser_orgIsNotNull() {
            addCriterion("user_org is not null");
            return (Criteria) this;
        }

        public Criteria andUser_orgEqualTo(Integer value) {
            addCriterion("user_org =", value, "user_org");
            return (Criteria) this;
        }

        public Criteria andUser_orgNotEqualTo(Integer value) {
            addCriterion("user_org <>", value, "user_org");
            return (Criteria) this;
        }

        public Criteria andUser_orgGreaterThan(Integer value) {
            addCriterion("user_org >", value, "user_org");
            return (Criteria) this;
        }

        public Criteria andUser_orgGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_org >=", value, "user_org");
            return (Criteria) this;
        }

        public Criteria andUser_orgLessThan(Integer value) {
            addCriterion("user_org <", value, "user_org");
            return (Criteria) this;
        }

        public Criteria andUser_orgLessThanOrEqualTo(Integer value) {
            addCriterion("user_org <=", value, "user_org");
            return (Criteria) this;
        }

        public Criteria andUser_orgIn(List<Integer> values) {
            addCriterion("user_org in", values, "user_org");
            return (Criteria) this;
        }

        public Criteria andUser_orgNotIn(List<Integer> values) {
            addCriterion("user_org not in", values, "user_org");
            return (Criteria) this;
        }

        public Criteria andUser_orgBetween(Integer value1, Integer value2) {
            addCriterion("user_org between", value1, value2, "user_org");
            return (Criteria) this;
        }

        public Criteria andUser_orgNotBetween(Integer value1, Integer value2) {
            addCriterion("user_org not between", value1, value2, "user_org");
            return (Criteria) this;
        }

        public Criteria andOrg_typeIsNull() {
            addCriterion("org_type is null");
            return (Criteria) this;
        }

        public Criteria andOrg_typeIsNotNull() {
            addCriterion("org_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrg_typeEqualTo(Integer value) {
            addCriterion("org_type =", value, "org_type");
            return (Criteria) this;
        }

        public Criteria andOrg_typeNotEqualTo(Integer value) {
            addCriterion("org_type <>", value, "org_type");
            return (Criteria) this;
        }

        public Criteria andOrg_typeGreaterThan(Integer value) {
            addCriterion("org_type >", value, "org_type");
            return (Criteria) this;
        }

        public Criteria andOrg_typeGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_type >=", value, "org_type");
            return (Criteria) this;
        }

        public Criteria andOrg_typeLessThan(Integer value) {
            addCriterion("org_type <", value, "org_type");
            return (Criteria) this;
        }

        public Criteria andOrg_typeLessThanOrEqualTo(Integer value) {
            addCriterion("org_type <=", value, "org_type");
            return (Criteria) this;
        }

        public Criteria andOrg_typeIn(List<Integer> values) {
            addCriterion("org_type in", values, "org_type");
            return (Criteria) this;
        }

        public Criteria andOrg_typeNotIn(List<Integer> values) {
            addCriterion("org_type not in", values, "org_type");
            return (Criteria) this;
        }

        public Criteria andOrg_typeBetween(Integer value1, Integer value2) {
            addCriterion("org_type between", value1, value2, "org_type");
            return (Criteria) this;
        }

        public Criteria andOrg_typeNotBetween(Integer value1, Integer value2) {
            addCriterion("org_type not between", value1, value2, "org_type");
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

        public Criteria andCreate_timeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeEqualTo(Date value) {
            addCriterion("create_time =", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThan(Date value) {
            addCriterion("create_time >", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThan(Date value) {
            addCriterion("create_time <", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIn(List<Date> values) {
            addCriterion("create_time in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andEmp_idIsNull() {
            addCriterion("emp_id is null");
            return (Criteria) this;
        }

        public Criteria andEmp_idIsNotNull() {
            addCriterion("emp_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmp_idEqualTo(Integer value) {
            addCriterion("emp_id =", value, "emp_id");
            return (Criteria) this;
        }

        public Criteria andEmp_idNotEqualTo(Integer value) {
            addCriterion("emp_id <>", value, "emp_id");
            return (Criteria) this;
        }

        public Criteria andEmp_idGreaterThan(Integer value) {
            addCriterion("emp_id >", value, "emp_id");
            return (Criteria) this;
        }

        public Criteria andEmp_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("emp_id >=", value, "emp_id");
            return (Criteria) this;
        }

        public Criteria andEmp_idLessThan(Integer value) {
            addCriterion("emp_id <", value, "emp_id");
            return (Criteria) this;
        }

        public Criteria andEmp_idLessThanOrEqualTo(Integer value) {
            addCriterion("emp_id <=", value, "emp_id");
            return (Criteria) this;
        }

        public Criteria andEmp_idIn(List<Integer> values) {
            addCriterion("emp_id in", values, "emp_id");
            return (Criteria) this;
        }

        public Criteria andEmp_idNotIn(List<Integer> values) {
            addCriterion("emp_id not in", values, "emp_id");
            return (Criteria) this;
        }

        public Criteria andEmp_idBetween(Integer value1, Integer value2) {
            addCriterion("emp_id between", value1, value2, "emp_id");
            return (Criteria) this;
        }

        public Criteria andEmp_idNotBetween(Integer value1, Integer value2) {
            addCriterion("emp_id not between", value1, value2, "emp_id");
            return (Criteria) this;
        }

        public Criteria andLast_login_timeIsNull() {
            addCriterion("last_login_time is null");
            return (Criteria) this;
        }

        public Criteria andLast_login_timeIsNotNull() {
            addCriterion("last_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLast_login_timeEqualTo(Date value) {
            addCriterion("last_login_time =", value, "last_login_time");
            return (Criteria) this;
        }

        public Criteria andLast_login_timeNotEqualTo(Date value) {
            addCriterion("last_login_time <>", value, "last_login_time");
            return (Criteria) this;
        }

        public Criteria andLast_login_timeGreaterThan(Date value) {
            addCriterion("last_login_time >", value, "last_login_time");
            return (Criteria) this;
        }

        public Criteria andLast_login_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_login_time >=", value, "last_login_time");
            return (Criteria) this;
        }

        public Criteria andLast_login_timeLessThan(Date value) {
            addCriterion("last_login_time <", value, "last_login_time");
            return (Criteria) this;
        }

        public Criteria andLast_login_timeLessThanOrEqualTo(Date value) {
            addCriterion("last_login_time <=", value, "last_login_time");
            return (Criteria) this;
        }

        public Criteria andLast_login_timeIn(List<Date> values) {
            addCriterion("last_login_time in", values, "last_login_time");
            return (Criteria) this;
        }

        public Criteria andLast_login_timeNotIn(List<Date> values) {
            addCriterion("last_login_time not in", values, "last_login_time");
            return (Criteria) this;
        }

        public Criteria andLast_login_timeBetween(Date value1, Date value2) {
            addCriterion("last_login_time between", value1, value2, "last_login_time");
            return (Criteria) this;
        }

        public Criteria andLast_login_timeNotBetween(Date value1, Date value2) {
            addCriterion("last_login_time not between", value1, value2, "last_login_time");
            return (Criteria) this;
        }

        public Criteria andLast_login_ipIsNull() {
            addCriterion("last_login_ip is null");
            return (Criteria) this;
        }

        public Criteria andLast_login_ipIsNotNull() {
            addCriterion("last_login_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLast_login_ipEqualTo(String value) {
            addCriterion("last_login_ip =", value, "last_login_ip");
            return (Criteria) this;
        }

        public Criteria andLast_login_ipNotEqualTo(String value) {
            addCriterion("last_login_ip <>", value, "last_login_ip");
            return (Criteria) this;
        }

        public Criteria andLast_login_ipGreaterThan(String value) {
            addCriterion("last_login_ip >", value, "last_login_ip");
            return (Criteria) this;
        }

        public Criteria andLast_login_ipGreaterThanOrEqualTo(String value) {
            addCriterion("last_login_ip >=", value, "last_login_ip");
            return (Criteria) this;
        }

        public Criteria andLast_login_ipLessThan(String value) {
            addCriterion("last_login_ip <", value, "last_login_ip");
            return (Criteria) this;
        }

        public Criteria andLast_login_ipLessThanOrEqualTo(String value) {
            addCriterion("last_login_ip <=", value, "last_login_ip");
            return (Criteria) this;
        }

        public Criteria andLast_login_ipLike(String value) {
            addCriterion("last_login_ip like", value, "last_login_ip");
            return (Criteria) this;
        }

        public Criteria andLast_login_ipNotLike(String value) {
            addCriterion("last_login_ip not like", value, "last_login_ip");
            return (Criteria) this;
        }

        public Criteria andLast_login_ipIn(List<String> values) {
            addCriterion("last_login_ip in", values, "last_login_ip");
            return (Criteria) this;
        }

        public Criteria andLast_login_ipNotIn(List<String> values) {
            addCriterion("last_login_ip not in", values, "last_login_ip");
            return (Criteria) this;
        }

        public Criteria andLast_login_ipBetween(String value1, String value2) {
            addCriterion("last_login_ip between", value1, value2, "last_login_ip");
            return (Criteria) this;
        }

        public Criteria andLast_login_ipNotBetween(String value1, String value2) {
            addCriterion("last_login_ip not between", value1, value2, "last_login_ip");
            return (Criteria) this;
        }

        public Criteria andDynamic_pwdIsNull() {
            addCriterion("dynamic_pwd is null");
            return (Criteria) this;
        }

        public Criteria andDynamic_pwdIsNotNull() {
            addCriterion("dynamic_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andDynamic_pwdEqualTo(String value) {
            addCriterion("dynamic_pwd =", value, "dynamic_pwd");
            return (Criteria) this;
        }

        public Criteria andDynamic_pwdNotEqualTo(String value) {
            addCriterion("dynamic_pwd <>", value, "dynamic_pwd");
            return (Criteria) this;
        }

        public Criteria andDynamic_pwdGreaterThan(String value) {
            addCriterion("dynamic_pwd >", value, "dynamic_pwd");
            return (Criteria) this;
        }

        public Criteria andDynamic_pwdGreaterThanOrEqualTo(String value) {
            addCriterion("dynamic_pwd >=", value, "dynamic_pwd");
            return (Criteria) this;
        }

        public Criteria andDynamic_pwdLessThan(String value) {
            addCriterion("dynamic_pwd <", value, "dynamic_pwd");
            return (Criteria) this;
        }

        public Criteria andDynamic_pwdLessThanOrEqualTo(String value) {
            addCriterion("dynamic_pwd <=", value, "dynamic_pwd");
            return (Criteria) this;
        }

        public Criteria andDynamic_pwdLike(String value) {
            addCriterion("dynamic_pwd like", value, "dynamic_pwd");
            return (Criteria) this;
        }

        public Criteria andDynamic_pwdNotLike(String value) {
            addCriterion("dynamic_pwd not like", value, "dynamic_pwd");
            return (Criteria) this;
        }

        public Criteria andDynamic_pwdIn(List<String> values) {
            addCriterion("dynamic_pwd in", values, "dynamic_pwd");
            return (Criteria) this;
        }

        public Criteria andDynamic_pwdNotIn(List<String> values) {
            addCriterion("dynamic_pwd not in", values, "dynamic_pwd");
            return (Criteria) this;
        }

        public Criteria andDynamic_pwdBetween(String value1, String value2) {
            addCriterion("dynamic_pwd between", value1, value2, "dynamic_pwd");
            return (Criteria) this;
        }

        public Criteria andDynamic_pwdNotBetween(String value1, String value2) {
            addCriterion("dynamic_pwd not between", value1, value2, "dynamic_pwd");
            return (Criteria) this;
        }

        public Criteria andDynamic_pwd_timeIsNull() {
            addCriterion("dynamic_pwd_time is null");
            return (Criteria) this;
        }

        public Criteria andDynamic_pwd_timeIsNotNull() {
            addCriterion("dynamic_pwd_time is not null");
            return (Criteria) this;
        }

        public Criteria andDynamic_pwd_timeEqualTo(Date value) {
            addCriterion("dynamic_pwd_time =", value, "dynamic_pwd_time");
            return (Criteria) this;
        }

        public Criteria andDynamic_pwd_timeNotEqualTo(Date value) {
            addCriterion("dynamic_pwd_time <>", value, "dynamic_pwd_time");
            return (Criteria) this;
        }

        public Criteria andDynamic_pwd_timeGreaterThan(Date value) {
            addCriterion("dynamic_pwd_time >", value, "dynamic_pwd_time");
            return (Criteria) this;
        }

        public Criteria andDynamic_pwd_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("dynamic_pwd_time >=", value, "dynamic_pwd_time");
            return (Criteria) this;
        }

        public Criteria andDynamic_pwd_timeLessThan(Date value) {
            addCriterion("dynamic_pwd_time <", value, "dynamic_pwd_time");
            return (Criteria) this;
        }

        public Criteria andDynamic_pwd_timeLessThanOrEqualTo(Date value) {
            addCriterion("dynamic_pwd_time <=", value, "dynamic_pwd_time");
            return (Criteria) this;
        }

        public Criteria andDynamic_pwd_timeIn(List<Date> values) {
            addCriterion("dynamic_pwd_time in", values, "dynamic_pwd_time");
            return (Criteria) this;
        }

        public Criteria andDynamic_pwd_timeNotIn(List<Date> values) {
            addCriterion("dynamic_pwd_time not in", values, "dynamic_pwd_time");
            return (Criteria) this;
        }

        public Criteria andDynamic_pwd_timeBetween(Date value1, Date value2) {
            addCriterion("dynamic_pwd_time between", value1, value2, "dynamic_pwd_time");
            return (Criteria) this;
        }

        public Criteria andDynamic_pwd_timeNotBetween(Date value1, Date value2) {
            addCriterion("dynamic_pwd_time not between", value1, value2, "dynamic_pwd_time");
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