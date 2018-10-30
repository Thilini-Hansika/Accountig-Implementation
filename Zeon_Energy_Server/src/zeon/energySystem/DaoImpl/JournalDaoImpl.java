/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeon.energySystem.DaoImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import zeon.energySystem.common.dao.JournalDao;
import zeon.energySystem.common.model.Journal;
import zeon.energySystem.util.HibernateUtil;
/**
 *
 * @author ZeonIT
 */
public class JournalDaoImpl extends UnicastRemoteObject implements JournalDao{

    public JournalDaoImpl()throws RemoteException{
        
    }
    @Override
    public boolean addJournal(Journal journal) throws RemoteException, SQLException, ClassNotFoundException {
          SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.save(journal);
        transaction.commit();
        return true;
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
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM Journal ORDER BY companyJornalId DESC";
        Query query = session.createQuery(hql).setMaxResults(1);
        Journal journal = (Journal) query.uniqueResult();
        transaction.commit();
        return journal;
    }

    @Override
    public List<Journal> getJournalByAccNo(int accNo) throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM Journal WHERE accountNo = '"+accNo+"'";
        Query query = session.createQuery(hql);
        List results = query.list();
        transaction.commit();
        return results;
    }

    @Override
    public List<Journal> getJournalByDate(String convertFrom, String convertTo) throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM Journal WHERE date BETWEEN '"+convertFrom+"' AND '"+convertTo+"' ";
        Query query = session.createQuery(hql);
        List results = query.list();
        transaction.commit();
        return results;
    }

    @Override
    public List<Journal> getAllJournalById(String journalId) throws RemoteException, SQLException, ClassNotFoundException {
         SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM Journal WHERE companyJornalId = '" + journalId + "'";
        Query query = session.createQuery(hql);
        List results = query.list();
        transaction.commit();
        return results;
    }
    
}
