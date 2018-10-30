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
public class IncomeList {
    private String incomeName;
    private String incomeBalance;

    public IncomeList() {
    }

    public IncomeList(String incomeName, String incomeBalance) {
        this.incomeName = incomeName;
        this.incomeBalance = incomeBalance;
    }

    public String getIncomeName() {
        return incomeName;
    }

    public void setIncomeName(String incomeName) {
        this.incomeName = incomeName;
    }

    public String getIncomeBalance() {
        return incomeBalance;
    }

    public void setIncomeBalance(String incomeBalance) {
        this.incomeBalance = incomeBalance;
    }
    
    
    
}
