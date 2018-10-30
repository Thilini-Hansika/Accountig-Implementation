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
import zeon.energySystem.common.model.OtherChargeItem;

/**
 *
 * @author Zeon-IT
 */
public interface OtherChargeItemController extends Remote{
     public boolean addOtherChargeItem(OtherChargeItem item)throws RemoteException,SQLException,ClassNotFoundException;
    public boolean updateOtherChargeItem(OtherChargeItem item)throws RemoteException,SQLException,ClassNotFoundException;
    public OtherChargeItem searchOtherChargeItem(String itemId)throws RemoteException,SQLException,ClassNotFoundException;
    public boolean deleteOtherChargeDelete(int itemId)throws RemoteException,SQLException,ClassNotFoundException;
    public List<OtherChargeItem>getAllOtherChargeItem()throws RemoteException,SQLException, ClassNotFoundException;
}
