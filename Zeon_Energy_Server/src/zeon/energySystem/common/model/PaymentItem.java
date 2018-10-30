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
 * @author Zeon-IT
 */
@Entity
public class PaymentItem implements Serializable {
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int itemId;
   
    private String itemName;
    private String itemDescription;
    private String paymentMethod;
    private String savingType;

    public PaymentItem() {
    }

    public PaymentItem(String itemName, String itemDescription, String paymentMethod, String savingType) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.paymentMethod = paymentMethod;
        this.savingType = savingType;
    }

    /**
     * @return the itemId
     */
    public int getItemId() {
        return itemId;
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

    /**
     * @return the itemDescription
     */
    public String getItemDescription() {
        return itemDescription;
    }

    /**
     * @param itemDescription the itemDescription to set
     */
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    /**
     * @return the paymentMethod
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * @param paymentMethod the paymentMethod to set
     */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * @return the savingType
     */
    public String getSavingType() {
        return savingType;
    }

    /**
     * @param savingType the savingType to set
     */
    public void setSavingType(String savingType) {
        this.savingType = savingType;
    }
    
    
}
