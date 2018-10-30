/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeon.energySystem.common.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Zeon-IT
 */
@Entity
public class UserType implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userTypeId;
    private String userType;

    public UserType() {
    }
    

    public UserType(String userType) {
        this.userType = userType;
    }

    /**
     * @return the userTypeId
     */
    public int getUserTypeId() {
        return userTypeId;
    }

    /**
     * @return the userType
     */
    public String getUserType() {
        return userType;
    }

    /**
     * @param userType the userType to set
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }
    
    
}
