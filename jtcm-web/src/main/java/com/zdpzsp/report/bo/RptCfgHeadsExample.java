package com.zdpzsp.report.bo;

import java.util.ArrayList;
import java.util.List;

public class RptCfgHeadsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RptCfgHeadsExample() {
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

        public Criteria andHead_nameIsNull() {
            addCriterion("head_name is null");
            return (Criteria) this;
        }

        public Criteria andHead_nameIsNotNull() {
            addCriterion("head_name is not null");
            return (Criteria) this;
        }

        public Criteria andHead_nameEqualTo(String value) {
            addCriterion("head_name =", value, "head_name");
            return (Criteria) this;
        }

        public Criteria andHead_nameNotEqualTo(String value) {
            addCriterion("head_name <>", value, "head_name");
            return (Criteria) this;
        }

        public Criteria andHead_nameGreaterThan(String value) {
            addCriterion("head_name >", value, "head_name");
            return (Criteria) this;
        }

        public Criteria andHead_nameGreaterThanOrEqualTo(String value) {
            addCriterion("head_name >=", value, "head_name");
            return (Criteria) this;
        }

        public Criteria andHead_nameLessThan(String value) {
            addCriterion("head_name <", value, "head_name");
            return (Criteria) this;
        }

        public Criteria andHead_nameLessThanOrEqualTo(String value) {
            addCriterion("head_name <=", value, "head_name");
            return (Criteria) this;
        }

        public Criteria andHead_nameLike(String value) {
            addCriterion("head_name like", value, "head_name");
            return (Criteria) this;
        }

        public Criteria andHead_nameNotLike(String value) {
            addCriterion("head_name not like", value, "head_name");
            return (Criteria) this;
        }

        public Criteria andHead_nameIn(List<String> values) {
            addCriterion("head_name in", values, "head_name");
            return (Criteria) this;
        }

        public Criteria andHead_nameNotIn(List<String> values) {
            addCriterion("head_name not in", values, "head_name");
            return (Criteria) this;
        }

        public Criteria andHead_nameBetween(String value1, String value2) {
            addCriterion("head_name between", value1, value2, "head_name");
            return (Criteria) this;
        }

        public Criteria andHead_nameNotBetween(String value1, String value2) {
            addCriterion("head_name not between", value1, value2, "head_name");
            return (Criteria) this;
        }

        public Criteria andHead_typeIsNull() {
            addCriterion("head_type is null");
            return (Criteria) this;
        }

        public Criteria andHead_typeIsNotNull() {
            addCriterion("head_type is not null");
            return (Criteria) this;
        }

        public Criteria andHead_typeEqualTo(Integer value) {
            addCriterion("head_type =", value, "head_type");
            return (Criteria) this;
        }

        public Criteria andHead_typeNotEqualTo(Integer value) {
            addCriterion("head_type <>", value, "head_type");
            return (Criteria) this;
        }

        public Criteria andHead_typeGreaterThan(Integer value) {
            addCriterion("head_type >", value, "head_type");
            return (Criteria) this;
        }

        public Criteria andHead_typeGreaterThanOrEqualTo(Integer value) {
            addCriterion("head_type >=", value, "head_type");
            return (Criteria) this;
        }

        public Criteria andHead_typeLessThan(Integer value) {
            addCriterion("head_type <", value, "head_type");
            return (Criteria) this;
        }

        public Criteria andHead_typeLessThanOrEqualTo(Integer value) {
            addCriterion("head_type <=", value, "head_type");
            return (Criteria) this;
        }

        public Criteria andHead_typeIn(List<Integer> values) {
            addCriterion("head_type in", values, "head_type");
            return (Criteria) this;
        }

        public Criteria andHead_typeNotIn(List<Integer> values) {
            addCriterion("head_type not in", values, "head_type");
            return (Criteria) this;
        }

        public Criteria andHead_typeBetween(Integer value1, Integer value2) {
            addCriterion("head_type between", value1, value2, "head_type");
            return (Criteria) this;
        }

