package com.zdpzsp.system.bo;

import java.util.ArrayList;
import java.util.List;

public class SysMenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysMenuExample() {
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

        public Criteria andMenu_idIsNull() {
            addCriterion("menu_id is null");
            return (Criteria) this;
        }

        public Criteria andMenu_idIsNotNull() {
            addCriterion("menu_id is not null");
            return (Criteria) this;
        }

        public Criteria andMenu_idEqualTo(Long value) {
            addCriterion("menu_id =", value, "menu_id");
            return (Criteria) this;
        }

        public Criteria andMenu_idNotEqualTo(Long value) {
            addCriterion("menu_id <>", value, "menu_id");
            return (Criteria) this;
        }

        public Criteria andMenu_idGreaterThan(Long value) {
            addCriterion("menu_id >", value, "menu_id");
            return (Criteria) this;
        }

        public Criteria andMenu_idGreaterThanOrEqualTo(Long value) {
            addCriterion("menu_id >=", value, "menu_id");
            return (Criteria) this;
        }

        public Criteria andMenu_idLessThan(Long value) {
            addCriterion("menu_id <", value, "menu_id");
            return (Criteria) this;
        }

        public Criteria andMenu_idLessThanOrEqualTo(Long value) {
            addCriterion("menu_id <=", value, "menu_id");
            return (Criteria) this;
        }

        public Criteria andMenu_idIn(List<Long> values) {
            addCriterion("menu_id in", values, "menu_id");
            return (Criteria) this;
        }

        public Criteria andMenu_idNotIn(List<Long> values) {
            addCriterion("menu_id not in", values, "menu_id");
            return (Criteria) this;
        }

        public Criteria andMenu_idBetween(Long value1, Long value2) {
            addCriterion("menu_id between", value1, value2, "menu_id");
            return (Criteria) this;
        }

        public Criteria andMenu_idNotBetween(Long value1, Long value2) {
            addCriterion("menu_id not between", value1, value2, "menu_id");
            return (Criteria) this;
        }

        public Criteria andMenu_nameIsNull() {
            addCriterion("menu_name is null");
            return (Criteria) this;
        }

        public Criteria andMenu_nameIsNotNull() {
            addCriterion("menu_name is not null");
            return (Criteria) this;
        }

        public Criteria andMenu_nameEqualTo(String value) {
            addCriterion("menu_name =", value, "menu_name");
            return (Criteria) this;
        }

        public Criteria andMenu_nameNotEqualTo(String value) {
            addCriterion("menu_name <>", value, "menu_name");
            return (Criteria) this;
        }

        public Criteria andMenu_nameGreaterThan(String value) {
            addCriterion("menu_name >", value, "menu_name");
            return (Criteria) this;
        }

        public Criteria andMenu_nameGreaterThanOrEqualTo(String value) {
            addCriterion("menu_name >=", value, "menu_name");
            return (Criteria) this;
        }

        public Criteria andMenu_nameLessThan(String value) {
            addCriterion("menu_name <", value, "menu_name");
            return (Criteria) this;
        }

        public Criteria andMenu_nameLessThanOrEqualTo(String value) {
            addCriterion("menu_name <=", value, "menu_name");
            return (Criteria) this;
        }

        public Criteria andMenu_nameLike(String value) {
            addCriterion("menu_name like", value, "menu_name");
            return (Criteria) this;
        }

        public Criteria andMenu_nameNotLike(String value) {
            addCriterion("menu_name not like", value, "menu_name");
            return (Criteria) this;
        }

        public Criteria andMenu_nameIn(List<String> values) {
            addCriterion("menu_name in", values, "menu_name");
            return (Criteria) this;
        }

        public Criteria andMenu_nameNotIn(List<String> values) {
            addCriterion("menu_name not in", values, "menu_name");
            return (Criteria) this;
        }

        public Criteria andMenu_nameBetween(String value1, String value2) {
            addCriterion("menu_name between", value1, value2, "menu_name");
            return (Criteria) this;
        }

        public Criteria andMenu_nameNotBetween(String value1, String value2) {
            addCriterion("menu_name not between", value1, value2, "menu_name");
            return (Criteria) this;
        }

