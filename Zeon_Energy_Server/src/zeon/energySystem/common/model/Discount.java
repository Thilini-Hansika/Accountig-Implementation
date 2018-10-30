/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeon.energySystem.common.model;

import java.io.Serializable;
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
public class Discount implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int discountId;
    @OneToOne(cascade = CascadeType.ALL)
    private Customer customer;
    private String invoiceCompanyId;
    private double discountRate;

    public Discount() {
    }

    public Discount(Customer customer, String invoiceCompanyId, double discountRate) {
        this.customer = customer;
        this.invoiceCompanyId = invoiceCompanyId;
        this.discountRate = discountRate;
    }

    public int getDiscountId() {
        return discountId;
    }

    public void setDiscountId(int discountId) {
        this.discountId = discountId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getInvoiceCompanyId() {
        return invoiceCompanyId;
    }

    public void setInvoiceCompanyId(String invoiceCompanyId) {
        this.invoiceCompanyId = invoiceCompanyId;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    
    
}
