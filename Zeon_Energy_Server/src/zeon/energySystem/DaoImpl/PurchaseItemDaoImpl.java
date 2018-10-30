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
import zeon.energySystem.common.controller.PurchaseItemController;
import zeon.energySystem.common.dao.PurchaseItemDao;
import zeon.energySystem.common.model.Purchase;
import zeon.energySystem.common.model.PurchaseItem;
import zeon.energySystem.util.HibernateUtil;
/**
 *
 * @author ZeonIT
 */
public class PurchaseItemDaoImpl extends UnicastRemoteObject implements PurchaseItemDao{

    public PurchaseItemDaoImpl()throws RemoteException{
        
    }
    @Override
    public List<Purchase> getAllPurchaseItem() throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PurchaseItem> getAllPurchaseById(String purchaseId) throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM PurchaseItem WHERE companyPurchaseId = '"+purchaseId+"'";
        Query query = session.createQuery(hql);
        List results = query.list();
        transaction.commit();
        return results;
    }
    
}
