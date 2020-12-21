package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

//This class is used to create the entity of products
@Entity
public class AddProduct {

	@Id
	private int prodID;
	private String prodName;
	private String details;
	public int getProdID() {
		return prodID;
	}
	public void setProdID(int prodID) {
		this.prodID = prodID;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public AddProduct(int prodID, String prodName, String details) {
		super();
		this.prodID = prodID;
		this.prodName = prodName;
		this.details = details;
	}
	@Override
	public String toString() {
		return "AddProduct [prodID=" + prodID + ", prodName=" + prodName
				+ ", details=" + details + "]";
	}
	public AddProduct() {
		super();
		// TODO Auto-generated constructor stub
	}

}
