package org.ncu.ecommerce_app.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class SmartProducts {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int smartProductId;
	private String smartProductName;
	private double smartProductPrice;
	
	@OneToMany(mappedBy = "smartProducts", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Review> reviews;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(
	        name = "product_category",
	        joinColumns = @JoinColumn(name = "product_id"),
	        inverseJoinColumns = @JoinColumn(name = "category_id")
	 )
	@JsonManagedReference
	private List<Category> categories;

	
	public SmartProducts() {}

	public SmartProducts(int smartProductId, String smartProductName, double smartProductPrice) {
		super();
		this.smartProductId = smartProductId;
		this.smartProductName = smartProductName;
		this.smartProductPrice = smartProductPrice;
	}



	public int getSmartProductId() {
		return smartProductId;
	}

	public void setSmartProductId(int smartProductId) {
		this.smartProductId = smartProductId;
	}

	public String getSmartProductName() {
		return smartProductName;
	}

	public void setSmartProductName(String smartProductName) {
		this.smartProductName = smartProductName;
	}

	public double getSmartProductPrice() {
		return smartProductPrice;
	}

	public void setSmartProductPrice(double smartProductPrice) {
		this.smartProductPrice = smartProductPrice;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
	
	
}
