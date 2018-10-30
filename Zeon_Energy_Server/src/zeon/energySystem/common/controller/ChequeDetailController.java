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
import zeon.energySystem.common.model.ChequeDetails;

/**
 *
 * @author ZeonIT
 */
public interface ChequeDetailController extends Remote{
    public List<ChequeDetails>getAllChequeDetails()throws RemoteException,SQLException, ClassNotFoundException;
    public List<ChequeDetails> getDetailByDate(String convertFrom, String convertTo)throws RemoteException,SQLException, ClassNotFoundException;
    public List<ChequeDetails> getDetailByAccountId(int accNo)throws RemoteException,SQLException, ClassNotFoundException;
}
