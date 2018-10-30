/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeon.energySystem.common.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author ZeonIT
 */
@Entity
public class PurchaseItem implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int purchaseItemId;
    private String companyPurchaseId;
    private String itemName;
    private String batchNo;
    private int qty;
    private double cost;

    public PurchaseItem() {
    }

    public PurchaseItem(String companyPurchaseId,String itemName,String batchNo, int qty, double cost) {
        this.companyPurchaseId = companyPurchaseId;
        this.itemName = itemName;
        this.batchNo = batchNo;
        
        this.qty = qty;
        this.cost = cost;
    }

    public String getCompanyPurchaseId() {
        return companyPurchaseId;
    }

    public void setCompanyPurchaseId(String companyPurchaseId) {
        this.companyPurchaseId = companyPurchaseId;
    }

    
    /**
     * @return the purchaseItemId
     */
    public int getPurchaseItemId() {
        return purchaseItemId;
    }

    /**
     * @return the itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName the itemName to set
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }


    /**
     * @return the qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(int qty) {
        this.qty = qty;
    }
    
    

    /**
     * @return the cost
     */
    public double getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(double cost) {
        this.cost = cost;
    }
    
    
    
    
    
}
