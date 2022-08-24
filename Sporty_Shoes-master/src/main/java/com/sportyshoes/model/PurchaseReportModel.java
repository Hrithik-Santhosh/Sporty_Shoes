package com.sportyshoes.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseReportModel {
	private String category;
	private Long userId;
	private Long shoeId;
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getShoeId() {
		return shoeId;
	}
	public void setShoeId(Long shoeId) {
		this.shoeId = shoeId;
	}
}
