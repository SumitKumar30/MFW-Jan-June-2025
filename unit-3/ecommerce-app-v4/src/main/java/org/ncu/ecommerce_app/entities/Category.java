package org.ncu.ecommerce_app.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "category")
public class Category {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;

    private String categoryName;

    @ManyToMany(mappedBy = "categories", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonBackReference
    //@JsonManagedReference
    private List<SmartProducts> smartProducts;
    
    public Category() {}

	public Category(Integer categoryId, String categoryName, List<SmartProducts> products) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.smartProducts = products;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<SmartProducts> getSmartProducts() {
		return smartProducts;
	}

	public void setSmartProducts(List<SmartProducts> products) {
		this.smartProducts = products;
	}

	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + ", products=" + smartProducts + "]";
	}
    
}
