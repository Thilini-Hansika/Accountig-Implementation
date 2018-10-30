/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeon.energySystem.reservation;

import java.util.HashMap;
import java.util.Map;
import zeon.energySystem.common.controller.UserController;

/**
 *
 * @author Zeon-IT
 */
public class UserReserver {
    public static Map<String,UserController>reserveData=new HashMap<>();
    
    public boolean setLockedCustomer(String id,UserController userController){
        if(reserveData.containsKey(id)){
           if(reserveData.get(id)==userController){
            return true;
           }else{
               return false;
           }
        }else{
            reserveData.put(id, userController);
            return true;
        }
    }
    public boolean removeLockedCustomer(String id,UserController userController){
        if(reserveData.get(id)==userController){
            reserveData.remove(id);
            return true;
            
        }else{
        return false;
        
        }
    }
}
