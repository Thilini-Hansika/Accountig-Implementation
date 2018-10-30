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
import zeon.energySystem.common.dao.ItemTypeDao;
import zeon.energySystem.common.model.ItemType;
import zeon.energySystem.util.HibernateUtil;
/**
 *
 * @author ZeonIT
 */
public class ItemTypeDaoImpl extends UnicastRemoteObject implements ItemTypeDao{

   
    public ItemTypeDaoImpl()throws RemoteException{
        
    }
    @Override
    public boolean addItemType(ItemType item) throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.save(item);
        transaction.commit();
        return true;
    }

    @Override
    public boolean updateItemType(ItemType item) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ItemType searchItemType(String itemId) throws RemoteException, SQLException, ClassNotFoundException {
          SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM ItemType WHERE categoryName = '"+itemId+"'";
        Query query = session.createQuery(hql);
        ItemType itemType = (ItemType) query.uniqueResult();
        transaction.commit();
        return itemType;
    }

    @Override
    public boolean deleteItemType(int itemId) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ItemType> getAllItemType() throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM ItemType";
        Query query = session.createQuery(hql);
        List results = query.list();
        transaction.commit();
        return results;
    }
    
}
