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
import zeon.energySystem.common.dao.ChequeDetailDao;
import zeon.energySystem.common.model.ChequeDetails;
import zeon.energySystem.util.HibernateUtil;
/**
 *
 * @author ZeonIT
 */
public class ChequeDetailDaoImpl extends UnicastRemoteObject implements ChequeDetailDao{

    public ChequeDetailDaoImpl()throws RemoteException{
        
    }
    @Override
    public List<ChequeDetails> getAllChequeDetails() throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ChequeDetails> getDetailByDate(String convertFrom, String convertTo) throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM ChequeDetails WHERE date BETWEEN '"+convertFrom+"' AND '"+convertTo+"' ";
        Query query = session.createQuery(hql);
        List results = query.list();
        System.out.println(results.size());
        transaction.commit();
        return results;
    }

    @Override
    public List<ChequeDetails> getDetailByAccountId(int accNo) throws RemoteException, SQLException, ClassNotFoundException {
       SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "From ChequeDetails WHERE bankAccNo = '"+accNo+"'";
        Query query = session.createQuery(hql);
        List results = query.list();
        System.out.println(results.size());
        transaction.commit();
        return results;
    }
    
}
