/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeon.energySystem.common.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author Zeon-IT
 */
@Entity
public class VendorPayment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int paymentId;
    private Date payDate;
    private String companyPurchaseId;
    private String paymentMethod;
    private String refCheck;
    private String memo;
    private double totPayment;

    @OneToOne(cascade = CascadeType.ALL)
    private Vendor vendor;
    public VendorPayment() {
    }

    public VendorPayment(Date payDate,String companyPurchaseId, String paymentMethod, String refCheck, String memo, double totPayment, Vendor vendor) {
        this.payDate = payDate;
        this.companyPurchaseId = companyPurchaseId;
        this.paymentMethod = paymentMethod;
        this.refCheck = refCheck;
        this.memo = memo;
        this.totPayment = totPayment;
        this.vendor = vendor;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public String getCompanyPurchaseId() {
        return companyPurchaseId;
    }

    public void setCompanyPurchaseId(String companyPurchaseId) {
        this.companyPurchaseId = companyPurchaseId;
    }
    

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getRefCheck() {
        return refCheck;
    }

    public void setRefCheck(String refCheck) {
        this.refCheck = refCheck;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public double getTotPayment() {
        return totPayment;
    }

    public void setTotPayment(double totPayment) {
        this.totPayment = totPayment;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    

    
    
}
