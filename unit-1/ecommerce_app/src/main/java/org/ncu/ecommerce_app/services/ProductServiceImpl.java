package org.ncu.ecommerce_app.services;

import java.util.Comparator;
import java.util.List;

import org.ncu.ecommerce_app.entities.Product;
import org.ncu.ecommerce_app.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository productRepository;
	
	// sort all products by their ids
	@Override
	public List<Product> getSoretedProducts() {
		List<Product> products = productRepository.getAllProducts();
		products.sort(Comparator.comparing(Product::getProductID));
		return products;
	}

}
