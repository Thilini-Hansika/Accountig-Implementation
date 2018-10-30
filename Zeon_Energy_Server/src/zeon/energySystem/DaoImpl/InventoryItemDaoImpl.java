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
import zeon.energySystem.common.dao.InventoryItemDao;
import zeon.energySystem.common.model.InventoryItem;
import zeon.energySystem.util.HibernateUtil;
/**
 *
 * @author ZeonIT
 */
public class InventoryItemDaoImpl extends UnicastRemoteObject implements InventoryItemDao{

    public InventoryItemDaoImpl()throws RemoteException{
        
    }
    @Override
    public boolean addInventoryItem(InventoryItem item) throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.save(item);
        transaction.commit();
        return true;
    }

    @Override
    public boolean updateInventoryItem(InventoryItem item) throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.update(item);
        transaction.commit();
        return true;
    }

    @Override
    public InventoryItem searchInventoryItem(String itemId,String batchNo) throws RemoteException, SQLException, ClassNotFoundException {
       SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM InventoryItem WHERE inventoryName = '"+itemId+"' AND batchNo = '"+batchNo+"'";
        Query query = session.createQuery(hql);
        InventoryItem inventoryItem = (InventoryItem) query.uniqueResult();
        transaction.commit();
        return inventoryItem;
    }

    @Override
    public boolean deleteInventoryDelete(int itemId) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<InventoryItem> getAllInventoryItem() throws RemoteException, SQLException, ClassNotFoundException {
           SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM InventoryItem";
        Query query = session.createQuery(hql);
        List results = query.list();
        transaction.commit();
        return results;
    }

    @Override
    public List<InventoryItem> getAllInventoryItem(String itemName) throws RemoteException, SQLException, ClassNotFoundException {
         SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM InventoryItem WHERE inventoryName = '"+itemName+"'";
        Query query = session.createQuery(hql);
        List results = query.list();
        transaction.commit();
        return results;
    }

    @Override
    public InventoryItem searchInventoryByCogsNo(int accNo) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public InventoryItem searchInventoryItemByCogs(String itemName, String batchNo, int accNo) throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM InventoryItem WHERE inventoryName = '"+itemName+"' AND batchNo = '"+batchNo+"' AND costAccNo = '"+accNo+"'";
        Query query = session.createQuery(hql);
        InventoryItem inventoryItem = (InventoryItem) query.uniqueResult();
        transaction.commit();
        return inventoryItem;
    }

    @Override
    public InventoryItem searchInventoryItemByIncome(String itemName, String batchNo, int accNo) throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM InventoryItem WHERE inventoryName = '"+itemName+"' AND batchNo = '"+batchNo+"' AND incomeAccNo = '"+accNo+"'";
        Query query = session.createQuery(hql);
        InventoryItem inventoryItem = (InventoryItem) query.uniqueResult();
        transaction.commit();
        return inventoryItem;
    }
    
}
