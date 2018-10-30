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
public class Account implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int accountId;
    private int uniqAccountId;
    private String accountType;
    private String accountName;
    private String accountDescription;
    private double openBalance;
    private double debit;
    private double credit;
    private Date asOfDate;

    public Account() {
    }

    public Account(int uniqAccountId, String accountType, String accountName, String accountDescription, double openBalance, double debit, double credit,Date asOfDate) {
        this.uniqAccountId = uniqAccountId;
        this.accountType = accountType;
        this.accountName = accountName;
        this.accountDescription = accountDescription;
        this.openBalance = openBalance;
        this.debit = debit;
        this.credit = credit;
        this.asOfDate = asOfDate;
    }

    public Account(int accountId, int uniqAccountId, String accountType, String accountName, String accountDescription, double openBalance, double debit, double credit,Date asOfDate) {
        this.accountId = accountId;
        this.uniqAccountId = uniqAccountId;
        this.accountType = accountType;
        this.accountName = accountName;
        this.accountDescription = accountDescription;
        this.openBalance = openBalance;
        this.debit = debit;
        this.credit = credit;
        this.asOfDate = asOfDate;
    }
    

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getUniqAccountId() {
        return uniqAccountId;
    }

    public void setUniqAccountId(int uniqAccountId) {
        this.uniqAccountId = uniqAccountId;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountDescription() {
        return accountDescription;
    }

    public void setAccountDescription(String accountDescription) {
        this.accountDescription = accountDescription;
    }

    public double getOpenBalance() {
        return openBalance;
    }

    public void setOpenBalance(double openBalance) {
        this.openBalance = openBalance;
    }

    public double getDebit() {
        return debit;
    }

    public void setDebit(double debit) {
        this.debit = debit;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public Date getAsOfDate() {
        return asOfDate;
    }

    public void setAsOfDate(Date asOfDate) {
        this.asOfDate = asOfDate;
    }

   
    
}
