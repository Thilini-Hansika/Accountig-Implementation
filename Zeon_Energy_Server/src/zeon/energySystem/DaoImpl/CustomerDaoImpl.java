/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeon.energySystem.DaoImpl;

import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import zeon.energySystem.common.dao.CustomerDao;
import zeon.energySystem.common.model.Customer;
import zeon.energySystem.util.HibernateUtil;

/**
 *
 * @author Zeon-IT
 */
public class CustomerDaoImpl implements CustomerDao{

    private static ReentrantReadWriteLock writeLock = new ReentrantReadWriteLock();
    @Override
    public boolean addCustomer(Customer customer) throws SQLException, ClassNotFoundException {
       try{
        writeLock.writeLock().lock();
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.save(customer);
        transaction.commit();
        return true;
       }finally{
           writeLock.writeLock().unlock();
       }
        
    }

    @Override
    public boolean updateCustomer(Customer customer) throws SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.update(customer);
        transaction.commit();
        return true;
    }

    @Override
    public boolean deleteCustomer(int id) throws SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        Customer customer = (Customer) session.get(Customer.class, id);
        session.delete(customer);
        transaction.commit();
        return true;
    }

    @Override
    public Customer searchCustomer(int id) throws SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        Customer customer = (Customer) session.get(Customer.class, id);
        transaction.commit();
        return customer;
    }

    @Override
    public List<Customer> getAllCustomers() throws SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM Customer";
        Query query = session.createQuery(hql);
        List results = query.list();
        transaction.commit();
        return results;
        
    }
    
    @Override
    public List<Customer> searchByName(String nameSearch)throws RemoteException,SQLException, ClassNotFoundException{
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM Customer WHERE firstName = '"+nameSearch+"'";
        Query query = session.createQuery(hql);
        List results = query.list();
        transaction.commit();
        return results;
    }

    @Override
    public Customer getCustomerByName(String custName) throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM Customer WHERE firstName = '"+custName+"'";
        Query query = session.createQuery(hql);
        Customer customer = (Customer) query.uniqueResult();
        transaction.commit();
        return customer;
    }

    @Override
    public Customer getCustomerByCompanyName(String companyName) throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM Customer WHERE companyName = '"+companyName+"'";
        Query query = session.createQuery(hql);
        Customer customer = (Customer) query.uniqueResult();
        transaction.commit();
        return customer;
    }
    
}
