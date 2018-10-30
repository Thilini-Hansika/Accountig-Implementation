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
public class CostList {
    private String costName;
    private String costBalance;

    public CostList() {
    }

    public CostList(String costName, String costBalance) {
        this.costName = costName;
        this.costBalance = costBalance;
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
    
}
