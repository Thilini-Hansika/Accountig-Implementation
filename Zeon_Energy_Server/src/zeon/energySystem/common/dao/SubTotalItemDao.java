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
import zeon.energySystem.common.model.SubTotalItem;

/**
 *
 * @author Zeon-IT
 */
public interface SubTotalItemDao extends Remote{
     public boolean addSubTotalItem(SubTotalItem item)throws RemoteException,SQLException,ClassNotFoundException;
    public boolean updateSubTotalItem(SubTotalItem item)throws RemoteException,SQLException,ClassNotFoundException;
    public SubTotalItem searchSubTotalItem(String itemId)throws RemoteException,SQLException,ClassNotFoundException;
    public boolean deleteSubTotalDelete(int itemId)throws RemoteException,SQLException,ClassNotFoundException;
    public List<SubTotalItem>getAllSubTotalItem()throws RemoteException,SQLException, ClassNotFoundException;
}
