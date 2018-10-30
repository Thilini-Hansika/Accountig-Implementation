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
import zeon.energySystem.DaoImpl.TransferDaoImpl;
import zeon.energySystem.common.controller.TransferController;
import zeon.energySystem.common.model.Transfer;
/**
 *
 * @author ZeonIT
 */
public class TransferControllerImpl extends UnicastRemoteObject implements TransferController{
private final TransferDaoImpl daoImpl = new TransferDaoImpl();

    public TransferControllerImpl()throws RemoteException{
        
    }
    @Override
    public boolean addTransferFund(Transfer transfer) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.addTransferFund(transfer);
    }

    @Override
    public boolean updateTransferFund(Transfer transfer) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteTransferFund(int id) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Transfer> getAllTransferFund() throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
