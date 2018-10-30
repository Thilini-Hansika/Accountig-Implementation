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
public class GroupItemDetail implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int detailId;
    private String groupName;
    private String itemName;
    private String itemDes;
    private int qty;
   
    public GroupItemDetail() {
    }

    public GroupItemDetail(String groupName, String itemName, String itemDes, int qty) {
        this.groupName = groupName;
        this.itemName = itemName;
        this.itemDes = itemDes;
        this.qty = qty;
    }

    /**
     * @return the detailId
     */
    public int getDetailId() {
        return detailId;
    }

    /**
     * @return the groupName
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * @param groupName the groupName to set
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
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
     * @return the itemDes
     */
    public String getItemDes() {
        return itemDes;
    }

    /**
     * @param itemDes the itemDes to set
     */
    public void setItemDes(String itemDes) {
        this.itemDes = itemDes;
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

  
   
   
}
