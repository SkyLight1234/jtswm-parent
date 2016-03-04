package com.zdpzsp.system.bo;

import java.util.ArrayList;
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

        public Criteria andSysAccountIsNull() {
            addCriterion("sys_account is null");
            return (Criteria) this;
        }

        public Criteria andSysAccountIsNotNull() {
            addCriterion("sys_account is not null");
            return (Criteria) this;
        }

        public Criteria andSysAccountEqualTo(String value) {
            addCriterion("sys_account =", value, "sysAccount");
            return (Criteria) this;
        }

        public Criteria andSysAccountNotEqualTo(String value) {
            addCriterion("sys_account <>", value, "sysAccount");
            return (Criteria) this;
        }

        public Criteria andSysAccountGreaterThan(String value) {
            addCriterion("sys_account >", value, "sysAccount");
            return (Criteria) this;
        }

        public Criteria andSysAccountGreaterThanOrEqualTo(String value) {
            addCriterion("sys_account >=", value, "sysAccount");
            return (Criteria) this;
        }

        public Criteria andSysAccountLessThan(String value) {
            addCriterion("sys_account <", value, "sysAccount");
            return (Criteria) this;
        }

        public Criteria andSysAccountLessThanOrEqualTo(String value) {
            addCriterion("sys_account <=", value, "sysAccount");
            return (Criteria) this;
        }

        public Criteria andSysAccountLike(String value) {
            addCriterion("sys_account like", value, "sysAccount");
            return (Criteria) this;
        }

        public Criteria andSysAccountNotLike(String value) {
            addCriterion("sys_account not like", value, "sysAccount");
            return (Criteria) this;
        }

        public Criteria andSysAccountIn(List<String> values) {
            addCriterion("sys_account in", values, "sysAccount");
            return (Criteria) this;
        }

        public Criteria andSysAccountNotIn(List<String> values) {
            addCriterion("sys_account not in", values, "sysAccount");
            return (Criteria) this;
        }

        public Criteria andSysAccountBetween(String value1, String value2) {
            addCriterion("sys_account between", value1, value2, "sysAccount");
            return (Criteria) this;
        }

        public Criteria andSysAccountNotBetween(String value1, String value2) {
            addCriterion("sys_account not between", value1, value2, "sysAccount");
            return (Criteria) this;
        }

        public Criteria andSysPasswordIsNull() {
            addCriterion("sys_password is null");
            return (Criteria) this;
        }

        public Criteria andSysPasswordIsNotNull() {
            addCriterion("sys_password is not null");
            return (Criteria) this;
        }

        public Criteria andSysPasswordEqualTo(String value) {
            addCriterion("sys_password =", value, "sysPassword");
            return (Criteria) this;
        }

        public Criteria andSysPasswordNotEqualTo(String value) {
            addCriterion("sys_password <>", value, "sysPassword");
            return (Criteria) this;
        }

        public Criteria andSysPasswordGreaterThan(String value) {
            addCriterion("sys_password >", value, "sysPassword");
            return (Criteria) this;
        }

        public Criteria andSysPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("sys_password >=", value, "sysPassword");
            return (Criteria) this;
        }

        public Criteria andSysPasswordLessThan(String value) {
            addCriterion("sys_password <", value, "sysPassword");
            return (Criteria) this;
        }

        public Criteria andSysPasswordLessThanOrEqualTo(String value) {
            addCriterion("sys_password <=", value, "sysPassword");
            return (Criteria) this;
        }

        public Criteria andSysPasswordLike(String value) {
            addCriterion("sys_password like", value, "sysPassword");
            return (Criteria) this;
        }

        public Criteria andSysPasswordNotLike(String value) {
            addCriterion("sys_password not like", value, "sysPassword");
            return (Criteria) this;
        }

        public Criteria andSysPasswordIn(List<String> values) {
            addCriterion("sys_password in", values, "sysPassword");
            return (Criteria) this;
        }

        public Criteria andSysPasswordNotIn(List<String> values) {
            addCriterion("sys_password not in", values, "sysPassword");
            return (Criteria) this;
        }

        public Criteria andSysPasswordBetween(String value1, String value2) {
            addCriterion("sys_password between", value1, value2, "sysPassword");
            return (Criteria) this;
        }

        public Criteria andSysPasswordNotBetween(String value1, String value2) {
            addCriterion("sys_password not between", value1, value2, "sysPassword");
            return (Criteria) this;
        }

        public Criteria andHeadUrlIsNull() {
            addCriterion("head_url is null");
            return (Criteria) this;
        }

        public Criteria andHeadUrlIsNotNull() {
            addCriterion("head_url is not null");
            return (Criteria) this;
        }

        public Criteria andHeadUrlEqualTo(String value) {
            addCriterion("head_url =", value, "headUrl");
            return (Criteria) this;
        }

        public Criteria andHeadUrlNotEqualTo(String value) {
            addCriterion("head_url <>", value, "headUrl");
            return (Criteria) this;
        }

        public Criteria andHeadUrlGreaterThan(String value) {
            addCriterion("head_url >", value, "headUrl");
            return (Criteria) this;
        }

        public Criteria andHeadUrlGreaterThanOrEqualTo(String value) {
            addCriterion("head_url >=", value, "headUrl");
            return (Criteria) this;
        }

        public Criteria andHeadUrlLessThan(String value) {
            addCriterion("head_url <", value, "headUrl");
            return (Criteria) this;
        }

        public Criteria andHeadUrlLessThanOrEqualTo(String value) {
            addCriterion("head_url <=", value, "headUrl");
            return (Criteria) this;
        }

        public Criteria andHeadUrlLike(String value) {
            addCriterion("head_url like", value, "headUrl");
            return (Criteria) this;
        }

        public Criteria andHeadUrlNotLike(String value) {
            addCriterion("head_url not like", value, "headUrl");
            return (Criteria) this;
        }

        public Criteria andHeadUrlIn(List<String> values) {
            addCriterion("head_url in", values, "headUrl");
            return (Criteria) this;
        }

        public Criteria andHeadUrlNotIn(List<String> values) {
            addCriterion("head_url not in", values, "headUrl");
            return (Criteria) this;
        }

        public Criteria andHeadUrlBetween(String value1, String value2) {
            addCriterion("head_url between", value1, value2, "headUrl");
            return (Criteria) this;
        }

        public Criteria andHeadUrlNotBetween(String value1, String value2) {
            addCriterion("head_url not between", value1, value2, "headUrl");
            return (Criteria) this;
        }

        public Criteria andSysUserNicknameIsNull() {
            addCriterion("sys_user_nickname is null");
            return (Criteria) this;
        }

        public Criteria andSysUserNicknameIsNotNull() {
            addCriterion("sys_user_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andSysUserNicknameEqualTo(String value) {
            addCriterion("sys_user_nickname =", value, "sysUserNickname");
            return (Criteria) this;
        }

        public Criteria andSysUserNicknameNotEqualTo(String value) {
            addCriterion("sys_user_nickname <>", value, "sysUserNickname");
            return (Criteria) this;
        }

        public Criteria andSysUserNicknameGreaterThan(String value) {
            addCriterion("sys_user_nickname >", value, "sysUserNickname");
            return (Criteria) this;
        }

        public Criteria andSysUserNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("sys_user_nickname >=", value, "sysUserNickname");
            return (Criteria) this;
        }

        public Criteria andSysUserNicknameLessThan(String value) {
            addCriterion("sys_user_nickname <", value, "sysUserNickname");
            return (Criteria) this;
        }

        public Criteria andSysUserNicknameLessThanOrEqualTo(String value) {
            addCriterion("sys_user_nickname <=", value, "sysUserNickname");
            return (Criteria) this;
        }

        public Criteria andSysUserNicknameLike(String value) {
            addCriterion("sys_user_nickname like", value, "sysUserNickname");
            return (Criteria) this;
        }

        public Criteria andSysUserNicknameNotLike(String value) {
            addCriterion("sys_user_nickname not like", value, "sysUserNickname");
            return (Criteria) this;
        }

        public Criteria andSysUserNicknameIn(List<String> values) {
            addCriterion("sys_user_nickname in", values, "sysUserNickname");
            return (Criteria) this;
        }

        public Criteria andSysUserNicknameNotIn(List<String> values) {
            addCriterion("sys_user_nickname not in", values, "sysUserNickname");
            return (Criteria) this;
        }

        public Criteria andSysUserNicknameBetween(String value1, String value2) {
            addCriterion("sys_user_nickname between", value1, value2, "sysUserNickname");
            return (Criteria) this;
        }

        public Criteria andSysUserNicknameNotBetween(String value1, String value2) {
            addCriterion("sys_user_nickname not between", value1, value2, "sysUserNickname");
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

        public Criteria andIsHeadIsNull() {
            addCriterion("is_head is null");
            return (Criteria) this;
        }

        public Criteria andIsHeadIsNotNull() {
            addCriterion("is_head is not null");
            return (Criteria) this;
        }

        public Criteria andIsHeadEqualTo(Integer value) {
            addCriterion("is_head =", value, "isHead");
            return (Criteria) this;
        }

        public Criteria andIsHeadNotEqualTo(Integer value) {
            addCriterion("is_head <>", value, "isHead");
            return (Criteria) this;
        }

        public Criteria andIsHeadGreaterThan(Integer value) {
            addCriterion("is_head >", value, "isHead");
            return (Criteria) this;
        }

        public Criteria andIsHeadGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_head >=", value, "isHead");
            return (Criteria) this;
        }

        public Criteria andIsHeadLessThan(Integer value) {
            addCriterion("is_head <", value, "isHead");
            return (Criteria) this;
        }

        public Criteria andIsHeadLessThanOrEqualTo(Integer value) {
            addCriterion("is_head <=", value, "isHead");
            return (Criteria) this;
        }

        public Criteria andIsHeadIn(List<Integer> values) {
            addCriterion("is_head in", values, "isHead");
            return (Criteria) this;
        }

        public Criteria andIsHeadNotIn(List<Integer> values) {
            addCriterion("is_head not in", values, "isHead");
            return (Criteria) this;
        }

        public Criteria andIsHeadBetween(Integer value1, Integer value2) {
            addCriterion("is_head between", value1, value2, "isHead");
            return (Criteria) this;
        }

        public Criteria andIsHeadNotBetween(Integer value1, Integer value2) {
            addCriterion("is_head not between", value1, value2, "isHead");
            return (Criteria) this;
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

        public Criteria andSysUserPhone2IsNull() {
            addCriterion("sys_user_phone2 is null");
            return (Criteria) this;
        }

        public Criteria andSysUserPhone2IsNotNull() {
            addCriterion("sys_user_phone2 is not null");
            return (Criteria) this;
        }

        public Criteria andSysUserPhone2EqualTo(String value) {
            addCriterion("sys_user_phone2 =", value, "sysUserPhone2");
            return (Criteria) this;
        }

        public Criteria andSysUserPhone2NotEqualTo(String value) {
            addCriterion("sys_user_phone2 <>", value, "sysUserPhone2");
            return (Criteria) this;
        }

        public Criteria andSysUserPhone2GreaterThan(String value) {
            addCriterion("sys_user_phone2 >", value, "sysUserPhone2");
            return (Criteria) this;
        }

        public Criteria andSysUserPhone2GreaterThanOrEqualTo(String value) {
            addCriterion("sys_user_phone2 >=", value, "sysUserPhone2");
            return (Criteria) this;
        }

        public Criteria andSysUserPhone2LessThan(String value) {
            addCriterion("sys_user_phone2 <", value, "sysUserPhone2");
            return (Criteria) this;
        }

        public Criteria andSysUserPhone2LessThanOrEqualTo(String value) {
            addCriterion("sys_user_phone2 <=", value, "sysUserPhone2");
            return (Criteria) this;
        }

        public Criteria andSysUserPhone2Like(String value) {
            addCriterion("sys_user_phone2 like", value, "sysUserPhone2");
            return (Criteria) this;
        }

        public Criteria andSysUserPhone2NotLike(String value) {
            addCriterion("sys_user_phone2 not like", value, "sysUserPhone2");
            return (Criteria) this;
        }

        public Criteria andSysUserPhone2In(List<String> values) {
            addCriterion("sys_user_phone2 in", values, "sysUserPhone2");
            return (Criteria) this;
        }

        public Criteria andSysUserPhone2NotIn(List<String> values) {
            addCriterion("sys_user_phone2 not in", values, "sysUserPhone2");
            return (Criteria) this;
        }

        public Criteria andSysUserPhone2Between(String value1, String value2) {
            addCriterion("sys_user_phone2 between", value1, value2, "sysUserPhone2");
            return (Criteria) this;
        }

        public Criteria andSysUserPhone2NotBetween(String value1, String value2) {
            addCriterion("sys_user_phone2 not between", value1, value2, "sysUserPhone2");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNull() {
            addCriterion("user_email is null");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNotNull() {
            addCriterion("user_email is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmailEqualTo(String value) {
            addCriterion("user_email =", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotEqualTo(String value) {
            addCriterion("user_email <>", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThan(String value) {
            addCriterion("user_email >", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("user_email >=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThan(String value) {
            addCriterion("user_email <", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThanOrEqualTo(String value) {
            addCriterion("user_email <=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLike(String value) {
            addCriterion("user_email like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotLike(String value) {
            addCriterion("user_email not like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailIn(List<String> values) {
            addCriterion("user_email in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotIn(List<String> values) {
            addCriterion("user_email not in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailBetween(String value1, String value2) {
            addCriterion("user_email between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotBetween(String value1, String value2) {
            addCriterion("user_email not between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Long value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Long value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Long value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Long value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Long value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Long value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Long> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Long> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Long value1, Long value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Long value1, Long value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andUserStateIsNull() {
            addCriterion("user_state is null");
            return (Criteria) this;
        }

        public Criteria andUserStateIsNotNull() {
            addCriterion("user_state is not null");
            return (Criteria) this;
        }

        public Criteria andUserStateEqualTo(Integer value) {
            addCriterion("user_state =", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotEqualTo(Integer value) {
            addCriterion("user_state <>", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateGreaterThan(Integer value) {
            addCriterion("user_state >", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_state >=", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateLessThan(Integer value) {
            addCriterion("user_state <", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateLessThanOrEqualTo(Integer value) {
            addCriterion("user_state <=", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateIn(List<Integer> values) {
            addCriterion("user_state in", values, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotIn(List<Integer> values) {
            addCriterion("user_state not in", values, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateBetween(Integer value1, Integer value2) {
            addCriterion("user_state between", value1, value2, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotBetween(Integer value1, Integer value2) {
            addCriterion("user_state not between", value1, value2, "userState");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNull() {
            addCriterion("school is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNotNull() {
            addCriterion("school is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolEqualTo(String value) {
            addCriterion("school =", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotEqualTo(String value) {
            addCriterion("school <>", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThan(String value) {
            addCriterion("school >", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("school >=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThan(String value) {
            addCriterion("school <", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThanOrEqualTo(String value) {
            addCriterion("school <=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLike(String value) {
            addCriterion("school like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotLike(String value) {
            addCriterion("school not like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolIn(List<String> values) {
            addCriterion("school in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotIn(List<String> values) {
            addCriterion("school not in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolBetween(String value1, String value2) {
            addCriterion("school between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotBetween(String value1, String value2) {
            addCriterion("school not between", value1, value2, "school");
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