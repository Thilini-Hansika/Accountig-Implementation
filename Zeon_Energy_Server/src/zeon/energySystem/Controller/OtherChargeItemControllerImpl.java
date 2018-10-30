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
import zeon.energySystem.DaoImpl.OtherChargeItemDaoImpl;
import zeon.energySystem.common.controller.OtherChargeItemController;
import zeon.energySystem.common.model.OtherChargeItem;
/**
 *
 * @author Zeon-IT
 */
public class OtherChargeItemControllerImpl extends UnicastRemoteObject implements OtherChargeItemController{
    private final OtherChargeItemDaoImpl daoImpl = new OtherChargeItemDaoImpl();
    public OtherChargeItemControllerImpl()throws RemoteException{
        
    }
    @Override
    public boolean addOtherChargeItem(OtherChargeItem item) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.addOtherChargeItem(item);
    }

    @Override
    public boolean updateOtherChargeItem(OtherChargeItem item) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public OtherChargeItem searchOtherChargeItem(String itemId) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.searchOtherChargeItem(itemId);
    }

    @Override
    public boolean deleteOtherChargeDelete(int itemId) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<OtherChargeItem> getAllOtherChargeItem() throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.getAllOtherChargeItem();
    }
    
}
