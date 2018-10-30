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
import zeon.energySystem.common.model.ItemType;

/**
 *
 * @author ZeonIT
 */
public interface ItemTypeDao extends Remote{
    public boolean addItemType(ItemType item)throws RemoteException,SQLException,ClassNotFoundException;
    public boolean updateItemType(ItemType item)throws RemoteException,SQLException,ClassNotFoundException;
    public ItemType searchItemType(String itemId)throws RemoteException,SQLException,ClassNotFoundException;
    public boolean deleteItemType(int itemId)throws RemoteException,SQLException,ClassNotFoundException;
    public List<ItemType>getAllItemType()throws RemoteException,SQLException, ClassNotFoundException;
}
