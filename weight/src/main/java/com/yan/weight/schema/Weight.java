package com.yan.weight.schema;

import java.io.Serializable;
import java.util.Date;

public class Weight implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private int id;
	
	private String userId;
	
	private Double weight;
	
	private String weightDay;
	
	private Date insertTime;
	
	private Date updateTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public String getWeightDay() {
		return weightDay;
	}

	public void setWeightDay(String weightDay) {
		this.weightDay = weightDay;
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
