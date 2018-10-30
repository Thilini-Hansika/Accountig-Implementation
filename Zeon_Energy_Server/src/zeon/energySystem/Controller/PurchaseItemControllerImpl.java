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
import zeon.energySystem.DaoImpl.PurchaseItemDaoImpl;
import zeon.energySystem.common.controller.PurchaseItemController;
import zeon.energySystem.common.model.Purchase;
import zeon.energySystem.common.model.PurchaseItem;
/**
 *
 * @author ZeonIT
 */
public class PurchaseItemControllerImpl extends UnicastRemoteObject implements PurchaseItemController{
private PurchaseItemDaoImpl daoImpl = new PurchaseItemDaoImpl();
    public PurchaseItemControllerImpl()throws RemoteException{
        
    }
    @Override
    public List<Purchase> getAllPurchaseItem() throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PurchaseItem> getAllPurchaseById(String purchaseId) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.getAllPurchaseById(purchaseId);
    }
    
}
