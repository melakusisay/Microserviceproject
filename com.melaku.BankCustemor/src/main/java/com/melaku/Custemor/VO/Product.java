package com.melaku.Custemor.VO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Product")
public class Product {
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long productid;
	  private String productName;
	  private String description;
	  private long  price;
	  private String stackqty;
	  private String email;
	  
	public Product(Long productid, String productName, String description, long price, String stackqty, String email) {
		super();
		this.productid = productid;
		this.productName = productName;
		this.description = description;
		this.price = price;
		this.stackqty = stackqty;
		this.email = email;
	}
	public Long getProductid() {
		return productid;
	}
	public void setProductid(Long productid) {
		this.productid = productid;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public String getStackqty() {
		return stackqty;
	}
	public void setStackqty(String stackqty) {
		this.stackqty = stackqty;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productName=" + productName + ", description=" + description
				+ ", price=" + price + ", stackqty=" + stackqty + ", email=" + email + "]";
	}
	
  
}
