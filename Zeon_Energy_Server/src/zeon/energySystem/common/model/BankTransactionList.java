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
public class BankTransactionList {
    private String date;
    private String accounttype;
    private String payee;
    private String memo;
    private String amount;

    public BankTransactionList() {
    }

    public BankTransactionList(String date, String accounttype, String payee, String memo, String amount) {
        this.date = date;
        this.accounttype = accounttype;
        this.payee = payee;
        this.memo = memo;
        this.amount = amount;
    }
    
    

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAccounttype() {
        return accounttype;
    }

    public void setAccounttype(String accounttype) {
        this.accounttype = accounttype;
    }

    public String getPayee() {
        return payee;
    }

    public void setPayee(String payee) {
        this.payee = payee;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
    
    
    
}
