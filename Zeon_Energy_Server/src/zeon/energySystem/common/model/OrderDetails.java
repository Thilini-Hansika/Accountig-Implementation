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
import javax.persistence.ManyToOne;

/**
 *
 * @author Zeon-IT
 */
@Entity
public class OrderDetails implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int orderDId;
    private String invoiceCompanyId;
    private String itemName;
    private String batchNo;
    private double discount;
    private String tax;
    private int qty;
    private double unitPrice;
    private double costPrice;
    private double totAmount;

  
    

    public OrderDetails() {
    }

    public OrderDetails(String invoiceCompanyId, String itemName,String batchNo, double discount, String tax, int qty,double unitPrice,double costPrice,double totAmount) {
      
        this.invoiceCompanyId = invoiceCompanyId;
        this.itemName = itemName;
        this.batchNo = batchNo;
        this.discount = discount;
        this.tax = tax;
        this.qty = qty;
        this.unitPrice = unitPrice;
        this.costPrice = costPrice;
        this.totAmount = totAmount;
    }

    /**
     * @return the orderDId
     */
    public int getOrderDId() {
        return orderDId;
    }

    public void setOrderDId(int orderDId) {
        this.orderDId = orderDId;
    }
    

    /**
     * @return the invoiceCompanyId
     */
    public String getInvoiceCompanyId() {
        return invoiceCompanyId;
    }

    /**
     * @param invoiceCompanyId the invoiceCompanyId to set
     */
    public void setInvoiceCompanyId(String invoiceCompanyId) {
        this.invoiceCompanyId = invoiceCompanyId;
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
     * @return the discount
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    /**
     * @return the tax
     */
    public String getTax() {
        return tax;
    }

    /**
     * @param tax the tax to set
     */
    public void setTax(String tax) {
        this.tax = tax;
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

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public double getTotAmount() {
        return totAmount;
    }

    public void setTotAmount(double totAmount) {
        this.totAmount = totAmount;
    }

   
    

}
