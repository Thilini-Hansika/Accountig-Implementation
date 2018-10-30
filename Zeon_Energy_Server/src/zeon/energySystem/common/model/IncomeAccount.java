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
public class IncomeAccount implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int incomeId;
    private String date;
    private int incomeAccNo;
    private double debit;
    private double credit;
    

    public IncomeAccount() {
    }

    public IncomeAccount(String date, int incomeAccNo, double debit, double credit) {
        this.date = date;
        this.incomeAccNo = incomeAccNo;
        this.debit = debit;
        this.credit = credit;
    }

    public int getIncomeId() {
        return incomeId;
    }

    public void setIncomeId(int incomeId) {
        this.incomeId = incomeId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getIncomeAccNo() {
        return incomeAccNo;
    }

    public void setIncomeAccNo(int incomeAccNo) {
        this.incomeAccNo = incomeAccNo;
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

    
    
}
