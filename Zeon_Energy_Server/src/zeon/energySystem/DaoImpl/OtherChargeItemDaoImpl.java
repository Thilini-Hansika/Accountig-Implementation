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
import zeon.energySystem.common.controller.OtherChargeItemController;
import zeon.energySystem.common.dao.OtherChargeItemDao;
import zeon.energySystem.common.model.NonInventoryItem;
import zeon.energySystem.common.model.OtherChargeItem;
import zeon.energySystem.util.HibernateUtil;
/**
 *
 * @author Zeon-IT
 */
public class OtherChargeItemDaoImpl extends UnicastRemoteObject implements OtherChargeItemDao{

    public OtherChargeItemDaoImpl()throws RemoteException{
        
    }
    @Override
    public boolean addOtherChargeItem(OtherChargeItem item) throws RemoteException, SQLException, ClassNotFoundException {
         SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.save(item);
        transaction.commit();
        return true;
    }

    @Override
    public boolean updateOtherChargeItem(OtherChargeItem item) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public OtherChargeItem searchOtherChargeItem(String itemId) throws RemoteException, SQLException, ClassNotFoundException {
       SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM OtherChargeItem WHERE itemName = '"+itemId+"'";
        Query query = session.createQuery(hql);
        OtherChargeItem otherChargeItem = (OtherChargeItem) query.uniqueResult();
        transaction.commit();
        return otherChargeItem;
    }

    @Override
    public boolean deleteOtherChargeDelete(int itemId) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<OtherChargeItem> getAllOtherChargeItem() throws RemoteException, SQLException, ClassNotFoundException {
       SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM OtherChargeItem";
        Query query = session.createQuery(hql);
        List results = query.list();
        transaction.commit();
        return results;
    }
    
}
