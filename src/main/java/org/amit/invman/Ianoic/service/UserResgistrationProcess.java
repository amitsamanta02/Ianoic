package org.amit.invman.Ianoic.service;

import org.amit.invman.Ianoic.dao.UserInfoDAO;
import org.amit.invman.Ianoic.model.ShopRegistration;
import org.amit.invman.Ianoic.model.UserSignInDetail;
import org.springframework.stereotype.Component;

@Component
public class UserResgistrationProcess implements IuserRegistration {
	
	@Override
    public String isUserhasEntry(String shopID) {
	    UserInfoDAO userInfoDAO = new UserInfoDAO();
        boolean flag =userInfoDAO.getUserInfoDAO(shopID);
        
        if (flag == true)
        	return "success";
        else
        	return "notsuccess";
    }

    @Override
    public boolean userSignin(UserSignInDetail userSignInDetail) {
        return false;
    }

	@Override
	public boolean shopRegistration(ShopRegistration shopRegistration) {
		UserInfoDAO userInfoDAO = new UserInfoDAO();
		return userInfoDAO.registerShopDetailDAO(shopRegistration);
	}
}
