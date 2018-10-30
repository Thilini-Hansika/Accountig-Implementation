/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeon.energySystem.reservation;

import java.util.HashMap;
import java.util.Map;
import zeon.energySystem.common.controller.TermsController;

/**
 *
 * @author Zeon-IT
 */
public class TermsReserver {
     public static Map<String,TermsController>reserveData=new HashMap<>();
    
    public boolean setLockedVendor(String id,TermsController termsController){
        if(reserveData.containsKey(id)){
           if(reserveData.get(id)==termsController){
            return true;
           }else{
               return false;
           }
        }else{
            reserveData.put(id, termsController);
            return true;
        }
    }
    public boolean removeLockedVendor(String id,TermsController termsController){
        if(reserveData.get(id)==termsController){
            reserveData.remove(id);
            return true;
            
        }else{
        return false;
        
        }
    }
}
