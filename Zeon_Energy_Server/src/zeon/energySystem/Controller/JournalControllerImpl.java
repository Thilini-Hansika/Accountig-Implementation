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
import zeon.energySystem.DaoImpl.JournalDaoImpl;
import zeon.energySystem.common.controller.JournalController;
import zeon.energySystem.common.model.Journal;
/**
 *
 * @author ZeonIT
 */
public class JournalControllerImpl extends UnicastRemoteObject implements JournalController{

    private final JournalDaoImpl daoImpl = new JournalDaoImpl();
    public JournalControllerImpl()throws RemoteException{
        
    }
    @Override
    public boolean addJournal(Journal journal) throws RemoteException, SQLException, ClassNotFoundException {
       return daoImpl.addJournal(journal);
    }

    @Override
    public boolean updateJournal(Journal journal) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteJournal(int id) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Journal> getAllJournal() throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Journal getLastJournal() throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.getLastJournal();
    }

    @Override
    public List<Journal> getJournalByAccNo(int accNo) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.getJournalByAccNo(accNo);
    }

    @Override
    public List<Journal> getJournalByDate(String convertFrom, String convertTo) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.getJournalByDate(convertFrom, convertTo);
    }

    @Override
    public List<Journal> getAllJournalById(String journalId) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.getAllJournalById(journalId);
    }
    
}
