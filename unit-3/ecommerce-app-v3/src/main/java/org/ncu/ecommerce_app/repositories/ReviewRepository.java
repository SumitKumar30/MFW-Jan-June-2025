package org.ncu.ecommerce_app.repositories;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.ncu.ecommerce_app.entities.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {
	@Autowired
	SessionFactory sessionFactory;
	
	public void saveReview(Review review) {
		Transaction transaction = null;
		// session object creation ==> using try with resources to automatically close
		// the session object
		System.out.println("DEBUG: Checking if sessionFactory is null: " + (sessionFactory == null));
		Session session = sessionFactory.openSession();
		System.out.println("DEBUG: Session Opened - " + session.isOpen()); // ✅ Check if session is actually open
		// transaction initiated
		transaction = session.beginTransaction();
		// perform save operation
		session.persist(review);
		System.out.println("DEBUG: Invoice Persisted: " + review);
		// commit the transaction
		transaction.commit();
		session.close();
	}
}
