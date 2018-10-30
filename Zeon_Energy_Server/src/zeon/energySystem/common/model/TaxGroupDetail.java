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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Zeon-IT
 */
@Entity
public class TaxGroupDetail implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int taxGroupId;
    private String taxName;
    private double taxRate;
    private String taxagency;
    private String taxDes;
    private double totalRate;
    

    public TaxGroupDetail() {
    }

    public TaxGroupDetail(String taxName, double taxRate, String taxagency, String taxDes, double totalRate) {
        this.taxName = taxName;
        this.taxRate = taxRate;
        this.taxagency = taxagency;
        this.taxDes = taxDes;
        this.totalRate = totalRate;
    }

    /**
     * @return the taxGroupId
     */
    public int getTaxGroupId() {
        return taxGroupId;
    }

    /**
     * @return the taxName
     */
    public String getTaxName() {
        return taxName;
    }

    /**
     * @param taxName the taxName to set
     */
    public void setTaxName(String taxName) {
        this.taxName = taxName;
    }

    /**
     * @return the taxRate
     */
    public double getTaxRate() {
        return taxRate;
    }

    /**
     * @param taxRate the taxRate to set
     */
    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    /**
     * @return the taxagency
     */
    public String getTaxagency() {
        return taxagency;
    }

    /**
     * @param taxagency the taxagency to set
     */
    public void setTaxagency(String taxagency) {
        this.taxagency = taxagency;
    }

    /**
     * @return the taxDes
     */
    public String getTaxDes() {
        return taxDes;
    }

    /**
     * @param taxDes the taxDes to set
     */
    public void setTaxDes(String taxDes) {
        this.taxDes = taxDes;
    }

    /**
     * @return the totalRate
     */
    public double getTotalRate() {
        return totalRate;
    }

    /**
     * @param totalRate the totalRate to set
     */
    public void setTotalRate(double totalRate) {
        this.totalRate = totalRate;
    }

    
    
}
