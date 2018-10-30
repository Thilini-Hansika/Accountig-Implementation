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
import zeon.energySystem.common.model.GroupItem;

/**
 *
 * @author Zeon-IT
 */
public interface GroupItemController extends Remote{
    public boolean addGroupItem(GroupItem item)throws RemoteException,SQLException,ClassNotFoundException;
    public boolean updateGroupItem(GroupItem item)throws RemoteException,SQLException,ClassNotFoundException;
    public GroupItem searchGroupItem(String itemId)throws RemoteException,SQLException,ClassNotFoundException;
    public boolean deleteGroupDelete(int itemId)throws RemoteException,SQLException,ClassNotFoundException;
    public List<GroupItem>getAllGroupItem()throws RemoteException,SQLException, ClassNotFoundException;
}
