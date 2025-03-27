package org.ncu.ecommerce_app.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "invoice_table")
public class Invoice {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer invoiceId;
	
	@Column(name = "billing", length = 20)
    private String billingAddress;

	@Column(unique = false)
    private LocalDate invoiceDate;

    @OneToOne
    @JoinColumn(name = "order_id")  // FK to Order
    private Order order;

    public Invoice() {}
    
	public Invoice(Integer invoiceId, String billingAddress, LocalDate invoiceDate, Order order) {
		super();
		this.invoiceId = invoiceId;
		this.billingAddress = billingAddress;
		this.invoiceDate = invoiceDate;
		this.order = order;
	}



	public Integer getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(Integer invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}

	public LocalDate getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(LocalDate invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "Invoice [invoiceId=" + invoiceId + ", billingAddress=" + billingAddress + ", invoiceDate=" + invoiceDate
				+ ", order=" + order + "]";
	}
    
    
}
