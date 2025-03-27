package org.ncu.ecommerce_app.services;

import org.ncu.ecommerce_app.entities.Invoice;
import org.ncu.ecommerce_app.entities.Order;
import org.ncu.ecommerce_app.repositories.InvoiceRepository;
import org.ncu.ecommerce_app.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvoiceServiceImpl implements InvoiceService {
	@Autowired
	private InvoiceRepository invoiceRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public void saveInvoice(Invoice invoice) {
		Integer orderId = invoice.getOrder().getOrderId();

	    if (orderId == null) {
	        throw new IllegalArgumentException("Order ID is required to attach invoice");
	    }

	    // Fetch managed (persistent) Order from DB
	    Order managedOrder = orderRepository.getOrderById(orderId);

	    if (managedOrder == null) {
	        throw new IllegalArgumentException("Order not found with ID: " + orderId);
	    }

	    // Re-assign the fetched, managed Order entity to invoice
	    invoice.setOrder(managedOrder);

	     invoiceRepository.saveInvoice(invoice);
	}

	@Override
	public Invoice getInvoiceById(int id) {
		
		return invoiceRepository.getInvoice(id);
	}

}
