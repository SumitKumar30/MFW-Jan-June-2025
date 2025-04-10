package org.ncu.ecommerce_app.services;

import org.ncu.ecommerce_app.entities.Invoice;

public interface InvoiceService {
	public void saveInvoice(Invoice invoice);
	public Invoice getInvoiceById(int id);
}
