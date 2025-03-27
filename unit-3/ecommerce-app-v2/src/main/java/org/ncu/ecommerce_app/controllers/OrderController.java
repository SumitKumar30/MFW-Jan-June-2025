package org.ncu.ecommerce_app.controllers;

import org.ncu.ecommerce_app.entities.Order;
import org.ncu.ecommerce_app.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ecommerce-app")
public class OrderController {
	@Autowired
	private OrderService orderService;
	
	@PostMapping(value = "/save-order")
	public ResponseEntity<String> insertOrderData(@RequestBody Order order){
		orderService.insertOrder(order);
		return ResponseEntity.ok("Order inserted succesfully!!!");
	}
}
