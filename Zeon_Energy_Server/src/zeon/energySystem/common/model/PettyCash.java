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
public class PettyCash implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String date;
    private int accNo;
    private String voucher;
    private String pettyId;
    @OneToOne(cascade = CascadeType.ALL)
    private Customer customer;
    @OneToOne(cascade = CascadeType.ALL)
    private Vendor vendor;
    @OneToMany(cascade = CascadeType.ALL)
    private List<PettyDetail>pettyList;

    public PettyCash() {
    }

    public PettyCash(String date,int accNo, String voucher, String pettyId, Customer customer, Vendor vendor, List<PettyDetail> pettyList) {
       
        this.date = date;
        this.accNo = accNo;
        this.voucher = voucher;
        this.pettyId = pettyId;
        this.customer = customer;
        this.vendor = vendor;
        this.pettyList = pettyList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    
    public String getVoucher() {
        return voucher;
    }

    public void setVoucher(String voucher) {
        this.voucher = voucher;
    }

    public String getPettyId() {
        return pettyId;
    }

    public void setPettyId(String pettyId) {
        this.pettyId = pettyId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public List<PettyDetail> getPettyList() {
        return pettyList;
    }

    public void setPettyList(List<PettyDetail> pettyList) {
        this.pettyList = pettyList;
    }

   
    
}   
    

