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
import zeon.energySystem.DaoImpl.VendorDaoImpl;
import zeon.energySystem.common.controller.VendorController;
import zeon.energySystem.common.model.Vendor;
import zeon.energySystem.common.observer.CustomerObserver;
import zeon.energySystem.observerble.VendorObserverble;
import zeon.energySystem.reservation.VendorReserver;

/**
 *
 * @author Zeon-IT
 */
public class VendorControllerImpl extends UnicastRemoteObject implements VendorController{
     private static final VendorReserver VENDOR_RESERVER = new VendorReserver();
    private final VendorDaoImpl daoImpl = new VendorDaoImpl();
    private static final VendorObserverble VENDOR_OBSERVERBLE = new VendorObserverble();
    
    
    public VendorControllerImpl()throws RemoteException{
    
    }
    @Override
    public boolean addVendor(Vendor vendor) throws RemoteException, SQLException, ClassNotFoundException {
        final boolean isAdded = daoImpl.addVendor(vendor);
        new Thread(){
            @Override
            public void run() {
               if(isAdded){
                   try {
                       VENDOR_OBSERVERBLE.setMessage("Customer Added Success...!!");
                   } catch (RemoteException ex) {
                       Logger.getLogger(VendorControllerImpl.class.getName()).log(Level.SEVERE, null, ex);
                   }
               }
            }
            
        }.start();
        return isAdded;
    }

    @Override
    public boolean updateVendor(Vendor vendor) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.updateVendor(vendor);
    }

    @Override
    public boolean deleteVendor(int id) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.deleteVendor(id);
    }

    @Override
    public Vendor searchVendor(int id) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.searchVendor(id);
    }

    @Override
    public List<Vendor> getAllVendor() throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.getAllVendor();
    }

    @Override
    public boolean setLockedVendor(String id) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeLockedVendor(String id) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addVendorObserver(CustomerObserver customerObserver) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeVendorObserver(CustomerObserver customerObserver) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vendor searchByCompanyName(String companyName) throws RemoteException, SQLException, ClassNotFoundException {
return daoImpl.searchByCompanyName(companyName);
    }

    @Override
    public Vendor searchVendorByName(String vendorName) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.searchVendorByName(vendorName);
    }
    
}
