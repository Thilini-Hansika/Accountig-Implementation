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
import zeon.energySystem.common.model.Account;

/**
 *
 * @author ZeonIT
 */
public interface AccountController extends Remote{
    public boolean addAccount(Account account)throws RemoteException,SQLException, ClassNotFoundException;
    public boolean updateAccount(Account account)throws RemoteException,SQLException, ClassNotFoundException;    
    public boolean deleteAccount(int id)throws RemoteException,SQLException, ClassNotFoundException;
    public List<Account>getAllAccount()throws RemoteException,SQLException, ClassNotFoundException;
    public Account getAccountByNo(int accountNo)throws RemoteException,SQLException, ClassNotFoundException;
    public Account getLastRow(int accountNo,String type)throws RemoteException,SQLException, ClassNotFoundException;

    public Account searchAccountByName(String expenseName)throws RemoteException,SQLException, ClassNotFoundException;
}
