package org.ncu.ecommerce_app.services;

import org.ncu.ecommerce_app.entities.SmartProducts;

public interface SmartProductService {
	public SmartProducts getSmartProduct(int id);
	public void saveSmartProduct(SmartProducts smartProducts);
}
