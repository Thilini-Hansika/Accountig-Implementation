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
import zeon.energySystem.DaoImpl.DiscountItemDaoImpl;
import zeon.energySystem.common.controller.DiscountItemController;
import zeon.energySystem.common.model.DiscountItem;
/**
 *
 * @author Zeon-IT
 */
public class DiscountItemControllerImpl extends UnicastRemoteObject implements DiscountItemController{

    private final DiscountItemDaoImpl daoImpl = new DiscountItemDaoImpl();
    public DiscountItemControllerImpl()throws RemoteException{
        
    }
    @Override
    public boolean addDiscountItemItem(DiscountItem item) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.addDiscountItemItem(item);
    }

    @Override
    public boolean updateDiscountItemItem(DiscountItem item) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DiscountItem searchDiscountItemItem(String itemId) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.searchDiscountItemItem(itemId);
    }

    @Override
    public boolean deleteDiscountItemDelete(int itemId) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DiscountItem> getAllDiscountItemItem() throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.getAllDiscountItemItem();
    }
    
}
