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
import javax.persistence.Temporal;

/**
 *
 * @author Ze
 */
@Entity
public class Employee implements Serializable{
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private  int EmpId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone ;
    private String mobile ;
    private String address;
    private int billinhRate;
    private int emoNo;
    private String gender;
      @Temporal(javax.persistence.TemporalType.DATE)
    private Date hireDate;
    private Date releasDate;
    private Date dob;
    private String note ;

    public Employee() {
    }

    public Employee( String firstName, String lastName, String email, String phone, String mobile, String address, int billinhRate, int emoNo, String gender, Date hireDate, Date releasDate, Date dob, String note) {
    
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.mobile = mobile;
        this.address = address;
        this.billinhRate = billinhRate;
        this.emoNo = emoNo;
        this.gender = gender;
        this.hireDate = hireDate;
        this.releasDate = releasDate;
        this.dob = dob;
        this.note = note;
    }

    public Employee(int EmpId, String firstName, String lastName, String email, String phone, String mobile, String address, int billinhRate, int emoNo, String gender, Date hireDate, Date releasDate, Date dob, String note) {
        this.EmpId = EmpId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.mobile = mobile;
        this.address = address;
        this.billinhRate = billinhRate;
        this.emoNo = emoNo;
        this.gender = gender;
        this.hireDate = hireDate;
        this.releasDate = releasDate;
        this.dob = dob;
        this.note = note;
    }

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int EmpId) {
        this.EmpId = EmpId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBillinhRate() {
        return billinhRate;
    }

    public void setBillinhRate(int billinhRate) {
        this.billinhRate = billinhRate;
    }

    public int getEmoNo() {
        return emoNo;
    }

    public void setEmoNo(int emoNo) {
        this.emoNo = emoNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Date getReleasDate() {
        return releasDate;
    }

    public void setReleasDate(Date releasDate) {
        this.releasDate = releasDate;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Employee{" + "EmpId=" + EmpId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phone=" + phone + ", mobile=" + mobile + ", address=" + address + ", billinhRate=" + billinhRate + ", emoNo=" + emoNo + ", gender=" + gender + ", hireDate=" + hireDate + ", releasDate=" + releasDate + ", dob=" + dob + ", note=" + note + '}';
    }

   
    
}
