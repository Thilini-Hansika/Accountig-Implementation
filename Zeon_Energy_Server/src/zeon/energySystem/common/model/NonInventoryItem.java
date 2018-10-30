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
public class NonInventoryItem implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int itemId;
    private String itemName;
    private String itemDescription;
    private String manuFPartNumber;
    private double taxRate;
    private double price;
    private String taxCode;
    private int qty;
    private String vendorName;
    private int expenseAccNo;
    private int incomeAccNo;
    

    public NonInventoryItem() {
    }

    public NonInventoryItem(String itemName, String itemDescription, String manuFPartNumber, double taxRate, double price, String taxCode, int qty, String vendorName, int expenseAccNo, int incomeAccNo) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.manuFPartNumber = manuFPartNumber;
        this.taxRate = taxRate;
        this.price = price;
        this.taxCode = taxCode;
        this.qty = qty;
        this.vendorName = vendorName;
        this.expenseAccNo = expenseAccNo;
        this.incomeAccNo = incomeAccNo;
    }

    public NonInventoryItem(int itemId, String itemName, String itemDescription, String manuFPartNumber, double taxRate, double price, String taxCode, int qty, String vendorName, int expenseAccNo, int incomeAccNo) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.manuFPartNumber = manuFPartNumber;
        this.taxRate = taxRate;
        this.price = price;
        this.taxCode = taxCode;
        this.qty = qty;
        this.vendorName = vendorName;
        this.expenseAccNo = expenseAccNo;
        this.incomeAccNo = incomeAccNo;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getManuFPartNumber() {
        return manuFPartNumber;
    }

    public void setManuFPartNumber(String manuFPartNumber) {
        this.manuFPartNumber = manuFPartNumber;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
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

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public int getExpenseAccNo() {
        return expenseAccNo;
    }

    public void setExpenseAccNo(int expenseAccNo) {
        this.expenseAccNo = expenseAccNo;
    }

    public int getIncomeAccNo() {
        return incomeAccNo;
    }

    public void setIncomeAccNo(int incomeAccNo) {
        this.incomeAccNo = incomeAccNo;
    }

   

}
