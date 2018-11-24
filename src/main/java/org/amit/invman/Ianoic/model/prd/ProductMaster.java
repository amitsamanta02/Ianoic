package org.amit.invman.Ianoic.model.prd;

import org.springframework.stereotype.Component;

@Component
public class ProductMaster {
	private String productId,productName,productDesc,productCatagory;

	
	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public String getProductCatagory() {
		return productCatagory;
	}

	public void setProductCatagory(String productCatagory) {
		this.productCatagory = productCatagory;
	}

	@Override
	public String toString() {
		return "ProductMaster [productId=" + productId + ", productName=" + productName + ", productDesc=" + productDesc
				+ ", productCatagory=" + productCatagory + "]";
	}
	

}
