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

@Entity
public class Customer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int custId;
    
    private String companyName;
    private String firstName;
    private String lastName;
    private String billaddress;
    private String shipAddress;
    private String phoneNumber;
    private String mobileNumber;
    private String fax;
    private String email;
    private String country;
    private String city;
    private String accountType;
    private String accountNo;
    private double creditLimit;

    @OneToOne(cascade = CascadeType.ALL)
    private CreditCard creditCardId;
    
    public Customer() {
    }

    public Customer(String companyName, String firstName, String lastName, String billaddress, String shipAddress, String phoneNumber, String mobileNumber, String fax, String email, String country, String city, String accountType, String accountNo, double creditLimit, CreditCard creditCardId) {
        this.companyName = companyName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.billaddress = billaddress;
        this.shipAddress = shipAddress;
        this.phoneNumber = phoneNumber;
        this.mobileNumber = mobileNumber;
        this.fax = fax;
        this.email = email;
        this.country = country;
        this.city = city;
        this.accountType = accountType;
        this.accountNo = accountNo;
        this.creditLimit = creditLimit;
        this.creditCardId = creditCardId;
    }

    public Customer(int custId, String companyName, String firstName, String lastName, String billaddress, String shipAddress, String phoneNumber, String mobileNumber, String fax, String email, String country, String city, String accountType, String accountNo, double creditLimit, CreditCard creditCardId) {
        this.custId = custId;
        this.companyName = companyName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.billaddress = billaddress;
        this.shipAddress = shipAddress;
        this.phoneNumber = phoneNumber;
        this.mobileNumber = mobileNumber;
        this.fax = fax;
        this.email = email;
        this.country = country;
        this.city = city;
        this.accountType = accountType;
        this.accountNo = accountNo;
        this.creditLimit = creditLimit;
        this.creditCardId = creditCardId;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
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

    public String getBilladdress() {
        return billaddress;
    }

    public void setBilladdress(String billaddress) {
        this.billaddress = billaddress;
    }

    public String getShipAddress() {
        return shipAddress;
    }

    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress;
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
