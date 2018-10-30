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
import zeon.energySystem.common.model.Journal;

/**
 *
 * @author ZeonIT
 */
public interface JournalDao extends Remote{
    public boolean addJournal(Journal journal)throws RemoteException,SQLException, ClassNotFoundException;
    public boolean updateJournal(Journal journal)throws RemoteException,SQLException, ClassNotFoundException;    
    public boolean deleteJournal(int id)throws RemoteException,SQLException, ClassNotFoundException;
    public List<Journal>getAllJournal()throws RemoteException,SQLException, ClassNotFoundException;
    public Journal getLastJournal()throws RemoteException,SQLException, ClassNotFoundException;
    public List<Journal> getJournalByAccNo(int accNo)throws RemoteException,SQLException, ClassNotFoundException;
    public List<Journal> getJournalByDate(String convertFrom, String convertTo)throws RemoteException,SQLException, ClassNotFoundException;
    public List<Journal> getAllJournalById(String journalId)throws RemoteException,SQLException, ClassNotFoundException;
}
