package org.amit.invman.Ianoic.dao;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;

import javax.sql.RowSet;

import org.amit.invman.Ianoic.config.IanoicAutoconfig;
import org.amit.invman.Ianoic.model.prd.ItemListMaster;
import org.amit.invman.Ianoic.model.prd.ItemMaster;
import org.amit.invman.Ianoic.model.prd.ProductMaster;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

@Component
public class ProductManagmentDAO {
	
	public static Logger log = LoggerFactory.getLogger(ProductManagmentDAO.class);
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public boolean addProducttToDB(ProductMaster productMaster){
		String prdadd = "insert into ProductMaster(ProductID,ProductName,ProductDesc,ProductCatagory)"+
				"values ("+"'"+productMaster.getProductId()+"'"+
			    ","+"'"+productMaster.getProductName()+"'"+
			    ","+"'"+productMaster.getProductDesc()+"'"+
			    ","+"'"+productMaster.getProductCatagory()+"'"+
			    ");";
		
		log.info("Product Add sql:"+prdadd);
		JdbcTemplate jdbcTemplate = new JdbcTemplate(new IanoicAutoconfig().dataSource());
		jdbcTemplate.execute(prdadd);
		
		return true;
	}
	
	public boolean addItemToDB(ItemListMaster itemListMaster){
		JdbcTemplate jdbcTemplate = new JdbcTemplate(new IanoicAutoconfig().dataSource());
		SimpleDateFormat simpleDateFormat =  new SimpleDateFormat("yyyy-MM-dd");
		String itemadd = "";
		int itemCount = 0;
	//Insert all product details one by one to the master tables.	
		for(ItemMaster item:itemListMaster.getItemListMaster()){
	//Check if productID is present on DB or not?
			SqlRowSet rowSet= jdbcTemplate.queryForRowSet("select count(*) from ProductMaster where productID ="
					+ item.getProductId());
			while(rowSet.next()){if(rowSet.getInt(1) == 00) return false;}
			
		//Insert items list one by one to Master database.
			itemadd ="insert into ItemMaster(ItemID,"
										+ "ItemName,"
										+ "ItemDesc,"
										+ "Manufacturer,"
										+ "UoM,"
										+ "UnitPrice,"
										+ "MinQlt,"
										+ "MaxQlt,"
										+ "TaxIndusive,"
										+ "MfgDate,"
										+ "Expdate,"
										+ "LaunchDate,"
										+ "ProductID)"+
								"values ("
										+"'"+item.getItemId()+"'"+
									 ","+"'"+item.getItemName()+"'"+
									 ","+"'"+item.getItemDesc()+"'"+
									 ","+"'"+item.getManufacture()+"'"+
									 ","+"'"+item.getUoM()+"'"+
									 ","+"'"+item.getUnitPrice()+"'"+
									 ","+"'"+item.getMinQlt()+"'"+
									 ","+"'"+item.getMaxQlt()+"'"+
									 ","+"'"+item.getTaxIndusive()+"'"+
									 ","+"'"+simpleDateFormat.format(item.getMfgDate())+"'"+
									 ","+"'"+simpleDateFormat.format(item.getExpDate())+"'"+
									 ","+"'"+simpleDateFormat.format(item.getLaunchDate())+"'"+
									 ","+"'"+item.getProductId()+"'"+
									 ");";
			jdbcTemplate.execute(itemadd);
			itemadd = "";
			itemCount++;
		}
	//check if insert counts an total item counts are match or not??
		
		if(itemListMaster.getItemCount() == itemCount)
			return true;
		else 
			return false;
	}

}
