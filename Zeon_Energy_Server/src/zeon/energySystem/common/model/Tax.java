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
public class Tax implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int taxId;
    private String taxCode;
    private Double taxRate;
  

    public Tax() {
    }

    public Tax(String taxCode, Double taxRate) {
       
        this.taxCode = taxCode;
        this.taxRate = taxRate;
    }

    public Tax(int taxId, String taxCode, Double taxRate) {
        this.taxId = taxId;
        this.taxCode = taxCode;
        this.taxRate = taxRate;
    }
    

    public int getTaxId() {
        return taxId;
    }

    public void setTaxId(int taxId) {
        this.taxId = taxId;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public Double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }

   
}
