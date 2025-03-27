package org.ncu.ecommerce_app.controllers;

import java.util.List;

import org.ncu.ecommerce_app.entities.Product;
import org.ncu.ecommerce_app.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@PostMapping(value = "/save-products")
	public ResponseEntity<String> batchSaveProducts(@RequestBody List<Product> products) {
		productService.batchInsert(products);
		return ResponseEntity.ok("products added successfully!!");
	}
	
	@PutMapping(value = "/update/{id}")
	public ResponseEntity<String> updateProduct(@PathVariable int id, @RequestBody Product product){
		productService.updateProductById(id, product);
		return ResponseEntity.ok("Product updated Succcessfully!!");
	}
	
	@GetMapping(value = "/paginated-products")
	public ResponseEntity<List<Product>> fetchPaginatedProducts(@RequestParam int page, @RequestParam int size){
		List<Product> paginatedProducts =  productService.getPaginatedProducts(page, size);
		return ResponseEntity.ok(paginatedProducts);
	}
}
