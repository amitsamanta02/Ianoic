package org.amit.invman.Ianoic.service;

import org.amit.invman.Ianoic.dao.ProductManagmentDAO;
import org.amit.invman.Ianoic.model.prd.ItemListMaster;
import org.amit.invman.Ianoic.model.prd.ProductMaster;
import org.amit.invman.Ianoic.util.ConstantVar;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductManagment implements IproductManagment{
	public static Logger log = LoggerFactory.getLogger(ProductManagment.class);
	
	@Autowired
	private ProductManagmentDAO productManagmentDAO;
	
	@Override
	public boolean addNewProduct(ProductMaster productMaster) {
	//Input data validation process happen here..
		log.info("Add product data:"+productMaster);

		if(productMaster.getProductId() == null || productMaster.getProductName() == null)
			return false;
		else
			return productManagmentDAO.addProducttToDB(productMaster);
		
	}

	@Override
	public boolean addNewItems(ItemListMaster itemListMaster) {
		//Add logic to add a new item to the list of item.
		String returnval = productManagmentDAO.addItemToDB(itemListMaster);
		log.info("DB Response:"+returnval);
	//Checking insert of new item is success or not.
		if(returnval.equalsIgnoreCase("SUCCESS"))
			return true;
		else
			return false;
	}
	

}
