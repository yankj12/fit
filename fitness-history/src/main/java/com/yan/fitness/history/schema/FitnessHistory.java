package com.yan.fitness.history.schema;

import java.io.Serializable;
import java.util.Date;

public class FitnessHistory implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private String userId;
	
	/**
	 * 锻炼日期  yyyy/MM/dd
	 */
	private String trainingDay;
	
	/**
	 * 锻炼难度
	 */
	private String trainingLevel;
	
	/**
	 * 锻炼名称
	 */
	private String trainingName;
	
	/**
	 * 消耗卡路里
	 */
	private double calorie;
	
	/**
	 * 消耗热量单位
	 */
	private String calorieUnit;
	
	/**
	 * 主锻炼部位
	 */
	private String mainTrainingPoint;

	/**
	 * 锻炼部位
	 */
	private String trainingPoints;

	/**
	 * 有效状态
	 */
	private String validStatus;

	/**
	 * 插入时间
	 */
	private Date insertTime;
	
	/**
	 * 修改时间
	 */
	private Date updateTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTrainingDay() {
		return trainingDay;
	}

	public void setTrainingDay(String trainingDay) {
		this.trainingDay = trainingDay;
	}

	public String getTrainingLevel() {
		return trainingLevel;
	}

	public void setTrainingLevel(String trainingLevel) {
		this.trainingLevel = trainingLevel;
	}

	public String getTrainingName() {
		return trainingName;
	}

	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}

	public String getMainTrainingPoint() {
		return mainTrainingPoint;
	}

	public void setMainTrainingPoint(String mainTrainingPoint) {
		this.mainTrainingPoint = mainTrainingPoint;
	}

	public String getTrainingPoints() {
		return trainingPoints;
	}

	public void setTrainingPoints(String trainingPoints) {
		this.trainingPoints = trainingPoints;
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

}
