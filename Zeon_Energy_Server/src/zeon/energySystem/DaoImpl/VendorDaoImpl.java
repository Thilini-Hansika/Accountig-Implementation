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
import zeon.energySystem.common.dao.VendorDao;
import zeon.energySystem.common.model.Vendor;
import zeon.energySystem.util.HibernateUtil;

/**
 *
 * @author Zeon-IT
 */
public class VendorDaoImpl extends UnicastRemoteObject implements VendorDao{

    public VendorDaoImpl()throws RemoteException{
        
    }
    @Override
    public boolean addVendor(Vendor vendor) throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.save(vendor);
        transaction.commit();
        return true;
    }

    @Override
    public boolean updateVendor(Vendor vendor) throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.update(vendor);
        transaction.commit();
        return true;
    }

    @Override
    public boolean deleteVendor(int id) throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        Vendor vendor = (Vendor) session.get(Vendor.class, id);
        session.delete(vendor);
        transaction.commit();
        return true;
    }

    @Override
    public Vendor searchVendor(int id) throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        Vendor vendor = (Vendor) session.get(Vendor.class, id);
        transaction.commit();
        return vendor;
    }

    @Override
    public List<Vendor> getAllVendor() throws RemoteException, SQLException, ClassNotFoundException {
       SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM Vendor";
        Query query = session.createQuery(hql);
        List results = query.list();
        transaction.commit();
        return results;
    }

    @Override
    public Vendor searchVendorByName(String vendorName) throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM Vendor WHERE firstName = '"+vendorName+"'";
        Query query = session.createQuery(hql);
        Vendor vendor = (Vendor) query.uniqueResult();
        transaction.commit();
        return vendor;
    }

    @Override
    public Vendor searchByCompanyName(String companyName) throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM Vendor WHERE companyName = '"+companyName+"'";
        Query query = session.createQuery(hql);
        Vendor vendor = (Vendor) query.uniqueResult();
        transaction.commit();
        return vendor;
    }
    
}
