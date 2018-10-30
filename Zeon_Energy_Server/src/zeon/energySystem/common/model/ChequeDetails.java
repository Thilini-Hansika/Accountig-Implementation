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
 * @author ZeonIT
 */
@Entity
public class ChequeDetails implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int chequeDetailId;
    private int bankAccNo;
    private int accountId;
    private String cheqNo;
    private String date;
    private double amount;
    private String memo;

    public ChequeDetails() {
    }

    public ChequeDetails(int bankAccNo,int accountId,String cheqNo,String date, double amount, String memo) {
        this.bankAccNo = bankAccNo;
        this.accountId = accountId;
        this.cheqNo = cheqNo;
        this.date = date;
        this.amount = amount;
        this.memo = memo;
    }

    public int getBankAccNo() {
        return bankAccNo;
    }

    public void setBankAccNo(int bankAccNo) {
        this.bankAccNo = bankAccNo;
    }

    
    public int getChequeDetailId() {
        return chequeDetailId;
    }

    public void setChequeDetailId(int chequeDetailId) {
        this.chequeDetailId = chequeDetailId;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getCheqNo() {
        return cheqNo;
    }

    public void setCheqNo(String cheqNo) {
        this.cheqNo = cheqNo;
    }

    
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
    
    
}
