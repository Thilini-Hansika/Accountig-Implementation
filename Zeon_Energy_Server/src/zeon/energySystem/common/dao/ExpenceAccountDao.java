/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeon.energySystem.common.dao;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.List;
import zeon.energySystem.common.model.ExpenceAccount;

/**
 *
 * @author ZeonIT
 */
public interface ExpenceAccountDao extends Remote{
    public boolean addExpenceAccount(ExpenceAccount expence)throws RemoteException,SQLException, ClassNotFoundException;
    public boolean updateExpenceAccount(ExpenceAccount expence)throws RemoteException,SQLException, ClassNotFoundException;    
    public boolean deleteExpenceAccount(int id)throws RemoteException,SQLException, ClassNotFoundException;
    public ExpenceAccount searchExpenceAccountByName(String id)throws RemoteException,SQLException, ClassNotFoundException;
    public List<ExpenceAccount>getAllExpenceAccount()throws RemoteException,SQLException, ClassNotFoundException;
}
