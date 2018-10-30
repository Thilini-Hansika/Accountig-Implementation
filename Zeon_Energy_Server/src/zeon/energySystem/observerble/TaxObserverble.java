/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeon.energySystem.observerble;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import zeon.energySystem.common.observer.TaxObserver;

/**
 *
 * @author Zeon-IT
 */
public class TaxObserverble {
     private String message;
    private List<TaxObserver>observers = new ArrayList<>();
    
    public void addTaxObserver(TaxObserver taxObserver){
        observers.add(taxObserver);
    }
    public void removeTaxObserver(TaxObserver taxObserver){
        observers.remove(taxObserver);
    }
    public void notifyTaxObserver()throws RemoteException{
        for (TaxObserver observer : observers) {
            observer.update(message);
        }
    }
    public void setMessage(String message) throws RemoteException{
        if(this.message != message){
            this.message = message;
            notifyTaxObserver();
            
        }
    }
    
}
