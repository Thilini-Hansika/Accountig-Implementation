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
import zeon.energySystem.DaoImpl.SaleTaxGroupItemDaoImpl;
import zeon.energySystem.common.controller.SaleTaxGroupItemController;
import zeon.energySystem.common.model.SaleTaxGroupItem;
/**
 *
 * @author Zeon-IT
 */
public class SaleTaxGroupItemControllerImpl extends UnicastRemoteObject implements SaleTaxGroupItemController{
    private final SaleTaxGroupItemDaoImpl daoImpl = new SaleTaxGroupItemDaoImpl();
    public SaleTaxGroupItemControllerImpl()throws RemoteException{
        
    }
    @Override
    public boolean addSaleTaxGroupItem(SaleTaxGroupItem item) throws RemoteException, SQLException, ClassNotFoundException {
      return daoImpl.addSaleTaxGroupItem(item);
    }

    @Override
    public boolean updateSaleTaxGroupItem(SaleTaxGroupItem item) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SaleTaxGroupItem searchSaleTaxGroupItem(String itemId) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.searchSaleTaxGroupItem(itemId);
    }

    @Override
    public boolean deleteSaleTaxGroupDelete(int itemId) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SaleTaxGroupItem> getAllSaleTaxGroupItem() throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.getAllSaleTaxGroupItem();
    }
    
}
