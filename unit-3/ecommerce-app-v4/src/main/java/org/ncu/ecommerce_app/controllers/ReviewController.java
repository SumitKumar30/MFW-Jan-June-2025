package org.ncu.ecommerce_app.controllers;

import org.ncu.ecommerce_app.entities.Review;
import org.ncu.ecommerce_app.services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ecommerce-app")
public class ReviewController {
	@Autowired
	private ReviewService reviewService;
	
	@PostMapping("/review/{productId}/add")
	public ResponseEntity<String> addReviewEntity(@PathVariable int productId, @RequestBody Review review){
		reviewService.addReview(review);
		return ResponseEntity.ok("Review added successfully!!");
	}
}
