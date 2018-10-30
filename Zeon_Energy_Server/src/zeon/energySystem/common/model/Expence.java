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
public class Expence implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int expenceId;
   
    private String expenceDate;
    private String expenceCompanyId;
    private String description;
    private int accountNo;
    private double totAmount;
    
    @OneToOne(cascade = CascadeType.ALL)
    private Vendor vendor;
    
    @OneToOne(cascade = CascadeType.ALL)
    private Customer customer;

    public Expence() {
    }

    public Expence(String expenceDate, String expenceCompanyId, String description, int accountNo, double totAmount, Vendor vendor, Customer customer) {
        
        this.expenceDate = expenceDate;
        this.expenceCompanyId = expenceCompanyId;
        
        this.description = description;
        this.accountNo = accountNo;
        this.totAmount = totAmount;
        this.vendor = vendor;
        this.customer = customer;
    }

    public int getExpenceId() {
        return expenceId;
    }

    public void setExpenceId(int expenceId) {
        this.expenceId = expenceId;
    }

    public String getExpenceDate() {
        return expenceDate;
    }

    public void setExpenceDate(String expenceDate) {
        this.expenceDate = expenceDate;
    }

   

    public String getExpenceCompanyId() {
        return expenceCompanyId;
    }

    public void setExpenceCompanyId(String expenceCompanyId) {
        this.expenceCompanyId = expenceCompanyId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public double getTotAmount() {
        return totAmount;
    }

    public void setTotAmount(double totAmount) {
        this.totAmount = totAmount;
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

   
    
    
}
