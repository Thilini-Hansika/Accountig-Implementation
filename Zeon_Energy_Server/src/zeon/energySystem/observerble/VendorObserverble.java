/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeon.energySystem.observerble;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import zeon.energySystem.common.observer.VendorObserver;

/**
 *
 * @author Zeon-IT
 */
public class VendorObserverble {
    private String message;
    private List<VendorObserver>observers = new ArrayList<>();
    
    public void addVendorObserver(VendorObserver vendorObserver){
        observers.add(vendorObserver);
    }
    public void removeVendorObserver(VendorObserver vendorObserver){
        observers.remove(vendorObserver);
    }
    public void notifyVendorObserver()throws RemoteException{
        for (VendorObserver observer : observers) {
            observer.update(message);
        }
    }
    public void setMessage(String message) throws RemoteException{
        if(this.message != message){
            this.message = message;
            notifyVendorObserver();
            
        }
    }
    
}
