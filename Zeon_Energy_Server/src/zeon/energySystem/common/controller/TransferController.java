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
import zeon.energySystem.common.model.Transfer;

/**
 *
 * @author ZeonIT
 */
public interface TransferController extends Remote{
    public boolean addTransferFund(Transfer transfer)throws RemoteException,SQLException, ClassNotFoundException;
    public boolean updateTransferFund(Transfer transfer)throws RemoteException,SQLException, ClassNotFoundException;    
    public boolean deleteTransferFund(int id)throws RemoteException,SQLException, ClassNotFoundException;
    public List<Transfer>getAllTransferFund()throws RemoteException,SQLException, ClassNotFoundException;
}
