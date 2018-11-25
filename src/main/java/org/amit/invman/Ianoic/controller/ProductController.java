package org.amit.invman.Ianoic.controller;

import org.amit.invman.Ianoic.model.ReturnMessage;
import org.amit.invman.Ianoic.model.prd.ItemListMaster;
import org.amit.invman.Ianoic.model.prd.ProductMaster;
import org.amit.invman.Ianoic.service.IproductManagment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/managment")
public class ProductController {
	
	private static Logger log = LoggerFactory.getLogger(ProductController.class);
	
	@Autowired
	private IproductManagment iproductManagment;
	
	@Autowired
	private ReturnMessage returnMessage;

//add new product to list...	
	@PostMapping("/addproduct")
	public ReturnMessage productAddition(@RequestBody ProductMaster productMaster){
		
		if(iproductManagment.addNewProduct(productMaster) == true){
			returnMessage.setRcCode(00);returnMessage.setReasonCode("00");
			returnMessage.setRsMessage("product added successfully.");
            returnMessage.setReasonMessage("success");
		}
		else
		{
			 returnMessage.setRcCode(8);returnMessage.setReasonCode("09");
	         returnMessage.setRsMessage("product addition fail!!");
	         returnMessage.setReasonMessage("not success");
		}
		return returnMessage;
	}

//add a new item to the list...
	@PostMapping("/additem")
	public ReturnMessage itemAddition(@RequestBody ItemListMaster itemListMaster){
		log.info("userInput:"+itemListMaster);
		if(iproductManagment.addNewItems(itemListMaster) == true){
			returnMessage.setRcCode(00);returnMessage.setReasonCode("00");
			returnMessage.setRsMessage("Item added successfully.");
            returnMessage.setReasonMessage("success");
		}
		else
		{
			 returnMessage.setRcCode(8);returnMessage.setReasonCode("09");
	         returnMessage.setRsMessage("product addition fail!!");
	         returnMessage.setReasonMessage("not success");
		}
		
		return returnMessage;
	}

}
