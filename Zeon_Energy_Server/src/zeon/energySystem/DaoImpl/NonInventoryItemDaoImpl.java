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
import zeon.energySystem.common.dao.NonInventoryItemDao;
import zeon.energySystem.common.model.NonInventoryItem;
import zeon.energySystem.util.HibernateUtil;
/**
 *
 * @author Zeon-IT
 */
public class NonInventoryItemDaoImpl extends UnicastRemoteObject implements NonInventoryItemDao{

    public NonInventoryItemDaoImpl()throws RemoteException{
        
    }
    @Override
    public boolean addInventoryItem(NonInventoryItem item) throws RemoteException, SQLException, ClassNotFoundException {
         SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.save(item);
        transaction.commit();
        return true;
    }

    @Override
    public boolean updateInventoryItem(NonInventoryItem item) throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.update(item);
        transaction.commit();
        return true;
    }

    @Override
    public NonInventoryItem searchInventoryItem(String itemId) throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM NonInventoryItem WHERE itemName = '"+itemId+"'";
        Query query = session.createQuery(hql);
        NonInventoryItem inventoryItem = (NonInventoryItem) query.uniqueResult();
        transaction.commit();
        return inventoryItem;
    }

    @Override
    public boolean deleteInventoryDelete(int itemId) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<NonInventoryItem> getAllInventoryItem() throws RemoteException, SQLException, ClassNotFoundException {
         SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM NonInventoryItem";
        Query query = session.createQuery(hql);
        List results = query.list();
        transaction.commit();
        return results;
    }

    @Override
    public boolean updateInventoryItemQTY(int itemId, int qty) throws RemoteException, SQLException, ClassNotFoundException {
       SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "update nonInventoryItem  set qty = '"+qty+"' where itemId = '"+itemId+"'";
        Query query = session.createQuery(hql);
       
        transaction.commit();
        return true;
    }
    
}
