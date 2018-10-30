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
import zeon.energySystem.DaoImpl.ExpenceDaoImpl;
import zeon.energySystem.common.controller.ExpenceController;
import zeon.energySystem.common.model.Expence;
/**
 *
 * @author ZeonIT
 */
public class ExpenceControllerImpl extends UnicastRemoteObject implements ExpenceController{
private final ExpenceDaoImpl  daoImpl = new ExpenceDaoImpl();
    public ExpenceControllerImpl()throws RemoteException{
        
    }
    @Override
    public boolean addExpence(Expence expence) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.addExpence(expence);
    }

    @Override
    public boolean updateExpence(Expence expence) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteExpence(int id) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Expence> getAllExpence() throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.getAllExpence();
                
    }

    @Override
    public Expence searchExpenceByName(String id) throws RemoteException, SQLException, ClassNotFoundException {
       return daoImpl.searchExpenceByName(id);
    }

    @Override
    public Expence getLastExpence() throws RemoteException, SQLException, ClassNotFoundException {
       return daoImpl.getLastExpence();
    }

    @Override
    public List<Expence> getAllExpenseByDate(String convertFrom, String convertTo) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.getAllExpenseByDate(convertFrom, convertTo);
    }

    @Override
    public List<Expence> getAllExpenceById(String purchaseId) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.getAllExpenceById(purchaseId);
    }
    
}
