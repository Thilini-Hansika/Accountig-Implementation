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
import zeon.energySystem.common.model.PurchaseItem;

/**
 *
 * @author Zeon-IT
 */
public interface PurchaseItemDao extends Remote{
    public List<Purchase>getAllPurchaseItem()throws RemoteException,SQLException, ClassNotFoundException;
    public List<PurchaseItem> getAllPurchaseById(String purchaseId)throws RemoteException,SQLException, ClassNotFoundException;
    
}
