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
import zeon.energySystem.common.model.Expence;


/**
 *
 * @author ZeonIT
 */
public interface ExpenceDao extends Remote{
    public boolean addExpence(Expence expence)throws RemoteException,SQLException, ClassNotFoundException;
    public boolean updateExpence(Expence expence)throws RemoteException,SQLException, ClassNotFoundException;    
    public boolean deleteExpence(int id)throws RemoteException,SQLException, ClassNotFoundException;
    public Expence searchExpenceByName(String id)throws RemoteException,SQLException, ClassNotFoundException;
    public List<Expence>getAllExpence()throws RemoteException,SQLException, ClassNotFoundException;
    public Expence getLastExpence()throws RemoteException,SQLException, ClassNotFoundException;
    public List<Expence> getAllExpenseByDate(String convertFrom, String convertTo)throws RemoteException,SQLException, ClassNotFoundException;
    public List<Expence> getAllExpenceById(String purchaseId)throws RemoteException,SQLException, ClassNotFoundException;

}
