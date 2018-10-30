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
import zeon.energySystem.DaoImpl.ChequeDaoImpl;
import zeon.energySystem.common.controller.ChequeController;
import zeon.energySystem.common.model.Cheque;
/**
 *
 * @author ZeonIT
 */
public class ChequeControllerImpl extends UnicastRemoteObject implements ChequeController{
    private final ChequeDaoImpl daoImpl = new ChequeDaoImpl();
    public ChequeControllerImpl()throws RemoteException{
        
    }
    @Override
    public boolean addCheque(Cheque cheque) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.addCheque(cheque);
    }

    @Override
    public boolean updateCheque(Cheque cheque) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteCheque(int id) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cheque> getAllCheque() throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cheque getChequeByChequeId(String cheqNo) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.getChequeByChequeId(cheqNo);
    }
    
}
