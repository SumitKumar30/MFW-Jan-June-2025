package org.ncu.ecommerce_app.jpadata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ecommerce-app/customer")
public class CustomerController {
	@Autowired
	private CustomerProfileServiceImpl customerProfileServiceImpl;
	
	@PostMapping(value = "/save")
	public ResponseEntity<String> saveCustomerEntity(@RequestBody CustomerProfile customerProfile){
		customerProfileServiceImpl.addCustomerDetails(customerProfile);
		return ResponseEntity.ok("saved successfully!!!");
	}
	
	@GetMapping(value = "/fetchbyid/{id}")
	public ResponseEntity<?> fetchCustomerEntity(@PathVariable Long id){
		return ResponseEntity.ok(customerProfileServiceImpl.findCustomerById(id));
	}
	
	@DeleteMapping(value = "/deletebyid/{id}")
	public ResponseEntity<String> deleteCustomerById(@PathVariable Long id){
		customerProfileServiceImpl.deleteCustomerById(id);
		return ResponseEntity.ok("Customer Deleted Succesfully!!");
	}
}
