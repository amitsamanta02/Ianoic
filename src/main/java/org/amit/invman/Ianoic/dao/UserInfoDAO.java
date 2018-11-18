package org.amit.invman.Ianoic.dao;


import javax.sql.DataSource;

import org.amit.invman.Ianoic.config.IanoicAutoconfig;
import org.amit.invman.Ianoic.model.ShopRegistration;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserInfoDAO{
	
	public static Logger log =  LoggerFactory.getLogger(UserInfoDAO.class);
	
	public boolean getUserInfoDAO(String shopID){	
		
		final String inqq = "select count(*) from shop_basic_info where org_id = ?";
		log.info("Sql:"+inqq);
		JdbcTemplate jdbc = new JdbcTemplate(new IanoicAutoconfig().dataSource());
		
		Integer count = (Integer) jdbc.queryForObject(inqq, new Object[] {shopID}, Integer.class);
		log.info("Counts:"+count);
		
		if(count > 00)
			return true;
		else
			return false;
	}
	
	public boolean registerShopDetailDAO(ShopRegistration shopRegistration){
		final String insertq = "insert into shop_basic_info(org_id,gstin_no,country,shop_name,contact_phonno,contact_email,shop_detail)"+
				"values ("+"'"+shopRegistration.getOrgId()+"'"+
					    ","+"'"+shopRegistration.getGstinNo()+"'"+
					    ","+"'"+shopRegistration.getCountry()+"'"+
					    ","+"'"+shopRegistration.getShopName()+"'"+
					    ","+"'"+shopRegistration.getPhoneNo()+"'"+
					    ","+"'"+shopRegistration.getEmail()+"'"+
					    ","+"'"+shopRegistration.getShopDetail()+"'"+
					    ");";
		JdbcTemplate jdbc = new JdbcTemplate(new IanoicAutoconfig().dataSource());
		log.info("Sql:"+insertq);
		jdbc.execute(insertq);
		return true;
	}
}