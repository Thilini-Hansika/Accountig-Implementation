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
import zeon.energySystem.DaoImpl.TaxDaoImpl;
import zeon.energySystem.common.controller.TaxController;
import zeon.energySystem.common.model.Tax;
import zeon.energySystem.observerble.TaxObserverble;
import zeon.energySystem.reservation.TaxReserver;
/**
 *
 * @author Zeon-IT
 */
public class TaxControllerImpl extends UnicastRemoteObject implements TaxController{
     private static final TaxReserver ITEM_RESERVER = new TaxReserver();
    private final TaxDaoImpl daoImpl = new TaxDaoImpl();
    private static final TaxObserverble ITEM_OBSERVERBLE = new TaxObserverble();
    
    public TaxControllerImpl()throws RemoteException{
        
    }
    @Override
    public boolean addTax(Tax tax) throws RemoteException, SQLException, ClassNotFoundException {
         final boolean isAdded = daoImpl.addTax(tax);
        new Thread(){
            @Override
            public void run() {
               if(isAdded){
                   try {
                       ITEM_OBSERVERBLE.setMessage("Customer Added Success...!!");
                   } catch (RemoteException ex) {
                       Logger.getLogger(TaxControllerImpl.class.getName()).log(Level.SEVERE, null, ex);
                   }
               }
            }
            
        }.start();
        return isAdded;
    }

    @Override
    public boolean updateTax(Tax tax) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.updateTax(tax);
    }

    @Override
    public Tax searchTax(String taxId) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.searchTax(taxId);
    }

    @Override
    public boolean deleteTax(int taxId) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.deleteTax(taxId);
    }

    @Override
    public List<Tax> getAllTax() throws RemoteException, SQLException, ClassNotFoundException {
        return  daoImpl.getAllTax();
    }
    
}
