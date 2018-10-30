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
import zeon.energySystem.common.model.Terms;

/**
 *
 * @author Zeon-IT
 */
public interface TermsDao extends Remote{
    public boolean addTerms(Terms terms)throws RemoteException,SQLException, ClassNotFoundException;
    public boolean updateTerms(Terms terms)throws RemoteException,SQLException, ClassNotFoundException;    
    public boolean deleteTerms(String id)throws RemoteException,SQLException, ClassNotFoundException;
    public Terms searchTerms(String id)throws RemoteException,SQLException, ClassNotFoundException;
    public List<Terms> getAllTerms()throws RemoteException,SQLException, ClassNotFoundException;
}
