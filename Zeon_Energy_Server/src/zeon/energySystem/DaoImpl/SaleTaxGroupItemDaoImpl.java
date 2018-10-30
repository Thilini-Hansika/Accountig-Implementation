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
import zeon.energySystem.common.controller.SaleTaxGroupItemController;
import zeon.energySystem.common.dao.SaleTaxGroupItemDao;
import zeon.energySystem.common.model.PaymentItem;
import zeon.energySystem.common.model.SaleTaxGroupItem;
import zeon.energySystem.util.HibernateUtil;
/**
 *
 * @author Zeon-IT
 */
public class SaleTaxGroupItemDaoImpl extends UnicastRemoteObject implements SaleTaxGroupItemDao{

    public SaleTaxGroupItemDaoImpl()throws RemoteException{
        
    }
    @Override
    public boolean addSaleTaxGroupItem(SaleTaxGroupItem item) throws RemoteException, SQLException, ClassNotFoundException {
         SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.save(item);
        transaction.commit();
        return true;
    }

    @Override
    public boolean updateSaleTaxGroupItem(SaleTaxGroupItem item) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SaleTaxGroupItem searchSaleTaxGroupItem(String itemId) throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM SaleTaxGroupItem WHERE itemName = '"+itemId+"'";
        Query query = session.createQuery(hql);
        SaleTaxGroupItem saleTaxGroupItem = (SaleTaxGroupItem) query.uniqueResult();
        transaction.commit();
        return saleTaxGroupItem;
    }

    @Override
    public boolean deleteSaleTaxGroupDelete(int itemId) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SaleTaxGroupItem> getAllSaleTaxGroupItem() throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM SaleTaxGroupItem";
        Query query = session.createQuery(hql);
        List results = query.list();
        transaction.commit();
        return results;
    }
    
}
