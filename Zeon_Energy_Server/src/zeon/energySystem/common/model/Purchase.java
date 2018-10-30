/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeon.energySystem.common.model;

import java.io.Serializable;
import java.util.Date;
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
 * @author Zeon-IT
 */
@Entity
public class Purchase implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int purchaseId;
    private String companyPurchaseId;
    private Date purchaseDate;
    private String address;
    private String terms;
    private String memo;
    private String refNo;
    private Date billDue;
    private double dueAmount; 
    private Double totAmount;
    private int assetAccNo;
    
    @OneToOne(cascade = CascadeType.ALL)
    private Vendor vendor; 
    
    @OneToMany(cascade = CascadeType.ALL)
    private List<PurchaseItem>itemList;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Expence>expList;
    public Purchase() {
    }

    public Purchase(String companyPurchaseId,Date purchaseDate, String address, String terms, String memo,String refNo, Date billDue,double dueAmount, Double totAmount,int assetAccNo, Vendor vendor, List<PurchaseItem> itemList,List<Expence>expList) {
        this.purchaseDate = purchaseDate;
        this.companyPurchaseId = companyPurchaseId; 
        this.address = address;
        this.terms = terms;
        this.memo = memo;
        this.refNo = refNo;
        this.billDue = billDue;
        this.dueAmount = dueAmount;
        this.totAmount = totAmount;
        this.assetAccNo = assetAccNo;
        this.vendor = vendor;
        this.itemList = itemList;
        this.expList = expList;
        
    }

    public int getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(int purchaseId) {
        this.purchaseId = purchaseId;
    }

    public String getCompanyPurchaseId() {
        return companyPurchaseId;
    }

    public void setCompanyPurchaseId(String companyPurchaseId) {
        this.companyPurchaseId = companyPurchaseId;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTerms() {
        return terms;
    }

    public void setTerms(String terms) {
        this.terms = terms;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Date getBillDue() {
        return billDue;
    }

    public void setBillDue(Date billDue) {
        this.billDue = billDue;
    }

    public String getRefNo() {
        return refNo;
    }

    public void setRefNo(String refNo) {
        this.refNo = refNo;
    }

    public double getDueAmount() {
        return dueAmount;
    }

    public void setDueAmount(double dueAmount) {
        this.dueAmount = dueAmount;
    }
    
    

    public Double getTotAmount() {
        return totAmount;
    }

    public void setTotAmount(Double totAmount) {
        this.totAmount = totAmount;
    }

   

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public List<PurchaseItem> getItemList() {
        return itemList;
    }

    public void setItemList(List<PurchaseItem> itemList) {
        this.itemList = itemList;
    }

    public List<Expence> getExpList() {
        return expList;
    }

    public void setExpList(List<Expence> expList) {
        this.expList = expList;
    }

    public int getAssetAccNo() {
        return assetAccNo;
    }

    public void setAssetAccNo(int assetAccNo) {
        this.assetAccNo = assetAccNo;
    }
    
    
    
    
    

   

}
