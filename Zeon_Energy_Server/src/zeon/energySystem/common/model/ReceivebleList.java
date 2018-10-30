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
public class ReceivebleList {
    private String issue_date;
    private String invoice_no;
    private String customer;
    private String amount;
    private String due_date;
    private String due_amount;

    public ReceivebleList() {
    }

    public ReceivebleList(String issue_date, String invoice_no, String customer, String amount, String due_date, String due_amount) {
        this.issue_date = issue_date;
        this.invoice_no = invoice_no;
        this.customer = customer;
        this.amount = amount;
        this.due_date = due_date;
        this.due_amount = due_amount;
    }
    
    

    public String getIssue_date() {
        return issue_date;
    }

    public void setIssue_date(String issue_date) {
        this.issue_date = issue_date;
    }

    public String getInvoice_no() {
        return invoice_no;
    }

    public void setInvoice_no(String invoice_no) {
        this.invoice_no = invoice_no;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDue_date() {
        return due_date;
    }

    public void setDue_date(String due_date) {
        this.due_date = due_date;
    }

    public String getDue_amount() {
        return due_amount;
    }

    public void setDue_amount(String due_amount) {
        this.due_amount = due_amount;
    }
    
    
    
}
