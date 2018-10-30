/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeon.energySystem.common.model;

/**
 *
 * @author ZeonIT
 */
public class InvoiceItems {
    
    private String descripton;
    private double unitPrice;
    private double qty;
    private String tax;
    private double discount;
    private double amount;

    public InvoiceItems() {
    }

    public InvoiceItems(String descripton, double unitPrice, double qty, String tax, double discount, double amount) {
        this.descripton = descripton;
        this.unitPrice = unitPrice;
        this.qty = qty;
        this.tax = tax;
        this.discount = discount;
        this.amount = amount;
    }

    /**
     * @return the descripton
     */
    public String getDescripton() {
        return descripton;
    }

    /**
     * @param descripton the descripton to set
     */
    public void setDescripton(String descripton) {
        this.descripton = descripton;
    }

    /**
     * @return the unitPrice
     */
    public double getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * @return the qty
     */
    public double getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(double qty) {
        this.qty = qty;
    }

    /**
     * @return the tax
     */
    public String getTax() {
        return tax;
    }

    /**
     * @param tax the tax to set
     */
    public void setTax(String tax) {
        this.tax = tax;
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
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    
    
}
