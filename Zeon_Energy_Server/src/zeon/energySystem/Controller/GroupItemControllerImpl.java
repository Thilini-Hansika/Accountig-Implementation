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
import zeon.energySystem.DaoImpl.GroupItemDaoImpl;
import zeon.energySystem.common.controller.GroupItemController;
import zeon.energySystem.common.model.GroupItem;
/**
 *
 * @author Zeon-IT
 */
public class GroupItemControllerImpl extends UnicastRemoteObject implements GroupItemController{
    private final GroupItemDaoImpl daoImpl = new GroupItemDaoImpl();
    public GroupItemControllerImpl()throws RemoteException{
        
    }
    @Override
    public boolean addGroupItem(GroupItem item) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.addGroupItem(item);
    }

    @Override
    public boolean updateGroupItem(GroupItem item) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public GroupItem searchGroupItem(String itemId) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.searchGroupItem(itemId);
    }

    @Override
    public boolean deleteGroupDelete(int itemId) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<GroupItem> getAllGroupItem() throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.getAllGroupItem();
    }
    
}
