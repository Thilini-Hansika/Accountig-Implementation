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
import zeon.energySystem.common.model.IncomeAccount;

/**
 *
 * @author ZeonIT
 */
public interface IncomeAccountController extends Remote{
    public boolean addIncomeAccount(IncomeAccount incomeAccount)throws RemoteException,SQLException, ClassNotFoundException;
    public boolean updateIncomeAccount(IncomeAccount incomeAccount)throws RemoteException,SQLException, ClassNotFoundException;    
    public boolean deleteIncomeAccount(int id)throws RemoteException,SQLException, ClassNotFoundException;
    public List<IncomeAccount>getAllIncomeAccount()throws RemoteException,SQLException, ClassNotFoundException;
    public List<IncomeAccount> getAllIncomeAccountByDate()throws RemoteException,SQLException, ClassNotFoundException;

    public List<IncomeAccount> getAllIncomeAccountByDate(String convertFrom, String convertTo)throws RemoteException,SQLException, ClassNotFoundException;
}
