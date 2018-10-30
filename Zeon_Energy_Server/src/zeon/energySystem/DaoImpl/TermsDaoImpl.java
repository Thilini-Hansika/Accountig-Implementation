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
import zeon.energySystem.common.dao.TermsDao;
import zeon.energySystem.common.model.Terms;
import zeon.energySystem.util.HibernateUtil;

/**
 *
 * @author Zeon-IT
 */
public class TermsDaoImpl extends UnicastRemoteObject implements TermsDao{

    public TermsDaoImpl()throws RemoteException{
        
    }
    @Override
    public boolean addTerms(Terms terms) throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.save(terms);
        transaction.commit();
        return true;
    }

    @Override
    public boolean updateTerms(Terms terms) throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.update(terms);
        transaction.commit();
        return true;
    }

    @Override
    public boolean deleteTerms(String id) throws RemoteException, SQLException, ClassNotFoundException {
         SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        Terms terms = (Terms) session.get(Terms.class, id);
        session.delete(terms);
        transaction.commit();
        return true;
    }

    @Override
    public Terms searchTerms(String id) throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM Terms WHERE termsName = '"+id+"'";
        Query query = session.createQuery(hql);
        Terms terms = (Terms) query.uniqueResult();
        transaction.commit();
        return terms;
    }

    @Override
    public List<Terms> getAllTerms() throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM Terms";
        Query query = session.createQuery(hql);
        List results = query.list();
        transaction.commit();
        return results;
    }
    
}
