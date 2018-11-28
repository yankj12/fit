package com.yan.fitness.history.vo;

import java.io.Serializable;

public class RequestVo implements Serializable{

	// 用户id
	private String userId;
	
	// 分页，第X页
	private Integer page;
	
	// 分页，每页X条数据
	private Integer rows;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	
}
