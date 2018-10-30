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
import zeon.energySystem.DaoImpl.SubTotalItemDaoImpl;
import zeon.energySystem.common.controller.SubTotalItemController;
import zeon.energySystem.common.model.SubTotalItem;
/**
 *
 * @author Zeon-IT
 */
public class SubTotalItemControllerImpl extends UnicastRemoteObject implements SubTotalItemController {
private final SubTotalItemDaoImpl daoImpl = new SubTotalItemDaoImpl();
    public SubTotalItemControllerImpl()throws RemoteException{
        
    }
    @Override
    public boolean addSubTotalItem(SubTotalItem item) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.addSubTotalItem(item);
    }

    @Override
    public boolean updateSubTotalItem(SubTotalItem item) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SubTotalItem searchSubTotalItem(String itemId) throws RemoteException, SQLException, ClassNotFoundException {
       return daoImpl.searchSubTotalItem(itemId);
    }

    @Override
    public boolean deleteSubTotalDelete(int itemId) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SubTotalItem> getAllSubTotalItem() throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.getAllSubTotalItem();
    }
    
}
