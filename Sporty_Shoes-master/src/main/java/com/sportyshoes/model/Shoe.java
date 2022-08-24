package com.sportyshoes.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Shoe {
	public Long getShoeid() {
		return shoeid;
	}
	public void setShoeid(Long shoeid) {
		this.shoeid = shoeid;
	}
	public String getShoeName() {
		return shoeName;
	}
	public void setShoeName(String shoeName) {
		this.shoeName = shoeName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Id
	@SequenceGenerator(name = "shoe_sequence", sequenceName = "shoe_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "shoe_sequence")
	private Long shoeid;
	private String shoeName;
	private String category;
	private Double price;
}
