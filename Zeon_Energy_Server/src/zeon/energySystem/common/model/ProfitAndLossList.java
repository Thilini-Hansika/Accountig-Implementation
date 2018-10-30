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
public class ProfitAndLossList {
    private String incomeName;
    private String incomeBalance;
    private String costName;
    private String costBalance;
    private String expenceName;
    private String expenceBalance;

    public ProfitAndLossList() {
    }

    public ProfitAndLossList(String incomeName, String incomeBalance, String costName, String costBalance, String expenceName, String expenceBalance) {
        this.incomeName = incomeName;
        this.incomeBalance = incomeBalance;
        this.costName = costName;
        this.costBalance = costBalance;
        this.expenceName = expenceName;
        this.expenceBalance = expenceBalance;
    }

    public ProfitAndLossList(String incomeName, String incomeBalance) {
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

    public String getCostName() {
        return costName;
    }

    public void setCostName(String costName) {
        this.costName = costName;
    }

    public String getCostBalance() {
        return costBalance;
    }

    public void setCostBalance(String costBalance) {
        this.costBalance = costBalance;
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
