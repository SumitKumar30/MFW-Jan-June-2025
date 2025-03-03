package org.ncu.ecommerce_app.services;

import java.util.Comparator;
import java.util.List;

import org.ncu.ecommerce_app.entities.Order;
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
		products.sort(Comparator.comparing(Product::getProductId));
		return products;
	}

	@Override
	public void insertProduct(Product product) {
		productRepository.addProduct(product);
	}

	@Override
	public void updateProductById(int id, Product product) {
		// TODO Auto-generated method stub
		productRepository.updateProductbyId(product, id);
	}

	@Override
	public void deleteProductById(int id) {
		productRepository.deleteProduct(id);
	}

	@Override
	public void batchInsert(List<Product> productList) {
		productRepository.batchInsertProducts(productList);
	}

	@Override
	public void batchUpdateById(List<Product> updatedProducts) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void batchDeleteById(List<Integer> productIds) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Product> getPaginatedProducts(int page, int size) {
		return productRepository.paginatedProductDetails(page, size);
	}


}
