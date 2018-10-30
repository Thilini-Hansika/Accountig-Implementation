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
import zeon.energySystem.common.model.Cheque;

/**
 *
 * @author ZeonIT
 */
public interface ChequeController extends Remote{
    public boolean addCheque(Cheque cheque)throws RemoteException,SQLException, ClassNotFoundException;
    public boolean updateCheque(Cheque cheque)throws RemoteException,SQLException, ClassNotFoundException;    
    public boolean deleteCheque(int id)throws RemoteException,SQLException, ClassNotFoundException;
    public List<Cheque>getAllCheque()throws RemoteException,SQLException, ClassNotFoundException;
    public Cheque getChequeByChequeId(String cheqNo)throws RemoteException,SQLException, ClassNotFoundException;
}
