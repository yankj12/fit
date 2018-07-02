package com.yan.weight.vo;

import java.io.Serializable;
import java.util.List;

import com.yan.weight.schema.Weight;

public class ResponseVo implements Serializable{

	private static final long serialVersionUID = 1L;
	private boolean success;
	private String errorMsg;
	
	private Weight weight;
	
	private List<Weight> weights;
	
	private int total;
	
	private int pageNo;
	
	private int pageSize;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Weight getWeight() {
		return weight;
	}

	public void setWeight(Weight weight) {
		this.weight = weight;
	}

	public List<Weight> getWeights() {
		return weights;
	}

	public void setWeights(List<Weight> weights) {
		this.weights = weights;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
}
