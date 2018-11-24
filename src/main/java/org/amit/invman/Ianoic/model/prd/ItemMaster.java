package org.amit.invman.Ianoic.model.prd;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class ItemMaster {
	
	private String itemId,itemName,itemDesc, manufacture,UoM,taxIndusive,productId;
	private double unitPrice;
	private int maxQlt,minQlt;
	private Date mfgDate,expDate,launchDate;
	
	public Date getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(Date mfgDate) {
		this.mfgDate = mfgDate;
	}

	public Date getExpDate() {
		return expDate;
	}

	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}

	public Date getLaunchDate() {
		return launchDate;
	}

	public void setLaunchDate(Date launchDate) {
		this.launchDate = launchDate;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getMaxQlt() {
		return maxQlt;
	}

	public void setMaxQlt(int maxQlt) {
		this.maxQlt = maxQlt;
	}

	public int getMinQlt() {
		return minQlt;
	}

	public void setMinQlt(int minQlt) {
		this.minQlt = minQlt;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDesc() {
		return itemDesc;
	}

	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

	public String getUoM() {
		return UoM;
	}

	public void setUoM(String uoM) {
		UoM = uoM;
	}

	public String getTaxIndusive() {
		return taxIndusive;
	}

	public void setTaxIndusive(String taxIndusive) {
		this.taxIndusive = taxIndusive;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	@Override
	public String toString() {
		return "ItemMaster [itemId=" + itemId + ", itemName=" + itemName + ", itemDesc=" + itemDesc + ", manufacture="
				+ manufacture + ", UoM=" + UoM + ", taxIndusive=" + taxIndusive + ", productId=" + productId
				+ ", unitPrice=" + unitPrice + ", maxQlt=" + maxQlt + ", minQlt=" + minQlt + ", mfgDate=" + mfgDate
				+ ", expDate=" + expDate + ", launchDate=" + launchDate + "]";
	}
	

}
