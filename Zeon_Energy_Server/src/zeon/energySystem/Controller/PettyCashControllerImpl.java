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
import zeon.energySystem.DaoImpl.PrettyCashDaoImpl;
import zeon.energySystem.common.model.PettyCash;
import zeon.energySystem.common.controller.PettyCashController;

/**
 *
 * @author Zeon-IT
 */
public class PettyCashControllerImpl extends UnicastRemoteObject implements PettyCashController{
    
    private final PrettyCashDaoImpl prettyCashDaoImpl=new PrettyCashDaoImpl();
    public PettyCashControllerImpl()throws RemoteException{
        
    }

    @Override
    public boolean addPrettyCash(PettyCash prettyCash) throws RemoteException, ClassNotFoundException, SQLException {
        return prettyCashDaoImpl.addPrettyCash(prettyCash);
    }

    @Override
    public boolean updatePrettyCash(PettyCash prettyCash) throws RemoteException, ClassNotFoundException, SQLException {
        return prettyCashDaoImpl.updatePrettyCash(prettyCash);
    }

    @Override
    public boolean deletePtrettyCash(int id) throws RemoteException, ClassNotFoundException, SQLException {
        return prettyCashDaoImpl.deletePtrettyCash(id);
    }

    @Override
    public PettyCash searchPrettyCash(int id) throws RemoteException, ClassNotFoundException, SQLException {
        return prettyCashDaoImpl.searchPrettyCash(id);
    }

    @Override
    public List<PettyCash> getAllprettyCash() throws RemoteException, SQLException, ClassNotFoundException {
        return prettyCashDaoImpl.getAllprettyCash();
    }

    @Override
    public PettyCash getLastRecord() throws RemoteException, SQLException, ClassNotFoundException {
        return prettyCashDaoImpl.getLastRecord();
    }

    @Override
    public PettyCash getPettyCashById(String pettyId) throws RemoteException, SQLException, ClassNotFoundException {
        return prettyCashDaoImpl.getPettyCashById(pettyId);
    }
}
