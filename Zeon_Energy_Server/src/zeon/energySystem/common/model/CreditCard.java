/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeon.energySystem.common.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CreditCard implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String creditCardNumber;
    private String cardType;
    private int expireYear;
    private int expireMonth;
   

    public CreditCard() {
    }

    public CreditCard(String creditCardNumber, String cardType, int expireYear, int expireMonth) {
     
        this.creditCardNumber = creditCardNumber;
        this.cardType = cardType;
        this.expireYear = expireYear;
        this.expireMonth = expireMonth;
        
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the creditCardNumber
     */
    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    /**
     * @param creditCardNumber the creditCardNumber to set
     */
    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    /**
     * @return the cardType
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * @param cardType the cardType to set
     */
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    /**
     * @return the expireYear
     */
    public int getExpireYear() {
        return expireYear;
    }

    /**
     * @param expireYear the expireYear to set
     */
    public void setExpireYear(int expireYear) {
        this.expireYear = expireYear;
    }

    /**
     * @return the expireMonth
     */
    public int getExpireMonth() {
        return expireMonth;
    }

    /**
     * @param expireMonth the expireMonth to set
     */
    public void setExpireMonth(int expireMonth) {
        this.expireMonth = expireMonth;
    }

}