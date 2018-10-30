/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeon.energySystem.common.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Zeon-IT
 */
@Entity
public class Terms implements Serializable {
    @Id
    @Column(name = "TERMS_NAME")
    private String termsName;
    private String standardNetDueDay;
    private String standardDisPercentage;
    private String standardDisPaidDay;
    private String drivenNetDueBeforDay;
    private String drivenNextMonthDueDay;
    private String drivenDisPercentage;
    private String drivenDisPaidBeforDay;

    public Terms() {
    }

    public Terms(String termsName, String standardNetDueDay, String standardDisPercentage, String standardDisPaidDay, String drivenNetDueBeforDay, String drivenNextMonthDueDay, String drivenDisPercentage, String drivenDisPaidBeforDay) {
        this.termsName = termsName;
        this.standardNetDueDay = standardNetDueDay;
        this.standardDisPercentage = standardDisPercentage;
        this.standardDisPaidDay = standardDisPaidDay;
        this.drivenNetDueBeforDay = drivenNetDueBeforDay;
        this.drivenNextMonthDueDay = drivenNextMonthDueDay;
        this.drivenDisPercentage = drivenDisPercentage;
        this.drivenDisPaidBeforDay = drivenDisPaidBeforDay;
    }


    /**
     * @return the termsName
     */
    public String getTermsName() {
        return termsName;
    }

    /**
     * @param termsName the termsName to set
     */
    public void setTermsName(String termsName) {
        this.termsName = termsName;
    }

    /**
     * @return the standardNetDueDay
     */
    public String getStandardNetDueDay() {
        return standardNetDueDay;
    }

    /**
     * @param standardNetDueDay the standardNetDueDay to set
     */
    public void setStandardNetDueDay(String standardNetDueDay) {
        this.standardNetDueDay = standardNetDueDay;
    }

    /**
     * @return the standardDisPercentage
     */
    public String getStandardDisPercentage() {
        return standardDisPercentage;
    }

    /**
     * @param standardDisPercentage the standardDisPercentage to set
     */
    public void setStandardDisPercentage(String standardDisPercentage) {
        this.standardDisPercentage = standardDisPercentage;
    }

    /**
     * @return the standardDisPaidDay
     */
    public String getStandardDisPaidDay() {
        return standardDisPaidDay;
    }

    /**
     * @param standardDisPaidDay the standardDisPaidDay to set
     */
    public void setStandardDisPaidDay(String standardDisPaidDay) {
        this.standardDisPaidDay = standardDisPaidDay;
    }

    /**
     * @return the drivenNetDueBeforDay
     */
    public String getDrivenNetDueBeforDay() {
        return drivenNetDueBeforDay;
    }

    /**
     * @param drivenNetDueBeforDay the drivenNetDueBeforDay to set
     */
    public void setDrivenNetDueBeforDay(String drivenNetDueBeforDay) {
        this.drivenNetDueBeforDay = drivenNetDueBeforDay;
    }

    /**
     * @return the drivenNextMonthDueDay
     */
    public String getDrivenNextMonthDueDay() {
        return drivenNextMonthDueDay;
    }

    /**
     * @param drivenNextMonthDueDay the drivenNextMonthDueDay to set
     */
    public void setDrivenNextMonthDueDay(String drivenNextMonthDueDay) {
        this.drivenNextMonthDueDay = drivenNextMonthDueDay;
    }

    /**
     * @return the drivenDisPercentage
     */
    public String getDrivenDisPercentage() {
        return drivenDisPercentage;
    }

    /**
     * @param drivenDisPercentage the drivenDisPercentage to set
     */
    public void setDrivenDisPercentage(String drivenDisPercentage) {
        this.drivenDisPercentage = drivenDisPercentage;
    }

    /**
     * @return the drivenDisPaidBeforDay
     */
    public String getDrivenDisPaidBeforDay() {
        return drivenDisPaidBeforDay;
    }

    /**
     * @param drivenDisPaidBeforDay the drivenDisPaidBeforDay to set
     */
    public void setDrivenDisPaidBeforDay(String drivenDisPaidBeforDay) {
        this.drivenDisPaidBeforDay = drivenDisPaidBeforDay;
    }
    
    
    
            
}
