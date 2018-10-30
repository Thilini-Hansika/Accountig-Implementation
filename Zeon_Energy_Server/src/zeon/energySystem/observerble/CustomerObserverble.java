/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeon.energySystem.observerble;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import zeon.energySystem.common.observer.CustomerObserver;

/**
 *
 * @author Zeon-IT
 */
public class CustomerObserverble {
    private String message;
    private List<CustomerObserver>observers = new ArrayList<>();
    
    public void addCustomerObserver(CustomerObserver customerObserver){
        observers.add(customerObserver);
    }
    public void removeCustomerObserver(CustomerObserver customerObserver){
        observers.remove(customerObserver);
    }
    public void notifyCustomerObserver()throws RemoteException{
        for (CustomerObserver observer : observers) {
            observer.update(message);
        }
    }
    public void setMessage(String message) throws RemoteException{
        if(this.message != message){
            this.message = message;
            notifyCustomerObserver();
            
        }
    }
    
}
