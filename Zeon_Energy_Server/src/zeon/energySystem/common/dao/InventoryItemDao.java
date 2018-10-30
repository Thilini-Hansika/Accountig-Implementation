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
import zeon.energySystem.common.model.InventoryItem;

/**
 *
 * @author ZeonIT
 */
public interface InventoryItemDao extends Remote{
    public boolean addInventoryItem(InventoryItem item)throws RemoteException,SQLException,ClassNotFoundException;
    public boolean updateInventoryItem(InventoryItem item)throws RemoteException,SQLException,ClassNotFoundException;
    public InventoryItem searchInventoryItem(String itemId,String batchNo)throws RemoteException,SQLException,ClassNotFoundException;
    public boolean deleteInventoryDelete(int itemId)throws RemoteException,SQLException,ClassNotFoundException;
    public List<InventoryItem>getAllInventoryItem()throws RemoteException,SQLException, ClassNotFoundException;
    public List<InventoryItem> getAllInventoryItem(String itemName)throws RemoteException,SQLException, ClassNotFoundException;
    public InventoryItem searchInventoryByCogsNo(int accNo)throws RemoteException,SQLException, ClassNotFoundException;
    public InventoryItem searchInventoryItemByCogs(String itemName, String batchNo, int accNo)throws RemoteException,SQLException, ClassNotFoundException;
    public InventoryItem searchInventoryItemByIncome(String itemName, String batchNo, int accNo)throws RemoteException,SQLException, ClassNotFoundException;
    
}
