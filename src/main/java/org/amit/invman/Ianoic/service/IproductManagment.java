package org.amit.invman.Ianoic.service;

import org.amit.invman.Ianoic.model.prd.ItemListMaster;
import org.amit.invman.Ianoic.model.prd.ProductMaster;
import org.springframework.stereotype.Service;

@Service
public interface IproductManagment {

	public abstract boolean addNewProduct(ProductMaster productMaster);
	public abstract boolean addNewItems(ItemListMaster itemListMaster);
	
}