        public Criteria andHead_typeNotBetween(Integer value1, Integer value2) {
            addCriterion("head_type not between", value1, value2, "head_type");
            return (Criteria) this;
        }

        public Criteria andUp_head_idIsNull() {
            addCriterion("up_head_id is null");
            return (Criteria) this;
        }

        public Criteria andUp_head_idIsNotNull() {
            addCriterion("up_head_id is not null");
            return (Criteria) this;
        }

        public Criteria andUp_head_idEqualTo(Long value) {
            addCriterion("up_head_id =", value, "up_head_id");
            return (Criteria) this;
        }

        public Criteria andUp_head_idNotEqualTo(Long value) {
            addCriterion("up_head_id <>", value, "up_head_id");
            return (Criteria) this;
        }

        public Criteria andUp_head_idGreaterThan(Long value) {
            addCriterion("up_head_id >", value, "up_head_id");
            return (Criteria) this;
        }

        public Criteria andUp_head_idGreaterThanOrEqualTo(Long value) {
            addCriterion("up_head_id >=", value, "up_head_id");
            return (Criteria) this;
        }

        public Criteria andUp_head_idLessThan(Long value) {
            addCriterion("up_head_id <", value, "up_head_id");
            return (Criteria) this;
        }

        public Criteria andUp_head_idLessThanOrEqualTo(Long value) {
            addCriterion("up_head_id <=", value, "up_head_id");
            return (Criteria) this;
        }

        public Criteria andUp_head_idIn(List<Long> values) {
            addCriterion("up_head_id in", values, "up_head_id");
            return (Criteria) this;
        }

        public Criteria andUp_head_idNotIn(List<Long> values) {
            addCriterion("up_head_id not in", values, "up_head_id");
            return (Criteria) this;
        }

        public Criteria andUp_head_idBetween(Long value1, Long value2) {
            addCriterion("up_head_id between", value1, value2, "up_head_id");
            return (Criteria) this;
        }

        public Criteria andUp_head_idNotBetween(Long value1, Long value2) {
            addCriterion("up_head_id not between", value1, value2, "up_head_id");
            return (Criteria) this;
        }

        public Criteria andHead_colIsNull() {
            addCriterion("head_col is null");
            return (Criteria) this;
        }

        public Criteria andHead_colIsNotNull() {
            addCriterion("head_col is not null");
            return (Criteria) this;
        }

        public Criteria andHead_colEqualTo(String value) {
            addCriterion("head_col =", value, "head_col");
            return (Criteria) this;
        }

        public Criteria andHead_colNotEqualTo(String value) {
            addCriterion("head_col <>", value, "head_col");
            return (Criteria) this;
        }

        public Criteria andHead_colGreaterThan(String value) {
            addCriterion("head_col >", value, "head_col");
            return (Criteria) this;
        }

        public Criteria andHead_colGreaterThanOrEqualTo(String value) {
            addCriterion("head_col >=", value, "head_col");
            return (Criteria) this;
        }

        public Criteria andHead_colLessThan(String value) {
            addCriterion("head_col <", value, "head_col");
            return (Criteria) this;
        }

        public Criteria andHead_colLessThanOrEqualTo(String value) {
            addCriterion("head_col <=", value, "head_col");
            return (Criteria) this;
        }

        public Criteria andHead_colLike(String value) {
            addCriterion("head_col like", value, "head_col");
            return (Criteria) this;
        }

        public Criteria andHead_colNotLike(String value) {
            addCriterion("head_col not like", value, "head_col");
            return (Criteria) this;
        }

        public Criteria andHead_colIn(List<String> values) {
            addCriterion("head_col in", values, "head_col");
            return (Criteria) this;
        }

        public Criteria andHead_colNotIn(List<String> values) {
            addCriterion("head_col not in", values, "head_col");
            return (Criteria) this;
        }

        public Criteria andHead_colBetween(String value1, String value2) {
            addCriterion("head_col between", value1, value2, "head_col");
            return (Criteria) this;
        }

        public Criteria andHead_colNotBetween(String value1, String value2) {
            addCriterion("head_col not between", value1, value2, "head_col");
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