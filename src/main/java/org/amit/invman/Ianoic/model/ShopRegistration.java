package org.amit.invman.Ianoic.model;

import org.springframework.stereotype.Component;

@Component
public class ShopRegistration {
	
	private String orgId,gstinNo,country,shopName,phoneNo,email,shopDetail;

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getGstinNo() {
		return gstinNo;
	}

	public void setGstinNo(String gstinNo) {
		this.gstinNo = gstinNo;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getShopDetail() {
		return shopDetail;
	}

	public void setShopDetail(String shopDetail) {
		this.shopDetail = shopDetail;
	}
	
	

}
