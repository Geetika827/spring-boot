package com.deloitte.deloitte.spring.boot.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@Table(name="products")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	   int productId;
	   String productName;
	   float price;
	   LocalDate releasedDate;
	   
	   
	   
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public LocalDate getReleasedDate() {
		return releasedDate;
	}
	public void setReleasedDate(LocalDate releasedDate) {
		this.releasedDate = releasedDate;
	}
	   
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(String productName, float price, LocalDate releasedDate) {
		super();
		this.productName = productName;
		this.price = price;
		this.releasedDate = releasedDate;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price
				+ ", releasedDate=" + releasedDate + "]";
	}
	
	
	
	
	   
	   
	   
}
