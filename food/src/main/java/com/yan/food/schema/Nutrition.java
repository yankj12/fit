package com.yan.food.schema;

import java.io.Serializable;
import java.util.Date;

public class Nutrition implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer id;
	
	/**
	 * 食物名称
	 */
	private String foodName;
	
	/**
	 * 食物id
	 */
	private Integer foodId;
	
	/**
	 * 营养素
	 */
	private String name;
	
	/**
	 * 单位
	 */
	private String unit;

	/**
	 * 含量（每100克）
	 */
	private double content;
	
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

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public Integer getFoodId() {
		return foodId;
	}

	public void setFoodId(Integer foodId) {
		this.foodId = foodId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public double getContent() {
		return content;
	}

	public void setContent(double content) {
		this.content = content;
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
