/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeon.energySystem.common.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author ZeonIT
 */
@Entity
public class Transfer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int transferId;
    private Date date;
    private int fromAccNo;
    private int toAccNo;
    private double amount;
    private String memo;

    public Transfer() {
    }

    public Transfer(Date date, int fromAccNo, int toAccNo, double amount, String memo) {
        this.date = date;
        this.fromAccNo = fromAccNo;
        this.toAccNo = toAccNo;
        this.amount = amount;
        this.memo = memo;
    }

    public int getTransferId() {
        return transferId;
    }

    public void setTransferId(int transferId) {
        this.transferId = transferId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getFromAccNo() {
        return fromAccNo;
    }

    public void setFromAccNo(int fromAccNo) {
        this.fromAccNo = fromAccNo;
    }

    public int getToAccNo() {
        return toAccNo;
    }

    public void setToAccNo(int toAccNo) {
        this.toAccNo = toAccNo;
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
