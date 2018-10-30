/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeon.energySystem.common.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Zeon-IT
 */
@Entity
public class Vendor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int vendorId;
    private String companyName;
    private String firstName;
    private String lastName;
    private String billTo;
    private String phoneNumber;
    private String mobileNumber;
    private String fax;
    private String email;
    private String country;
    private String city;
    private String accountNo;
    private double creditLimit;
    
    @OneToOne(cascade = CascadeType.ALL)
    private CreditCard creditCardId;
    public Vendor() {
    }

    public Vendor( String companyName, String firstName, String lastName, String billTo, String phoneNumber, String mobileNumber, String fax, String email, String country, String city, String accountNo, double creditLimit, CreditCard creditCardId) {

        this.companyName = companyName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.billTo = billTo;
        this.phoneNumber = phoneNumber;
        this.mobileNumber = mobileNumber;
        this.fax = fax;
        this.email = email;
        this.country = country;
        this.city = city;
        this.accountNo = accountNo;
        this.creditLimit = creditLimit;
        this.creditCardId = creditCardId;
    }

    public Vendor(int vendorId, String companyName, String firstName, String lastName, String billTo, String phoneNumber, String mobileNumber, String fax, String email, String country, String city, String accountNo, double creditLimit, CreditCard creditCardId) {
        this.vendorId = vendorId;
        this.companyName = companyName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.billTo = billTo;
        this.phoneNumber = phoneNumber;
        this.mobileNumber = mobileNumber;
        this.fax = fax;
        this.email = email;
        this.country = country;
        this.city = city;
        this.accountNo = accountNo;
        this.creditLimit = creditLimit;
        this.creditCardId = creditCardId;
    }

    public int getVendorId() {
        return vendorId;
    }

    public void setVendorId(int vendorId) {
        this.vendorId = vendorId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBillTo() {
        return billTo;
    }

    public void setBillTo(String billTo) {
        this.billTo = billTo;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public CreditCard getCreditCardId() {
        return creditCardId;
    }

    public void setCreditCardId(CreditCard creditCardId) {
        this.creditCardId = creditCardId;
    }

    
    

}
