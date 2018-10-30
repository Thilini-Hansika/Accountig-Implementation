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
import zeon.energySystem.DaoImpl.ServiceItemDaoImpl;
import zeon.energySystem.common.controller.ServiceItemController;
import zeon.energySystem.common.model.ServiceItem;
/**
 *
 * @author Zeon-IT
 */
public class ServiceItemControllerImpl extends UnicastRemoteObject implements ServiceItemController{
    private final ServiceItemDaoImpl daoImpl = new ServiceItemDaoImpl();
    public ServiceItemControllerImpl()throws RemoteException{
        
    }
    @Override
    public boolean addServiceItem(ServiceItem item) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.addServiceItem(item);
    }

    @Override
    public boolean updateServiceItem(ServiceItem item) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ServiceItem searchServiceItem(String itemId) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.searchServiceItem(itemId);
    }

    @Override
    public boolean deleteServiceDelete(int itemId) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ServiceItem> getAllServiceItem() throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.getAllServiceItem();
    }
    
}
