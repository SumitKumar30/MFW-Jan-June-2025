package org.ncu.ecommerce_app.repositories;

import java.util.ArrayList;
import java.util.List;

import org.ncu.ecommerce_app.entities.Product;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {
	List<Product> products = new ArrayList<Product>();
	
	public ProductRepository() {
		products.add(new Product(101, "Smart phones", "smart phones - of diff brands", true, 10000.00));
		products.add(new Product(102, "Shoes", "shoes of diff brands", false, 50000.00));
		products.add(new Product(104, "Clothes", "clothes of diff brands", true, 100000.00));
		products.add(new Product(105, "Smart watch", "smart watches - of diff brands", true, 18000.00));
		products.add(new Product(106, "Smart television", "smart tv - of diff brands", false, 5000.00));
		products.add(new Product(108, "Smart speakers", "smart speakers - of diff brands", true, 15600.00));
	}
	
	public void addProduct(Product product) {
		// write logic to add a new product object
		products.add(product);
	}
	
	public List<Product> getAllProducts(){
		return products;
	}
	
	public Product updateProduct(int id, Product product) {
		// write logic to update an existing product
		return null;
	}
	
	public String deleteProduct(int id) {
		// write the logic to delete an existing product by id
		return null;
	}
	
 }
