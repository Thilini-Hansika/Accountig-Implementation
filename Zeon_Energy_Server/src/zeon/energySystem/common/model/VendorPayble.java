/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeon.energySystem.common.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author ZeonIT
 */
@Entity
public class VendorPayble implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int receiveId;
    private String receiveTypeId;
    @OneToOne(cascade = CascadeType.ALL)
    private Vendor vendor;
    private double purchaseTotal;
    private double dueAmount;
    private double paymentTotal;
    private int accountNo;
    
    
    @OneToOne(cascade = CascadeType.ALL)
    private Customer customer;

    public VendorPayble() {
    }

    public VendorPayble(String receiveTypeId, Vendor vendor,Customer customer, double purchaseTotal, double dueAmount, double paymentTotal,int accountNo) {

        this.receiveTypeId = receiveTypeId;
        this.vendor = vendor;
        this.customer = customer;
        this.purchaseTotal = purchaseTotal;
        this.dueAmount = dueAmount;
        this.paymentTotal = paymentTotal;
        this.accountNo = accountNo;
        
    }

    public VendorPayble(int receiveId, String receiveTypeId, Vendor vendor,Customer customer, double purchaseTotal, double dueAmount, double paymentTotal,int accountNo) {
        this.receiveId = receiveId;
        this.receiveTypeId = receiveTypeId;
        this.vendor = vendor;
        this.customer = customer;
        this.purchaseTotal = purchaseTotal;
        this.dueAmount = dueAmount;
        this.paymentTotal = paymentTotal;
        this.accountNo = accountNo;
       
    }
    
    

    public int getReceiveId() {
        return receiveId;
    }

    public void setReceiveId(int receiveId) {
        this.receiveId = receiveId;
    }

    public String getReceiveTypeId() {
        return receiveTypeId;
    }

    public void setReceiveTypeId(String receiveTypeId) {
        this.receiveTypeId = receiveTypeId;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    
    public double getPurchaseTotal() {
        return purchaseTotal;
    }

    public void setPurchaseTotal(double purchaseTotal) {
        this.purchaseTotal = purchaseTotal;
    }

    public double getDueAmount() {
        return dueAmount;
    }

    public void setDueAmount(double dueAmount) {
        this.dueAmount = dueAmount;
    }

    public double getPaymentTotal() {
        return paymentTotal;
    }

    public void setPaymentTotal(double paymentTotal) {
        this.paymentTotal = paymentTotal;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

   

    
}
