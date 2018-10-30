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
public class Payment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int paymentId;
    private String payDate;
    private String invoiceCompanyId;
    private String paymentMethod;
    private String refCheck;
    private String memo;
    private double totPayment;
    
    @OneToOne(cascade = CascadeType.ALL)
    private Customer customerId;
    
    @OneToOne(cascade = CascadeType.ALL)
    private Vendor vendor;

    

    public Payment() {
    }

    public Payment(String payDate,String invoiceCompanyId,String paymentMethod, String refCheck, String memo, double totPayment,Customer customerId,Vendor vendor) {
        this.payDate = payDate;
        this.invoiceCompanyId =invoiceCompanyId;
        this.paymentMethod = paymentMethod;
        this.refCheck = refCheck;
        this.memo = memo;
        this.totPayment = totPayment;
        this.customerId = customerId;
        this.vendor = vendor;
      
    }

    public Payment(int paymentId, int custId, String paymentMethod, String refCheck, String memo, double totPayment,Customer customerId) {
        this.paymentId = paymentId;
        this.paymentMethod = paymentMethod;
        this.refCheck = refCheck;
        this.memo = memo;
        this.totPayment = totPayment;
        this.customerId = customerId;
        
    }
    
    

    /**
     * @return the paymentId
     */
    public int getPaymentId() {
        return paymentId;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
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
     * @return the refCheck
     */
    public String getRefCheck() {
        return refCheck;
    }

    /**
     * @param refCheck the refCheck to set
     */
    public void setRefCheck(String refCheck) {
        this.refCheck = refCheck;
    }

    /**
     * @return the memo
     */
    public String getMemo() {
        return memo;
    }

    /**
     * @param memo the memo to set
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * @return the totPayment
     */
    public double getTotPayment() {
        return totPayment;
    }

    /**
     * @param totPayment the totPayment to set
     */
    public void setTotPayment(double totPayment) {
        this.totPayment = totPayment;
    }

    public String getPayDate() {
        return payDate;
    }

    public void setPayDate(String payDate) {
        this.payDate = payDate;
    }

    

    public String getInvoiceCompanyId() {
        return invoiceCompanyId;
    }

    public void setInvoiceCompanyId(String invoiceCompanyId) {
        this.invoiceCompanyId = invoiceCompanyId;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    
}
