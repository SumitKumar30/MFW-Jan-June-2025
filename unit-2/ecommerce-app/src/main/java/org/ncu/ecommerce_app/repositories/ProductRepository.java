package org.ncu.ecommerce_app.repositories;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.ncu.ecommerce_app.controllers.ProductController;
import org.ncu.ecommerce_app.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {
	List<Product> products = new ArrayList<Product>();
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
//	public ProductRepository() {
//		products.add(new Product(101, "Smart phones", "smart phones - of diff brands", true, 10000.00));
//		products.add(new Product(102, "Shoes", "shoes of diff brands", false, 50000.00));
//		products.add(new Product(104, "Clothes", "clothes of diff brands", true, 100000.00));
//		products.add(new Product(105, "Smart watch", "smart watches - of diff brands", true, 18000.00));
//		products.add(new Product(106, "Smart television", "smart tv - of diff brands", false, 5000.00));
//		products.add(new Product(108, "Smart speakers", "smart speakers - of diff brands", true, 15600.00));
//	}
	
	public void addProduct(Product product) {
		// write logic to add a new product object
		//		products.add(product);
		String queryString = "insert into product values (?, ?, ?, ?, ?)";
		Object [] argsObject = {product.getProductId(), product.getProductName(), product.getProductDesc(), product.isAvailable(),product.getProductPrice()};
		jdbcTemplate.update(queryString, argsObject);
	}
	
	public List<Product> getAllProducts(){
		String queryString = "select * from product";
//		List<Product> products = jdbcTemplate.query(queryString, new ProductRowMapper());
//		List<Product> products = jdbcTemplate.query(queryString, new ProductResultSetExtractor());
		List<Product> products = jdbcTemplate.query(queryString, new BeanPropertyRowMapper<Product>(Product.class));
		return products;
	}
	
	public Product updateProduct(int id, Product product) {
		// write logic to update an existing product
		return null;
	}
	
	public boolean deleteProduct(int id) {
		boolean isDeleted = false;
		for(Product product : products) {
			if(product.getProductId() == id) {
				isDeleted = products.remove(product);
			}
		}
		return isDeleted;
	}
	
	public void batchInsertProducts(List<Product> products) {
		String queryString = "insert into product (product_id, product_name, product_desc, is_available, product_price) VALUES (?, ?, ?, ?, ?)";
		jdbcTemplate.batchUpdate(queryString, new BatchPreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				Product product = products.get(i);
				ps.setInt(1, product.getProductId());
				ps.setString(2, product.getProductName());
				ps.setString(3, product.getProductDesc());
				ps.setBoolean(4, product.isAvailable());
				ps.setDouble(5, product.getProductPrice());
			}
			
			@Override
			public int getBatchSize() {
				// TODO Auto-generated method stub
				return products.size();
			}
		});
	}
	
}
