package org.ncu.ecommerce_app.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "review")
public class Review {
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer reviewId;

	    private String comment;

	    private int rating;

	    @ManyToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "smart_product_id")
	    @JsonIgnore
	    private SmartProducts smartProducts;
	    
	    public Review() {}

		public Integer getReviewId() {
			return reviewId;
		}

		public void setReviewId(Integer reviewId) {
			this.reviewId = reviewId;
		}

		public String getComment() {
			return comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public int getRating() {
			return rating;
		}

		public void setRating(int rating) {
			this.rating = rating;
		}

		public SmartProducts getSmartProducts() {
			return smartProducts;
		}

		public void setSmartProducts(SmartProducts product) {
			this.smartProducts = product;
		}
	    
	    
}
