package org.ncu.ecommerce_app.entities;

// Entity class - POJO

public class Product {
	private int productId;
	private String productName;
	private String productDesc;
	private boolean isAvailable;
	private double productPrice;
	
	public Product(int productID, String productName, String productDesc, boolean isAvailable, double productPrice) {
		super();
		this.productId = productID;
		this.productName = productName;
		this.productDesc = productDesc;
		this.isAvailable = isAvailable;
		this.productPrice = productPrice;
	}
	
	public Product() {}
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productID) {
		this.productId = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Product [productID=" + productId + ", productName=" + productName + ", productDesc=" + productDesc
				+ ", isAvailable=" + isAvailable + ", productPrice=" + productPrice + "]";
	}
	
}
