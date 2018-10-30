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
import zeon.energySystem.DaoImpl.BankAccountDaoImpl;
import zeon.energySystem.common.controller.BankAccountController;
import zeon.energySystem.common.model.BankAccount;
/**
 *
 * @author ZeonIT
 */
public class BankAccountControllerImpl extends UnicastRemoteObject implements BankAccountController{
private final BankAccountDaoImpl daoImpl = new BankAccountDaoImpl();
    public BankAccountControllerImpl()throws RemoteException{
        
    }
    @Override
    public boolean addBankAccount(BankAccount account) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.addBankAccount(account);
    }

    @Override
    public boolean updateBankAccount(BankAccount account) throws RemoteException, SQLException, ClassNotFoundException {
       return daoImpl.updateBankAccount(account);
    }

    @Override
    public boolean deleteBankAccount(int id) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<BankAccount> getAllBankAccount() throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.getAllBankAccount();
    }

    @Override
    public BankAccount getBankAccountByNo(String bankAccountNo) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.getBankAccountByNo(bankAccountNo);
    }
    
}
