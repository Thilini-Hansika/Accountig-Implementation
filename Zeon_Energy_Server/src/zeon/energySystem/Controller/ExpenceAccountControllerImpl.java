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
import zeon.energySystem.DaoImpl.ExpenceAccountDaoImpl;
import zeon.energySystem.common.controller.ExpenceAccountController;
import zeon.energySystem.common.model.ExpenceAccount;
/**
 *
 * @author ZeonIT
 */
public class ExpenceAccountControllerImpl extends UnicastRemoteObject implements ExpenceAccountController{

    private ExpenceAccountDaoImpl daoImpl = new ExpenceAccountDaoImpl();
    
    public ExpenceAccountControllerImpl()throws RemoteException{
        
    }
    @Override
    public boolean addExpenceAccount(ExpenceAccount expenceAccount) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.addExpenceAccount(expenceAccount);
    }

    @Override
    public boolean updateExpenceAccount(ExpenceAccount expenceAccount) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteExpenceAccount(int id) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExpenceAccount searchExpenceAccountByName(String id) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ExpenceAccount> getAllExpenceAccount() throws RemoteException, SQLException, ClassNotFoundException {
       return daoImpl.getAllExpenceAccount();
    }
    
}
