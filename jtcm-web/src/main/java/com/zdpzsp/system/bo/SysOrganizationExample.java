package com.zdpzsp.system.bo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysOrganizationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysOrganizationExample() {
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

        public Criteria andOrg_idIsNull() {
            addCriterion("org_id is null");
            return (Criteria) this;
        }

        public Criteria andOrg_idIsNotNull() {
            addCriterion("org_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrg_idEqualTo(Long value) {
            addCriterion("org_id =", value, "org_id");
            return (Criteria) this;
        }

        public Criteria andOrg_idNotEqualTo(Long value) {
            addCriterion("org_id <>", value, "org_id");
            return (Criteria) this;
        }

        public Criteria andOrg_idGreaterThan(Long value) {
            addCriterion("org_id >", value, "org_id");
            return (Criteria) this;
        }

        public Criteria andOrg_idGreaterThanOrEqualTo(Long value) {
            addCriterion("org_id >=", value, "org_id");
            return (Criteria) this;
        }

        public Criteria andOrg_idLessThan(Long value) {
            addCriterion("org_id <", value, "org_id");
            return (Criteria) this;
        }

        public Criteria andOrg_idLessThanOrEqualTo(Long value) {
            addCriterion("org_id <=", value, "org_id");
            return (Criteria) this;
        }

        public Criteria andOrg_idIn(List<Long> values) {
            addCriterion("org_id in", values, "org_id");
            return (Criteria) this;
        }

        public Criteria andOrg_idNotIn(List<Long> values) {
            addCriterion("org_id not in", values, "org_id");
            return (Criteria) this;
        }

        public Criteria andOrg_idBetween(Long value1, Long value2) {
            addCriterion("org_id between", value1, value2, "org_id");
            return (Criteria) this;
        }

        public Criteria andOrg_idNotBetween(Long value1, Long value2) {
            addCriterion("org_id not between", value1, value2, "org_id");
            return (Criteria) this;
        }

        public Criteria andOrg_nameIsNull() {
            addCriterion("org_name is null");
            return (Criteria) this;
        }

        public Criteria andOrg_nameIsNotNull() {
            addCriterion("org_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrg_nameEqualTo(String value) {
            addCriterion("org_name =", value, "org_name");
            return (Criteria) this;
        }

        public Criteria andOrg_nameNotEqualTo(String value) {
            addCriterion("org_name <>", value, "org_name");
            return (Criteria) this;
        }

        public Criteria andOrg_nameGreaterThan(String value) {
            addCriterion("org_name >", value, "org_name");
            return (Criteria) this;
        }

        public Criteria andOrg_nameGreaterThanOrEqualTo(String value) {
            addCriterion("org_name >=", value, "org_name");
            return (Criteria) this;
        }

        public Criteria andOrg_nameLessThan(String value) {
            addCriterion("org_name <", value, "org_name");
            return (Criteria) this;
        }

        public Criteria andOrg_nameLessThanOrEqualTo(String value) {
            addCriterion("org_name <=", value, "org_name");
            return (Criteria) this;
        }

        public Criteria andOrg_nameLike(String value) {
            addCriterion("org_name like", value, "org_name");
            return (Criteria) this;
        }

        public Criteria andOrg_nameNotLike(String value) {
            addCriterion("org_name not like", value, "org_name");
            return (Criteria) this;
        }

        public Criteria andOrg_nameIn(List<String> values) {
            addCriterion("org_name in", values, "org_name");
            return (Criteria) this;
        }

        public Criteria andOrg_nameNotIn(List<String> values) {
            addCriterion("org_name not in", values, "org_name");
            return (Criteria) this;
        }

        public Criteria andOrg_nameBetween(String value1, String value2) {
            addCriterion("org_name between", value1, value2, "org_name");
            return (Criteria) this;
        }

        public Criteria andOrg_nameNotBetween(String value1, String value2) {
            addCriterion("org_name not between", value1, value2, "org_name");
            return (Criteria) this;
        }

        public Criteria andUp_org_idIsNull() {
            addCriterion("up_org_id is null");
            return (Criteria) this;
        }

        public Criteria andUp_org_idIsNotNull() {
            addCriterion("up_org_id is not null");
            return (Criteria) this;
        }

        public Criteria andUp_org_idEqualTo(Integer value) {
            addCriterion("up_org_id =", value, "up_org_id");
            return (Criteria) this;
        }

        public Criteria andUp_org_idNotEqualTo(Integer value) {
            addCriterion("up_org_id <>", value, "up_org_id");
            return (Criteria) this;
        }

        public Criteria andUp_org_idGreaterThan(Integer value) {
            addCriterion("up_org_id >", value, "up_org_id");
            return (Criteria) this;
        }

        public Criteria andUp_org_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("up_org_id >=", value, "up_org_id");
            return (Criteria) this;
        }

        public Criteria andUp_org_idLessThan(Integer value) {
            addCriterion("up_org_id <", value, "up_org_id");
            return (Criteria) this;
        }

        public Criteria andUp_org_idLessThanOrEqualTo(Integer value) {
            addCriterion("up_org_id <=", value, "up_org_id");
            return (Criteria) this;
        }

        public Criteria andUp_org_idIn(List<Integer> values) {
            addCriterion("up_org_id in", values, "up_org_id");
            return (Criteria) this;
        }

        public Criteria andUp_org_idNotIn(List<Integer> values) {
            addCriterion("up_org_id not in", values, "up_org_id");
            return (Criteria) this;
        }

        public Criteria andUp_org_idBetween(Integer value1, Integer value2) {
            addCriterion("up_org_id between", value1, value2, "up_org_id");
            return (Criteria) this;
        }

        public Criteria andUp_org_idNotBetween(Integer value1, Integer value2) {
            addCriterion("up_org_id not between", value1, value2, "up_org_id");
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

        public Criteria andOrg_sub_typeIsNull() {
            addCriterion("org_sub_type is null");
            return (Criteria) this;
        }

        public Criteria andOrg_sub_typeIsNotNull() {
            addCriterion("org_sub_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrg_sub_typeEqualTo(String value) {
            addCriterion("org_sub_type =", value, "org_sub_type");
            return (Criteria) this;
        }

        public Criteria andOrg_sub_typeNotEqualTo(String value) {
            addCriterion("org_sub_type <>", value, "org_sub_type");
            return (Criteria) this;
        }

        public Criteria andOrg_sub_typeGreaterThan(String value) {
            addCriterion("org_sub_type >", value, "org_sub_type");
            return (Criteria) this;
        }

        public Criteria andOrg_sub_typeGreaterThanOrEqualTo(String value) {
            addCriterion("org_sub_type >=", value, "org_sub_type");
            return (Criteria) this;
        }

        public Criteria andOrg_sub_typeLessThan(String value) {
            addCriterion("org_sub_type <", value, "org_sub_type");
            return (Criteria) this;
        }

        public Criteria andOrg_sub_typeLessThanOrEqualTo(String value) {
            addCriterion("org_sub_type <=", value, "org_sub_type");
            return (Criteria) this;
        }

        public Criteria andOrg_sub_typeLike(String value) {
            addCriterion("org_sub_type like", value, "org_sub_type");
            return (Criteria) this;
        }

        public Criteria andOrg_sub_typeNotLike(String value) {
            addCriterion("org_sub_type not like", value, "org_sub_type");
            return (Criteria) this;
        }

        public Criteria andOrg_sub_typeIn(List<String> values) {
            addCriterion("org_sub_type in", values, "org_sub_type");
            return (Criteria) this;
        }

        public Criteria andOrg_sub_typeNotIn(List<String> values) {
            addCriterion("org_sub_type not in", values, "org_sub_type");
            return (Criteria) this;
        }

        public Criteria andOrg_sub_typeBetween(String value1, String value2) {
            addCriterion("org_sub_type between", value1, value2, "org_sub_type");
            return (Criteria) this;
        }

        public Criteria andOrg_sub_typeNotBetween(String value1, String value2) {
            addCriterion("org_sub_type not between", value1, value2, "org_sub_type");
            return (Criteria) this;
        }

        public Criteria andOrg_addrIsNull() {
            addCriterion("org_addr is null");
            return (Criteria) this;
        }

        public Criteria andOrg_addrIsNotNull() {
            addCriterion("org_addr is not null");
            return (Criteria) this;
        }

        public Criteria andOrg_addrEqualTo(String value) {
            addCriterion("org_addr =", value, "org_addr");
            return (Criteria) this;
        }

        public Criteria andOrg_addrNotEqualTo(String value) {
            addCriterion("org_addr <>", value, "org_addr");
            return (Criteria) this;
        }

        public Criteria andOrg_addrGreaterThan(String value) {
            addCriterion("org_addr >", value, "org_addr");
            return (Criteria) this;
        }

        public Criteria andOrg_addrGreaterThanOrEqualTo(String value) {
            addCriterion("org_addr >=", value, "org_addr");
            return (Criteria) this;
        }

        public Criteria andOrg_addrLessThan(String value) {
            addCriterion("org_addr <", value, "org_addr");
            return (Criteria) this;
        }

        public Criteria andOrg_addrLessThanOrEqualTo(String value) {
            addCriterion("org_addr <=", value, "org_addr");
            return (Criteria) this;
        }

        public Criteria andOrg_addrLike(String value) {
            addCriterion("org_addr like", value, "org_addr");
            return (Criteria) this;
        }

        public Criteria andOrg_addrNotLike(String value) {
            addCriterion("org_addr not like", value, "org_addr");
            return (Criteria) this;
        }

        public Criteria andOrg_addrIn(List<String> values) {
            addCriterion("org_addr in", values, "org_addr");
            return (Criteria) this;
        }

        public Criteria andOrg_addrNotIn(List<String> values) {
            addCriterion("org_addr not in", values, "org_addr");
            return (Criteria) this;
        }

        public Criteria andOrg_addrBetween(String value1, String value2) {
            addCriterion("org_addr between", value1, value2, "org_addr");
            return (Criteria) this;
        }

        public Criteria andOrg_addrNotBetween(String value1, String value2) {
            addCriterion("org_addr not between", value1, value2, "org_addr");
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

        public Criteria andCpu_idIsNull() {
            addCriterion("cpu_id is null");
            return (Criteria) this;
        }

        public Criteria andCpu_idIsNotNull() {
            addCriterion("cpu_id is not null");
            return (Criteria) this;
        }

        public Criteria andCpu_idEqualTo(String value) {
            addCriterion("cpu_id =", value, "cpu_id");
            return (Criteria) this;
        }

        public Criteria andCpu_idNotEqualTo(String value) {
            addCriterion("cpu_id <>", value, "cpu_id");
            return (Criteria) this;
        }

        public Criteria andCpu_idGreaterThan(String value) {
            addCriterion("cpu_id >", value, "cpu_id");
            return (Criteria) this;
        }

        public Criteria andCpu_idGreaterThanOrEqualTo(String value) {
            addCriterion("cpu_id >=", value, "cpu_id");
            return (Criteria) this;
        }

        public Criteria andCpu_idLessThan(String value) {
            addCriterion("cpu_id <", value, "cpu_id");
            return (Criteria) this;
        }

        public Criteria andCpu_idLessThanOrEqualTo(String value) {
            addCriterion("cpu_id <=", value, "cpu_id");
            return (Criteria) this;
        }

        public Criteria andCpu_idLike(String value) {
            addCriterion("cpu_id like", value, "cpu_id");
            return (Criteria) this;
        }

        public Criteria andCpu_idNotLike(String value) {
            addCriterion("cpu_id not like", value, "cpu_id");
            return (Criteria) this;
        }

        public Criteria andCpu_idIn(List<String> values) {
            addCriterion("cpu_id in", values, "cpu_id");
            return (Criteria) this;
        }

        public Criteria andCpu_idNotIn(List<String> values) {
            addCriterion("cpu_id not in", values, "cpu_id");
            return (Criteria) this;
        }

        public Criteria andCpu_idBetween(String value1, String value2) {
            addCriterion("cpu_id between", value1, value2, "cpu_id");
            return (Criteria) this;
        }

        public Criteria andCpu_idNotBetween(String value1, String value2) {
            addCriterion("cpu_id not between", value1, value2, "cpu_id");
            return (Criteria) this;
        }

        public Criteria andCompany_idIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompany_idIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompany_idEqualTo(Integer value) {
            addCriterion("company_id =", value, "company_id");
            return (Criteria) this;
        }

        public Criteria andCompany_idNotEqualTo(Integer value) {
            addCriterion("company_id <>", value, "company_id");
            return (Criteria) this;
        }

        public Criteria andCompany_idGreaterThan(Integer value) {
            addCriterion("company_id >", value, "company_id");
            return (Criteria) this;
        }

        public Criteria andCompany_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_id >=", value, "company_id");
            return (Criteria) this;
        }

        public Criteria andCompany_idLessThan(Integer value) {
            addCriterion("company_id <", value, "company_id");
            return (Criteria) this;
        }

        public Criteria andCompany_idLessThanOrEqualTo(Integer value) {
            addCriterion("company_id <=", value, "company_id");
            return (Criteria) this;
        }

        public Criteria andCompany_idIn(List<Integer> values) {
            addCriterion("company_id in", values, "company_id");
            return (Criteria) this;
        }

        public Criteria andCompany_idNotIn(List<Integer> values) {
            addCriterion("company_id not in", values, "company_id");
            return (Criteria) this;
        }

        public Criteria andCompany_idBetween(Integer value1, Integer value2) {
            addCriterion("company_id between", value1, value2, "company_id");
            return (Criteria) this;
        }

        public Criteria andCompany_idNotBetween(Integer value1, Integer value2) {
            addCriterion("company_id not between", value1, value2, "company_id");
            return (Criteria) this;
        }

        public Criteria andContactsIsNull() {
            addCriterion("contacts is null");
            return (Criteria) this;
        }

        public Criteria andContactsIsNotNull() {
            addCriterion("contacts is not null");
            return (Criteria) this;
        }

        public Criteria andContactsEqualTo(String value) {
            addCriterion("contacts =", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotEqualTo(String value) {
            addCriterion("contacts <>", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsGreaterThan(String value) {
            addCriterion("contacts >", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsGreaterThanOrEqualTo(String value) {
            addCriterion("contacts >=", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLessThan(String value) {
            addCriterion("contacts <", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLessThanOrEqualTo(String value) {
            addCriterion("contacts <=", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLike(String value) {
            addCriterion("contacts like", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotLike(String value) {
            addCriterion("contacts not like", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsIn(List<String> values) {
            addCriterion("contacts in", values, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotIn(List<String> values) {
            addCriterion("contacts not in", values, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsBetween(String value1, String value2) {
            addCriterion("contacts between", value1, value2, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotBetween(String value1, String value2) {
            addCriterion("contacts not between", value1, value2, "contacts");
            return (Criteria) this;
        }

        public Criteria andContact_emailIsNull() {
            addCriterion("contact_email is null");
            return (Criteria) this;
        }

        public Criteria andContact_emailIsNotNull() {
            addCriterion("contact_email is not null");
            return (Criteria) this;
        }

        public Criteria andContact_emailEqualTo(String value) {
            addCriterion("contact_email =", value, "contact_email");
            return (Criteria) this;
        }

        public Criteria andContact_emailNotEqualTo(String value) {
            addCriterion("contact_email <>", value, "contact_email");
            return (Criteria) this;
        }

        public Criteria andContact_emailGreaterThan(String value) {
            addCriterion("contact_email >", value, "contact_email");
            return (Criteria) this;
        }

        public Criteria andContact_emailGreaterThanOrEqualTo(String value) {
            addCriterion("contact_email >=", value, "contact_email");
            return (Criteria) this;
        }

        public Criteria andContact_emailLessThan(String value) {
            addCriterion("contact_email <", value, "contact_email");
            return (Criteria) this;
        }

        public Criteria andContact_emailLessThanOrEqualTo(String value) {
            addCriterion("contact_email <=", value, "contact_email");
            return (Criteria) this;
        }

        public Criteria andContact_emailLike(String value) {
            addCriterion("contact_email like", value, "contact_email");
            return (Criteria) this;
        }

        public Criteria andContact_emailNotLike(String value) {
            addCriterion("contact_email not like", value, "contact_email");
            return (Criteria) this;
        }

        public Criteria andContact_emailIn(List<String> values) {
            addCriterion("contact_email in", values, "contact_email");
            return (Criteria) this;
        }

        public Criteria andContact_emailNotIn(List<String> values) {
            addCriterion("contact_email not in", values, "contact_email");
            return (Criteria) this;
        }

        public Criteria andContact_emailBetween(String value1, String value2) {
            addCriterion("contact_email between", value1, value2, "contact_email");
            return (Criteria) this;
        }

        public Criteria andContact_emailNotBetween(String value1, String value2) {
            addCriterion("contact_email not between", value1, value2, "contact_email");
            return (Criteria) this;
        }

        public Criteria andContact_numberIsNull() {
            addCriterion("contact_number is null");
            return (Criteria) this;
        }

        public Criteria andContact_numberIsNotNull() {
            addCriterion("contact_number is not null");
            return (Criteria) this;
        }

        public Criteria andContact_numberEqualTo(String value) {
            addCriterion("contact_number =", value, "contact_number");
            return (Criteria) this;
        }

        public Criteria andContact_numberNotEqualTo(String value) {
            addCriterion("contact_number <>", value, "contact_number");
            return (Criteria) this;
        }

        public Criteria andContact_numberGreaterThan(String value) {
            addCriterion("contact_number >", value, "contact_number");
            return (Criteria) this;
        }

        public Criteria andContact_numberGreaterThanOrEqualTo(String value) {
            addCriterion("contact_number >=", value, "contact_number");
            return (Criteria) this;
        }

        public Criteria andContact_numberLessThan(String value) {
            addCriterion("contact_number <", value, "contact_number");
            return (Criteria) this;
        }

        public Criteria andContact_numberLessThanOrEqualTo(String value) {
            addCriterion("contact_number <=", value, "contact_number");
            return (Criteria) this;
        }

        public Criteria andContact_numberLike(String value) {
            addCriterion("contact_number like", value, "contact_number");
            return (Criteria) this;
        }

        public Criteria andContact_numberNotLike(String value) {
            addCriterion("contact_number not like", value, "contact_number");
            return (Criteria) this;
        }

        public Criteria andContact_numberIn(List<String> values) {
            addCriterion("contact_number in", values, "contact_number");
            return (Criteria) this;
        }

        public Criteria andContact_numberNotIn(List<String> values) {
            addCriterion("contact_number not in", values, "contact_number");
            return (Criteria) this;
        }

        public Criteria andContact_numberBetween(String value1, String value2) {
            addCriterion("contact_number between", value1, value2, "contact_number");
            return (Criteria) this;
        }

        public Criteria andContact_numberNotBetween(String value1, String value2) {
            addCriterion("contact_number not between", value1, value2, "contact_number");
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

        public Criteria andOrg_LongitudeIsNull() {
            addCriterion("org_Longitude is null");
            return (Criteria) this;
        }

        public Criteria andOrg_LongitudeIsNotNull() {
            addCriterion("org_Longitude is not null");
            return (Criteria) this;
        }

        public Criteria andOrg_LongitudeEqualTo(String value) {
            addCriterion("org_Longitude =", value, "org_Longitude");
            return (Criteria) this;
        }

        public Criteria andOrg_LongitudeNotEqualTo(String value) {
            addCriterion("org_Longitude <>", value, "org_Longitude");
            return (Criteria) this;
        }

        public Criteria andOrg_LongitudeGreaterThan(String value) {
            addCriterion("org_Longitude >", value, "org_Longitude");
            return (Criteria) this;
        }

        public Criteria andOrg_LongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("org_Longitude >=", value, "org_Longitude");
            return (Criteria) this;
        }

        public Criteria andOrg_LongitudeLessThan(String value) {
            addCriterion("org_Longitude <", value, "org_Longitude");
            return (Criteria) this;
        }

        public Criteria andOrg_LongitudeLessThanOrEqualTo(String value) {
            addCriterion("org_Longitude <=", value, "org_Longitude");
            return (Criteria) this;
        }

        public Criteria andOrg_LongitudeLike(String value) {
            addCriterion("org_Longitude like", value, "org_Longitude");
            return (Criteria) this;
        }

        public Criteria andOrg_LongitudeNotLike(String value) {
            addCriterion("org_Longitude not like", value, "org_Longitude");
            return (Criteria) this;
        }

        public Criteria andOrg_LongitudeIn(List<String> values) {
            addCriterion("org_Longitude in", values, "org_Longitude");
            return (Criteria) this;
        }

        public Criteria andOrg_LongitudeNotIn(List<String> values) {
            addCriterion("org_Longitude not in", values, "org_Longitude");
            return (Criteria) this;
        }

        public Criteria andOrg_LongitudeBetween(String value1, String value2) {
            addCriterion("org_Longitude between", value1, value2, "org_Longitude");
            return (Criteria) this;
        }

        public Criteria andOrg_LongitudeNotBetween(String value1, String value2) {
            addCriterion("org_Longitude not between", value1, value2, "org_Longitude");
            return (Criteria) this;
        }

        public Criteria andOrg_latitudeIsNull() {
            addCriterion("org_latitude is null");
            return (Criteria) this;
        }

        public Criteria andOrg_latitudeIsNotNull() {
            addCriterion("org_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andOrg_latitudeEqualTo(String value) {
            addCriterion("org_latitude =", value, "org_latitude");
            return (Criteria) this;
        }

        public Criteria andOrg_latitudeNotEqualTo(String value) {
            addCriterion("org_latitude <>", value, "org_latitude");
            return (Criteria) this;
        }

        public Criteria andOrg_latitudeGreaterThan(String value) {
            addCriterion("org_latitude >", value, "org_latitude");
            return (Criteria) this;
        }

        public Criteria andOrg_latitudeGreaterThanOrEqualTo(String value) {
            addCriterion("org_latitude >=", value, "org_latitude");
            return (Criteria) this;
        }

        public Criteria andOrg_latitudeLessThan(String value) {
            addCriterion("org_latitude <", value, "org_latitude");
            return (Criteria) this;
        }

        public Criteria andOrg_latitudeLessThanOrEqualTo(String value) {
            addCriterion("org_latitude <=", value, "org_latitude");
            return (Criteria) this;
        }

        public Criteria andOrg_latitudeLike(String value) {
            addCriterion("org_latitude like", value, "org_latitude");
            return (Criteria) this;
        }

        public Criteria andOrg_latitudeNotLike(String value) {
            addCriterion("org_latitude not like", value, "org_latitude");
            return (Criteria) this;
        }

        public Criteria andOrg_latitudeIn(List<String> values) {
            addCriterion("org_latitude in", values, "org_latitude");
            return (Criteria) this;
        }

        public Criteria andOrg_latitudeNotIn(List<String> values) {
            addCriterion("org_latitude not in", values, "org_latitude");
            return (Criteria) this;
        }

        public Criteria andOrg_latitudeBetween(String value1, String value2) {
            addCriterion("org_latitude between", value1, value2, "org_latitude");
            return (Criteria) this;
        }

        public Criteria andOrg_latitudeNotBetween(String value1, String value2) {
            addCriterion("org_latitude not between", value1, value2, "org_latitude");
            return (Criteria) this;
        }

        public Criteria andAddrArryIsNull() {
            addCriterion("addrArry is null");
            return (Criteria) this;
        }

        public Criteria andAddrArryIsNotNull() {
            addCriterion("addrArry is not null");
            return (Criteria) this;
        }

        public Criteria andAddrArryEqualTo(String value) {
            addCriterion("addrArry =", value, "addrArry");
            return (Criteria) this;
        }

        public Criteria andAddrArryNotEqualTo(String value) {
            addCriterion("addrArry <>", value, "addrArry");
            return (Criteria) this;
        }

        public Criteria andAddrArryGreaterThan(String value) {
            addCriterion("addrArry >", value, "addrArry");
            return (Criteria) this;
        }

        public Criteria andAddrArryGreaterThanOrEqualTo(String value) {
            addCriterion("addrArry >=", value, "addrArry");
            return (Criteria) this;
        }

        public Criteria andAddrArryLessThan(String value) {
            addCriterion("addrArry <", value, "addrArry");
            return (Criteria) this;
        }

        public Criteria andAddrArryLessThanOrEqualTo(String value) {
            addCriterion("addrArry <=", value, "addrArry");
            return (Criteria) this;
        }

        public Criteria andAddrArryLike(String value) {
            addCriterion("addrArry like", value, "addrArry");
            return (Criteria) this;
        }

        public Criteria andAddrArryNotLike(String value) {
            addCriterion("addrArry not like", value, "addrArry");
            return (Criteria) this;
        }

        public Criteria andAddrArryIn(List<String> values) {
            addCriterion("addrArry in", values, "addrArry");
            return (Criteria) this;
        }

        public Criteria andAddrArryNotIn(List<String> values) {
            addCriterion("addrArry not in", values, "addrArry");
            return (Criteria) this;
        }

        public Criteria andAddrArryBetween(String value1, String value2) {
            addCriterion("addrArry between", value1, value2, "addrArry");
            return (Criteria) this;
        }

        public Criteria andAddrArryNotBetween(String value1, String value2) {
            addCriterion("addrArry not between", value1, value2, "addrArry");
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