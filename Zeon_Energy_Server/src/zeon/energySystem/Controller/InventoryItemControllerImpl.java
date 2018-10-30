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
import zeon.energySystem.DaoImpl.InventoryItemDaoImpl;
import zeon.energySystem.common.controller.InventoryItemController;
import zeon.energySystem.common.model.InventoryItem;
/**
 *
 * @author ZeonIT
 */
public class InventoryItemControllerImpl extends UnicastRemoteObject implements InventoryItemController{
private final InventoryItemDaoImpl daoImpl = new InventoryItemDaoImpl();
    public InventoryItemControllerImpl()throws RemoteException{
        
    }
    @Override
    public boolean addInventoryItem(InventoryItem item) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.addInventoryItem(item);
    }

    @Override
    public boolean updateInventoryItem(InventoryItem item) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.updateInventoryItem(item);
    }

    @Override
    public InventoryItem searchInventoryItem(String itemId,String batchNo) throws RemoteException, SQLException, ClassNotFoundException {
       return daoImpl.searchInventoryItem(itemId,batchNo);
    }

    @Override
    public boolean deleteInventoryDelete(int itemId) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<InventoryItem> getAllInventoryItem() throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.getAllInventoryItem();
    }


    @Override
    public List<InventoryItem> getAllInventoryItem(String itemName) throws RemoteException, SQLException, ClassNotFoundException {
       return daoImpl.getAllInventoryItem(itemName);
    }

    @Override
    public InventoryItem searchInventoryByCogsNo(int accNo) throws RemoteException, SQLException, ClassNotFoundException {
       return daoImpl.searchInventoryByCogsNo(accNo);
    }

    @Override
    public InventoryItem searchInventoryItemByCogs(String itemName, String batchNo, int accNo) throws RemoteException, SQLException, ClassNotFoundException {
       return daoImpl.searchInventoryItemByCogs(itemName, batchNo, accNo);
    }

    @Override
    public InventoryItem searchInventoryItemByIncome(String itemName, String batchNo, int accNo) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.searchInventoryItemByIncome(itemName, batchNo, accNo);
    }
    
}
