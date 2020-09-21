package cn.huas.mall.domain;

import java.util.ArrayList;
import java.util.List;

public class OrderDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderDetailsExample() {
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

        public Criteria andDetailsidIsNull() {
            addCriterion("detailsId is null");
            return (Criteria) this;
        }

        public Criteria andDetailsidIsNotNull() {
            addCriterion("detailsId is not null");
            return (Criteria) this;
        }

        public Criteria andDetailsidEqualTo(String value) {
            addCriterion("detailsId =", value, "detailsid");
            return (Criteria) this;
        }

        public Criteria andDetailsidNotEqualTo(String value) {
            addCriterion("detailsId <>", value, "detailsid");
            return (Criteria) this;
        }

        public Criteria andDetailsidGreaterThan(String value) {
            addCriterion("detailsId >", value, "detailsid");
            return (Criteria) this;
        }

        public Criteria andDetailsidGreaterThanOrEqualTo(String value) {
            addCriterion("detailsId >=", value, "detailsid");
            return (Criteria) this;
        }

        public Criteria andDetailsidLessThan(String value) {
            addCriterion("detailsId <", value, "detailsid");
            return (Criteria) this;
        }

        public Criteria andDetailsidLessThanOrEqualTo(String value) {
            addCriterion("detailsId <=", value, "detailsid");
            return (Criteria) this;
        }

        public Criteria andDetailsidLike(String value) {
            addCriterion("detailsId like", value, "detailsid");
            return (Criteria) this;
        }

        public Criteria andDetailsidNotLike(String value) {
            addCriterion("detailsId not like", value, "detailsid");
            return (Criteria) this;
        }

        public Criteria andDetailsidIn(List<String> values) {
            addCriterion("detailsId in", values, "detailsid");
            return (Criteria) this;
        }

        public Criteria andDetailsidNotIn(List<String> values) {
            addCriterion("detailsId not in", values, "detailsid");
            return (Criteria) this;
        }

        public Criteria andDetailsidBetween(String value1, String value2) {
            addCriterion("detailsId between", value1, value2, "detailsid");
            return (Criteria) this;
        }

        public Criteria andDetailsidNotBetween(String value1, String value2) {
            addCriterion("detailsId not between", value1, value2, "detailsid");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNull() {
            addCriterion("orderId is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(String value) {
            addCriterion("orderId =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(String value) {
            addCriterion("orderId <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(String value) {
            addCriterion("orderId >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("orderId >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(String value) {
            addCriterion("orderId <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(String value) {
            addCriterion("orderId <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLike(String value) {
            addCriterion("orderId like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotLike(String value) {
            addCriterion("orderId not like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<String> values) {
            addCriterion("orderId in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<String> values) {
            addCriterion("orderId not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(String value1, String value2) {
            addCriterion("orderId between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(String value1, String value2) {
            addCriterion("orderId not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andProldIsNull() {
            addCriterion("prold is null");
            return (Criteria) this;
        }

        public Criteria andProldIsNotNull() {
            addCriterion("prold is not null");
            return (Criteria) this;
        }

        public Criteria andProldEqualTo(String value) {
            addCriterion("prold =", value, "prold");
            return (Criteria) this;
        }

        public Criteria andProldNotEqualTo(String value) {
            addCriterion("prold <>", value, "prold");
            return (Criteria) this;
        }

        public Criteria andProldGreaterThan(String value) {
            addCriterion("prold >", value, "prold");
            return (Criteria) this;
        }

        public Criteria andProldGreaterThanOrEqualTo(String value) {
            addCriterion("prold >=", value, "prold");
            return (Criteria) this;
        }

        public Criteria andProldLessThan(String value) {
            addCriterion("prold <", value, "prold");
            return (Criteria) this;
        }

        public Criteria andProldLessThanOrEqualTo(String value) {
            addCriterion("prold <=", value, "prold");
            return (Criteria) this;
        }

        public Criteria andProldLike(String value) {
            addCriterion("prold like", value, "prold");
            return (Criteria) this;
        }

        public Criteria andProldNotLike(String value) {
            addCriterion("prold not like", value, "prold");
            return (Criteria) this;
        }

        public Criteria andProldIn(List<String> values) {
            addCriterion("prold in", values, "prold");
            return (Criteria) this;
        }

        public Criteria andProldNotIn(List<String> values) {
            addCriterion("prold not in", values, "prold");
            return (Criteria) this;
        }

        public Criteria andProldBetween(String value1, String value2) {
            addCriterion("prold between", value1, value2, "prold");
            return (Criteria) this;
        }

        public Criteria andProldNotBetween(String value1, String value2) {
            addCriterion("prold not between", value1, value2, "prold");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andCountIsNull() {
            addCriterion("count is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("count is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(Integer value) {
            addCriterion("count =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(Integer value) {
            addCriterion("count <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(Integer value) {
            addCriterion("count >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("count >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(Integer value) {
            addCriterion("count <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(Integer value) {
            addCriterion("count <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<Integer> values) {
            addCriterion("count in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<Integer> values) {
            addCriterion("count not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(Integer value1, Integer value2) {
            addCriterion("count between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(Integer value1, Integer value2) {
            addCriterion("count not between", value1, value2, "count");
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