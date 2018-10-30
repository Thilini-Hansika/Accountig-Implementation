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
import zeon.energySystem.DaoImpl.IncomeAccountDaoImpl;
import zeon.energySystem.common.controller.IncomeAccountController;
import zeon.energySystem.common.model.IncomeAccount;
/**
 *
 * @author ZeonIT
 */
public class IncomeAccountControllerImpl extends UnicastRemoteObject implements IncomeAccountController{
public final IncomeAccountDaoImpl daoImpl = new IncomeAccountDaoImpl();
    public IncomeAccountControllerImpl()throws RemoteException{
        
    }
    @Override
    public boolean addIncomeAccount(IncomeAccount incomeAccount) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.addIncomeAccount(incomeAccount);
    }

    @Override
    public boolean updateIncomeAccount(IncomeAccount incomeAccount) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteIncomeAccount(int id) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<IncomeAccount> getAllIncomeAccount() throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<IncomeAccount> getAllIncomeAccountByDate() throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<IncomeAccount> getAllIncomeAccountByDate(String convertFrom, String convertTo) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.getAllIncomeAccountByDate(convertFrom, convertTo);
    }
    
}
