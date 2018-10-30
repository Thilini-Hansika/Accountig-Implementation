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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

/**
 *
 * @author Zeon-IT
 */
@Entity
public class Invoice implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int invoiceId;
    private String invoiceCompanyId;
    private String type;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date issueDate;
    private Date dueDate;
    private String billTo;
    private String shipTo;
    private String poNumber;
    private String terms;
    private Date ship;
    private String via;
    private String fob;
    private String custMessage;
    private double discount;
    private double totAmount;
    private int receivableAccNO;
    
    @ManyToOne(cascade = CascadeType.ALL)
    private Customer customer;
    
    @OneToMany(cascade = CascadeType.ALL)
    
    private List<OrderDetails>orderDetails;

    public Invoice() {
    }

    public Invoice(String invoiceCompanyId, String type, Date issueDate,Date dueDate, String billTo, String shipTo, String poNumber, String terms, Date ship, String via, String fob, String custMessage, double discount, double totAmount,int receivableAccNO, Customer customer, List<OrderDetails> orderDetails) {
        this.invoiceCompanyId = invoiceCompanyId;
        this.type = type;
        this.issueDate = issueDate;
        this.billTo = billTo;
        this.shipTo = shipTo;
        this.poNumber = poNumber;
        this.terms = terms;
       this.dueDate = dueDate;
        this.ship = ship;
        this.via = via;
        this.fob = fob;
        this.custMessage = custMessage;
        this.discount = discount;
        this.totAmount = totAmount;
        this.receivableAccNO = receivableAccNO;
        this.customer = customer;
        this.orderDetails = orderDetails;
    }
    

    /**
     * @return the invoiceId
     */
    public int getInvoiceId() {
        return invoiceId;
    }

    /**
     * @return the invoiceCompanyId
     */
    public String getInvoiceCompanyId() {
        return invoiceCompanyId;
    }

    /**
     * @param invoiceCompanyId the invoiceCompanyId to set
     */
    public void setInvoiceCompanyId(String invoiceCompanyId) {
        this.invoiceCompanyId = invoiceCompanyId;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the issueDate
     */
    public Date getIssueDate() {
        return issueDate;
    }

    /**
     * @param issueDate the issueDate to set
     */
    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    /**
     * @return the billTo
     */
    public String getBillTo() {
        return billTo;
    }

    /**
     * @param billTo the billTo to set
     */
    public void setBillTo(String billTo) {
        this.billTo = billTo;
    }

    /**
     * @return the shipTo
     */
    public String getShipTo() {
        return shipTo;
    }

    /**
     * @param shipTo the shipTo to set
     */
    public void setShipTo(String shipTo) {
        this.shipTo = shipTo;
    }

    /**
     * @return the poNumber
     */
    public String getPoNumber() {
        return poNumber;
    }

    /**
     * @param poNumber the poNumber to set
     */
    public void setPoNumber(String poNumber) {
        this.poNumber = poNumber;
    }

    /**
     * @return the terms
     */
    public String getTerms() {
        return terms;
    }

    /**
     * @param terms the terms to set
     */
    public void setTerms(String terms) {
        this.terms = terms;
    }

    

    /**
     * @return the ship
     */
    public Date getShip() {
        return ship;
    }

    /**
     * @param ship the ship to set
     */
    public void setShip(Date ship) {
        this.ship = ship;
    }

    /**
     * @return the via
     */
    public String getVia() {
        return via;
    }

    /**
     * @param via the via to set
     */
    public void setVia(String via) {
        this.via = via;
    }

    /**
     * @return the fob
     */
    public String getFob() {
        return fob;
    }

    /**
     * @param fob the fob to set
     */
    public void setFob(String fob) {
        this.fob = fob;
    }

    /**
     * @return the custMessage
     */
    public String getCustMessage() {
        return custMessage;
    }

    /**
     * @param custMessage the custMessage to set
     */
    public void setCustMessage(String custMessage) {
        this.custMessage = custMessage;
    }

    /**
     * @return the discount
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    /**
     * @return the totAmount
     */
    public double getTotAmount() {
        return totAmount;
    }

    /**
     * @param totAmount the totAmount to set
     */
    public void setTotAmount(double totAmount) {
        this.totAmount = totAmount;
    }

    public int getReceivableAccNO() {
        return receivableAccNO;
    }

    public void setReceivableAccNO(int receivableAccNO) {
        this.receivableAccNO = receivableAccNO;
    }

    /**
     * @return the customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * @return the orderDetails
     */
    public List<OrderDetails> getOrderDetails() {
        return orderDetails;
    }

    /**
     * @param orderDetails the orderDetails to set
     */
    public void setOrderDetails(List<OrderDetails> orderDetails) {
        this.orderDetails = orderDetails;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

   
}
