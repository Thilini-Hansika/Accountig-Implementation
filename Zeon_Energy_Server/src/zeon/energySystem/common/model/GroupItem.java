/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeon.energySystem.common.model;

import java.io.Serializable;
import java.util.ArrayList;
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
public class GroupItem implements Serializable {
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int itemId;
    private String itemName;
    private String itemDescription;
    
    @OneToMany(cascade = CascadeType.ALL)
    private List<GroupItemDetail>groupDetails;

    public GroupItem() {
    }

    public GroupItem(String itemName, String itemDescription, List<GroupItemDetail> groupDetails) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.groupDetails = groupDetails;
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
     * @return the groupDetails
     */
    public List<GroupItemDetail> getGroupDetails() {
        return groupDetails;
    }

    /**
     * @param groupDetails the groupDetails to set
     */
    public void setGroupDetails(List<GroupItemDetail> groupDetails) {
        this.groupDetails = groupDetails;
    }

   
    

}
