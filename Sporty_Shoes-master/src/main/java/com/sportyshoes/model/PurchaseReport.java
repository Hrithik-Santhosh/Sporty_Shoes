package com.sportyshoes.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseReport {
	@Id
	@SequenceGenerator(name = "pr_sequence", sequenceName = "pr_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "pr_sequence")
	private Long pr_id;
	private Date dOP;
	private String category;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id", referencedColumnName = "userId")
	private User purchasedBy;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "shoe_id", referencedColumnName = "shoeid")
	private Shoe shoe;
	public Long getPr_id() {
		return pr_id;
	}
	public void setPr_id(Long pr_id) {
		this.pr_id = pr_id;
	}
	public Date getdOP() {
		return dOP;
	}
	public void setdOP(Date dOP) {
		this.dOP = dOP;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public User getPurchasedBy() {
		return purchasedBy;
	}
	public void setPurchasedBy(User purchasedBy) {
		this.purchasedBy = purchasedBy;
	}
	public Shoe getShoe() {
		return shoe;
	}
	public void setShoe(Shoe shoe) {
		this.shoe = shoe;
	}
}
