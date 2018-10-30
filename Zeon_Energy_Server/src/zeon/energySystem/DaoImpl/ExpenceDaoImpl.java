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
import zeon.energySystem.common.dao.ExpenceDao;
import zeon.energySystem.common.model.Expence;
import zeon.energySystem.util.HibernateUtil;
/**
 *
 * @author ZeonIT
 */
public class ExpenceDaoImpl extends UnicastRemoteObject implements ExpenceDao{

    public ExpenceDaoImpl()throws RemoteException{
        
    }
    @Override
    public boolean addExpence(Expence expence) throws RemoteException, SQLException, ClassNotFoundException {
         SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.save(expence);
        transaction.commit();
        return true;
    }

    @Override
    public boolean updateExpence(Expence expence) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteExpence(int id) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Expence> getAllExpence() throws RemoteException, SQLException, ClassNotFoundException {
         SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM Expence";
        Query query = session.createQuery(hql);
        List results = query.list();
        transaction.commit();
        return results;
    }

    @Override
    public Expence searchExpenceByName(String id) throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM Expence WHERE expenceCompanyId = '"+id+"'";
        Query query = session.createQuery(hql);
        Expence expence = (Expence) query.uniqueResult();
        transaction.commit();
        return expence;
    }

    @Override
    public Expence getLastExpence() throws RemoteException, SQLException, ClassNotFoundException {
         SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM Expence ORDER BY expenceId DESC";
        Query query = session.createQuery(hql).setMaxResults(1);
        Expence expence = (Expence) query.uniqueResult();
        transaction.commit();
        return expence;
    }

    @Override
    public List<Expence> getAllExpenseByDate(String convertFrom, String convertTo) throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM Expence WHERE expenceDate BETWEEN '"+convertFrom+"' AND '"+convertTo+"' ";
        Query query = session.createQuery(hql);
        List results = query.list();
        transaction.commit();
        return results;
    }

    @Override
    public List<Expence> getAllExpenceById(String purchaseId) throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM Expence WHERE expenceCompanyId = '"+purchaseId+"'";
        Query query = session.createQuery(hql);
        List results = query.list();
        transaction.commit();
        return results;
    }
    
}