        public Criteria andMenu_descIsNull() {
            addCriterion("menu_desc is null");
            return (Criteria) this;
        }

        public Criteria andMenu_descIsNotNull() {
            addCriterion("menu_desc is not null");
            return (Criteria) this;
        }

        public Criteria andMenu_descEqualTo(String value) {
            addCriterion("menu_desc =", value, "menu_desc");
            return (Criteria) this;
        }

        public Criteria andMenu_descNotEqualTo(String value) {
            addCriterion("menu_desc <>", value, "menu_desc");
            return (Criteria) this;
        }

        public Criteria andMenu_descGreaterThan(String value) {
            addCriterion("menu_desc >", value, "menu_desc");
            return (Criteria) this;
        }

        public Criteria andMenu_descGreaterThanOrEqualTo(String value) {
            addCriterion("menu_desc >=", value, "menu_desc");
            return (Criteria) this;
        }

        public Criteria andMenu_descLessThan(String value) {
            addCriterion("menu_desc <", value, "menu_desc");
            return (Criteria) this;
        }

        public Criteria andMenu_descLessThanOrEqualTo(String value) {
            addCriterion("menu_desc <=", value, "menu_desc");
            return (Criteria) this;
        }

        public Criteria andMenu_descLike(String value) {
            addCriterion("menu_desc like", value, "menu_desc");
            return (Criteria) this;
        }

        public Criteria andMenu_descNotLike(String value) {
            addCriterion("menu_desc not like", value, "menu_desc");
            return (Criteria) this;
        }

        public Criteria andMenu_descIn(List<String> values) {
            addCriterion("menu_desc in", values, "menu_desc");
            return (Criteria) this;
        }

        public Criteria andMenu_descNotIn(List<String> values) {
            addCriterion("menu_desc not in", values, "menu_desc");
            return (Criteria) this;
        }

        public Criteria andMenu_descBetween(String value1, String value2) {
            addCriterion("menu_desc between", value1, value2, "menu_desc");
            return (Criteria) this;
        }

        public Criteria andMenu_descNotBetween(String value1, String value2) {
            addCriterion("menu_desc not between", value1, value2, "menu_desc");
            return (Criteria) this;
        }

        public Criteria andMenu_pidIsNull() {
            addCriterion("menu_pid is null");
            return (Criteria) this;
        }

        public Criteria andMenu_pidIsNotNull() {
            addCriterion("menu_pid is not null");
            return (Criteria) this;
        }

        public Criteria andMenu_pidEqualTo(Integer value) {
            addCriterion("menu_pid =", value, "menu_pid");
            return (Criteria) this;
        }

        public Criteria andMenu_pidNotEqualTo(Integer value) {
            addCriterion("menu_pid <>", value, "menu_pid");
            return (Criteria) this;
        }

        public Criteria andMenu_pidGreaterThan(Integer value) {
            addCriterion("menu_pid >", value, "menu_pid");
            return (Criteria) this;
        }

        public Criteria andMenu_pidGreaterThanOrEqualTo(Integer value) {
            addCriterion("menu_pid >=", value, "menu_pid");
            return (Criteria) this;
        }

        public Criteria andMenu_pidLessThan(Integer value) {
            addCriterion("menu_pid <", value, "menu_pid");
            return (Criteria) this;
        }

        public Criteria andMenu_pidLessThanOrEqualTo(Integer value) {
            addCriterion("menu_pid <=", value, "menu_pid");
            return (Criteria) this;
        }

        public Criteria andMenu_pidIn(List<Integer> values) {
            addCriterion("menu_pid in", values, "menu_pid");
            return (Criteria) this;
        }

        public Criteria andMenu_pidNotIn(List<Integer> values) {
            addCriterion("menu_pid not in", values, "menu_pid");
            return (Criteria) this;
        }

        public Criteria andMenu_pidBetween(Integer value1, Integer value2) {
            addCriterion("menu_pid between", value1, value2, "menu_pid");
            return (Criteria) this;
        }

        public Criteria andMenu_pidNotBetween(Integer value1, Integer value2) {
            addCriterion("menu_pid not between", value1, value2, "menu_pid");
            return (Criteria) this;
        }

