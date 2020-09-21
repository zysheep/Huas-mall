package cn.huas.mall.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andOrdernoIsNull() {
            addCriterion("orderNo is null");
            return (Criteria) this;
        }

        public Criteria andOrdernoIsNotNull() {
            addCriterion("orderNo is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernoEqualTo(String value) {
            addCriterion("orderNo =", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotEqualTo(String value) {
            addCriterion("orderNo <>", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThan(String value) {
            addCriterion("orderNo >", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThanOrEqualTo(String value) {
            addCriterion("orderNo >=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThan(String value) {
            addCriterion("orderNo <", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThanOrEqualTo(String value) {
            addCriterion("orderNo <=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLike(String value) {
            addCriterion("orderNo like", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotLike(String value) {
            addCriterion("orderNo not like", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoIn(List<String> values) {
            addCriterion("orderNo in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotIn(List<String> values) {
            addCriterion("orderNo not in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoBetween(String value1, String value2) {
            addCriterion("orderNo between", value1, value2, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotBetween(String value1, String value2) {
            addCriterion("orderNo not between", value1, value2, "orderno");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userId like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userId not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andSendnameIsNull() {
            addCriterion("sendName is null");
            return (Criteria) this;
        }

        public Criteria andSendnameIsNotNull() {
            addCriterion("sendName is not null");
            return (Criteria) this;
        }

        public Criteria andSendnameEqualTo(String value) {
            addCriterion("sendName =", value, "sendname");
            return (Criteria) this;
        }

        public Criteria andSendnameNotEqualTo(String value) {
            addCriterion("sendName <>", value, "sendname");
            return (Criteria) this;
        }

        public Criteria andSendnameGreaterThan(String value) {
            addCriterion("sendName >", value, "sendname");
            return (Criteria) this;
        }

        public Criteria andSendnameGreaterThanOrEqualTo(String value) {
            addCriterion("sendName >=", value, "sendname");
            return (Criteria) this;
        }

        public Criteria andSendnameLessThan(String value) {
            addCriterion("sendName <", value, "sendname");
            return (Criteria) this;
        }

        public Criteria andSendnameLessThanOrEqualTo(String value) {
            addCriterion("sendName <=", value, "sendname");
            return (Criteria) this;
        }

        public Criteria andSendnameLike(String value) {
            addCriterion("sendName like", value, "sendname");
            return (Criteria) this;
        }

        public Criteria andSendnameNotLike(String value) {
            addCriterion("sendName not like", value, "sendname");
            return (Criteria) this;
        }

        public Criteria andSendnameIn(List<String> values) {
            addCriterion("sendName in", values, "sendname");
            return (Criteria) this;
        }

        public Criteria andSendnameNotIn(List<String> values) {
            addCriterion("sendName not in", values, "sendname");
            return (Criteria) this;
        }

        public Criteria andSendnameBetween(String value1, String value2) {
            addCriterion("sendName between", value1, value2, "sendname");
            return (Criteria) this;
        }

        public Criteria andSendnameNotBetween(String value1, String value2) {
            addCriterion("sendName not between", value1, value2, "sendname");
            return (Criteria) this;
        }

        public Criteria andSendaddressIsNull() {
            addCriterion("sendAddress is null");
            return (Criteria) this;
        }

        public Criteria andSendaddressIsNotNull() {
            addCriterion("sendAddress is not null");
            return (Criteria) this;
        }

        public Criteria andSendaddressEqualTo(String value) {
            addCriterion("sendAddress =", value, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressNotEqualTo(String value) {
            addCriterion("sendAddress <>", value, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressGreaterThan(String value) {
            addCriterion("sendAddress >", value, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressGreaterThanOrEqualTo(String value) {
            addCriterion("sendAddress >=", value, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressLessThan(String value) {
            addCriterion("sendAddress <", value, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressLessThanOrEqualTo(String value) {
            addCriterion("sendAddress <=", value, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressLike(String value) {
            addCriterion("sendAddress like", value, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressNotLike(String value) {
            addCriterion("sendAddress not like", value, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressIn(List<String> values) {
            addCriterion("sendAddress in", values, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressNotIn(List<String> values) {
            addCriterion("sendAddress not in", values, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressBetween(String value1, String value2) {
            addCriterion("sendAddress between", value1, value2, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressNotBetween(String value1, String value2) {
            addCriterion("sendAddress not between", value1, value2, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendzipIsNull() {
            addCriterion("sendZip is null");
            return (Criteria) this;
        }

        public Criteria andSendzipIsNotNull() {
            addCriterion("sendZip is not null");
            return (Criteria) this;
        }

        public Criteria andSendzipEqualTo(String value) {
            addCriterion("sendZip =", value, "sendzip");
            return (Criteria) this;
        }

        public Criteria andSendzipNotEqualTo(String value) {
            addCriterion("sendZip <>", value, "sendzip");
            return (Criteria) this;
        }

        public Criteria andSendzipGreaterThan(String value) {
            addCriterion("sendZip >", value, "sendzip");
            return (Criteria) this;
        }

        public Criteria andSendzipGreaterThanOrEqualTo(String value) {
            addCriterion("sendZip >=", value, "sendzip");
            return (Criteria) this;
        }

        public Criteria andSendzipLessThan(String value) {
            addCriterion("sendZip <", value, "sendzip");
            return (Criteria) this;
        }

        public Criteria andSendzipLessThanOrEqualTo(String value) {
            addCriterion("sendZip <=", value, "sendzip");
            return (Criteria) this;
        }

        public Criteria andSendzipLike(String value) {
            addCriterion("sendZip like", value, "sendzip");
            return (Criteria) this;
        }

        public Criteria andSendzipNotLike(String value) {
            addCriterion("sendZip not like", value, "sendzip");
            return (Criteria) this;
        }

        public Criteria andSendzipIn(List<String> values) {
            addCriterion("sendZip in", values, "sendzip");
            return (Criteria) this;
        }

        public Criteria andSendzipNotIn(List<String> values) {
            addCriterion("sendZip not in", values, "sendzip");
            return (Criteria) this;
        }

        public Criteria andSendzipBetween(String value1, String value2) {
            addCriterion("sendZip between", value1, value2, "sendzip");
            return (Criteria) this;
        }

        public Criteria andSendzipNotBetween(String value1, String value2) {
            addCriterion("sendZip not between", value1, value2, "sendzip");
            return (Criteria) this;
        }

        public Criteria andSendtelIsNull() {
            addCriterion("sendTel is null");
            return (Criteria) this;
        }

        public Criteria andSendtelIsNotNull() {
            addCriterion("sendTel is not null");
            return (Criteria) this;
        }

        public Criteria andSendtelEqualTo(String value) {
            addCriterion("sendTel =", value, "sendtel");
            return (Criteria) this;
        }

        public Criteria andSendtelNotEqualTo(String value) {
            addCriterion("sendTel <>", value, "sendtel");
            return (Criteria) this;
        }

        public Criteria andSendtelGreaterThan(String value) {
            addCriterion("sendTel >", value, "sendtel");
            return (Criteria) this;
        }

        public Criteria andSendtelGreaterThanOrEqualTo(String value) {
            addCriterion("sendTel >=", value, "sendtel");
            return (Criteria) this;
        }

        public Criteria andSendtelLessThan(String value) {
            addCriterion("sendTel <", value, "sendtel");
            return (Criteria) this;
        }

        public Criteria andSendtelLessThanOrEqualTo(String value) {
            addCriterion("sendTel <=", value, "sendtel");
            return (Criteria) this;
        }

        public Criteria andSendtelLike(String value) {
            addCriterion("sendTel like", value, "sendtel");
            return (Criteria) this;
        }

        public Criteria andSendtelNotLike(String value) {
            addCriterion("sendTel not like", value, "sendtel");
            return (Criteria) this;
        }

        public Criteria andSendtelIn(List<String> values) {
            addCriterion("sendTel in", values, "sendtel");
            return (Criteria) this;
        }

        public Criteria andSendtelNotIn(List<String> values) {
            addCriterion("sendTel not in", values, "sendtel");
            return (Criteria) this;
        }

        public Criteria andSendtelBetween(String value1, String value2) {
            addCriterion("sendTel between", value1, value2, "sendtel");
            return (Criteria) this;
        }

        public Criteria andSendtelNotBetween(String value1, String value2) {
            addCriterion("sendTel not between", value1, value2, "sendtel");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNull() {
            addCriterion("payment is null");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNotNull() {
            addCriterion("payment is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentEqualTo(String value) {
            addCriterion("payment =", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotEqualTo(String value) {
            addCriterion("payment <>", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThan(String value) {
            addCriterion("payment >", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThanOrEqualTo(String value) {
            addCriterion("payment >=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThan(String value) {
            addCriterion("payment <", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThanOrEqualTo(String value) {
            addCriterion("payment <=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLike(String value) {
            addCriterion("payment like", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotLike(String value) {
            addCriterion("payment not like", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentIn(List<String> values) {
            addCriterion("payment in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotIn(List<String> values) {
            addCriterion("payment not in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentBetween(String value1, String value2) {
            addCriterion("payment between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotBetween(String value1, String value2) {
            addCriterion("payment not between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andMenoIsNull() {
            addCriterion("meno is null");
            return (Criteria) this;
        }

        public Criteria andMenoIsNotNull() {
            addCriterion("meno is not null");
            return (Criteria) this;
        }

        public Criteria andMenoEqualTo(String value) {
            addCriterion("meno =", value, "meno");
            return (Criteria) this;
        }

        public Criteria andMenoNotEqualTo(String value) {
            addCriterion("meno <>", value, "meno");
            return (Criteria) this;
        }

        public Criteria andMenoGreaterThan(String value) {
            addCriterion("meno >", value, "meno");
            return (Criteria) this;
        }

        public Criteria andMenoGreaterThanOrEqualTo(String value) {
            addCriterion("meno >=", value, "meno");
            return (Criteria) this;
        }

        public Criteria andMenoLessThan(String value) {
            addCriterion("meno <", value, "meno");
            return (Criteria) this;
        }

        public Criteria andMenoLessThanOrEqualTo(String value) {
            addCriterion("meno <=", value, "meno");
            return (Criteria) this;
        }

        public Criteria andMenoLike(String value) {
            addCriterion("meno like", value, "meno");
            return (Criteria) this;
        }

        public Criteria andMenoNotLike(String value) {
            addCriterion("meno not like", value, "meno");
            return (Criteria) this;
        }

        public Criteria andMenoIn(List<String> values) {
            addCriterion("meno in", values, "meno");
            return (Criteria) this;
        }

        public Criteria andMenoNotIn(List<String> values) {
            addCriterion("meno not in", values, "meno");
            return (Criteria) this;
        }

        public Criteria andMenoBetween(String value1, String value2) {
            addCriterion("meno between", value1, value2, "meno");
            return (Criteria) this;
        }

        public Criteria andMenoNotBetween(String value1, String value2) {
            addCriterion("meno not between", value1, value2, "meno");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTagIsNull() {
            addCriterion("tag is null");
            return (Criteria) this;
        }

        public Criteria andTagIsNotNull() {
            addCriterion("tag is not null");
            return (Criteria) this;
        }

        public Criteria andTagEqualTo(Integer value) {
            addCriterion("tag =", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotEqualTo(Integer value) {
            addCriterion("tag <>", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThan(Integer value) {
            addCriterion("tag >", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThanOrEqualTo(Integer value) {
            addCriterion("tag >=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThan(Integer value) {
            addCriterion("tag <", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThanOrEqualTo(Integer value) {
            addCriterion("tag <=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagIn(List<Integer> values) {
            addCriterion("tag in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotIn(List<Integer> values) {
            addCriterion("tag not in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagBetween(Integer value1, Integer value2) {
            addCriterion("tag between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotBetween(Integer value1, Integer value2) {
            addCriterion("tag not between", value1, value2, "tag");
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