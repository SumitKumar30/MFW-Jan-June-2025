package org.ncu.ecommerce_app.entities;

import java.sql.Date;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@jakarta.persistence.Table(name = "cust_order")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_id")
	private Integer orderId;
	@Column(name = "product_id", nullable = false)
	private int productId;
	@Column(name = "customer_name", nullable = false, length = 20)
	private String customerName;
	@Column(nullable = false)
	private double quantity;
	@Column(name = "total_price", nullable = false)
	private double totalPrice;
	@Column(name = "order_date", nullable = false)
	private LocalDate orderDate;
	
	public Order() {}
	
	public Order(int productId, String customerName, double quantity, double totalPrice, LocalDate orderDate) {
		super();
//		this.orderId = orderId;
		this.productId = productId;
		this.customerName = customerName;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
		this.orderDate = orderDate;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	@Override
	public String toString() {
		return "Order [productId=" + productId + ", customerName=" + customerName
				+ ", quantity=" + quantity + ", totalPrice=" + totalPrice + ", orderDate=" + orderDate + "]";
	}
	
	
}
