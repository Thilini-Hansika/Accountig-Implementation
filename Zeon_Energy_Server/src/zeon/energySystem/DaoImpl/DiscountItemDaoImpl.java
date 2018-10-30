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
import zeon.energySystem.common.dao.DiscountItemDao;
import zeon.energySystem.common.model.DiscountItem;
import zeon.energySystem.util.HibernateUtil;
/**
 *
 * @author Zeon-IT
 */
public class DiscountItemDaoImpl extends UnicastRemoteObject implements DiscountItemDao{

    public DiscountItemDaoImpl()throws RemoteException{
        
    }
    @Override
    public boolean addDiscountItemItem(DiscountItem item) throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.save(item);
        transaction.commit();
        return true;
    }

    @Override
    public boolean updateDiscountItemItem(DiscountItem item) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DiscountItem searchDiscountItemItem(String itemId) throws RemoteException, SQLException, ClassNotFoundException {
         SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM DiscountItem WHERE itemName = '"+itemId+"'";
        Query query = session.createQuery(hql);
        DiscountItem discountItem = (DiscountItem) query.uniqueResult();
        transaction.commit();
        return discountItem;
    }

    @Override
    public boolean deleteDiscountItemDelete(int itemId) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DiscountItem> getAllDiscountItemItem() throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM DiscountItem";
        Query query = session.createQuery(hql);
        List results = query.list();
        transaction.commit();
        return results;
    }
    
}
