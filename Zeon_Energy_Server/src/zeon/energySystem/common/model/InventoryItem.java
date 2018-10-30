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
 * @author ZeonIT
 */
@Entity
public class InventoryItem implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int inventoryId;
    private String inventoryName;
    private String inventoryDes;
    private String batchNo;
    private String manuNo;
    private double costPrice;
    private int reOrderLevel;
    private int qtyOnHand;
    private double price;
    private String taxCode;
    private int costAccNo;
    private int incomeAccNo;
    private int assetAccount;
    private Date asof;
    
    public InventoryItem() {
    }

    public InventoryItem(String inventoryName, String inventoryDes,String batchNO, String manuNo, double costPrice, int reOrderLevel, int qtyOnHand, double price, String taxCode, int costAccNo, int incomeAccNo,int assetAccount, Date asof) {

        this.inventoryName = inventoryName;
        this.inventoryDes = inventoryDes;
        this.batchNo = batchNO;
        this.manuNo = manuNo;
        this.costPrice = costPrice;
        this.reOrderLevel = reOrderLevel;
        this.qtyOnHand = qtyOnHand;
        this.price = price;
        this.taxCode = taxCode;
        this.costAccNo = costAccNo;
        this.incomeAccNo = incomeAccNo;
        this.assetAccount = assetAccount;
        this.asof = asof;
    }

    public InventoryItem(int inventoryId, String inventoryName, String inventoryDes,String batchNO, String manuNo, double costPrice, int reOrderLevel, int qtyOnHand, double price, String taxCode, int costAccNo, int incomeAccNo,int assetAccount, Date asof) {
        this.inventoryId = inventoryId;
        this.inventoryName = inventoryName;
        this.inventoryDes = inventoryDes;
        this.batchNo = batchNO;
        this.manuNo = manuNo;
        this.costPrice = costPrice;
        this.reOrderLevel = reOrderLevel;
        this.qtyOnHand = qtyOnHand;
        this.price = price;
        this.taxCode = taxCode;
        this.costAccNo = costAccNo;
        this.incomeAccNo = incomeAccNo;
        this.assetAccount = assetAccount;
        this.asof = asof;
    }

    public int getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
    }

    public String getInventoryName() {
        return inventoryName;
    }

    public void setInventoryName(String inventoryName) {
        this.inventoryName = inventoryName;
    }

    public String getInventoryDes() {
        return inventoryDes;
    }

    public void setInventoryDes(String inventoryDes) {
        this.inventoryDes = inventoryDes;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    
    public String getManuNo() {
        return manuNo;
    }

    public void setManuNo(String manuNo) {
        this.manuNo = manuNo;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public int getReOrderLevel() {
        return reOrderLevel;
    }

    public void setReOrderLevel(int reOrderLevel) {
        this.reOrderLevel = reOrderLevel;
    }

    public int getQtyOnHand() {
        return qtyOnHand;
    }

    public void setQtyOnHand(int qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public int getCostAccNo() {
        return costAccNo;
    }

    public void setCostAccNo(int costAccNo) {
        this.costAccNo = costAccNo;
    }

    public int getIncomeAccNo() {
        return incomeAccNo;
    }

    public void setIncomeAccNo(int incomeAccNo) {
        this.incomeAccNo = incomeAccNo;
    }

    public int getAssetAccount() {
        return assetAccount;
    }

    public void setAssetAccount(int assetAccount) {
        this.assetAccount = assetAccount;
    }
    

    public Date getAsof() {
        return asof;
    }

    public void setAsof(Date asof) {
        this.asof = asof;
    }

    
    
}
