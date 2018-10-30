/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeon.energySystem.common.dao;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.List;
import zeon.energySystem.common.model.NonInventoryItem;

/**
 *
 * @author Zeon-IT
 */
public interface NonInventoryItemDao extends Remote{
    public boolean addInventoryItem(NonInventoryItem item)throws RemoteException,SQLException,ClassNotFoundException;
    public boolean updateInventoryItem(NonInventoryItem item)throws RemoteException,SQLException,ClassNotFoundException;
    public NonInventoryItem searchInventoryItem(String itemId)throws RemoteException,SQLException,ClassNotFoundException;
    public boolean deleteInventoryDelete(int itemId)throws RemoteException,SQLException,ClassNotFoundException;
    public List<NonInventoryItem>getAllInventoryItem()throws RemoteException,SQLException, ClassNotFoundException;
    public boolean updateInventoryItemQTY(int itemId,int qty)throws RemoteException,SQLException,ClassNotFoundException;
}
