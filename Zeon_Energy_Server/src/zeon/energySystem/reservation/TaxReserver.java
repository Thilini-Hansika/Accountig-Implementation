/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeon.energySystem.reservation;

import java.util.HashMap;
import java.util.Map;
import zeon.energySystem.common.controller.TaxController;

/**
 *
 * @author Zeon-IT
 */
public class TaxReserver {
     public static Map<String,TaxController>reserveData=new HashMap<>();
    
    public boolean setLockedTax(String id,TaxController taxController){
        if(reserveData.containsKey(id)){
           if(reserveData.get(id)==taxController){
            return true;
           }else{
               return false;
           }
        }else{
            reserveData.put(id, taxController);
            return true;
        }
    }
    public boolean removeLockedTax(String id,TaxController taxController){
        if(reserveData.get(id)==taxController){
            reserveData.remove(id);
            return true;
            
        }else{
        return false;
        
        }
    }
}
