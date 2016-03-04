package com.zdpzsp.report.bo;

import java.util.ArrayList;
import java.util.List;

public class RptCfgQueriesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RptCfgQueriesExample() {
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

        public Criteria andRpt_cfg_main_idIsNull() {
            addCriterion("rpt_cfg_main_id is null");
            return (Criteria) this;
        }

        public Criteria andRpt_cfg_main_idIsNotNull() {
            addCriterion("rpt_cfg_main_id is not null");
            return (Criteria) this;
        }

        public Criteria andRpt_cfg_main_idEqualTo(Long value) {
            addCriterion("rpt_cfg_main_id =", value, "rpt_cfg_main_id");
            return (Criteria) this;
        }

        public Criteria andRpt_cfg_main_idNotEqualTo(Long value) {
            addCriterion("rpt_cfg_main_id <>", value, "rpt_cfg_main_id");
            return (Criteria) this;
        }

        public Criteria andRpt_cfg_main_idGreaterThan(Long value) {
            addCriterion("rpt_cfg_main_id >", value, "rpt_cfg_main_id");
            return (Criteria) this;
        }

        public Criteria andRpt_cfg_main_idGreaterThanOrEqualTo(Long value) {
            addCriterion("rpt_cfg_main_id >=", value, "rpt_cfg_main_id");
            return (Criteria) this;
        }

        public Criteria andRpt_cfg_main_idLessThan(Long value) {
            addCriterion("rpt_cfg_main_id <", value, "rpt_cfg_main_id");
            return (Criteria) this;
        }

        public Criteria andRpt_cfg_main_idLessThanOrEqualTo(Long value) {
            addCriterion("rpt_cfg_main_id <=", value, "rpt_cfg_main_id");
            return (Criteria) this;
        }

        public Criteria andRpt_cfg_main_idIn(List<Long> values) {
            addCriterion("rpt_cfg_main_id in", values, "rpt_cfg_main_id");
            return (Criteria) this;
        }

        public Criteria andRpt_cfg_main_idNotIn(List<Long> values) {
            addCriterion("rpt_cfg_main_id not in", values, "rpt_cfg_main_id");
            return (Criteria) this;
        }

        public Criteria andRpt_cfg_main_idBetween(Long value1, Long value2) {
            addCriterion("rpt_cfg_main_id between", value1, value2, "rpt_cfg_main_id");
            return (Criteria) this;
        }

        public Criteria andRpt_cfg_main_idNotBetween(Long value1, Long value2) {
            addCriterion("rpt_cfg_main_id not between", value1, value2, "rpt_cfg_main_id");
            return (Criteria) this;
        }

        public Criteria andQuery_colIsNull() {
            addCriterion("query_col is null");
            return (Criteria) this;
        }

        public Criteria andQuery_colIsNotNull() {
            addCriterion("query_col is not null");
            return (Criteria) this;
        }

        public Criteria andQuery_colEqualTo(String value) {
            addCriterion("query_col =", value, "query_col");
            return (Criteria) this;
        }

        public Criteria andQuery_colNotEqualTo(String value) {
            addCriterion("query_col <>", value, "query_col");
            return (Criteria) this;
        }

        public Criteria andQuery_colGreaterThan(String value) {
            addCriterion("query_col >", value, "query_col");
            return (Criteria) this;
        }

        public Criteria andQuery_colGreaterThanOrEqualTo(String value) {
            addCriterion("query_col >=", value, "query_col");
            return (Criteria) this;
        }

        public Criteria andQuery_colLessThan(String value) {
            addCriterion("query_col <", value, "query_col");
            return (Criteria) this;
        }

        public Criteria andQuery_colLessThanOrEqualTo(String value) {
            addCriterion("query_col <=", value, "query_col");
            return (Criteria) this;
        }

        public Criteria andQuery_colLike(String value) {
            addCriterion("query_col like", value, "query_col");
            return (Criteria) this;
        }

        public Criteria andQuery_colNotLike(String value) {
            addCriterion("query_col not like", value, "query_col");
            return (Criteria) this;
        }

        public Criteria andQuery_colIn(List<String> values) {
            addCriterion("query_col in", values, "query_col");
            return (Criteria) this;
        }

        public Criteria andQuery_colNotIn(List<String> values) {
            addCriterion("query_col not in", values, "query_col");
            return (Criteria) this;
        }

        public Criteria andQuery_colBetween(String value1, String value2) {
            addCriterion("query_col between", value1, value2, "query_col");
            return (Criteria) this;
        }

