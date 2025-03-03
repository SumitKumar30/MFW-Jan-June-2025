package org.ncu.ecommerce_app.services;

import java.util.List;

import org.ncu.ecommerce_app.entities.Order;
import org.ncu.ecommerce_app.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public void insertOrder(Order order) {
		orderRepository.saveOrder(order);
	}

	@Override
	public Order updateOrderById(int id, Order order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order deleteOrderById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order getOrderById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> getAllOrders(List<Order> orders) {
		// TODO Auto-generated method stub
		return null;
	}

}
