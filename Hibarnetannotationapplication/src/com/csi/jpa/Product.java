package com.csi.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//welcome to csi
@Entity
public class Product {

	@Id
	@GeneratedValue

	private int id;

	private String productName;

	private double Productprice;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductprice() {
		return Productprice;
	}

	public void setProductprice(double productprice) {
		Productprice = productprice;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", Productprice=" + Productprice + "]";
	}

}
