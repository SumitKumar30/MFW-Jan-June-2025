package org.ncu.ecommerce_app.controllers;

import java.util.List;

import org.ncu.ecommerce_app.entities.Product;
import org.ncu.ecommerce_app.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ecommerce-app")
public class ProductController {
	@Autowired 
	private ProductService productService;
	
	@GetMapping(value = "/products")
	public List<Product> fetchProducts(){
		return productService.getSoretedProducts();
	}
	
	@PostMapping(value = "/save")
	public String saveProdcut(@RequestBody Product product) {
		productService.insertProduct(product);
		return "Product saved successfully!!";
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public String deleteProduct(@PathVariable int id) {
		productService.deleteProductById(id);
		return "Product Deleted Successfully!!";
	}
}
