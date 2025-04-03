package org.ncu.ecommerce_app.repositories;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.ncu.ecommerce_app.entities.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.config.TxNamespaceHandler;

@Repository
public class InvoiceRepository {
	@Autowired
	private SessionFactory sessionFactory;
	
	public void saveInvoice(Invoice invoice) {
		Transaction transaction = null;
		// session object creation ==> using try with resources to automatically close
		// the session object
		System.out.println("DEBUG: Checking if sessionFactory is null: " + (sessionFactory == null));
		Session session = sessionFactory.openSession();
		System.out.println("DEBUG: Session Opened - " + session.isOpen()); // ✅ Check if session is actually open
		// transaction initiated
		transaction = session.beginTransaction();
		// perform save operation
		session.persist(invoice);
		System.out.println("DEBUG: Invoice Persisted: " + invoice);
		// commit the transaction
		transaction.commit();
		session.close();

	}
	
	public Invoice getInvoice(int id) {
		try (Session session = sessionFactory.openSession()){
			return session.get(Invoice.class, id);
		} 
	}
}