        public Criteria andMenu_typeIsNull() {
            addCriterion("menu_type is null");
            return (Criteria) this;
        }

        public Criteria andMenu_typeIsNotNull() {
            addCriterion("menu_type is not null");
            return (Criteria) this;
        }

        public Criteria andMenu_typeEqualTo(Integer value) {
            addCriterion("menu_type =", value, "menu_type");
            return (Criteria) this;
        }

        public Criteria andMenu_typeNotEqualTo(Integer value) {
            addCriterion("menu_type <>", value, "menu_type");
            return (Criteria) this;
        }

        public Criteria andMenu_typeGreaterThan(Integer value) {
            addCriterion("menu_type >", value, "menu_type");
            return (Criteria) this;
        }

        public Criteria andMenu_typeGreaterThanOrEqualTo(Integer value) {
            addCriterion("menu_type >=", value, "menu_type");
            return (Criteria) this;
        }

        public Criteria andMenu_typeLessThan(Integer value) {
            addCriterion("menu_type <", value, "menu_type");
            return (Criteria) this;
        }

        public Criteria andMenu_typeLessThanOrEqualTo(Integer value) {
            addCriterion("menu_type <=", value, "menu_type");
            return (Criteria) this;
        }

        public Criteria andMenu_typeIn(List<Integer> values) {
            addCriterion("menu_type in", values, "menu_type");
            return (Criteria) this;
        }

        public Criteria andMenu_typeNotIn(List<Integer> values) {
            addCriterion("menu_type not in", values, "menu_type");
            return (Criteria) this;
        }

        public Criteria andMenu_typeBetween(Integer value1, Integer value2) {
            addCriterion("menu_type between", value1, value2, "menu_type");
            return (Criteria) this;
        }

        public Criteria andMenu_typeNotBetween(Integer value1, Integer value2) {
            addCriterion("menu_type not between", value1, value2, "menu_type");
            return (Criteria) this;
        }

        public Criteria andMenu_orderIsNull() {
            addCriterion("menu_order is null");
            return (Criteria) this;
        }

        public Criteria andMenu_orderIsNotNull() {
            addCriterion("menu_order is not null");
            return (Criteria) this;
        }

        public Criteria andMenu_orderEqualTo(Integer value) {
            addCriterion("menu_order =", value, "menu_order");
            return (Criteria) this;
        }

        public Criteria andMenu_orderNotEqualTo(Integer value) {
            addCriterion("menu_order <>", value, "menu_order");
            return (Criteria) this;
        }

        public Criteria andMenu_orderGreaterThan(Integer value) {
            addCriterion("menu_order >", value, "menu_order");
            return (Criteria) this;
        }

        public Criteria andMenu_orderGreaterThanOrEqualTo(Integer value) {
            addCriterion("menu_order >=", value, "menu_order");
            return (Criteria) this;
        }

        public Criteria andMenu_orderLessThan(Integer value) {
            addCriterion("menu_order <", value, "menu_order");
            return (Criteria) this;
        }

        public Criteria andMenu_orderLessThanOrEqualTo(Integer value) {
            addCriterion("menu_order <=", value, "menu_order");
            return (Criteria) this;
        }

        public Criteria andMenu_orderIn(List<Integer> values) {
            addCriterion("menu_order in", values, "menu_order");
            return (Criteria) this;
        }

        public Criteria andMenu_orderNotIn(List<Integer> values) {
            addCriterion("menu_order not in", values, "menu_order");
            return (Criteria) this;
        }

        public Criteria andMenu_orderBetween(Integer value1, Integer value2) {
            addCriterion("menu_order between", value1, value2, "menu_order");
            return (Criteria) this;
        }

        public Criteria andMenu_orderNotBetween(Integer value1, Integer value2) {
            addCriterion("menu_order not between", value1, value2, "menu_order");
            return (Criteria) this;
        }

        public Criteria andMenu_targetIsNull() {
            addCriterion("menu_target is null");
            return (Criteria) this;
        }

        public Criteria andMenu_targetIsNotNull() {
            addCriterion("menu_target is not null");
            return (Criteria) this;
        }

