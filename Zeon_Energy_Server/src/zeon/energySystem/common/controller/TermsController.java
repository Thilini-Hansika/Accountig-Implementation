/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeon.energySystem.common.controller;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.List;
import zeon.energySystem.common.model.Terms;
import zeon.energySystem.common.observer.TermsObserver;

/**
 *
 * @author Zeon-IT
 */
public interface TermsController extends Remote{
    public boolean addTerms(Terms terms)throws RemoteException,SQLException, ClassNotFoundException;
    public boolean updateTerms(Terms terms)throws RemoteException,SQLException, ClassNotFoundException;    
    public boolean deleteTerms(String id)throws RemoteException,SQLException, ClassNotFoundException;
    public Terms searchTerms(String id)throws RemoteException,SQLException, ClassNotFoundException;
    public boolean setLockedTerms(String id)throws RemoteException,SQLException, ClassNotFoundException;
    public boolean removeLockedTerms(String id)throws RemoteException,SQLException, ClassNotFoundException;
    public void addTermsObserver(TermsObserver termsObserver)throws RemoteException,SQLException, ClassNotFoundException;
    public void removeTermsObserver(TermsObserver termsObserver)throws RemoteException,SQLException, ClassNotFoundException;
    public List<Terms> getAllTerms()throws RemoteException,SQLException, ClassNotFoundException;
}
