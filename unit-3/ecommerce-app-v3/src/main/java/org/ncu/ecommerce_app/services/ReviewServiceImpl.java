package org.ncu.ecommerce_app.services;

import org.ncu.ecommerce_app.entities.Review;
import org.ncu.ecommerce_app.entities.SmartProducts;
import org.ncu.ecommerce_app.repositories.ReviewRepository;
import org.ncu.ecommerce_app.repositories.SmartProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewServiceImpl implements ReviewService {
	@Autowired
	private SmartProductService smartProductService;
	
	@Autowired
	private ReviewRepository reviewRepository;
	
	@Override
	public void addReview(Review review) {
		Integer productId = review.getSmartProducts().getSmartProductId();
		
		System.out.println("Product id is: "+productId);
		
		SmartProducts products =  smartProductService.getSmartProduct(productId);
		
		review.setSmartProducts(products);
		
		reviewRepository.saveReview(review);
	}

	@Override
	public Review getReview(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
