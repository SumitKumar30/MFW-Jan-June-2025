package org.ncu.ecommerce_app.jpadata;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerProfileServiceImpl {
	@Autowired
	CustomerProfileRepository customerProfileRepository;
	
	public void addCustomerDetails(CustomerProfile customerProfile) {
		customerProfileRepository.save(customerProfile);
	}
	public Optional<CustomerProfile> findCustomerById(Long id) {
		Optional<CustomerProfile> profileOptional =  customerProfileRepository.findById(id);
		return profileOptional;
	}
	
	public void deleteCustomerById(Long id) {
		customerProfileRepository.deleteById(id);
	}
}