        public Criteria andMenu_targetEqualTo(String value) {
            addCriterion("menu_target =", value, "menu_target");
            return (Criteria) this;
        }

        public Criteria andMenu_targetNotEqualTo(String value) {
            addCriterion("menu_target <>", value, "menu_target");
            return (Criteria) this;
        }

        public Criteria andMenu_targetGreaterThan(String value) {
            addCriterion("menu_target >", value, "menu_target");
            return (Criteria) this;
        }

        public Criteria andMenu_targetGreaterThanOrEqualTo(String value) {
            addCriterion("menu_target >=", value, "menu_target");
            return (Criteria) this;
        }

        public Criteria andMenu_targetLessThan(String value) {
            addCriterion("menu_target <", value, "menu_target");
            return (Criteria) this;
        }

        public Criteria andMenu_targetLessThanOrEqualTo(String value) {
            addCriterion("menu_target <=", value, "menu_target");
            return (Criteria) this;
        }

        public Criteria andMenu_targetLike(String value) {
            addCriterion("menu_target like", value, "menu_target");
            return (Criteria) this;
        }

        public Criteria andMenu_targetNotLike(String value) {
            addCriterion("menu_target not like", value, "menu_target");
            return (Criteria) this;
        }

        public Criteria andMenu_targetIn(List<String> values) {
            addCriterion("menu_target in", values, "menu_target");
            return (Criteria) this;
        }

        public Criteria andMenu_targetNotIn(List<String> values) {
            addCriterion("menu_target not in", values, "menu_target");
            return (Criteria) this;
        }

        public Criteria andMenu_targetBetween(String value1, String value2) {
            addCriterion("menu_target between", value1, value2, "menu_target");
            return (Criteria) this;
        }

        public Criteria andMenu_targetNotBetween(String value1, String value2) {
            addCriterion("menu_target not between", value1, value2, "menu_target");
            return (Criteria) this;
        }

        public Criteria andMenu_urlIsNull() {
            addCriterion("menu_url is null");
            return (Criteria) this;
        }

        public Criteria andMenu_urlIsNotNull() {
            addCriterion("menu_url is not null");
            return (Criteria) this;
        }

        public Criteria andMenu_urlEqualTo(String value) {
            addCriterion("menu_url =", value, "menu_url");
            return (Criteria) this;
        }

        public Criteria andMenu_urlNotEqualTo(String value) {
            addCriterion("menu_url <>", value, "menu_url");
            return (Criteria) this;
        }

        public Criteria andMenu_urlGreaterThan(String value) {
            addCriterion("menu_url >", value, "menu_url");
            return (Criteria) this;
        }

        public Criteria andMenu_urlGreaterThanOrEqualTo(String value) {
            addCriterion("menu_url >=", value, "menu_url");
            return (Criteria) this;
        }

        public Criteria andMenu_urlLessThan(String value) {
            addCriterion("menu_url <", value, "menu_url");
            return (Criteria) this;
        }

        public Criteria andMenu_urlLessThanOrEqualTo(String value) {
            addCriterion("menu_url <=", value, "menu_url");
            return (Criteria) this;
        }

        public Criteria andMenu_urlLike(String value) {
            addCriterion("menu_url like", value, "menu_url");
            return (Criteria) this;
        }

        public Criteria andMenu_urlNotLike(String value) {
            addCriterion("menu_url not like", value, "menu_url");
            return (Criteria) this;
        }

        public Criteria andMenu_urlIn(List<String> values) {
            addCriterion("menu_url in", values, "menu_url");
            return (Criteria) this;
        }

        public Criteria andMenu_urlNotIn(List<String> values) {
            addCriterion("menu_url not in", values, "menu_url");
            return (Criteria) this;
        }

        public Criteria andMenu_urlBetween(String value1, String value2) {
            addCriterion("menu_url between", value1, value2, "menu_url");
            return (Criteria) this;
        }

        public Criteria andMenu_urlNotBetween(String value1, String value2) {
            addCriterion("menu_url not between", value1, value2, "menu_url");
            return (Criteria) this;
        }

        public Criteria andMenu_picIsNull() {
            addCriterion("menu_pic is null");
            return (Criteria) this;
        }

