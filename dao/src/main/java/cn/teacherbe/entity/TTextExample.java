package cn.teacherbe.entity;

import java.util.ArrayList;
import java.util.List;

public class TTextExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TTextExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTextNameIsNull() {
            addCriterion("TEXT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTextNameIsNotNull() {
            addCriterion("TEXT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTextNameEqualTo(String value) {
            addCriterion("TEXT_NAME =", value, "textName");
            return (Criteria) this;
        }

        public Criteria andTextNameNotEqualTo(String value) {
            addCriterion("TEXT_NAME <>", value, "textName");
            return (Criteria) this;
        }

        public Criteria andTextNameGreaterThan(String value) {
            addCriterion("TEXT_NAME >", value, "textName");
            return (Criteria) this;
        }

        public Criteria andTextNameGreaterThanOrEqualTo(String value) {
            addCriterion("TEXT_NAME >=", value, "textName");
            return (Criteria) this;
        }

        public Criteria andTextNameLessThan(String value) {
            addCriterion("TEXT_NAME <", value, "textName");
            return (Criteria) this;
        }

        public Criteria andTextNameLessThanOrEqualTo(String value) {
            addCriterion("TEXT_NAME <=", value, "textName");
            return (Criteria) this;
        }

        public Criteria andTextNameLike(String value) {
            addCriterion("TEXT_NAME like", value, "textName");
            return (Criteria) this;
        }

        public Criteria andTextNameNotLike(String value) {
            addCriterion("TEXT_NAME not like", value, "textName");
            return (Criteria) this;
        }

        public Criteria andTextNameIn(List<String> values) {
            addCriterion("TEXT_NAME in", values, "textName");
            return (Criteria) this;
        }

        public Criteria andTextNameNotIn(List<String> values) {
            addCriterion("TEXT_NAME not in", values, "textName");
            return (Criteria) this;
        }

        public Criteria andTextNameBetween(String value1, String value2) {
            addCriterion("TEXT_NAME between", value1, value2, "textName");
            return (Criteria) this;
        }

        public Criteria andTextNameNotBetween(String value1, String value2) {
            addCriterion("TEXT_NAME not between", value1, value2, "textName");
            return (Criteria) this;
        }

        public Criteria andTextPositionIsNull() {
            addCriterion("TEXT_POSITION is null");
            return (Criteria) this;
        }

        public Criteria andTextPositionIsNotNull() {
            addCriterion("TEXT_POSITION is not null");
            return (Criteria) this;
        }

        public Criteria andTextPositionEqualTo(Integer value) {
            addCriterion("TEXT_POSITION =", value, "textPosition");
            return (Criteria) this;
        }

        public Criteria andTextPositionNotEqualTo(Integer value) {
            addCriterion("TEXT_POSITION <>", value, "textPosition");
            return (Criteria) this;
        }

        public Criteria andTextPositionGreaterThan(Integer value) {
            addCriterion("TEXT_POSITION >", value, "textPosition");
            return (Criteria) this;
        }

        public Criteria andTextPositionGreaterThanOrEqualTo(Integer value) {
            addCriterion("TEXT_POSITION >=", value, "textPosition");
            return (Criteria) this;
        }

        public Criteria andTextPositionLessThan(Integer value) {
            addCriterion("TEXT_POSITION <", value, "textPosition");
            return (Criteria) this;
        }

        public Criteria andTextPositionLessThanOrEqualTo(Integer value) {
            addCriterion("TEXT_POSITION <=", value, "textPosition");
            return (Criteria) this;
        }

        public Criteria andTextPositionIn(List<Integer> values) {
            addCriterion("TEXT_POSITION in", values, "textPosition");
            return (Criteria) this;
        }

        public Criteria andTextPositionNotIn(List<Integer> values) {
            addCriterion("TEXT_POSITION not in", values, "textPosition");
            return (Criteria) this;
        }

        public Criteria andTextPositionBetween(Integer value1, Integer value2) {
            addCriterion("TEXT_POSITION between", value1, value2, "textPosition");
            return (Criteria) this;
        }

        public Criteria andTextPositionNotBetween(Integer value1, Integer value2) {
            addCriterion("TEXT_POSITION not between", value1, value2, "textPosition");
            return (Criteria) this;
        }

        public Criteria andTextPositionNameIsNull() {
            addCriterion("TEXT_POSITION_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTextPositionNameIsNotNull() {
            addCriterion("TEXT_POSITION_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTextPositionNameEqualTo(String value) {
            addCriterion("TEXT_POSITION_NAME =", value, "textPositionName");
            return (Criteria) this;
        }

        public Criteria andTextPositionNameNotEqualTo(String value) {
            addCriterion("TEXT_POSITION_NAME <>", value, "textPositionName");
            return (Criteria) this;
        }

        public Criteria andTextPositionNameGreaterThan(String value) {
            addCriterion("TEXT_POSITION_NAME >", value, "textPositionName");
            return (Criteria) this;
        }

        public Criteria andTextPositionNameGreaterThanOrEqualTo(String value) {
            addCriterion("TEXT_POSITION_NAME >=", value, "textPositionName");
            return (Criteria) this;
        }

        public Criteria andTextPositionNameLessThan(String value) {
            addCriterion("TEXT_POSITION_NAME <", value, "textPositionName");
            return (Criteria) this;
        }

        public Criteria andTextPositionNameLessThanOrEqualTo(String value) {
            addCriterion("TEXT_POSITION_NAME <=", value, "textPositionName");
            return (Criteria) this;
        }

        public Criteria andTextPositionNameLike(String value) {
            addCriterion("TEXT_POSITION_NAME like", value, "textPositionName");
            return (Criteria) this;
        }

        public Criteria andTextPositionNameNotLike(String value) {
            addCriterion("TEXT_POSITION_NAME not like", value, "textPositionName");
            return (Criteria) this;
        }

        public Criteria andTextPositionNameIn(List<String> values) {
            addCriterion("TEXT_POSITION_NAME in", values, "textPositionName");
            return (Criteria) this;
        }

        public Criteria andTextPositionNameNotIn(List<String> values) {
            addCriterion("TEXT_POSITION_NAME not in", values, "textPositionName");
            return (Criteria) this;
        }

        public Criteria andTextPositionNameBetween(String value1, String value2) {
            addCriterion("TEXT_POSITION_NAME between", value1, value2, "textPositionName");
            return (Criteria) this;
        }

        public Criteria andTextPositionNameNotBetween(String value1, String value2) {
            addCriterion("TEXT_POSITION_NAME not between", value1, value2, "textPositionName");
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