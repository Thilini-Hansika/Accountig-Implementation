/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeon.energySystem.common.model;

/**
 *
 * @author Zeon-IT
 */
public class ExpenceList {
    private String expenceName;
    private String expenceBalance;

    public ExpenceList() {
    }

    public ExpenceList(String expenceName, String expenceBalance) {
        this.expenceName = expenceName;
        this.expenceBalance = expenceBalance;
    }

    public String getExpenceName() {
        return expenceName;
    }

    public void setExpenceName(String expenceName) {
        this.expenceName = expenceName;
    }

    public String getExpenceBalance() {
        return expenceBalance;
    }

    public void setExpenceBalance(String expenceBalance) {
        this.expenceBalance = expenceBalance;
    }

    
}
