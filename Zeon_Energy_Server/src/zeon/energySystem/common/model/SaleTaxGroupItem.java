/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeon.energySystem.common.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Zeon-IT
 */
@Entity
public class SaleTaxGroupItem implements Serializable {
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int itemId;
    private String itemName;
    private String itemDescription;
    
    @OneToMany(cascade = CascadeType.ALL)
    private List<TaxGroupDetail>taxGroupDetails;

    public SaleTaxGroupItem() {
    }

    public SaleTaxGroupItem(String itemName, String itemDescription, List<TaxGroupDetail> taxGroupDetails) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.taxGroupDetails = taxGroupDetails;
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
     * @return the taxGroupDetails
     */
    public List<TaxGroupDetail> getTaxGroupDetails() {
        return taxGroupDetails;
    }

    /**
     * @param taxGroupDetails the taxGroupDetails to set
     */
    public void setTaxGroupDetails(List<TaxGroupDetail> taxGroupDetails) {
        this.taxGroupDetails = taxGroupDetails;
    }



}
