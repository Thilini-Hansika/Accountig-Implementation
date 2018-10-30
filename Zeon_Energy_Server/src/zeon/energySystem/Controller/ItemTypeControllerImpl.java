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
import zeon.energySystem.DaoImpl.ItemTypeDaoImpl;
import zeon.energySystem.common.controller.ItemTypeController;
import zeon.energySystem.common.model.ItemType;
/**
 *
 * @author ZeonIT
 */
public class ItemTypeControllerImpl extends UnicastRemoteObject implements ItemTypeController{

    private final ItemTypeDaoImpl daoImpl = new ItemTypeDaoImpl();
    public ItemTypeControllerImpl()throws RemoteException{
        
    }
    @Override
    public boolean addItemType(ItemType item) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.addItemType(item);
    }

    @Override
    public boolean updateItemType(ItemType item) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ItemType searchItemType(String itemId) throws RemoteException, SQLException, ClassNotFoundException {
       return daoImpl.searchItemType(itemId);
    }

    @Override
    public boolean deleteItemType(int itemId) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ItemType> getAllItemType() throws RemoteException, SQLException, ClassNotFoundException {
       return daoImpl.getAllItemType();
    }
    
}
