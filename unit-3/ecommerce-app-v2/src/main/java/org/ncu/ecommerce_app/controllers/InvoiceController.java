package org.ncu.ecommerce_app.controllers;

import org.ncu.ecommerce_app.entities.Invoice;
import org.ncu.ecommerce_app.entities.Order;
import org.ncu.ecommerce_app.services.InvoiceService;
import org.ncu.ecommerce_app.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ecommerce-app")
public class InvoiceController {
	@Autowired
	private InvoiceService invoiceService;
	
	@PostMapping(value = "/save-invoice")
	public ResponseEntity<String> saveInvoicEntity(@RequestBody Invoice invoice){	
		invoiceService.saveInvoice(invoice);
		return ResponseEntity.ok("invoice saved successfully!!");
	}
}
