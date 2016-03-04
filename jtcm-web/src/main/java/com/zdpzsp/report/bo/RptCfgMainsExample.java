package com.zdpzsp.report.bo;

import java.util.ArrayList;
import java.util.List;

public class RptCfgMainsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RptCfgMainsExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRpt_codeIsNull() {
            addCriterion("rpt_code is null");
            return (Criteria) this;
        }

        public Criteria andRpt_codeIsNotNull() {
            addCriterion("rpt_code is not null");
            return (Criteria) this;
        }

        public Criteria andRpt_codeEqualTo(String value) {
            addCriterion("rpt_code =", value, "rpt_code");
            return (Criteria) this;
        }

        public Criteria andRpt_codeNotEqualTo(String value) {
            addCriterion("rpt_code <>", value, "rpt_code");
            return (Criteria) this;
        }

        public Criteria andRpt_codeGreaterThan(String value) {
            addCriterion("rpt_code >", value, "rpt_code");
            return (Criteria) this;
        }

        public Criteria andRpt_codeGreaterThanOrEqualTo(String value) {
            addCriterion("rpt_code >=", value, "rpt_code");
            return (Criteria) this;
        }

        public Criteria andRpt_codeLessThan(String value) {
            addCriterion("rpt_code <", value, "rpt_code");
            return (Criteria) this;
        }

        public Criteria andRpt_codeLessThanOrEqualTo(String value) {
            addCriterion("rpt_code <=", value, "rpt_code");
            return (Criteria) this;
        }

        public Criteria andRpt_codeLike(String value) {
            addCriterion("rpt_code like", value, "rpt_code");
            return (Criteria) this;
        }

        public Criteria andRpt_codeNotLike(String value) {
            addCriterion("rpt_code not like", value, "rpt_code");
            return (Criteria) this;
        }

        public Criteria andRpt_codeIn(List<String> values) {
            addCriterion("rpt_code in", values, "rpt_code");
            return (Criteria) this;
        }

        public Criteria andRpt_codeNotIn(List<String> values) {
            addCriterion("rpt_code not in", values, "rpt_code");
            return (Criteria) this;
        }

        public Criteria andRpt_codeBetween(String value1, String value2) {
            addCriterion("rpt_code between", value1, value2, "rpt_code");
            return (Criteria) this;
        }

        public Criteria andRpt_codeNotBetween(String value1, String value2) {
            addCriterion("rpt_code not between", value1, value2, "rpt_code");
            return (Criteria) this;
        }

        public Criteria andRpt_nameIsNull() {
            addCriterion("rpt_name is null");
            return (Criteria) this;
        }

        public Criteria andRpt_nameIsNotNull() {
            addCriterion("rpt_name is not null");
            return (Criteria) this;
        }

        public Criteria andRpt_nameEqualTo(String value) {
            addCriterion("rpt_name =", value, "rpt_name");
            return (Criteria) this;
        }

        public Criteria andRpt_nameNotEqualTo(String value) {
            addCriterion("rpt_name <>", value, "rpt_name");
            return (Criteria) this;
        }

        public Criteria andRpt_nameGreaterThan(String value) {
            addCriterion("rpt_name >", value, "rpt_name");
            return (Criteria) this;
        }

        public Criteria andRpt_nameGreaterThanOrEqualTo(String value) {
            addCriterion("rpt_name >=", value, "rpt_name");
            return (Criteria) this;
        }

        public Criteria andRpt_nameLessThan(String value) {
            addCriterion("rpt_name <", value, "rpt_name");
            return (Criteria) this;
        }

        public Criteria andRpt_nameLessThanOrEqualTo(String value) {
            addCriterion("rpt_name <=", value, "rpt_name");
            return (Criteria) this;
        }

        public Criteria andRpt_nameLike(String value) {
            addCriterion("rpt_name like", value, "rpt_name");
            return (Criteria) this;
        }

        public Criteria andRpt_nameNotLike(String value) {
            addCriterion("rpt_name not like", value, "rpt_name");
            return (Criteria) this;
        }

        public Criteria andRpt_nameIn(List<String> values) {
            addCriterion("rpt_name in", values, "rpt_name");
            return (Criteria) this;
        }

        public Criteria andRpt_nameNotIn(List<String> values) {
            addCriterion("rpt_name not in", values, "rpt_name");
            return (Criteria) this;
        }

        public Criteria andRpt_nameBetween(String value1, String value2) {
            addCriterion("rpt_name between", value1, value2, "rpt_name");
            return (Criteria) this;
        }

        public Criteria andRpt_nameNotBetween(String value1, String value2) {
            addCriterion("rpt_name not between", value1, value2, "rpt_name");
            return (Criteria) this;
        }

        public Criteria andDir_typeIsNull() {
            addCriterion("dir_type is null");
            return (Criteria) this;
        }

        public Criteria andDir_typeIsNotNull() {
            addCriterion("dir_type is not null");
            return (Criteria) this;
        }

        public Criteria andDir_typeEqualTo(Integer value) {
            addCriterion("dir_type =", value, "dir_type");
            return (Criteria) this;
        }

        public Criteria andDir_typeNotEqualTo(Integer value) {
            addCriterion("dir_type <>", value, "dir_type");
            return (Criteria) this;
        }

        public Criteria andDir_typeGreaterThan(Integer value) {
            addCriterion("dir_type >", value, "dir_type");
            return (Criteria) this;
        }

        public Criteria andDir_typeGreaterThanOrEqualTo(Integer value) {
            addCriterion("dir_type >=", value, "dir_type");
            return (Criteria) this;
        }

        public Criteria andDir_typeLessThan(Integer value) {
            addCriterion("dir_type <", value, "dir_type");
            return (Criteria) this;
        }

        public Criteria andDir_typeLessThanOrEqualTo(Integer value) {
            addCriterion("dir_type <=", value, "dir_type");
            return (Criteria) this;
        }

        public Criteria andDir_typeIn(List<Integer> values) {
            addCriterion("dir_type in", values, "dir_type");
            return (Criteria) this;
        }

        public Criteria andDir_typeNotIn(List<Integer> values) {
            addCriterion("dir_type not in", values, "dir_type");
            return (Criteria) this;
        }

        public Criteria andDir_typeBetween(Integer value1, Integer value2) {
            addCriterion("dir_type between", value1, value2, "dir_type");
            return (Criteria) this;
        }

        public Criteria andDir_typeNotBetween(Integer value1, Integer value2) {
            addCriterion("dir_type not between", value1, value2, "dir_type");
            return (Criteria) this;
        }

        public Criteria andUp_rpt_idIsNull() {
            addCriterion("up_rpt_id is null");
            return (Criteria) this;
        }

        public Criteria andUp_rpt_idIsNotNull() {
            addCriterion("up_rpt_id is not null");
            return (Criteria) this;
        }

        public Criteria andUp_rpt_idEqualTo(Long value) {
            addCriterion("up_rpt_id =", value, "up_rpt_id");
            return (Criteria) this;
        }

        public Criteria andUp_rpt_idNotEqualTo(Long value) {
            addCriterion("up_rpt_id <>", value, "up_rpt_id");
            return (Criteria) this;
        }

        public Criteria andUp_rpt_idGreaterThan(Long value) {
            addCriterion("up_rpt_id >", value, "up_rpt_id");
            return (Criteria) this;
        }

        public Criteria andUp_rpt_idGreaterThanOrEqualTo(Long value) {
            addCriterion("up_rpt_id >=", value, "up_rpt_id");
            return (Criteria) this;
        }

        public Criteria andUp_rpt_idLessThan(Long value) {
            addCriterion("up_rpt_id <", value, "up_rpt_id");
            return (Criteria) this;
        }

        public Criteria andUp_rpt_idLessThanOrEqualTo(Long value) {
            addCriterion("up_rpt_id <=", value, "up_rpt_id");
            return (Criteria) this;
        }

        public Criteria andUp_rpt_idIn(List<Long> values) {
            addCriterion("up_rpt_id in", values, "up_rpt_id");
            return (Criteria) this;
        }

        public Criteria andUp_rpt_idNotIn(List<Long> values) {
            addCriterion("up_rpt_id not in", values, "up_rpt_id");
            return (Criteria) this;
        }

        public Criteria andUp_rpt_idBetween(Long value1, Long value2) {
            addCriterion("up_rpt_id between", value1, value2, "up_rpt_id");
            return (Criteria) this;
        }

        public Criteria andUp_rpt_idNotBetween(Long value1, Long value2) {
            addCriterion("up_rpt_id not between", value1, value2, "up_rpt_id");
            return (Criteria) this;
        }

        public Criteria andRpt_urlIsNull() {
            addCriterion("rpt_url is null");
            return (Criteria) this;
        }

        public Criteria andRpt_urlIsNotNull() {
            addCriterion("rpt_url is not null");
            return (Criteria) this;
        }

        public Criteria andRpt_urlEqualTo(String value) {
            addCriterion("rpt_url =", value, "rpt_url");
            return (Criteria) this;
        }

        public Criteria andRpt_urlNotEqualTo(String value) {
            addCriterion("rpt_url <>", value, "rpt_url");
            return (Criteria) this;
        }

        public Criteria andRpt_urlGreaterThan(String value) {
            addCriterion("rpt_url >", value, "rpt_url");
            return (Criteria) this;
        }

        public Criteria andRpt_urlGreaterThanOrEqualTo(String value) {
            addCriterion("rpt_url >=", value, "rpt_url");
            return (Criteria) this;
        }

        public Criteria andRpt_urlLessThan(String value) {
            addCriterion("rpt_url <", value, "rpt_url");
            return (Criteria) this;
        }

        public Criteria andRpt_urlLessThanOrEqualTo(String value) {
            addCriterion("rpt_url <=", value, "rpt_url");
            return (Criteria) this;
        }

        public Criteria andRpt_urlLike(String value) {
            addCriterion("rpt_url like", value, "rpt_url");
            return (Criteria) this;
        }

        public Criteria andRpt_urlNotLike(String value) {
            addCriterion("rpt_url not like", value, "rpt_url");
            return (Criteria) this;
        }

        public Criteria andRpt_urlIn(List<String> values) {
            addCriterion("rpt_url in", values, "rpt_url");
            return (Criteria) this;
        }

        public Criteria andRpt_urlNotIn(List<String> values) {
            addCriterion("rpt_url not in", values, "rpt_url");
            return (Criteria) this;
        }

        public Criteria andRpt_urlBetween(String value1, String value2) {
            addCriterion("rpt_url between", value1, value2, "rpt_url");
            return (Criteria) this;
        }

        public Criteria andRpt_urlNotBetween(String value1, String value2) {
            addCriterion("rpt_url not between", value1, value2, "rpt_url");
            return (Criteria) this;
        }

        public Criteria andRpt_typeIsNull() {
            addCriterion("rpt_type is null");
            return (Criteria) this;
        }

        public Criteria andRpt_typeIsNotNull() {
            addCriterion("rpt_type is not null");
            return (Criteria) this;
        }

        public Criteria andRpt_typeEqualTo(String value) {
            addCriterion("rpt_type =", value, "rpt_type");
            return (Criteria) this;
        }

        public Criteria andRpt_typeNotEqualTo(String value) {
            addCriterion("rpt_type <>", value, "rpt_type");
            return (Criteria) this;
        }

        public Criteria andRpt_typeGreaterThan(String value) {
            addCriterion("rpt_type >", value, "rpt_type");
            return (Criteria) this;
        }

        public Criteria andRpt_typeGreaterThanOrEqualTo(String value) {
            addCriterion("rpt_type >=", value, "rpt_type");
            return (Criteria) this;
        }

        public Criteria andRpt_typeLessThan(String value) {
            addCriterion("rpt_type <", value, "rpt_type");
            return (Criteria) this;
        }

        public Criteria andRpt_typeLessThanOrEqualTo(String value) {
            addCriterion("rpt_type <=", value, "rpt_type");
            return (Criteria) this;
        }

        public Criteria andRpt_typeLike(String value) {
            addCriterion("rpt_type like", value, "rpt_type");
            return (Criteria) this;
        }

        public Criteria andRpt_typeNotLike(String value) {
            addCriterion("rpt_type not like", value, "rpt_type");
            return (Criteria) this;
        }

        public Criteria andRpt_typeIn(List<String> values) {
            addCriterion("rpt_type in", values, "rpt_type");
            return (Criteria) this;
        }

        public Criteria andRpt_typeNotIn(List<String> values) {
            addCriterion("rpt_type not in", values, "rpt_type");
            return (Criteria) this;
        }

        public Criteria andRpt_typeBetween(String value1, String value2) {
            addCriterion("rpt_type between", value1, value2, "rpt_type");
            return (Criteria) this;
        }

        public Criteria andRpt_typeNotBetween(String value1, String value2) {
            addCriterion("rpt_type not between", value1, value2, "rpt_type");
            return (Criteria) this;
        }

        public Criteria andMain_sqlIsNull() {
            addCriterion("main_sql is null");
            return (Criteria) this;
        }

        public Criteria andMain_sqlIsNotNull() {
            addCriterion("main_sql is not null");
            return (Criteria) this;
        }

        public Criteria andMain_sqlEqualTo(String value) {
            addCriterion("main_sql =", value, "main_sql");
            return (Criteria) this;
        }

        public Criteria andMain_sqlNotEqualTo(String value) {
            addCriterion("main_sql <>", value, "main_sql");
            return (Criteria) this;
        }

        public Criteria andMain_sqlGreaterThan(String value) {
            addCriterion("main_sql >", value, "main_sql");
            return (Criteria) this;
        }

        public Criteria andMain_sqlGreaterThanOrEqualTo(String value) {
            addCriterion("main_sql >=", value, "main_sql");
            return (Criteria) this;
        }

        public Criteria andMain_sqlLessThan(String value) {
            addCriterion("main_sql <", value, "main_sql");
            return (Criteria) this;
        }

        public Criteria andMain_sqlLessThanOrEqualTo(String value) {
            addCriterion("main_sql <=", value, "main_sql");
            return (Criteria) this;
        }

        public Criteria andMain_sqlLike(String value) {
            addCriterion("main_sql like", value, "main_sql");
            return (Criteria) this;
        }

        public Criteria andMain_sqlNotLike(String value) {
            addCriterion("main_sql not like", value, "main_sql");
            return (Criteria) this;
        }

        public Criteria andMain_sqlIn(List<String> values) {
            addCriterion("main_sql in", values, "main_sql");
            return (Criteria) this;
        }

        public Criteria andMain_sqlNotIn(List<String> values) {
            addCriterion("main_sql not in", values, "main_sql");
            return (Criteria) this;
        }

        public Criteria andMain_sqlBetween(String value1, String value2) {
            addCriterion("main_sql between", value1, value2, "main_sql");
            return (Criteria) this;
        }

        public Criteria andMain_sqlNotBetween(String value1, String value2) {
            addCriterion("main_sql not between", value1, value2, "main_sql");
            return (Criteria) this;
        }

        public Criteria andIs_usedIsNull() {
            addCriterion("is_used is null");
            return (Criteria) this;
        }

        public Criteria andIs_usedIsNotNull() {
            addCriterion("is_used is not null");
            return (Criteria) this;
        }

        public Criteria andIs_usedEqualTo(Byte value) {
            addCriterion("is_used =", value, "is_used");
            return (Criteria) this;
        }

        public Criteria andIs_usedNotEqualTo(Byte value) {
            addCriterion("is_used <>", value, "is_used");
            return (Criteria) this;
        }

        public Criteria andIs_usedGreaterThan(Byte value) {
            addCriterion("is_used >", value, "is_used");
            return (Criteria) this;
        }

        public Criteria andIs_usedGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_used >=", value, "is_used");
            return (Criteria) this;
        }

        public Criteria andIs_usedLessThan(Byte value) {
            addCriterion("is_used <", value, "is_used");
            return (Criteria) this;
        }

        public Criteria andIs_usedLessThanOrEqualTo(Byte value) {
            addCriterion("is_used <=", value, "is_used");
            return (Criteria) this;
        }

        public Criteria andIs_usedIn(List<Byte> values) {
            addCriterion("is_used in", values, "is_used");
            return (Criteria) this;
        }

        public Criteria andIs_usedNotIn(List<Byte> values) {
            addCriterion("is_used not in", values, "is_used");
            return (Criteria) this;
        }

        public Criteria andIs_usedBetween(Byte value1, Byte value2) {
            addCriterion("is_used between", value1, value2, "is_used");
            return (Criteria) this;
        }

        public Criteria andIs_usedNotBetween(Byte value1, Byte value2) {
            addCriterion("is_used not between", value1, value2, "is_used");
            return (Criteria) this;
        }

        public Criteria andCreated_atIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreated_atIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreated_atEqualTo(Long value) {
            addCriterion("created_at =", value, "created_at");
            return (Criteria) this;
        }

        public Criteria andCreated_atNotEqualTo(Long value) {
            addCriterion("created_at <>", value, "created_at");
            return (Criteria) this;
        }

        public Criteria andCreated_atGreaterThan(Long value) {
            addCriterion("created_at >", value, "created_at");
            return (Criteria) this;
        }

        public Criteria andCreated_atGreaterThanOrEqualTo(Long value) {
            addCriterion("created_at >=", value, "created_at");
            return (Criteria) this;
        }

        public Criteria andCreated_atLessThan(Long value) {
            addCriterion("created_at <", value, "created_at");
            return (Criteria) this;
        }

        public Criteria andCreated_atLessThanOrEqualTo(Long value) {
            addCriterion("created_at <=", value, "created_at");
            return (Criteria) this;
        }

        public Criteria andCreated_atIn(List<Long> values) {
            addCriterion("created_at in", values, "created_at");
            return (Criteria) this;
        }

        public Criteria andCreated_atNotIn(List<Long> values) {
            addCriterion("created_at not in", values, "created_at");
            return (Criteria) this;
        }

        public Criteria andCreated_atBetween(Long value1, Long value2) {
            addCriterion("created_at between", value1, value2, "created_at");
            return (Criteria) this;
        }

        public Criteria andCreated_atNotBetween(Long value1, Long value2) {
            addCriterion("created_at not between", value1, value2, "created_at");
            return (Criteria) this;
        }

        public Criteria andCreator_idIsNull() {
            addCriterion("creator_id is null");
            return (Criteria) this;
        }

        public Criteria andCreator_idIsNotNull() {
            addCriterion("creator_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreator_idEqualTo(Long value) {
            addCriterion("creator_id =", value, "creator_id");
            return (Criteria) this;
        }

        public Criteria andCreator_idNotEqualTo(Long value) {
            addCriterion("creator_id <>", value, "creator_id");
            return (Criteria) this;
        }

        public Criteria andCreator_idGreaterThan(Long value) {
            addCriterion("creator_id >", value, "creator_id");
            return (Criteria) this;
        }

        public Criteria andCreator_idGreaterThanOrEqualTo(Long value) {
            addCriterion("creator_id >=", value, "creator_id");
            return (Criteria) this;
        }

        public Criteria andCreator_idLessThan(Long value) {
            addCriterion("creator_id <", value, "creator_id");
            return (Criteria) this;
        }

        public Criteria andCreator_idLessThanOrEqualTo(Long value) {
            addCriterion("creator_id <=", value, "creator_id");
            return (Criteria) this;
        }

        public Criteria andCreator_idIn(List<Long> values) {
            addCriterion("creator_id in", values, "creator_id");
            return (Criteria) this;
        }

        public Criteria andCreator_idNotIn(List<Long> values) {
            addCriterion("creator_id not in", values, "creator_id");
            return (Criteria) this;
        }

        public Criteria andCreator_idBetween(Long value1, Long value2) {
            addCriterion("creator_id between", value1, value2, "creator_id");
            return (Criteria) this;
        }

        public Criteria andCreator_idNotBetween(Long value1, Long value2) {
            addCriterion("creator_id not between", value1, value2, "creator_id");
            return (Criteria) this;
        }

        public Criteria andUpdated_atIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdated_atIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdated_atEqualTo(Long value) {
            addCriterion("updated_at =", value, "updated_at");
            return (Criteria) this;
        }

        public Criteria andUpdated_atNotEqualTo(Long value) {
            addCriterion("updated_at <>", value, "updated_at");
            return (Criteria) this;
        }

        public Criteria andUpdated_atGreaterThan(Long value) {
            addCriterion("updated_at >", value, "updated_at");
            return (Criteria) this;
        }

        public Criteria andUpdated_atGreaterThanOrEqualTo(Long value) {
            addCriterion("updated_at >=", value, "updated_at");
            return (Criteria) this;
        }

        public Criteria andUpdated_atLessThan(Long value) {
            addCriterion("updated_at <", value, "updated_at");
            return (Criteria) this;
        }

        public Criteria andUpdated_atLessThanOrEqualTo(Long value) {
            addCriterion("updated_at <=", value, "updated_at");
            return (Criteria) this;
        }

        public Criteria andUpdated_atIn(List<Long> values) {
            addCriterion("updated_at in", values, "updated_at");
            return (Criteria) this;
        }

        public Criteria andUpdated_atNotIn(List<Long> values) {
            addCriterion("updated_at not in", values, "updated_at");
            return (Criteria) this;
        }

        public Criteria andUpdated_atBetween(Long value1, Long value2) {
            addCriterion("updated_at between", value1, value2, "updated_at");
            return (Criteria) this;
        }

        public Criteria andUpdated_atNotBetween(Long value1, Long value2) {
            addCriterion("updated_at not between", value1, value2, "updated_at");
            return (Criteria) this;
        }

        public Criteria andUpdater_idIsNull() {
            addCriterion("updater_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdater_idIsNotNull() {
            addCriterion("updater_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdater_idEqualTo(Long value) {
            addCriterion("updater_id =", value, "updater_id");
            return (Criteria) this;
        }

        public Criteria andUpdater_idNotEqualTo(Long value) {
            addCriterion("updater_id <>", value, "updater_id");
            return (Criteria) this;
        }

        public Criteria andUpdater_idGreaterThan(Long value) {
            addCriterion("updater_id >", value, "updater_id");
            return (Criteria) this;
        }

        public Criteria andUpdater_idGreaterThanOrEqualTo(Long value) {
            addCriterion("updater_id >=", value, "updater_id");
            return (Criteria) this;
        }

        public Criteria andUpdater_idLessThan(Long value) {
            addCriterion("updater_id <", value, "updater_id");
            return (Criteria) this;
        }

        public Criteria andUpdater_idLessThanOrEqualTo(Long value) {
            addCriterion("updater_id <=", value, "updater_id");
            return (Criteria) this;
        }

        public Criteria andUpdater_idIn(List<Long> values) {
            addCriterion("updater_id in", values, "updater_id");
            return (Criteria) this;
        }

        public Criteria andUpdater_idNotIn(List<Long> values) {
            addCriterion("updater_id not in", values, "updater_id");
            return (Criteria) this;
        }

        public Criteria andUpdater_idBetween(Long value1, Long value2) {
            addCriterion("updater_id between", value1, value2, "updater_id");
            return (Criteria) this;
        }

        public Criteria andUpdater_idNotBetween(Long value1, Long value2) {
            addCriterion("updater_id not between", value1, value2, "updater_id");
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