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
import zeon.energySystem.common.dao.TaxDao;
import zeon.energySystem.common.model.Tax;
import zeon.energySystem.util.HibernateUtil;

/**
 *
 * @author Zeon-IT
 */
public class TaxDaoImpl extends UnicastRemoteObject implements TaxDao{

    public TaxDaoImpl()throws RemoteException{
    }
    @Override
    public boolean addTax(Tax tax) throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.save(tax);
        transaction.commit();
        return true;
    }

    @Override
    public boolean updateTax(Tax tax) throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.update(tax);
        transaction.commit();
        return true;
    }

    @Override
    public Tax searchTax(String taxId) throws RemoteException, SQLException, ClassNotFoundException {
      SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM Tax WHERE taxCode = '"+taxId+"'";
        Query query = session.createQuery(hql);
        Tax tax = (Tax) query.uniqueResult();
        transaction.commit();
        return tax;
    }

    @Override
    public boolean deleteTax(int taxId) throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        Tax tax = (Tax) session.get(Tax.class, taxId);
        session.delete(tax);
        transaction.commit();
        return true;
    }

    @Override
    public List<Tax> getAllTax() throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM Tax";
        Query query = session.createQuery(hql);
        List results = query.list();
        transaction.commit();
        return results;
    }
    
}
