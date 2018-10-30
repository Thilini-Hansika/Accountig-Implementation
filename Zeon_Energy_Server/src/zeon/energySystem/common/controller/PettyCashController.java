/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeon.energySystem.common.controller;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.List;
import zeon.energySystem.common.model.PettyCash;

/**
 *
 * @author Zeon-IT
 */
public interface PettyCashController extends Remote{
    public boolean addPrettyCash(PettyCash prettyCash) throws RemoteException,ClassNotFoundException,SQLException;
    public boolean updatePrettyCash(PettyCash prettyCash) throws RemoteException,ClassNotFoundException,SQLException;
    public boolean deletePtrettyCash(int id) throws RemoteException,ClassNotFoundException,SQLException;
    public PettyCash searchPrettyCash(int id) throws RemoteException,ClassNotFoundException,SQLException;
    public List<PettyCash>getAllprettyCash()throws RemoteException,SQLException, ClassNotFoundException;
    public PettyCash getLastRecord()throws RemoteException,SQLException, ClassNotFoundException;
    public PettyCash getPettyCashById(String pettyId)throws RemoteException,SQLException, ClassNotFoundException;

    
    
}
