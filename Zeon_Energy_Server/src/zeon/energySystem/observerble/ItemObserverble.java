/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeon.energySystem.observerble;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import zeon.energySystem.common.observer.ItemObserver;

/**
 *
 * @author Zeon-IT
 */
public class ItemObserverble {
    private String message;
    private List<ItemObserver>observers = new ArrayList<>();
    
    public void addItemObserver(ItemObserver itemObserver){
        observers.add(itemObserver);
    }
    public void removeItemObserver(ItemObserver itemObserver){
        observers.remove(itemObserver);
    }
    public void notifyItemObserver()throws RemoteException{
        for (ItemObserver observer : observers) {
            observer.update(message);
        }
    }
    public void setMessage(String message) throws RemoteException{
        if(this.message != message){
            this.message = message;
            notifyItemObserver();
            
        }
    }
}
