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
public class COGSAccount implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cogsId;
    private String date;
    private int cogsAccNo;
    private double debit;
    private double credit;

    public COGSAccount() {
    }

    public COGSAccount(String date, int cogsAccNo, double debit, double credit) {
        
        this.date = date;
        this.cogsAccNo = cogsAccNo;
        this.debit = debit;
        this.credit = credit;
    }

    public int getCogsId() {
        return cogsId;
    }

    public void setCogsId(int cogsId) {
        this.cogsId = cogsId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getCogsAccNo() {
        return cogsAccNo;
    }

    public void setCogsAccNo(int cogsAccNo) {
        this.cogsAccNo = cogsAccNo;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public double getDebit() {
        return debit;
    }

    public void setDebit(double debit) {
        this.debit = debit;
    }

   
    
}
