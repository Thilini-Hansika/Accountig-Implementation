/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeon.energySystem.common.model;

/**
 *
 * @author Zeon-IT
 */
public class PaybleList {
    private String purchaise_date;
    private String purchaice_id;
    private String vendor_name;
    private String due_date;
    private String amount_total;
    private String due_amount;

    public PaybleList() {
    }

    public PaybleList(String purchaise_date, String purchaice_id, String vendor_name, String due_date, String amount_total, String due_amount) {
        this.purchaise_date = purchaise_date;
        this.purchaice_id = purchaice_id;
        this.vendor_name = vendor_name;
        this.due_date = due_date;
        this.amount_total = amount_total;
        this.due_amount = due_amount;
    }

    

    public String getPurchaise_date() {
        return purchaise_date;
    }

    public void setPurchaise_date(String purchaise_date) {
        this.purchaise_date = purchaise_date;
    }

    public String getPurchaice_id() {
        return purchaice_id;
    }

    public void setPurchaice_id(String purchaice_id) {
        this.purchaice_id = purchaice_id;
    }

    public String getVendor_name() {
        return vendor_name;
    }

    public void setVendor_name(String vendor_name) {
        this.vendor_name = vendor_name;
    }

    public String getDue_date() {
        return due_date;
    }

    public void setDue_date(String due_date) {
        this.due_date = due_date;
    }

    public String getAmount_total() {
        return amount_total;
    }

    public void setAmount_total(String amount_total) {
        this.amount_total = amount_total;
    }

    public String getDue_amount() {
        return due_amount;
    }

    public void setDue_amount(String due_amount) {
        this.due_amount = due_amount;
    }
    
    
}
