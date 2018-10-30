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
import zeon.energySystem.common.model.Tax;

/**
 *
 * @author Zeon-IT
 */
public interface TaxDao extends Remote{
   public boolean addTax(Tax tax)throws RemoteException,SQLException,ClassNotFoundException;
    public boolean updateTax(Tax tax)throws RemoteException,SQLException,ClassNotFoundException;
    public Tax searchTax(String taxId)throws RemoteException,SQLException,ClassNotFoundException;
    public boolean deleteTax(int taxId)throws RemoteException,SQLException,ClassNotFoundException;
    public List<Tax>getAllTax()throws RemoteException,SQLException, ClassNotFoundException;
}
