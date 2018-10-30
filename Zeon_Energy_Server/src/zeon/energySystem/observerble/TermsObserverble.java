/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeon.energySystem.observerble;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import zeon.energySystem.common.observer.TermsObserver;

/**
 *
 * @author Zeon-IT
 */
public class TermsObserverble {
     private String message;
    private List<TermsObserver>observers = new ArrayList<>();
    
    public void addTermsObserver(TermsObserver termsObserver){
        observers.add(termsObserver);
    }
    public void removeTermsObserver(TermsObserver termsObserver){
        observers.remove(termsObserver);
    }
    public void notifyTermsObserver()throws RemoteException{
        for (TermsObserver observer : observers) {
            observer.update(message);
        }
    }
    public void setMessage(String message) throws RemoteException{
        if(this.message != message){
            this.message = message;
            notifyTermsObserver();
            
        }
    }
    
}
