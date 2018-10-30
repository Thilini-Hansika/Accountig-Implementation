/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeon.energySystem.common.controller;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.List;
import zeon.energySystem.common.model.ServiceItem;

/**
 *
 * @author Zeon-IT
 */
public interface ServiceItemController extends Remote{
    public boolean addServiceItem(ServiceItem item)throws RemoteException,SQLException,ClassNotFoundException;
    public boolean updateServiceItem(ServiceItem item)throws RemoteException,SQLException,ClassNotFoundException;
    public ServiceItem searchServiceItem(String itemId)throws RemoteException,SQLException,ClassNotFoundException;
    public boolean deleteServiceDelete(int itemId)throws RemoteException,SQLException,ClassNotFoundException;
    public List<ServiceItem>getAllServiceItem()throws RemoteException,SQLException, ClassNotFoundException;
}