        public Criteria andQuery_colNotBetween(String value1, String value2) {
            addCriterion("query_col not between", value1, value2, "query_col");
            return (Criteria) this;
        }

        public Criteria andQuery_nameIsNull() {
            addCriterion("query_name is null");
            return (Criteria) this;
        }

        public Criteria andQuery_nameIsNotNull() {
            addCriterion("query_name is not null");
            return (Criteria) this;
        }

        public Criteria andQuery_nameEqualTo(String value) {
            addCriterion("query_name =", value, "query_name");
            return (Criteria) this;
        }

        public Criteria andQuery_nameNotEqualTo(String value) {
            addCriterion("query_name <>", value, "query_name");
            return (Criteria) this;
        }

        public Criteria andQuery_nameGreaterThan(String value) {
            addCriterion("query_name >", value, "query_name");
            return (Criteria) this;
        }

        public Criteria andQuery_nameGreaterThanOrEqualTo(String value) {
            addCriterion("query_name >=", value, "query_name");
            return (Criteria) this;
        }

        public Criteria andQuery_nameLessThan(String value) {
            addCriterion("query_name <", value, "query_name");
            return (Criteria) this;
        }

        public Criteria andQuery_nameLessThanOrEqualTo(String value) {
            addCriterion("query_name <=", value, "query_name");
            return (Criteria) this;
        }

        public Criteria andQuery_nameLike(String value) {
            addCriterion("query_name like", value, "query_name");
            return (Criteria) this;
        }

        public Criteria andQuery_nameNotLike(String value) {
            addCriterion("query_name not like", value, "query_name");
            return (Criteria) this;
        }

        public Criteria andQuery_nameIn(List<String> values) {
            addCriterion("query_name in", values, "query_name");
            return (Criteria) this;
        }

        public Criteria andQuery_nameNotIn(List<String> values) {
            addCriterion("query_name not in", values, "query_name");
            return (Criteria) this;
        }

        public Criteria andQuery_nameBetween(String value1, String value2) {
            addCriterion("query_name between", value1, value2, "query_name");
            return (Criteria) this;
        }

        public Criteria andQuery_nameNotBetween(String value1, String value2) {
            addCriterion("query_name not between", value1, value2, "query_name");
            return (Criteria) this;
        }

        public Criteria andQuery_operatorIsNull() {
            addCriterion("query_operator is null");
            return (Criteria) this;
        }

        public Criteria andQuery_operatorIsNotNull() {
            addCriterion("query_operator is not null");
            return (Criteria) this;
        }

        public Criteria andQuery_operatorEqualTo(String value) {
            addCriterion("query_operator =", value, "query_operator");
            return (Criteria) this;
        }

        public Criteria andQuery_operatorNotEqualTo(String value) {
            addCriterion("query_operator <>", value, "query_operator");
            return (Criteria) this;
        }

        public Criteria andQuery_operatorGreaterThan(String value) {
            addCriterion("query_operator >", value, "query_operator");
            return (Criteria) this;
        }

        public Criteria andQuery_operatorGreaterThanOrEqualTo(String value) {
            addCriterion("query_operator >=", value, "query_operator");
            return (Criteria) this;
        }

        public Criteria andQuery_operatorLessThan(String value) {
            addCriterion("query_operator <", value, "query_operator");
            return (Criteria) this;
        }

        public Criteria andQuery_operatorLessThanOrEqualTo(String value) {
            addCriterion("query_operator <=", value, "query_operator");
            return (Criteria) this;
        }

        public Criteria andQuery_operatorLike(String value) {
            addCriterion("query_operator like", value, "query_operator");
            return (Criteria) this;
        }

        public Criteria andQuery_operatorNotLike(String value) {
            addCriterion("query_operator not like", value, "query_operator");
            return (Criteria) this;
        }

        public Criteria andQuery_operatorIn(List<String> values) {
            addCriterion("query_operator in", values, "query_operator");
            return (Criteria) this;
        }

        public Criteria andQuery_operatorNotIn(List<String> values) {
            addCriterion("query_operator not in", values, "query_operator");
            return (Criteria) this;
        }

        public Criteria andQuery_operatorBetween(String value1, String value2) {
            addCriterion("query_operator between", value1, value2, "query_operator");
            return (Criteria) this;
        }

        public Criteria andQuery_operatorNotBetween(String value1, String value2) {
            addCriterion("query_operator not between", value1, value2, "query_operator");
            return (Criteria) this;
        }

