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
import zeon.energySystem.common.dao.OrderDetailDao;
import zeon.energySystem.common.model.OrderDetails;
import zeon.energySystem.util.HibernateUtil;

/**
 *
 * @author ZeonIT
 */
public class OrderDetailDaoImpl extends UnicastRemoteObject implements OrderDetailDao {

    public OrderDetailDaoImpl() throws RemoteException {

    }

    @Override
    public List<OrderDetails> getAllDetails() throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM OrderDetails";
        Query query = session.createQuery(hql);
        List results = query.list();
        transaction.commit();
        return results;
    }

    @Override
    public List<OrderDetails> getDetailsFromAccNo(int accNo) throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM OrderDetails WHERE customerName = '" + accNo + "'";
        Query query = session.createQuery(hql);
        List results = query.list();
        transaction.commit();
        return results;
    }

    @Override
    public List<OrderDetails> getDetailByInvoiceId(String invoiceCompanyId) throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM OrderDetails WHERE invoiceCompanyId = '" + invoiceCompanyId + "'";
        Query query = session.createQuery(hql);
        List results = query.list();
        transaction.commit();
        return results;
    }

    @Override
    public boolean deleteItem(int orderId) throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.openSession();
        session.clear();
        OrderDetails details = new OrderDetails();
        details.setOrderDId(orderId);
        session.delete(details);
        session.close();
        return true;
    }
    

}
