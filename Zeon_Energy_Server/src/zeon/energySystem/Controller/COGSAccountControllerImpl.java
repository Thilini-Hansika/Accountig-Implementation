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
import zeon.energySystem.DaoImpl.COGSAccountDaoImpl;
import zeon.energySystem.common.controller.COGSAccountController;
import zeon.energySystem.common.model.COGSAccount;
/**
 *
 * @author ZeonIT
 */
public class COGSAccountControllerImpl extends UnicastRemoteObject implements COGSAccountController{
public final COGSAccountDaoImpl daoImpl = new COGSAccountDaoImpl();
    public COGSAccountControllerImpl()throws RemoteException{
        
    }

    @Override
    public boolean addCOGSAccount(COGSAccount cOGSAccount) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.addCOGSAccount(cOGSAccount);
    }

    @Override
    public boolean updateCOGSAccount(COGSAccount cOGSAccount) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteCOGSAccount(int id) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<COGSAccount> getAllCOGSAccount() throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<COGSAccount> getCOGSByDateRange(String convertFrom, String convertTo) throws RemoteException, SQLException, ClassNotFoundException {
       return daoImpl.getCOGSByDateRange(convertFrom, convertTo);
    }

   
    
}
