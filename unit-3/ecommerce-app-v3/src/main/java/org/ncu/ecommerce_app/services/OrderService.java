package org.ncu.ecommerce_app.services;

import java.util.List;

import org.ncu.ecommerce_app.entities.Order;

public interface OrderService {
	public void insertOrder(Order order);
	public Order updateOrderById(int id, Order order);
	public Order deleteOrderById(int id);
	public Order getOrderById(int id);
	public List<Order> getAllOrders(List<Order> orders);
}	
