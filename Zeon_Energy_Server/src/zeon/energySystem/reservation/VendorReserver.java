/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeon.energySystem.reservation;

import java.util.HashMap;
import java.util.Map;
import zeon.energySystem.common.controller.VendorController;

/**
 *
 * @author Zeon-IT
 */
public class VendorReserver {
     public static Map<String,VendorController>reserveData=new HashMap<>();
    
    public boolean setLockedVendor(String id,VendorController vendorController){
        if(reserveData.containsKey(id)){
           if(reserveData.get(id)==vendorController){
            return true;
           }else{
               return false;
           }
        }else{
            reserveData.put(id, vendorController);
            return true;
        }
    }
    public boolean removeLockedVendor(String id,VendorController vendorController){
        if(reserveData.get(id)==vendorController){
            reserveData.remove(id);
            return true;
            
        }else{
        return false;
        
        }
    }
}
