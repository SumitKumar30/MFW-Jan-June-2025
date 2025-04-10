package org.ncu.ecommerce_app.entities;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

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
	
	@OneToOne(mappedBy = "order")
	private Invoice invoice;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)	// since its a uni-directional relationship
	@JoinColumn(name = "order_id")  // Adds FK in product table
	private List<SmartProducts> productList;
	
	public Order() {}
	
	public Order(int productId, String customerName, double quantity, double totalPrice, LocalDate orderDate, List<SmartProducts> products) {
		super();
//		this.orderId = orderId;
		this.productId = productId;
		this.customerName = customerName;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
		this.orderDate = orderDate;
		this.productList = products;
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
	
	
	public List<SmartProducts> getProductList() {
		return productList;
	}

	public void setProductList(List<SmartProducts> productList) {
		this.productList = productList;
	}

	@Override
	public String toString() {
		return "Order [productId=" + productId + ", customerName=" + customerName
				+ ", quantity=" + quantity + ", totalPrice=" + totalPrice + ", orderDate=" + orderDate + "]";
	}
	
	
}
