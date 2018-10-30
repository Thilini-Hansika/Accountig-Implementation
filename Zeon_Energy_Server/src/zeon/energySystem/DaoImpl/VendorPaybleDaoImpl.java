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
import zeon.energySystem.common.model.VendorPayble;
import zeon.energySystem.util.HibernateUtil;
import zeon.energySystem.common.dao.VendorPaybleDao;

/**
 *
 * @author ZeonIT
 */
public class VendorPaybleDaoImpl extends UnicastRemoteObject implements VendorPaybleDao{

    public VendorPaybleDaoImpl()throws RemoteException{
        
    }

    @Override
    public boolean addVendorPayble(VendorPayble accountPayble) throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.save(accountPayble);
        transaction.commit();
        return true;
    }

    @Override
    public boolean updateVendorPayble(VendorPayble accountPayble) throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.update(accountPayble);
        transaction.commit();
        return true;
    }

    @Override
    public boolean deleteVendorPayble(int id) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VendorPayble searchVendorPayble(int id) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<VendorPayble> getAllVendorPayble() throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM VendorPayble";
        Query query = session.createQuery(hql);
        List results = query.list();
        transaction.commit();
        return results;
    }

    @Override
    public List<VendorPayble> searchPaybleByVendorId(int custId) throws RemoteException, SQLException, ClassNotFoundException {
         SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM VendorPayble WHERE receiveTypeId LIKE 'ZEL-P%' and vendor_vendorId = '"+custId+"'";
        Query query = session.createQuery(hql);
        List results = query.list();
        transaction.commit();
        return results;
    }

    @Override
    public VendorPayble searchPaybleByCompanyId(String CompanyId) throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM VendorPayble WHERE receiveTypeId = '"+CompanyId+"'";
        Query query = session.createQuery(hql);
        VendorPayble accountPayble = (VendorPayble) query.uniqueResult();
        transaction.commit();
        return accountPayble;
    }

    @Override
    public List<VendorPayble> getAllVendorPaybleByVendor(int vendorId) throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM VendorPayble WHERE vendor_vendorId = '"+vendorId+"'";
        Query query = session.createQuery(hql);
        List results = query.list();
        transaction.commit();
        return results;
    }

    @Override
    public List<VendorPayble> getAllExpenceData() throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM VendorPayble WHERE receiveTypeId LIKE 'ZEL-E%'";
        Query query = session.createQuery(hql);
        List results = query.list();
        transaction.commit();
        return results;
    }

    @Override
    public List<VendorPayble> searchExpencePaybleByCustomer(int custId) throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM VendorPayble WHERE receiveTypeId LIKE 'ZEL-E%' and customer_custId = '"+custId+"'";
        Query query = session.createQuery(hql);
        List results = query.list();
        transaction.commit();
        return results;
    }

    @Override
    public List<VendorPayble> searchExpencePaybleByVendor(int vendorId) throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM VendorPayble WHERE receiveTypeId LIKE 'ZEL-E%' and vendor_vendorId = '"+vendorId+"'";
        Query query = session.createQuery(hql);
        List results = query.list();
        transaction.commit();
        return results;
    }

    @Override
    public List<VendorPayble> getAllVendorPaybleByAcc(int accNO) throws RemoteException, SQLException, ClassNotFoundException {
         SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM VendorPayble WHERE accountNo = '"+accNO+"'";
        Query query = session.createQuery(hql);
        List results = query.list();
        transaction.commit();
        return results;
    }
   
}
