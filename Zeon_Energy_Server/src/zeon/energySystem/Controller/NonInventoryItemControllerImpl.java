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
import zeon.energySystem.DaoImpl.NonInventoryItemDaoImpl;
import zeon.energySystem.common.controller.NonInventoryItemController;
import zeon.energySystem.common.model.NonInventoryItem;
/**
 *
 * @author Zeon-IT
 */
public class NonInventoryItemControllerImpl extends UnicastRemoteObject implements NonInventoryItemController{
private final NonInventoryItemDaoImpl daoImpl = new NonInventoryItemDaoImpl();
    public NonInventoryItemControllerImpl()throws RemoteException{
        
    }
    @Override
    public boolean addInventoryItem(NonInventoryItem item) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.addInventoryItem(item);
    }

    @Override
    public boolean updateInventoryItem(NonInventoryItem item) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.updateInventoryItem(item);
    }

    @Override
    public NonInventoryItem searchInventoryItem(String itemId) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.searchInventoryItem(itemId);
    }

    @Override
    public boolean deleteInventoryDelete(int itemId) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<NonInventoryItem> getAllInventoryItem() throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.getAllInventoryItem();
    }

    @Override
    public boolean updateInventoryItemQTY(int itemId, int qty) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.updateInventoryItemQTY(itemId, qty);
    }
    
}
