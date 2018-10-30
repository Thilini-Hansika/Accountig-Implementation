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
public class CustomerReceived implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int receiveId;
    private String receiveTypeId;
    @OneToOne(cascade = CascadeType.ALL)
    private Customer customer;
    private double invoiceTotal;
    private double dueAmount;
    private double incomeTotal;
    private int accountNo;

   

    public CustomerReceived() {
    }

    public CustomerReceived(int receiveId, String receiveTypeId, Customer customer, double invoiceTotal, double dueAmount, double incomeTotal,int accountNo) {
        this.receiveId = receiveId;
        this.receiveTypeId = receiveTypeId;
        this.customer = customer;
    
        this.invoiceTotal = invoiceTotal;
        this.dueAmount = dueAmount;
        this.incomeTotal = incomeTotal;
        this.accountNo = accountNo;
    }

    
     public CustomerReceived(String receiveTypeId,  Customer customer, double invoiceTotal, double dueAmount,int accountNo) {

        this.receiveTypeId = receiveTypeId;
        this.customer = customer;
        this.invoiceTotal = invoiceTotal;
        this.dueAmount = dueAmount;
        this.accountNo = accountNo;
     
    }

    /**
     * @return the receiveId
     */
    public int getReceiveId() {
        return receiveId;
    }

    /**
     * @return the receiveTypeId
     */
    public String getReceiveTypeId() {
        return receiveTypeId;
    }

    /**
     * @param receiveTypeId the receiveTypeId to set
     */
    public void setReceiveTypeId(String receiveTypeId) {
        this.receiveTypeId = receiveTypeId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

   
  

    /**
     * @return the invoiceTotal
     */
    public double getInvoiceTotal() {
        return invoiceTotal;
    }

    /**
     * @param invoiceTotal the invoiceTotal to set
     */
    public void setInvoiceTotal(double invoiceTotal) {
        this.invoiceTotal = invoiceTotal;
    }

    /**
     * @return the dueAmount
     */
    public double getDueAmount() {
        return dueAmount;
    }

    /**
     * @param dueAmount the dueAmount to set
     */
    public void setDueAmount(double dueAmount) {
        this.dueAmount = dueAmount;
    }

    /**
     * @return the incomeTotal
     */
    public double getIncomeTotal() {
        return incomeTotal;
    }

    /**
     * @param incomeTotal the incomeTotal to set
     */
    public void setIncomeTotal(double incomeTotal) {
        this.incomeTotal = incomeTotal;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

   
  
}
