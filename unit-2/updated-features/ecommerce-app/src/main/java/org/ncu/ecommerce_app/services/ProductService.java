package org.ncu.ecommerce_app.services;

import java.util.List;

import org.ncu.ecommerce_app.entities.Product;

public interface ProductService {
	public List<Product> getSoretedProducts();
	public void insertProduct(Product product);
	public void updateProductById(int id, Product product);
	public void deleteProductById(int id);
	public void batchInsert(List<Product> productList);
	public void batchUpdateById(List<Product> updatedProducts);
	public void batchDeleteById(List<Integer> productIds);
	public List<Product> getPaginatedProducts(int page, int size);
}
