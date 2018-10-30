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
public class BankAccount implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int accountId;
    private String accountType;
    private String accountNo;
    private String description;
    private double openBalance;
    private Date asOf;
    private double updateBalance;

    public BankAccount() {
    }

    public BankAccount(String accountType, String accountNo, String description, double openBalance, Date asOf, double updateBalance) {
        this.accountType = accountType;
        this.accountNo = accountNo;
        this.description = description;
        this.openBalance = openBalance;
        this.asOf = asOf;
        this.updateBalance = updateBalance;
    }

    public BankAccount(int accountId, String accountType, String accountNo, String description, double openBalance, Date asOf, double updateBalance) {
        this.accountId = accountId;
        this.accountType = accountType;
        this.accountNo = accountNo;
        this.description = description;
        this.openBalance = openBalance;
        this.asOf = asOf;
        this.updateBalance = updateBalance;
    }
    

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getOpenBalance() {
        return openBalance;
    }

    public void setOpenBalance(double openBalance) {
        this.openBalance = openBalance;
    }

    public Date getAsOf() {
        return asOf;
    }

    public void setAsOf(Date asOf) {
        this.asOf = asOf;
    }

    public double getUpdateBalance() {
        return updateBalance;
    }

    public void setUpdateBalance(double updateBalance) {
        this.updateBalance = updateBalance;
    }
    
    
    
}
