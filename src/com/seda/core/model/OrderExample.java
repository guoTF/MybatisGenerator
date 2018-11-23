package com.seda.core.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andSupplyIdIsNull() {
            addCriterion("supply_id is null");
            return (Criteria) this;
        }

        public Criteria andSupplyIdIsNotNull() {
            addCriterion("supply_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupplyIdEqualTo(Long value) {
            addCriterion("supply_id =", value, "supplyId");
            return (Criteria) this;
        }

        public Criteria andSupplyIdNotEqualTo(Long value) {
            addCriterion("supply_id <>", value, "supplyId");
            return (Criteria) this;
        }

        public Criteria andSupplyIdGreaterThan(Long value) {
            addCriterion("supply_id >", value, "supplyId");
            return (Criteria) this;
        }

        public Criteria andSupplyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("supply_id >=", value, "supplyId");
            return (Criteria) this;
        }

        public Criteria andSupplyIdLessThan(Long value) {
            addCriterion("supply_id <", value, "supplyId");
            return (Criteria) this;
        }

        public Criteria andSupplyIdLessThanOrEqualTo(Long value) {
            addCriterion("supply_id <=", value, "supplyId");
            return (Criteria) this;
        }

        public Criteria andSupplyIdIn(List<Long> values) {
            addCriterion("supply_id in", values, "supplyId");
            return (Criteria) this;
        }

        public Criteria andSupplyIdNotIn(List<Long> values) {
            addCriterion("supply_id not in", values, "supplyId");
            return (Criteria) this;
        }

        public Criteria andSupplyIdBetween(Long value1, Long value2) {
            addCriterion("supply_id between", value1, value2, "supplyId");
            return (Criteria) this;
        }

        public Criteria andSupplyIdNotBetween(Long value1, Long value2) {
            addCriterion("supply_id not between", value1, value2, "supplyId");
            return (Criteria) this;
        }

        public Criteria andOrdCofulNmIsNull() {
            addCriterion("ord_coful_nm is null");
            return (Criteria) this;
        }

        public Criteria andOrdCofulNmIsNotNull() {
            addCriterion("ord_coful_nm is not null");
            return (Criteria) this;
        }

        public Criteria andOrdCofulNmEqualTo(String value) {
            addCriterion("ord_coful_nm =", value, "ordCofulNm");
            return (Criteria) this;
        }

        public Criteria andOrdCofulNmNotEqualTo(String value) {
            addCriterion("ord_coful_nm <>", value, "ordCofulNm");
            return (Criteria) this;
        }

        public Criteria andOrdCofulNmGreaterThan(String value) {
            addCriterion("ord_coful_nm >", value, "ordCofulNm");
            return (Criteria) this;
        }

        public Criteria andOrdCofulNmGreaterThanOrEqualTo(String value) {
            addCriterion("ord_coful_nm >=", value, "ordCofulNm");
            return (Criteria) this;
        }

        public Criteria andOrdCofulNmLessThan(String value) {
            addCriterion("ord_coful_nm <", value, "ordCofulNm");
            return (Criteria) this;
        }

        public Criteria andOrdCofulNmLessThanOrEqualTo(String value) {
            addCriterion("ord_coful_nm <=", value, "ordCofulNm");
            return (Criteria) this;
        }

        public Criteria andOrdCofulNmLike(String value) {
            addCriterion("ord_coful_nm like", value, "ordCofulNm");
            return (Criteria) this;
        }

        public Criteria andOrdCofulNmNotLike(String value) {
            addCriterion("ord_coful_nm not like", value, "ordCofulNm");
            return (Criteria) this;
        }

        public Criteria andOrdCofulNmIn(List<String> values) {
            addCriterion("ord_coful_nm in", values, "ordCofulNm");
            return (Criteria) this;
        }

        public Criteria andOrdCofulNmNotIn(List<String> values) {
            addCriterion("ord_coful_nm not in", values, "ordCofulNm");
            return (Criteria) this;
        }

        public Criteria andOrdCofulNmBetween(String value1, String value2) {
            addCriterion("ord_coful_nm between", value1, value2, "ordCofulNm");
            return (Criteria) this;
        }

        public Criteria andOrdCofulNmNotBetween(String value1, String value2) {
            addCriterion("ord_coful_nm not between", value1, value2, "ordCofulNm");
            return (Criteria) this;
        }

        public Criteria andOrdDatIsNull() {
            addCriterion("ord_dat is null");
            return (Criteria) this;
        }

        public Criteria andOrdDatIsNotNull() {
            addCriterion("ord_dat is not null");
            return (Criteria) this;
        }

        public Criteria andOrdDatEqualTo(String value) {
            addCriterion("ord_dat =", value, "ordDat");
            return (Criteria) this;
        }

        public Criteria andOrdDatNotEqualTo(String value) {
            addCriterion("ord_dat <>", value, "ordDat");
            return (Criteria) this;
        }

        public Criteria andOrdDatGreaterThan(String value) {
            addCriterion("ord_dat >", value, "ordDat");
            return (Criteria) this;
        }

        public Criteria andOrdDatGreaterThanOrEqualTo(String value) {
            addCriterion("ord_dat >=", value, "ordDat");
            return (Criteria) this;
        }

        public Criteria andOrdDatLessThan(String value) {
            addCriterion("ord_dat <", value, "ordDat");
            return (Criteria) this;
        }

        public Criteria andOrdDatLessThanOrEqualTo(String value) {
            addCriterion("ord_dat <=", value, "ordDat");
            return (Criteria) this;
        }

        public Criteria andOrdDatLike(String value) {
            addCriterion("ord_dat like", value, "ordDat");
            return (Criteria) this;
        }

        public Criteria andOrdDatNotLike(String value) {
            addCriterion("ord_dat not like", value, "ordDat");
            return (Criteria) this;
        }

        public Criteria andOrdDatIn(List<String> values) {
            addCriterion("ord_dat in", values, "ordDat");
            return (Criteria) this;
        }

        public Criteria andOrdDatNotIn(List<String> values) {
            addCriterion("ord_dat not in", values, "ordDat");
            return (Criteria) this;
        }

        public Criteria andOrdDatBetween(String value1, String value2) {
            addCriterion("ord_dat between", value1, value2, "ordDat");
            return (Criteria) this;
        }

        public Criteria andOrdDatNotBetween(String value1, String value2) {
            addCriterion("ord_dat not between", value1, value2, "ordDat");
            return (Criteria) this;
        }

        public Criteria andOrdNoIsNull() {
            addCriterion("ord_no is null");
            return (Criteria) this;
        }

        public Criteria andOrdNoIsNotNull() {
            addCriterion("ord_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrdNoEqualTo(String value) {
            addCriterion("ord_no =", value, "ordNo");
            return (Criteria) this;
        }

        public Criteria andOrdNoNotEqualTo(String value) {
            addCriterion("ord_no <>", value, "ordNo");
            return (Criteria) this;
        }

        public Criteria andOrdNoGreaterThan(String value) {
            addCriterion("ord_no >", value, "ordNo");
            return (Criteria) this;
        }

        public Criteria andOrdNoGreaterThanOrEqualTo(String value) {
            addCriterion("ord_no >=", value, "ordNo");
            return (Criteria) this;
        }

        public Criteria andOrdNoLessThan(String value) {
            addCriterion("ord_no <", value, "ordNo");
            return (Criteria) this;
        }

        public Criteria andOrdNoLessThanOrEqualTo(String value) {
            addCriterion("ord_no <=", value, "ordNo");
            return (Criteria) this;
        }

        public Criteria andOrdNoLike(String value) {
            addCriterion("ord_no like", value, "ordNo");
            return (Criteria) this;
        }

        public Criteria andOrdNoNotLike(String value) {
            addCriterion("ord_no not like", value, "ordNo");
            return (Criteria) this;
        }

        public Criteria andOrdNoIn(List<String> values) {
            addCriterion("ord_no in", values, "ordNo");
            return (Criteria) this;
        }

        public Criteria andOrdNoNotIn(List<String> values) {
            addCriterion("ord_no not in", values, "ordNo");
            return (Criteria) this;
        }

        public Criteria andOrdNoBetween(String value1, String value2) {
            addCriterion("ord_no between", value1, value2, "ordNo");
            return (Criteria) this;
        }

        public Criteria andOrdNoNotBetween(String value1, String value2) {
            addCriterion("ord_no not between", value1, value2, "ordNo");
            return (Criteria) this;
        }

        public Criteria andTamtIsNull() {
            addCriterion("tamt is null");
            return (Criteria) this;
        }

        public Criteria andTamtIsNotNull() {
            addCriterion("tamt is not null");
            return (Criteria) this;
        }

        public Criteria andTamtEqualTo(BigDecimal value) {
            addCriterion("tamt =", value, "tamt");
            return (Criteria) this;
        }

        public Criteria andTamtNotEqualTo(BigDecimal value) {
            addCriterion("tamt <>", value, "tamt");
            return (Criteria) this;
        }

        public Criteria andTamtGreaterThan(BigDecimal value) {
            addCriterion("tamt >", value, "tamt");
            return (Criteria) this;
        }

        public Criteria andTamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tamt >=", value, "tamt");
            return (Criteria) this;
        }

        public Criteria andTamtLessThan(BigDecimal value) {
            addCriterion("tamt <", value, "tamt");
            return (Criteria) this;
        }

        public Criteria andTamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tamt <=", value, "tamt");
            return (Criteria) this;
        }

        public Criteria andTamtIn(List<BigDecimal> values) {
            addCriterion("tamt in", values, "tamt");
            return (Criteria) this;
        }

        public Criteria andTamtNotIn(List<BigDecimal> values) {
            addCriterion("tamt not in", values, "tamt");
            return (Criteria) this;
        }

        public Criteria andTamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tamt between", value1, value2, "tamt");
            return (Criteria) this;
        }

        public Criteria andTamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tamt not between", value1, value2, "tamt");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(Long value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(Long value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(Long value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(Long value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(Long value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(Long value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<Long> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<Long> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(Long value1, Long value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(Long value1, Long value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
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