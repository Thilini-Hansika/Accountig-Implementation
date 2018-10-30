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
import zeon.energySystem.common.model.SaleTaxGroupItem;


/**
 *
 * @author Zeon-IT
 */
public interface SaleTaxGroupItemController extends Remote{
    public boolean addSaleTaxGroupItem(SaleTaxGroupItem item)throws RemoteException,SQLException,ClassNotFoundException;
    public boolean updateSaleTaxGroupItem(SaleTaxGroupItem item)throws RemoteException,SQLException,ClassNotFoundException;
    public SaleTaxGroupItem searchSaleTaxGroupItem(String itemId)throws RemoteException,SQLException,ClassNotFoundException;
    public boolean deleteSaleTaxGroupDelete(int itemId)throws RemoteException,SQLException,ClassNotFoundException;
    public List<SaleTaxGroupItem>getAllSaleTaxGroupItem()throws RemoteException,SQLException, ClassNotFoundException;
}
