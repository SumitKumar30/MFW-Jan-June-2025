package org.ncu.ecommerce_app.repositories;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.ncu.ecommerce_app.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {
	// inject the hibernate session factory object
	@Autowired
	private SessionFactory sessionFactory;
	
	// create order 
	public void saveOrder(Order order) {
		Transaction transaction = null;
		// session object creation ==> using try with resources to automatically close the session object
		try(Session session = sessionFactory.openSession()){
			// transaction initiated
			transaction = session.beginTransaction();
			// perform save operation
			session.persist(order);
			// commit the transaction
			transaction.commit();
		}catch(Exception e) {
			System.out.println("Exception occurred while creating a hibernate session!!!");
			// in case of exception --> rollback to original state
			transaction.rollback();
			throw e;
		}
	}
	
	public Order updateOrder(int id, Order order) {
		return null;
	}
	
	public Order deleteOrderById(int id) {
		return null;
	}
	
	public Order getOrderById(int id) {
		return null;
	}
	
	public List<Order> getAllOrders(List<Order> orders){
		return null;
	}
}
