/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeon.energySystem.reservation;

import java.util.HashMap;
import java.util.Map;
import zeon.energySystem.common.controller.CustomerController;

/**
 *
 * @author Zeon-IT
 */
public class CustomerReserver {
     public static Map<String,CustomerController>reserveData=new HashMap<>();
    
    public boolean setLockedCustomer(String id,CustomerController customerController){
        if(reserveData.containsKey(id)){
           if(reserveData.get(id)==customerController){
            return true;
           }else{
               return false;
           }
        }else{
            reserveData.put(id, customerController);
            return true;
        }
    }
    public boolean removeLockedCustomer(String id,CustomerController customerController){
        if(reserveData.get(id)==customerController){
            reserveData.remove(id);
            return true;
            
        }else{
        return false;
        
        }
    }
}
