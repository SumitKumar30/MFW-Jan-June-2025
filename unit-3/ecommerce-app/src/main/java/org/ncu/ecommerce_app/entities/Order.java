package org.ncu.ecommerce_app.entities;

import java.sql.Date;

import org.hibernate.annotations.Table;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@jakarta.persistence.Table(name = "cust_order")
public class Order {
	@Id
	@Column(name = "order_id")
	private int orderId;
	@Column(name = "product_id", nullable = false)
	private int productId;
	@Column(name = "customer_name", nullable = false, length = 20)
	private String customerName;
	@Column(nullable = false, unique = true)
	private double quantity;
	@Column(name = "total_price", nullable = false)
	private double totalPrice;
	@Column(name = "order_date", nullable = false)
	private Date orderDate;
	
	public Order(int orderId, int productId, String customerName, double quantity, double totalPrice, Date orderDate) {
		super();
		this.orderId = orderId;
		this.productId = productId;
		this.customerName = customerName;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
		this.orderDate = orderDate;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
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
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", productId=" + productId + ", customerName=" + customerName
				+ ", quantity=" + quantity + ", totalPrice=" + totalPrice + ", orderDate=" + orderDate + "]";
	}
	
	
}
