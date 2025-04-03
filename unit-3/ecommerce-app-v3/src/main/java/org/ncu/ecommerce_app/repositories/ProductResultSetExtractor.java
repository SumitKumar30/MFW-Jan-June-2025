package org.ncu.ecommerce_app.repositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.ncu.ecommerce_app.entities.Product;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class ProductResultSetExtractor implements ResultSetExtractor<List<Product>> {

	@Override
	public List<Product> extractData(ResultSet rs) throws SQLException, DataAccessException {
		List<Product> products = new ArrayList<Product>();
		while(rs.next()) {
			Product tempProduct = new Product();
			tempProduct.setProductId(rs.getInt("product_id"));
			tempProduct.setProductName(rs.getString("product_name"));
			tempProduct.setProductDesc(rs.getString("product_desc"));
			tempProduct.setAvailable(rs.getBoolean("is_available"));
			tempProduct.setProductPrice(rs.getDouble("product_price"));
			products.add(tempProduct);
		}
			
		return products;
	}

}
