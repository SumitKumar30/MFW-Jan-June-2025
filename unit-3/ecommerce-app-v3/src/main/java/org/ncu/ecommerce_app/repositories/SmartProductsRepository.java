package org.ncu.ecommerce_app.repositories;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.ncu.ecommerce_app.entities.Invoice;
import org.ncu.ecommerce_app.entities.SmartProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SmartProductsRepository {
	@Autowired
	private SessionFactory sessionFactory;
	
	public SmartProducts getSmartProducts(int id) {
		try (Session session = sessionFactory.openSession()){
			return session.get(SmartProducts.class, id);
		} 
	}
}

