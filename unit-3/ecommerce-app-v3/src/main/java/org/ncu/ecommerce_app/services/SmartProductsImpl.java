package org.ncu.ecommerce_app.services;

import org.ncu.ecommerce_app.entities.SmartProducts;
import org.ncu.ecommerce_app.repositories.SmartProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SmartProductsImpl implements SmartProductService {
	@Autowired
	private SmartProductsRepository smartProductsRepository;
	
	@Override
	public SmartProducts getSmartProduct(int id) {
		// TODO Auto-generated method stub
		return smartProductsRepository.getSmartProducts(id);
	}

}
