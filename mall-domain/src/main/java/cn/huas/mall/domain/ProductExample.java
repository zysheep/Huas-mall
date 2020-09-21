package cn.huas.mall.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andSorldIsNull() {
            addCriterion("sorld is null");
            return (Criteria) this;
        }

        public Criteria andSorldIsNotNull() {
            addCriterion("sorld is not null");
            return (Criteria) this;
        }

        public Criteria andSorldEqualTo(String value) {
            addCriterion("sorld =", value, "sorld");
            return (Criteria) this;
        }

        public Criteria andSorldNotEqualTo(String value) {
            addCriterion("sorld <>", value, "sorld");
            return (Criteria) this;
        }

        public Criteria andSorldGreaterThan(String value) {
            addCriterion("sorld >", value, "sorld");
            return (Criteria) this;
        }

        public Criteria andSorldGreaterThanOrEqualTo(String value) {
            addCriterion("sorld >=", value, "sorld");
            return (Criteria) this;
        }

        public Criteria andSorldLessThan(String value) {
            addCriterion("sorld <", value, "sorld");
            return (Criteria) this;
        }

        public Criteria andSorldLessThanOrEqualTo(String value) {
            addCriterion("sorld <=", value, "sorld");
            return (Criteria) this;
        }

        public Criteria andSorldLike(String value) {
            addCriterion("sorld like", value, "sorld");
            return (Criteria) this;
        }

        public Criteria andSorldNotLike(String value) {
            addCriterion("sorld not like", value, "sorld");
            return (Criteria) this;
        }

        public Criteria andSorldIn(List<String> values) {
            addCriterion("sorld in", values, "sorld");
            return (Criteria) this;
        }

        public Criteria andSorldNotIn(List<String> values) {
            addCriterion("sorld not in", values, "sorld");
            return (Criteria) this;
        }

        public Criteria andSorldBetween(String value1, String value2) {
            addCriterion("sorld between", value1, value2, "sorld");
            return (Criteria) this;
        }

        public Criteria andSorldNotBetween(String value1, String value2) {
            addCriterion("sorld not between", value1, value2, "sorld");
            return (Criteria) this;
        }

        public Criteria andPronameIsNull() {
            addCriterion("proName is null");
            return (Criteria) this;
        }

        public Criteria andPronameIsNotNull() {
            addCriterion("proName is not null");
            return (Criteria) this;
        }

        public Criteria andPronameEqualTo(String value) {
            addCriterion("proName =", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotEqualTo(String value) {
            addCriterion("proName <>", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameGreaterThan(String value) {
            addCriterion("proName >", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameGreaterThanOrEqualTo(String value) {
            addCriterion("proName >=", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameLessThan(String value) {
            addCriterion("proName <", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameLessThanOrEqualTo(String value) {
            addCriterion("proName <=", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameLike(String value) {
            addCriterion("proName like", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotLike(String value) {
            addCriterion("proName not like", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameIn(List<String> values) {
            addCriterion("proName in", values, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotIn(List<String> values) {
            addCriterion("proName not in", values, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameBetween(String value1, String value2) {
            addCriterion("proName between", value1, value2, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotBetween(String value1, String value2) {
            addCriterion("proName not between", value1, value2, "proname");
            return (Criteria) this;
        }

        public Criteria andSalecountIsNull() {
            addCriterion("saleCount is null");
            return (Criteria) this;
        }

        public Criteria andSalecountIsNotNull() {
            addCriterion("saleCount is not null");
            return (Criteria) this;
        }

        public Criteria andSalecountEqualTo(String value) {
            addCriterion("saleCount =", value, "salecount");
            return (Criteria) this;
        }

        public Criteria andSalecountNotEqualTo(String value) {
            addCriterion("saleCount <>", value, "salecount");
            return (Criteria) this;
        }

        public Criteria andSalecountGreaterThan(String value) {
            addCriterion("saleCount >", value, "salecount");
            return (Criteria) this;
        }

        public Criteria andSalecountGreaterThanOrEqualTo(String value) {
            addCriterion("saleCount >=", value, "salecount");
            return (Criteria) this;
        }

        public Criteria andSalecountLessThan(String value) {
            addCriterion("saleCount <", value, "salecount");
            return (Criteria) this;
        }

        public Criteria andSalecountLessThanOrEqualTo(String value) {
            addCriterion("saleCount <=", value, "salecount");
            return (Criteria) this;
        }

        public Criteria andSalecountLike(String value) {
            addCriterion("saleCount like", value, "salecount");
            return (Criteria) this;
        }

        public Criteria andSalecountNotLike(String value) {
            addCriterion("saleCount not like", value, "salecount");
            return (Criteria) this;
        }

        public Criteria andSalecountIn(List<String> values) {
            addCriterion("saleCount in", values, "salecount");
            return (Criteria) this;
        }

        public Criteria andSalecountNotIn(List<String> values) {
            addCriterion("saleCount not in", values, "salecount");
            return (Criteria) this;
        }

        public Criteria andSalecountBetween(String value1, String value2) {
            addCriterion("saleCount between", value1, value2, "salecount");
            return (Criteria) this;
        }

        public Criteria andSalecountNotBetween(String value1, String value2) {
            addCriterion("saleCount not between", value1, value2, "salecount");
            return (Criteria) this;
        }

        public Criteria andImageIsNull() {
            addCriterion("image is null");
            return (Criteria) this;
        }

        public Criteria andImageIsNotNull() {
            addCriterion("image is not null");
            return (Criteria) this;
        }

        public Criteria andImageEqualTo(String value) {
            addCriterion("image =", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotEqualTo(String value) {
            addCriterion("image <>", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThan(String value) {
            addCriterion("image >", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThanOrEqualTo(String value) {
            addCriterion("image >=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThan(String value) {
            addCriterion("image <", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThanOrEqualTo(String value) {
            addCriterion("image <=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLike(String value) {
            addCriterion("image like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotLike(String value) {
            addCriterion("image not like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageIn(List<String> values) {
            addCriterion("image in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotIn(List<String> values) {
            addCriterion("image not in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageBetween(String value1, String value2) {
            addCriterion("image between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotBetween(String value1, String value2) {
            addCriterion("image not between", value1, value2, "image");
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

        public Criteria andSalepriceIsNull() {
            addCriterion("salePrice is null");
            return (Criteria) this;
        }

        public Criteria andSalepriceIsNotNull() {
            addCriterion("salePrice is not null");
            return (Criteria) this;
        }

        public Criteria andSalepriceEqualTo(Double value) {
            addCriterion("salePrice =", value, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceNotEqualTo(Double value) {
            addCriterion("salePrice <>", value, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceGreaterThan(Double value) {
            addCriterion("salePrice >", value, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceGreaterThanOrEqualTo(Double value) {
            addCriterion("salePrice >=", value, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceLessThan(Double value) {
            addCriterion("salePrice <", value, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceLessThanOrEqualTo(Double value) {
            addCriterion("salePrice <=", value, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceIn(List<Double> values) {
            addCriterion("salePrice in", values, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceNotIn(List<Double> values) {
            addCriterion("salePrice not in", values, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceBetween(Double value1, Double value2) {
            addCriterion("salePrice between", value1, value2, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceNotBetween(Double value1, Double value2) {
            addCriterion("salePrice not between", value1, value2, "saleprice");
            return (Criteria) this;
        }

        public Criteria andDecriptIsNull() {
            addCriterion("decript is null");
            return (Criteria) this;
        }

        public Criteria andDecriptIsNotNull() {
            addCriterion("decript is not null");
            return (Criteria) this;
        }

        public Criteria andDecriptEqualTo(String value) {
            addCriterion("decript =", value, "decript");
            return (Criteria) this;
        }

        public Criteria andDecriptNotEqualTo(String value) {
            addCriterion("decript <>", value, "decript");
            return (Criteria) this;
        }

        public Criteria andDecriptGreaterThan(String value) {
            addCriterion("decript >", value, "decript");
            return (Criteria) this;
        }

        public Criteria andDecriptGreaterThanOrEqualTo(String value) {
            addCriterion("decript >=", value, "decript");
            return (Criteria) this;
        }

        public Criteria andDecriptLessThan(String value) {
            addCriterion("decript <", value, "decript");
            return (Criteria) this;
        }

        public Criteria andDecriptLessThanOrEqualTo(String value) {
            addCriterion("decript <=", value, "decript");
            return (Criteria) this;
        }

        public Criteria andDecriptLike(String value) {
            addCriterion("decript like", value, "decript");
            return (Criteria) this;
        }

        public Criteria andDecriptNotLike(String value) {
            addCriterion("decript not like", value, "decript");
            return (Criteria) this;
        }

        public Criteria andDecriptIn(List<String> values) {
            addCriterion("decript in", values, "decript");
            return (Criteria) this;
        }

        public Criteria andDecriptNotIn(List<String> values) {
            addCriterion("decript not in", values, "decript");
            return (Criteria) this;
        }

        public Criteria andDecriptBetween(String value1, String value2) {
            addCriterion("decript between", value1, value2, "decript");
            return (Criteria) this;
        }

        public Criteria andDecriptNotBetween(String value1, String value2) {
            addCriterion("decript not between", value1, value2, "decript");
            return (Criteria) this;
        }

        public Criteria andSaledateIsNull() {
            addCriterion("saleDate is null");
            return (Criteria) this;
        }

        public Criteria andSaledateIsNotNull() {
            addCriterion("saleDate is not null");
            return (Criteria) this;
        }

        public Criteria andSaledateEqualTo(Date value) {
            addCriterion("saleDate =", value, "saledate");
            return (Criteria) this;
        }

        public Criteria andSaledateNotEqualTo(Date value) {
            addCriterion("saleDate <>", value, "saledate");
            return (Criteria) this;
        }

        public Criteria andSaledateGreaterThan(Date value) {
            addCriterion("saleDate >", value, "saledate");
            return (Criteria) this;
        }

        public Criteria andSaledateGreaterThanOrEqualTo(Date value) {
            addCriterion("saleDate >=", value, "saledate");
            return (Criteria) this;
        }

        public Criteria andSaledateLessThan(Date value) {
            addCriterion("saleDate <", value, "saledate");
            return (Criteria) this;
        }

        public Criteria andSaledateLessThanOrEqualTo(Date value) {
            addCriterion("saleDate <=", value, "saledate");
            return (Criteria) this;
        }

        public Criteria andSaledateIn(List<Date> values) {
            addCriterion("saleDate in", values, "saledate");
            return (Criteria) this;
        }

        public Criteria andSaledateNotIn(List<Date> values) {
            addCriterion("saleDate not in", values, "saledate");
            return (Criteria) this;
        }

        public Criteria andSaledateBetween(Date value1, Date value2) {
            addCriterion("saleDate between", value1, value2, "saledate");
            return (Criteria) this;
        }

        public Criteria andSaledateNotBetween(Date value1, Date value2) {
            addCriterion("saleDate not between", value1, value2, "saledate");
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