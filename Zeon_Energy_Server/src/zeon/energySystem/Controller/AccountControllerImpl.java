/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeon.energySystem.Controller;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.List;
import zeon.energySystem.DaoImpl.AccountDaoImpl;
import zeon.energySystem.common.controller.AccountController;
import zeon.energySystem.common.model.Account;
/**
 *
 * @author ZeonIT
 */
public class AccountControllerImpl extends UnicastRemoteObject implements AccountController{

    private final AccountDaoImpl daoImpl = new AccountDaoImpl();
    public AccountControllerImpl()throws RemoteException{
        
    }
    @Override
    public boolean addAccount(Account account) throws RemoteException, SQLException, ClassNotFoundException {
       return daoImpl.addAccount(account);
    }

    @Override
    public boolean updateAccount(Account account) throws RemoteException, SQLException, ClassNotFoundException {
       return daoImpl.updateAccount(account);
    }

    @Override
    public boolean deleteAccount(int id) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Account> getAllAccount() throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.getAllAccount();
    }

    @Override
    public Account getAccountByNo(int accountNo) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.getAccountByNo(accountNo);
    }

    @Override
    public Account getLastRow(int accountNo,String type) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.getLastRow(accountNo,type);
    }

    @Override
    public Account searchAccountByName(String expenseName) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.searchAccountByName(expenseName);
    }
    
}
