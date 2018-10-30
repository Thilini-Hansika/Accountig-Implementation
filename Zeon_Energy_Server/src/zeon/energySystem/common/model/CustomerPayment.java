/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeon.energySystem.common.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class CustomerPayment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PAYMENT_METHOD_ID")
    private int paymentMethodId;
    private long accountNumber;
    private String paymentType;
    private int creditLimit;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CREDIT_CARD_ID")
    private CreditCard creditCard;

    public CustomerPayment() {
    }

    public CustomerPayment(long accountNumber, String paymentType, int creditLimit, CreditCard creditCard) {
        this.accountNumber = accountNumber;
        this.paymentType = paymentType;
        this.creditLimit = creditLimit;
        this.creditCard = creditCard;
    }

    /**
     * @return the paymentMethodId
     */
    public int getPaymentMethodId() {
        return paymentMethodId;
    }

    /**
     * @param paymentMethodId the paymentMethodId to set
     */
    public void setPaymentMethodId(int paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    /**
     * @return the accountNumber
     */
    public long getAccountNumber() {
        return accountNumber;
    }

    /**
     * @param accountNumber the accountNumber to set
     */
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * @return the paymentType
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * @param paymentType the paymentType to set
     */
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * @return the creditLimit
     */
    public int getCreditLimit() {
        return creditLimit;
    }

    /**
     * @param creditLimit the creditLimit to set
     */
    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    /**
     * @return the creditCard
     */
    public CreditCard getCreditCard() {
        return creditCard;
    }

    /**
     * @param creditCard the creditCard to set
     */
    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }
    


    
    
}
