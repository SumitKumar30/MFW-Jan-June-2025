package org.ncu.ecommerce_app.services;

import org.ncu.ecommerce_app.entities.Review;

public interface ReviewService {
	public void addReview(Review review);
	public Review getReview(int id);
}
