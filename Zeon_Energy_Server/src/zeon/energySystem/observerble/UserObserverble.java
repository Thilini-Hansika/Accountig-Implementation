/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeon.energySystem.observerble;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import zeon.energySystem.common.observer.UserObserver;

/**
 *
 * @author Zeon-IT
 */
public class UserObserverble {
     private String message;
    private List<UserObserver>observers = new ArrayList<>();
    
    public void addUserObserver(UserObserver userObserver){
        observers.add(userObserver);
    }
    public void removeUserObserver(UserObserver userObserver){
        observers.remove(userObserver);
    }
    public void notifyUserObserver()throws RemoteException{
        for (UserObserver observer : observers) {
            observer.update(message);
        }
    }
    public void setMessage(String message) throws RemoteException{
        if(this.message != message){
            this.message = message;
            notifyUserObserver();
            
        }
    }
}
