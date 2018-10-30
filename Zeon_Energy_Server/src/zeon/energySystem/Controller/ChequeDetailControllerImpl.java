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
import zeon.energySystem.DaoImpl.ChequeDetailDaoImpl;
import zeon.energySystem.common.controller.ChequeDetailController;
import zeon.energySystem.common.model.ChequeDetails;
/**
 *
 * @author ZeonIT
 */
public class ChequeDetailControllerImpl extends UnicastRemoteObject implements ChequeDetailController{

    private final ChequeDetailDaoImpl daoImpl = new ChequeDetailDaoImpl();
    public ChequeDetailControllerImpl()throws RemoteException{
        
    }
    @Override
    public List<ChequeDetails> getAllChequeDetails() throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ChequeDetails> getDetailByDate(String convertFrom, String convertTo) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.getDetailByDate(convertFrom, convertTo);
    }

    @Override
    public List<ChequeDetails> getDetailByAccountId(int accNo) throws RemoteException, SQLException, ClassNotFoundException {
       return daoImpl.getDetailByAccountId(accNo);
    }
    
}
