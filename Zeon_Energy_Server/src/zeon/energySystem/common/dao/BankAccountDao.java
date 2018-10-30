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
import zeon.energySystem.common.model.BankAccount;

/**
 *
 * @author ZeonIT
 */
public interface BankAccountDao extends Remote{
    public boolean addBankAccount(BankAccount account)throws RemoteException,SQLException, ClassNotFoundException;
    public boolean updateBankAccount(BankAccount account)throws RemoteException,SQLException, ClassNotFoundException;    
    public boolean deleteBankAccount(int id)throws RemoteException,SQLException, ClassNotFoundException;
    public List<BankAccount>getAllBankAccount()throws RemoteException,SQLException, ClassNotFoundException;
    public BankAccount getBankAccountByNo(String bankAccountNo)throws RemoteException,SQLException, ClassNotFoundException;
    
}
