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
import zeon.energySystem.common.model.Purchase;

/**
 *
 * @author Zeon-IT
 */
public interface PurchaseDao extends Remote{
    public boolean addPurchaseItem(Purchase item)throws RemoteException,SQLException,ClassNotFoundException;
    public boolean updatePurchaseItem(Purchase item)throws RemoteException,SQLException,ClassNotFoundException;
    public Purchase searchPurchaseItem(String itemId)throws RemoteException,SQLException,ClassNotFoundException;
    public boolean deletePurchaseItem(int itemId)throws RemoteException,SQLException,ClassNotFoundException;
    public List<Purchase>getAllPurchaseItem()throws RemoteException,SQLException, ClassNotFoundException;
    public List<Purchase> getAllPurchaseItemByVendor(int vendorId)throws RemoteException,SQLException, ClassNotFoundException;
    public Purchase getLastPurchase()throws RemoteException,SQLException, ClassNotFoundException;
}
