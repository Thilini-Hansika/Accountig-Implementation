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
import zeon.energySystem.common.model.DiscountItem;


/**
 *
 * @author Zeon-IT
 */
public interface DiscountItemDao extends Remote{
    public boolean addDiscountItemItem(DiscountItem item)throws RemoteException,SQLException,ClassNotFoundException;
    public boolean updateDiscountItemItem(DiscountItem item)throws RemoteException,SQLException,ClassNotFoundException;
    public DiscountItem searchDiscountItemItem(String itemId)throws RemoteException,SQLException,ClassNotFoundException;
    public boolean deleteDiscountItemDelete(int itemId)throws RemoteException,SQLException,ClassNotFoundException;
    public List<DiscountItem>getAllDiscountItemItem()throws RemoteException,SQLException, ClassNotFoundException;
}
