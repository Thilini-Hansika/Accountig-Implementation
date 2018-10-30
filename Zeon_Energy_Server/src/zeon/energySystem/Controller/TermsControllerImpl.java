/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeon.energySystem.Controller;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import zeon.energySystem.DaoImpl.TermsDaoImpl;
import zeon.energySystem.common.controller.TermsController;
import zeon.energySystem.common.model.Terms;
import zeon.energySystem.common.observer.TermsObserver;
import zeon.energySystem.observerble.TermsObserverble;
import zeon.energySystem.reservation.TermsReserver;
/**
 *
 * @author Zeon-IT
 */
public class TermsControllerImpl extends UnicastRemoteObject implements TermsController{
    private static final TermsReserver TERMS_RESERVER = new TermsReserver();
    private final TermsDaoImpl daoImpl = new TermsDaoImpl();
    private static final TermsObserverble TERMS_OBSERVERBLE = new TermsObserverble();
    
    public TermsControllerImpl()throws RemoteException{
        
    }
    
    @Override
    public boolean addTerms(Terms terms) throws RemoteException, SQLException, ClassNotFoundException {
        final boolean isAdded = daoImpl.addTerms(terms);
        new Thread(){
            @Override
            public void run() {
               if(isAdded){
                   try {
                       TERMS_OBSERVERBLE.setMessage("Customer Added Success...!!");
                   } catch (RemoteException ex) {
                       Logger.getLogger(TermsControllerImpl.class.getName()).log(Level.SEVERE, null, ex);
                   }
               }
            }
            
        }.start();
        return isAdded;
    }

    @Override
    public boolean updateTerms(Terms terms) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.updateTerms(terms);
    }

    @Override
    public boolean deleteTerms(String id) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.deleteTerms(id);
    }

    @Override
    public Terms searchTerms(String id) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.searchTerms(id);
    }

    @Override
    public boolean setLockedTerms(String id) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeLockedTerms(String id) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addTermsObserver(TermsObserver termsObserver) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeTermsObserver(TermsObserver termsObserver) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Terms> getAllTerms() throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.getAllTerms();
    }
    
    }

   
    

