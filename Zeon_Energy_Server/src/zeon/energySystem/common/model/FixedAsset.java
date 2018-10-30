/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeon.energySystem.common.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Zeon-IT
 */
@Entity
public class FixedAsset implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int assetId;
    private String assetName;
    private String itemType;
    private String purchaseDes;
    private double cost;
    private double price;
    private int qty;
    private String assetDes;
    private String location;
    private String poNumber;
    private String serialNumber;
    private Date worrentyDate;
    private String note;
    private int accountNo;

    public FixedAsset() {
    }

    public FixedAsset(String assetName, String itemType, String purchaseDes, double cost, double price, int qty, String assetDes, String location, String poNumber, String serialNumber, Date worrentyDate, String note, int accountNo) {
        this.assetName = assetName;
        this.itemType = itemType;
        this.purchaseDes = purchaseDes;
        this.cost = cost;
        this.price = price;
        this.qty = qty;
        this.assetDes = assetDes;
        this.location = location;
        this.poNumber = poNumber;
        this.serialNumber = serialNumber;
        this.worrentyDate = worrentyDate;
        this.note = note;
        this.accountNo = accountNo;
    }

    public FixedAsset(int assetId, String assetName, String itemType, String purchaseDes, double cost, double price, int qty, String assetDes, String location, String poNumber, String serialNumber, Date worrentyDate, String note, int accountNo) {
        this.assetId = assetId;
        this.assetName = assetName;
        this.itemType = itemType;
        this.purchaseDes = purchaseDes;
        this.cost = cost;
        this.price = price;
        this.qty = qty;
        this.assetDes = assetDes;
        this.location = location;
        this.poNumber = poNumber;
        this.serialNumber = serialNumber;
        this.worrentyDate = worrentyDate;
        this.note = note;
        this.accountNo = accountNo;
    }

    public int getAssetId() {
        return assetId;
    }

    public void setAssetId(int assetId) {
        this.assetId = assetId;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getPurchaseDes() {
        return purchaseDes;
    }

    public void setPurchaseDes(String purchaseDes) {
        this.purchaseDes = purchaseDes;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAssetDes() {
        return assetDes;
    }

    public void setAssetDes(String assetDes) {
        this.assetDes = assetDes;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(String poNumber) {
        this.poNumber = poNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Date getWorrentyDate() {
        return worrentyDate;
    }

    public void setWorrentyDate(Date worrentyDate) {
        this.worrentyDate = worrentyDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

   
    
}
