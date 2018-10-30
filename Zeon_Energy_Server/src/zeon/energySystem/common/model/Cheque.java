/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeon.energySystem.common.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author ZeonIT
 */
@Entity
public class Cheque implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int chequeId;
    private int bankAccountId;
    private String chequeNo;
    private String date;
    private String address;
    private String memo;
    
    @OneToOne(cascade = CascadeType.ALL)
    private Vendor vendor;
    @OneToOne(cascade = CascadeType.ALL)
    private Customer customer;
    @OneToOne(cascade = CascadeType.ALL)
    private Account account;

    @OneToMany(cascade = CascadeType.ALL)
    private List<ChequeDetails>chequeList;
    @OneToMany(cascade = CascadeType.ALL)
    private List<PurchaseItem> purchaseList;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Expence>expenceList;
    public Cheque() {
    }

    public Cheque(int bankAccountId, String chequeNo, String date, String address, String memo, Vendor vendor, Customer customer, Account account, List<ChequeDetails> chequeList, List<PurchaseItem> purchaseList, List<Expence> expenceList) {
       
        this.bankAccountId = bankAccountId;
        this.chequeNo = chequeNo;
        this.date = date;
        this.address = address;
        this.memo = memo;
        this.vendor = vendor;
        this.customer = customer;
        this.account = account;
        this.chequeList = chequeList;
        this.purchaseList = purchaseList;
        this.expenceList = expenceList;
    }

   
    public int getChequeId() {
        return chequeId;
    }

    public void setChequeId(int chequeId) {
        this.chequeId = chequeId;
    }

    public int getBankAccountId() {
        return bankAccountId;
    }

    public void setBankAccountId(int bankAccountId) {
        this.bankAccountId = bankAccountId;
    }

    public String getChequeNo() {
        return chequeNo;
    }

    public void setChequeNo(String chequeNo) {
        this.chequeNo = chequeNo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<ChequeDetails> getChequeList() {
        return chequeList;
    }

    public void setChequeList(List<ChequeDetails> chequeList) {
        this.chequeList = chequeList;
    }

    public List<PurchaseItem> getPurchaseList() {
        return purchaseList;
    }

    public void setPurchaseList(List<PurchaseItem> purchaseList) {
        this.purchaseList = purchaseList;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public List<Expence> getExpenceList() {
        return expenceList;
    }

    public void setExpenceList(List<Expence> expenceList) {
        this.expenceList = expenceList;
    }

   
    
    
}
