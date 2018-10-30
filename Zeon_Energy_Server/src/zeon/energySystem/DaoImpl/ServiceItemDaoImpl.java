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
import zeon.energySystem.common.controller.ServiceItemController;
import zeon.energySystem.common.dao.ServiceItemDao;
import zeon.energySystem.common.model.SaleTaxItem;
import zeon.energySystem.common.model.ServiceItem;
import zeon.energySystem.util.HibernateUtil;
/**
 *
 * @author Zeon-IT
 */
public class ServiceItemDaoImpl extends UnicastRemoteObject implements ServiceItemDao{

    public ServiceItemDaoImpl()throws RemoteException{
        
    }
    @Override
    public boolean addServiceItem(ServiceItem item) throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.save(item);
        transaction.commit();
        return true;
    }

    @Override
    public boolean updateServiceItem(ServiceItem item) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ServiceItem searchServiceItem(String itemId) throws RemoteException, SQLException, ClassNotFoundException {
         SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM ServiceItem WHERE itemName = '"+itemId+"'";
        Query query = session.createQuery(hql);
        ServiceItem serviceItem = (ServiceItem) query.uniqueResult();
        transaction.commit();
        return serviceItem;
    }

    @Override
    public boolean deleteServiceDelete(int itemId) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ServiceItem> getAllServiceItem() throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM ServiceItem";
        Query query = session.createQuery(hql);
        List results = query.list();
        transaction.commit();
        return results;
    }
    
}