        public Criteria andMenu_picIsNotNull() {
            addCriterion("menu_pic is not null");
            return (Criteria) this;
        }

        public Criteria andMenu_picEqualTo(String value) {
            addCriterion("menu_pic =", value, "menu_pic");
            return (Criteria) this;
        }

        public Criteria andMenu_picNotEqualTo(String value) {
            addCriterion("menu_pic <>", value, "menu_pic");
            return (Criteria) this;
        }

        public Criteria andMenu_picGreaterThan(String value) {
            addCriterion("menu_pic >", value, "menu_pic");
            return (Criteria) this;
        }

        public Criteria andMenu_picGreaterThanOrEqualTo(String value) {
            addCriterion("menu_pic >=", value, "menu_pic");
            return (Criteria) this;
        }

        public Criteria andMenu_picLessThan(String value) {
            addCriterion("menu_pic <", value, "menu_pic");
            return (Criteria) this;
        }

        public Criteria andMenu_picLessThanOrEqualTo(String value) {
            addCriterion("menu_pic <=", value, "menu_pic");
            return (Criteria) this;
        }

        public Criteria andMenu_picLike(String value) {
            addCriterion("menu_pic like", value, "menu_pic");
            return (Criteria) this;
        }

        public Criteria andMenu_picNotLike(String value) {
            addCriterion("menu_pic not like", value, "menu_pic");
            return (Criteria) this;
        }

        public Criteria andMenu_picIn(List<String> values) {
            addCriterion("menu_pic in", values, "menu_pic");
            return (Criteria) this;
        }

        public Criteria andMenu_picNotIn(List<String> values) {
            addCriterion("menu_pic not in", values, "menu_pic");
            return (Criteria) this;
        }

        public Criteria andMenu_picBetween(String value1, String value2) {
            addCriterion("menu_pic between", value1, value2, "menu_pic");
            return (Criteria) this;
        }

        public Criteria andMenu_picNotBetween(String value1, String value2) {
            addCriterion("menu_pic not between", value1, value2, "menu_pic");
            return (Criteria) this;
        }

        public Criteria andSystem_idIsNull() {
            addCriterion("system_id is null");
            return (Criteria) this;
        }

        public Criteria andSystem_idIsNotNull() {
            addCriterion("system_id is not null");
            return (Criteria) this;
        }

        public Criteria andSystem_idEqualTo(String value) {
            addCriterion("system_id =", value, "system_id");
            return (Criteria) this;
        }

        public Criteria andSystem_idNotEqualTo(String value) {
            addCriterion("system_id <>", value, "system_id");
            return (Criteria) this;
        }

        public Criteria andSystem_idGreaterThan(String value) {
            addCriterion("system_id >", value, "system_id");
            return (Criteria) this;
        }

        public Criteria andSystem_idGreaterThanOrEqualTo(String value) {
            addCriterion("system_id >=", value, "system_id");
            return (Criteria) this;
        }

        public Criteria andSystem_idLessThan(String value) {
            addCriterion("system_id <", value, "system_id");
            return (Criteria) this;
        }

        public Criteria andSystem_idLessThanOrEqualTo(String value) {
            addCriterion("system_id <=", value, "system_id");
            return (Criteria) this;
        }

        public Criteria andSystem_idLike(String value) {
            addCriterion("system_id like", value, "system_id");
            return (Criteria) this;
        }

        public Criteria andSystem_idNotLike(String value) {
            addCriterion("system_id not like", value, "system_id");
            return (Criteria) this;
        }

        public Criteria andSystem_idIn(List<String> values) {
            addCriterion("system_id in", values, "system_id");
            return (Criteria) this;
        }

        public Criteria andSystem_idNotIn(List<String> values) {
            addCriterion("system_id not in", values, "system_id");
            return (Criteria) this;
        }

        public Criteria andSystem_idBetween(String value1, String value2) {
            addCriterion("system_id between", value1, value2, "system_id");
            return (Criteria) this;
        }

        public Criteria andSystem_idNotBetween(String value1, String value2) {
            addCriterion("system_id not between", value1, value2, "system_id");
            return (Criteria) this;
        }