        public Criteria andQuery_typeIsNull() {
            addCriterion("query_type is null");
            return (Criteria) this;
        }

        public Criteria andQuery_typeIsNotNull() {
            addCriterion("query_type is not null");
            return (Criteria) this;
        }

        public Criteria andQuery_typeEqualTo(String value) {
            addCriterion("query_type =", value, "query_type");
            return (Criteria) this;
        }

        public Criteria andQuery_typeNotEqualTo(String value) {
            addCriterion("query_type <>", value, "query_type");
            return (Criteria) this;
        }

        public Criteria andQuery_typeGreaterThan(String value) {
            addCriterion("query_type >", value, "query_type");
            return (Criteria) this;
        }

        public Criteria andQuery_typeGreaterThanOrEqualTo(String value) {
            addCriterion("query_type >=", value, "query_type");
            return (Criteria) this;
        }

        public Criteria andQuery_typeLessThan(String value) {
            addCriterion("query_type <", value, "query_type");
            return (Criteria) this;
        }

        public Criteria andQuery_typeLessThanOrEqualTo(String value) {
            addCriterion("query_type <=", value, "query_type");
            return (Criteria) this;
        }

        public Criteria andQuery_typeLike(String value) {
            addCriterion("query_type like", value, "query_type");
            return (Criteria) this;
        }

        public Criteria andQuery_typeNotLike(String value) {
            addCriterion("query_type not like", value, "query_type");
            return (Criteria) this;
        }

        public Criteria andQuery_typeIn(List<String> values) {
            addCriterion("query_type in", values, "query_type");
            return (Criteria) this;
        }

        public Criteria andQuery_typeNotIn(List<String> values) {
            addCriterion("query_type not in", values, "query_type");
            return (Criteria) this;
        }

        public Criteria andQuery_typeBetween(String value1, String value2) {
            addCriterion("query_type between", value1, value2, "query_type");
            return (Criteria) this;
        }

        public Criteria andQuery_typeNotBetween(String value1, String value2) {
            addCriterion("query_type not between", value1, value2, "query_type");
            return (Criteria) this;
        }

        public Criteria andQuery_dataIsNull() {
            addCriterion("query_data is null");
            return (Criteria) this;
        }

        public Criteria andQuery_dataIsNotNull() {
            addCriterion("query_data is not null");
            return (Criteria) this;
        }

        public Criteria andQuery_dataEqualTo(String value) {
            addCriterion("query_data =", value, "query_data");
            return (Criteria) this;
        }

        public Criteria andQuery_dataNotEqualTo(String value) {
            addCriterion("query_data <>", value, "query_data");
            return (Criteria) this;
        }

        public Criteria andQuery_dataGreaterThan(String value) {
            addCriterion("query_data >", value, "query_data");
            return (Criteria) this;
        }

        public Criteria andQuery_dataGreaterThanOrEqualTo(String value) {
            addCriterion("query_data >=", value, "query_data");
            return (Criteria) this;
        }

        public Criteria andQuery_dataLessThan(String value) {
            addCriterion("query_data <", value, "query_data");
            return (Criteria) this;
        }

        public Criteria andQuery_dataLessThanOrEqualTo(String value) {
            addCriterion("query_data <=", value, "query_data");
            return (Criteria) this;
        }

        public Criteria andQuery_dataLike(String value) {
            addCriterion("query_data like", value, "query_data");
            return (Criteria) this;
        }

        public Criteria andQuery_dataNotLike(String value) {
            addCriterion("query_data not like", value, "query_data");
            return (Criteria) this;
        }

        public Criteria andQuery_dataIn(List<String> values) {
            addCriterion("query_data in", values, "query_data");
            return (Criteria) this;
        }

        public Criteria andQuery_dataNotIn(List<String> values) {
            addCriterion("query_data not in", values, "query_data");
            return (Criteria) this;
        }

        public Criteria andQuery_dataBetween(String value1, String value2) {
            addCriterion("query_data between", value1, value2, "query_data");
            return (Criteria) this;
        }

        public Criteria andQuery_dataNotBetween(String value1, String value2) {
            addCriterion("query_data not between", value1, value2, "query_data");
            return (Criteria) this;
        }

        public Criteria andOrder_idIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrder_idIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_idEqualTo(Integer value) {
            addCriterion("order_id =", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idGreaterThan(Integer value) {
            addCriterion("order_id >", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idLessThan(Integer value) {
            addCriterion("order_id <", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idIn(List<Integer> values) {
            addCriterion("order_id in", values, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "order_id");
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