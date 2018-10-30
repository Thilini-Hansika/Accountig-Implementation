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
public class Journal implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int journalId;
    private String companyJornalId;
    private String date;
    private int accountNo;
    private double debit;
    private double credit;
    private String memo;

    public Journal() {
    }

    public Journal(String companyJornalId,String date, int accountNo, double debit, double credit, String memo) {
        this.companyJornalId = companyJornalId;
        this.date = date;
        this.accountNo = accountNo;
        this.debit = debit;
        this.credit = credit;
        this.memo = memo;
    }

    public int getJournalId() {
        return journalId;
    }

    public void setJournalId(int journalId) {
        this.journalId = journalId;
    }

    public String getCompanyJornalId() {
        return companyJornalId;
    }

    public void setCompanyJornalId(String companyJornalId) {
        this.companyJornalId = companyJornalId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    
    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
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

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

  

    

}
