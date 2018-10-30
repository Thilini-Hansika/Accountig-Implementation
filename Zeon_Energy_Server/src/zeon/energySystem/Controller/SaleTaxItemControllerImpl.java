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
import zeon.energySystem.DaoImpl.SaleTaxItemDaoImpl;
import zeon.energySystem.common.controller.SaleTaxItemController;
import zeon.energySystem.common.model.SaleTaxItem;
/**
 *
 * @author Zeon-IT
 */
public class SaleTaxItemControllerImpl extends UnicastRemoteObject implements SaleTaxItemController{
 private final SaleTaxItemDaoImpl daoImpl = new SaleTaxItemDaoImpl();
    public SaleTaxItemControllerImpl()throws RemoteException{
        
    }
    @Override
    public boolean addSaleTaxItem(SaleTaxItem item) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.addSaleTaxItem(item);
    }

    @Override
    public boolean updateSaleTaxItem(SaleTaxItem item) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SaleTaxItem searchSaleTaxItem(String itemId) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.searchSaleTaxItem(itemId);
    }

    @Override
    public boolean deleteSaleTaxDelete(int itemId) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SaleTaxItem> getAllSaleTaxItem() throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.getAllSaleTaxItem();
    }
    
}
