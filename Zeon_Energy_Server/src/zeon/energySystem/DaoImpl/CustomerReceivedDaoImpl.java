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

import zeon.energySystem.common.model.CustomerReceived;
import zeon.energySystem.util.HibernateUtil;
import zeon.energySystem.common.dao.CustomerReceivedDao;
/**
 *
 * @author ZeonIT
 */
public class CustomerReceivedDaoImpl extends UnicastRemoteObject implements CustomerReceivedDao{

    public CustomerReceivedDaoImpl()throws RemoteException{
        
    }
    @Override
    public boolean addCustomerReceived(CustomerReceived accountReceivable) throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(accountReceivable);
        transaction.commit();
        return true;
    }

    @Override
    public boolean updateCustomerReceived(CustomerReceived accountReceivable) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteCustomerReceived(int id) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CustomerReceived> getAllCustomerReceived() throws RemoteException, SQLException, ClassNotFoundException {
       SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM CustomerReceived";
        Query query = session.createQuery(hql);
        List results = query.list();
        transaction.commit();
        return results;
    }

    @Override
    public List<CustomerReceived> searchReceivedByCustId(int custId) throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM CustomerReceived WHERE customer_custId = '"+custId+"'";
        Query query = session.createQuery(hql);
        List results = query.list();
        transaction.commit();
        return results;
    }

    @Override
    public CustomerReceived searchReceivedByCompanyId(String invoiceCompanyId) throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM CustomerReceived WHERE receiveTypeId = '"+invoiceCompanyId+"'";
        Query query = session.createQuery(hql);
        CustomerReceived accountReceivable = (CustomerReceived) query.uniqueResult();
        transaction.commit();
        return accountReceivable;
    }

    @Override
    public List<CustomerReceived> getAllCustomerReceivedByAccNo(int accNO) throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM CustomerReceived WHERE accountNo = '"+accNO+"'";
        Query query = session.createQuery(hql);
        List results = query.list();
        transaction.commit();
        return results;
    }

    
}
