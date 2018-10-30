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
import zeon.energySystem.common.model.COGSAccount;

/**
 *
 * @author ZeonIT
 */
public interface COGSAccountController extends Remote{
    public boolean addCOGSAccount(COGSAccount cOGSAccount)throws RemoteException,SQLException, ClassNotFoundException;
    public boolean updateCOGSAccount(COGSAccount cOGSAccount)throws RemoteException,SQLException, ClassNotFoundException;    
    public boolean deleteCOGSAccount(int id)throws RemoteException,SQLException, ClassNotFoundException;
    public List<COGSAccount>getAllCOGSAccount()throws RemoteException,SQLException, ClassNotFoundException;
    public List<COGSAccount> getCOGSByDateRange(String convertFrom, String convertTo)throws RemoteException,SQLException, ClassNotFoundException;
}
