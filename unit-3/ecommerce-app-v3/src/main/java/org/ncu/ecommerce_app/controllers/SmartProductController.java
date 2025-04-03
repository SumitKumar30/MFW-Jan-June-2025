package org.ncu.ecommerce_app.controllers;

import org.ncu.ecommerce_app.entities.SmartProducts;
import org.ncu.ecommerce_app.services.SmartProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ecommerce-app")
public class SmartProductController {
	@Autowired
	private SmartProductService smartProductService;
	
	@GetMapping("/smart-products/{id}")
	public ResponseEntity<SmartProducts> getSmartProduts(@PathVariable int id){
		return ResponseEntity.ok(smartProductService.getSmartProduct(id));
	}
}
