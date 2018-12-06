package com.yan.food.schema;

import java.io.Serializable;
import java.util.Date;

public class Food implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer id;
	
	/**
	 *  名称
	 */
	private String name;
	
	/**
	 *  别名
	 */
	private String alias;
	
	/**
	 *  热量（每100克）  
	 */
	private double calorie;
	
	/**
	 *  热量单位
	 */
	private String calorieUnit;
	
	/**
	 *  分类
	 */
	private String category;
	
	/**
	 *  评价
	 */
	private String remark;

	/**
	 *  来源  
	 */
	private String source;
	
	/**
	 *  有效状态  
	 */
	private String validStatus;
	
	/**
	 *  插入时间  
	 */
	private Date insertTime;
	
	/**
	 *  修改时间  
	 */
	private Date updateTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public double getCalorie() {
		return calorie;
	}

	public void setCalorie(double calorie) {
		this.calorie = calorie;
	}

	public String getCalorieUnit() {
		return calorieUnit;
	}

	public void setCalorieUnit(String calorieUnit) {
		this.calorieUnit = calorieUnit;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getValidStatus() {
		return validStatus;
	}

	public void setValidStatus(String validStatus) {
		this.validStatus = validStatus;
	}

	public Date getInsertTime() {
		return insertTime;
	}

	public void setInsertTime(Date insertTime) {
		this.insertTime = insertTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
