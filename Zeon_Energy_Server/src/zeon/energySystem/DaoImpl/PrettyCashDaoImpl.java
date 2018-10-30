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
import zeon.energySystem.common.dao.PrettyCashDao;
import zeon.energySystem.common.model.PettyCash;
import zeon.energySystem.util.HibernateUtil;

/**
 *
 * @author Zeon-IT
 */
public class PrettyCashDaoImpl extends UnicastRemoteObject implements PrettyCashDao{
    public PrettyCashDaoImpl() throws RemoteException{
        
    }

    @Override
    public boolean addPrettyCash(PettyCash prettyCash) throws RemoteException, ClassNotFoundException, SQLException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(prettyCash);
        transaction.commit();
        return true;
    }

    @Override
    public boolean updatePrettyCash(PettyCash prettyCash) throws RemoteException, ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deletePtrettyCash(int id) throws RemoteException, ClassNotFoundException, SQLException {
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PettyCash searchPrettyCash(int id) throws RemoteException, ClassNotFoundException, SQLException {
        
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM PettyCash WHERE itemName = '"+id+"'";
        Query query = session.createQuery(hql);
        PettyCash prettyCash = (PettyCash) query.uniqueResult();
        transaction.commit();
        return prettyCash;
    }

    @Override
    public List<PettyCash> getAllprettyCash() throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM PettyCash";
        Query query = session.createQuery(hql);
        List results = query.list();
        transaction.commit();
        return results;
    }

    @Override
    public PettyCash getLastRecord() throws RemoteException, SQLException, ClassNotFoundException {
         SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM PettyCash ORDER BY id DESC";
        Query query = session.createQuery(hql).setMaxResults(1);
        PettyCash prettyCash = (PettyCash) query.uniqueResult();
        transaction.commit();
        return prettyCash;
    }

    @Override
    public PettyCash getPettyCashById(String pettyId) throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM PettyCash WHERE pettyId = '"+pettyId+"'";
        Query query = session.createQuery(hql);
        PettyCash pettyCash = (PettyCash) query.uniqueResult();
        transaction.commit();
        return pettyCash;
    }

}
