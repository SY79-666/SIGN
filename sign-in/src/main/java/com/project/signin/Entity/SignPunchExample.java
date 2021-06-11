package com.project.signin.Entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SignPunchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SignPunchExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andStartNormaltimeIsNull() {
            addCriterion("START_NORMALTIME is null");
            return (Criteria) this;
        }

        public Criteria andStartNormaltimeIsNotNull() {
            addCriterion("START_NORMALTIME is not null");
            return (Criteria) this;
        }

        public Criteria andStartNormaltimeEqualTo(Date value) {
            addCriterion("START_NORMALTIME =", value, "startNormaltime");
            return (Criteria) this;
        }

        public Criteria andStartNormaltimeNotEqualTo(Date value) {
            addCriterion("START_NORMALTIME <>", value, "startNormaltime");
            return (Criteria) this;
        }

        public Criteria andStartNormaltimeGreaterThan(Date value) {
            addCriterion("START_NORMALTIME >", value, "startNormaltime");
            return (Criteria) this;
        }

        public Criteria andStartNormaltimeGreaterThanOrEqualTo(Date value) {
            addCriterion("START_NORMALTIME >=", value, "startNormaltime");
            return (Criteria) this;
        }

        public Criteria andStartNormaltimeLessThan(Date value) {
            addCriterion("START_NORMALTIME <", value, "startNormaltime");
            return (Criteria) this;
        }

        public Criteria andStartNormaltimeLessThanOrEqualTo(Date value) {
            addCriterion("START_NORMALTIME <=", value, "startNormaltime");
            return (Criteria) this;
        }

        public Criteria andStartNormaltimeIn(List<Date> values) {
            addCriterion("START_NORMALTIME in", values, "startNormaltime");
            return (Criteria) this;
        }

        public Criteria andStartNormaltimeNotIn(List<Date> values) {
            addCriterion("START_NORMALTIME not in", values, "startNormaltime");
            return (Criteria) this;
        }

        public Criteria andStartNormaltimeBetween(Date value1, Date value2) {
            addCriterion("START_NORMALTIME between", value1, value2, "startNormaltime");
            return (Criteria) this;
        }

        public Criteria andStartNormaltimeNotBetween(Date value1, Date value2) {
            addCriterion("START_NORMALTIME not between", value1, value2, "startNormaltime");
            return (Criteria) this;
        }

        public Criteria andEndNormaltimeIsNull() {
            addCriterion("END_NORMALTIME is null");
            return (Criteria) this;
        }

        public Criteria andEndNormaltimeIsNotNull() {
            addCriterion("END_NORMALTIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndNormaltimeEqualTo(Date value) {
            addCriterion("END_NORMALTIME =", value, "endNormaltime");
            return (Criteria) this;
        }

        public Criteria andEndNormaltimeNotEqualTo(Date value) {
            addCriterion("END_NORMALTIME <>", value, "endNormaltime");
            return (Criteria) this;
        }

        public Criteria andEndNormaltimeGreaterThan(Date value) {
            addCriterion("END_NORMALTIME >", value, "endNormaltime");
            return (Criteria) this;
        }

        public Criteria andEndNormaltimeGreaterThanOrEqualTo(Date value) {
            addCriterion("END_NORMALTIME >=", value, "endNormaltime");
            return (Criteria) this;
        }

        public Criteria andEndNormaltimeLessThan(Date value) {
            addCriterion("END_NORMALTIME <", value, "endNormaltime");
            return (Criteria) this;
        }

        public Criteria andEndNormaltimeLessThanOrEqualTo(Date value) {
            addCriterion("END_NORMALTIME <=", value, "endNormaltime");
            return (Criteria) this;
        }

        public Criteria andEndNormaltimeIn(List<Date> values) {
            addCriterion("END_NORMALTIME in", values, "endNormaltime");
            return (Criteria) this;
        }

        public Criteria andEndNormaltimeNotIn(List<Date> values) {
            addCriterion("END_NORMALTIME not in", values, "endNormaltime");
            return (Criteria) this;
        }

        public Criteria andEndNormaltimeBetween(Date value1, Date value2) {
            addCriterion("END_NORMALTIME between", value1, value2, "endNormaltime");
            return (Criteria) this;
        }

        public Criteria andEndNormaltimeNotBetween(Date value1, Date value2) {
            addCriterion("END_NORMALTIME not between", value1, value2, "endNormaltime");
            return (Criteria) this;
        }

        public Criteria andStartOvertimeIsNull() {
            addCriterion("START_OVERTIME is null");
            return (Criteria) this;
        }

        public Criteria andStartOvertimeIsNotNull() {
            addCriterion("START_OVERTIME is not null");
            return (Criteria) this;
        }

        public Criteria andStartOvertimeEqualTo(Date value) {
            addCriterion("START_OVERTIME =", value, "startOvertime");
            return (Criteria) this;
        }

        public Criteria andStartOvertimeNotEqualTo(Date value) {
            addCriterion("START_OVERTIME <>", value, "startOvertime");
            return (Criteria) this;
        }

        public Criteria andStartOvertimeGreaterThan(Date value) {
            addCriterion("START_OVERTIME >", value, "startOvertime");
            return (Criteria) this;
        }

        public Criteria andStartOvertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("START_OVERTIME >=", value, "startOvertime");
            return (Criteria) this;
        }

        public Criteria andStartOvertimeLessThan(Date value) {
            addCriterion("START_OVERTIME <", value, "startOvertime");
            return (Criteria) this;
        }

        public Criteria andStartOvertimeLessThanOrEqualTo(Date value) {
            addCriterion("START_OVERTIME <=", value, "startOvertime");
            return (Criteria) this;
        }

        public Criteria andStartOvertimeIn(List<Date> values) {
            addCriterion("START_OVERTIME in", values, "startOvertime");
            return (Criteria) this;
        }

        public Criteria andStartOvertimeNotIn(List<Date> values) {
            addCriterion("START_OVERTIME not in", values, "startOvertime");
            return (Criteria) this;
        }

        public Criteria andStartOvertimeBetween(Date value1, Date value2) {
            addCriterion("START_OVERTIME between", value1, value2, "startOvertime");
            return (Criteria) this;
        }

        public Criteria andStartOvertimeNotBetween(Date value1, Date value2) {
            addCriterion("START_OVERTIME not between", value1, value2, "startOvertime");
            return (Criteria) this;
        }

        public Criteria andEndOvertimeIsNull() {
            addCriterion("END_OVERTIME is null");
            return (Criteria) this;
        }

        public Criteria andEndOvertimeIsNotNull() {
            addCriterion("END_OVERTIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndOvertimeEqualTo(Date value) {
            addCriterion("END_OVERTIME =", value, "endOvertime");
            return (Criteria) this;
        }

        public Criteria andEndOvertimeNotEqualTo(Date value) {
            addCriterion("END_OVERTIME <>", value, "endOvertime");
            return (Criteria) this;
        }

        public Criteria andEndOvertimeGreaterThan(Date value) {
            addCriterion("END_OVERTIME >", value, "endOvertime");
            return (Criteria) this;
        }

        public Criteria andEndOvertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("END_OVERTIME >=", value, "endOvertime");
            return (Criteria) this;
        }

        public Criteria andEndOvertimeLessThan(Date value) {
            addCriterion("END_OVERTIME <", value, "endOvertime");
            return (Criteria) this;
        }

        public Criteria andEndOvertimeLessThanOrEqualTo(Date value) {
            addCriterion("END_OVERTIME <=", value, "endOvertime");
            return (Criteria) this;
        }

        public Criteria andEndOvertimeIn(List<Date> values) {
            addCriterion("END_OVERTIME in", values, "endOvertime");
            return (Criteria) this;
        }

        public Criteria andEndOvertimeNotIn(List<Date> values) {
            addCriterion("END_OVERTIME not in", values, "endOvertime");
            return (Criteria) this;
        }

        public Criteria andEndOvertimeBetween(Date value1, Date value2) {
            addCriterion("END_OVERTIME between", value1, value2, "endOvertime");
            return (Criteria) this;
        }

        public Criteria andEndOvertimeNotBetween(Date value1, Date value2) {
            addCriterion("END_OVERTIME not between", value1, value2, "endOvertime");
            return (Criteria) this;
        }

        public Criteria andNormalhoursIsNull() {
            addCriterion("NORMALHOURS is null");
            return (Criteria) this;
        }

        public Criteria andNormalhoursIsNotNull() {
            addCriterion("NORMALHOURS is not null");
            return (Criteria) this;
        }

        public Criteria andNormalhoursEqualTo(Integer value) {
            addCriterion("NORMALHOURS =", value, "normalhours");
            return (Criteria) this;
        }

        public Criteria andNormalhoursNotEqualTo(Integer value) {
            addCriterion("NORMALHOURS <>", value, "normalhours");
            return (Criteria) this;
        }

        public Criteria andNormalhoursGreaterThan(Integer value) {
            addCriterion("NORMALHOURS >", value, "normalhours");
            return (Criteria) this;
        }

        public Criteria andNormalhoursGreaterThanOrEqualTo(Integer value) {
            addCriterion("NORMALHOURS >=", value, "normalhours");
            return (Criteria) this;
        }

        public Criteria andNormalhoursLessThan(Integer value) {
            addCriterion("NORMALHOURS <", value, "normalhours");
            return (Criteria) this;
        }

        public Criteria andNormalhoursLessThanOrEqualTo(Integer value) {
            addCriterion("NORMALHOURS <=", value, "normalhours");
            return (Criteria) this;
        }

        public Criteria andNormalhoursIn(List<Integer> values) {
            addCriterion("NORMALHOURS in", values, "normalhours");
            return (Criteria) this;
        }

        public Criteria andNormalhoursNotIn(List<Integer> values) {
            addCriterion("NORMALHOURS not in", values, "normalhours");
            return (Criteria) this;
        }

        public Criteria andNormalhoursBetween(Integer value1, Integer value2) {
            addCriterion("NORMALHOURS between", value1, value2, "normalhours");
            return (Criteria) this;
        }

        public Criteria andNormalhoursNotBetween(Integer value1, Integer value2) {
            addCriterion("NORMALHOURS not between", value1, value2, "normalhours");
            return (Criteria) this;
        }

        public Criteria andOverhoursIsNull() {
            addCriterion("OVERHOURS is null");
            return (Criteria) this;
        }

        public Criteria andOverhoursIsNotNull() {
            addCriterion("OVERHOURS is not null");
            return (Criteria) this;
        }

        public Criteria andOverhoursEqualTo(Integer value) {
            addCriterion("OVERHOURS =", value, "overhours");
            return (Criteria) this;
        }

        public Criteria andOverhoursNotEqualTo(Integer value) {
            addCriterion("OVERHOURS <>", value, "overhours");
            return (Criteria) this;
        }

        public Criteria andOverhoursGreaterThan(Integer value) {
            addCriterion("OVERHOURS >", value, "overhours");
            return (Criteria) this;
        }

        public Criteria andOverhoursGreaterThanOrEqualTo(Integer value) {
            addCriterion("OVERHOURS >=", value, "overhours");
            return (Criteria) this;
        }

        public Criteria andOverhoursLessThan(Integer value) {
            addCriterion("OVERHOURS <", value, "overhours");
            return (Criteria) this;
        }

        public Criteria andOverhoursLessThanOrEqualTo(Integer value) {
            addCriterion("OVERHOURS <=", value, "overhours");
            return (Criteria) this;
        }

        public Criteria andOverhoursIn(List<Integer> values) {
            addCriterion("OVERHOURS in", values, "overhours");
            return (Criteria) this;
        }

        public Criteria andOverhoursNotIn(List<Integer> values) {
            addCriterion("OVERHOURS not in", values, "overhours");
            return (Criteria) this;
        }

        public Criteria andOverhoursBetween(Integer value1, Integer value2) {
            addCriterion("OVERHOURS between", value1, value2, "overhours");
            return (Criteria) this;
        }

        public Criteria andOverhoursNotBetween(Integer value1, Integer value2) {
            addCriterion("OVERHOURS not between", value1, value2, "overhours");
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