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
import zeon.energySystem.common.model.SaleTaxItem;

/**
 *
 * @author Zeon-IT
 */
public interface SaleTaxItemController extends Remote{
    public boolean addSaleTaxItem(SaleTaxItem item)throws RemoteException,SQLException,ClassNotFoundException;
    public boolean updateSaleTaxItem(SaleTaxItem item)throws RemoteException,SQLException,ClassNotFoundException;
    public SaleTaxItem searchSaleTaxItem(String itemId)throws RemoteException,SQLException,ClassNotFoundException;
    public boolean deleteSaleTaxDelete(int itemId)throws RemoteException,SQLException,ClassNotFoundException;
    public List<SaleTaxItem>getAllSaleTaxItem()throws RemoteException,SQLException, ClassNotFoundException;
}
