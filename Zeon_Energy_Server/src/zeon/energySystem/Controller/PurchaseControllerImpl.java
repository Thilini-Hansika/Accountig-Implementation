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
import zeon.energySystem.DaoImpl.PurchaseDaoImpl;
import zeon.energySystem.common.controller.PurchaseController;
import zeon.energySystem.common.model.Purchase;
/**
 *
 * @author ZeonIT
 */
public class PurchaseControllerImpl extends UnicastRemoteObject implements PurchaseController{

    private final PurchaseDaoImpl daoImpl = new PurchaseDaoImpl();
    public PurchaseControllerImpl()throws RemoteException{
        
    }
    @Override
    public boolean addPurchaseItem(Purchase item) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.addPurchaseItem(item);
    }

    @Override
    public boolean updatePurchaseItem(Purchase item) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Purchase searchPurchaseItem(String itemId) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.searchPurchaseItem(itemId);
    }

    @Override
    public boolean deletePurchaseItem(int itemId) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Purchase> getAllPurchaseItem() throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.getAllPurchaseItem();
    }

    @Override
    public List<Purchase> getAllPurchaseItemByVendor(int vendorId) throws RemoteException, SQLException, ClassNotFoundException {
       return daoImpl.getAllPurchaseItemByVendor(vendorId);
    }

    @Override
    public Purchase getLastPurchase() throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.getLastPurchase();
    }

  
}