        public Criteria andSub_system_idIsNull() {
            addCriterion("sub_system_id is null");
            return (Criteria) this;
        }

        public Criteria andSub_system_idIsNotNull() {
            addCriterion("sub_system_id is not null");
            return (Criteria) this;
        }

        public Criteria andSub_system_idEqualTo(String value) {
            addCriterion("sub_system_id =", value, "sub_system_id");
            return (Criteria) this;
        }

        public Criteria andSub_system_idNotEqualTo(String value) {
            addCriterion("sub_system_id <>", value, "sub_system_id");
            return (Criteria) this;
        }

        public Criteria andSub_system_idGreaterThan(String value) {
            addCriterion("sub_system_id >", value, "sub_system_id");
            return (Criteria) this;
        }

        public Criteria andSub_system_idGreaterThanOrEqualTo(String value) {
            addCriterion("sub_system_id >=", value, "sub_system_id");
            return (Criteria) this;
        }

        public Criteria andSub_system_idLessThan(String value) {
            addCriterion("sub_system_id <", value, "sub_system_id");
            return (Criteria) this;
        }

        public Criteria andSub_system_idLessThanOrEqualTo(String value) {
            addCriterion("sub_system_id <=", value, "sub_system_id");
            return (Criteria) this;
        }

        public Criteria andSub_system_idLike(String value) {
            addCriterion("sub_system_id like", value, "sub_system_id");
            return (Criteria) this;
        }

        public Criteria andSub_system_idNotLike(String value) {
            addCriterion("sub_system_id not like", value, "sub_system_id");
            return (Criteria) this;
        }

        public Criteria andSub_system_idIn(List<String> values) {
            addCriterion("sub_system_id in", values, "sub_system_id");
            return (Criteria) this;
        }

        public Criteria andSub_system_idNotIn(List<String> values) {
            addCriterion("sub_system_id not in", values, "sub_system_id");
            return (Criteria) this;
        }

        public Criteria andSub_system_idBetween(String value1, String value2) {
            addCriterion("sub_system_id between", value1, value2, "sub_system_id");
            return (Criteria) this;
        }

        public Criteria andSub_system_idNotBetween(String value1, String value2) {
            addCriterion("sub_system_id not between", value1, value2, "sub_system_id");
            return (Criteria) this;
        }

        public Criteria andMenu_stateIsNull() {
            addCriterion("menu_state is null");
            return (Criteria) this;
        }

        public Criteria andMenu_stateIsNotNull() {
            addCriterion("menu_state is not null");
            return (Criteria) this;
        }

        public Criteria andMenu_stateEqualTo(Integer value) {
            addCriterion("menu_state =", value, "menu_state");
            return (Criteria) this;
        }

        public Criteria andMenu_stateNotEqualTo(Integer value) {
            addCriterion("menu_state <>", value, "menu_state");
            return (Criteria) this;
        }

        public Criteria andMenu_stateGreaterThan(Integer value) {
            addCriterion("menu_state >", value, "menu_state");
            return (Criteria) this;
        }

        public Criteria andMenu_stateGreaterThanOrEqualTo(Integer value) {
            addCriterion("menu_state >=", value, "menu_state");
            return (Criteria) this;
        }

        public Criteria andMenu_stateLessThan(Integer value) {
            addCriterion("menu_state <", value, "menu_state");
            return (Criteria) this;
        }

        public Criteria andMenu_stateLessThanOrEqualTo(Integer value) {
            addCriterion("menu_state <=", value, "menu_state");
            return (Criteria) this;
        }

        public Criteria andMenu_stateIn(List<Integer> values) {
            addCriterion("menu_state in", values, "menu_state");
            return (Criteria) this;
        }

        public Criteria andMenu_stateNotIn(List<Integer> values) {
            addCriterion("menu_state not in", values, "menu_state");
            return (Criteria) this;
        }

        public Criteria andMenu_stateBetween(Integer value1, Integer value2) {
            addCriterion("menu_state between", value1, value2, "menu_state");
            return (Criteria) this;
        }

        public Criteria andMenu_stateNotBetween(Integer value1, Integer value2) {
            addCriterion("menu_state not between", value1, value2, "menu_state");
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