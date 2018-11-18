package org.amit.invman.Ianoic.service;

import org.amit.invman.Ianoic.model.ShopRegistration;
import org.amit.invman.Ianoic.model.UserSignInDetail;
import org.springframework.stereotype.Service;

@Service
public interface IuserRegistration {
    public abstract String isUserhasEntry(String userId);
    public abstract boolean userSignin(UserSignInDetail userSignInDetail);
    public abstract boolean shopRegistration(ShopRegistration shopRegistration);
}
