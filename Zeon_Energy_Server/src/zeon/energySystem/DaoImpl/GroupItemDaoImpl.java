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
import zeon.energySystem.common.controller.GroupItemController;
import zeon.energySystem.common.dao.GroupItemDao;
import zeon.energySystem.common.model.FixedAsset;
import zeon.energySystem.common.model.GroupItem;
import zeon.energySystem.util.HibernateUtil;
/**
 *
 * @author Zeon-IT
 */
public class GroupItemDaoImpl extends UnicastRemoteObject implements GroupItemDao{

    public GroupItemDaoImpl()throws RemoteException{
        
    }
    @Override
    public boolean addGroupItem(GroupItem item) throws RemoteException, SQLException, ClassNotFoundException {
         SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.save(item);
        transaction.commit();
        return true;
    }

    @Override
    public boolean updateGroupItem(GroupItem item) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public GroupItem searchGroupItem(String itemId) throws RemoteException, SQLException, ClassNotFoundException {
         SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM GroupItem WHERE ItemName = '"+itemId+"'";
        Query query = session.createQuery(hql);
        GroupItem groupItem = (GroupItem) query.uniqueResult();
        transaction.commit();
        return groupItem;
    }

    @Override
    public boolean deleteGroupDelete(int itemId) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<GroupItem> getAllGroupItem() throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM GroupItem";
        Query query = session.createQuery(hql);
        List results = query.list();
        transaction.commit();
        return results;
    }
    
}
