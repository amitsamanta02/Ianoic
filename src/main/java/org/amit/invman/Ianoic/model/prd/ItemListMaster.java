package org.amit.invman.Ianoic.model.prd;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class ItemListMaster {

	private int itemCount;
	
	private String userId;
	
	private ArrayList<ItemMaster> itemListMaster = new ArrayList<ItemMaster>();

	
	public String getUserId() {
		return userId;
	}
	@JsonProperty("userid")
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getItemCount() {
		return itemCount;
	}

    @JsonProperty("itemcount")
	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}
	    
    public ArrayList<ItemMaster> getItemListMaster() {
        return itemListMaster;
    }

    
    @JsonProperty("items")
    public void setItemListMaster(ArrayList<ItemMaster> itemListMaster) {
        this.itemListMaster = itemListMaster;
    }
    

	@Override
	public String toString() {
		return "ItemListMaster [itemCount=" + itemCount + ", itemListMaster=" + itemListMaster + "]";
	}

    
}
