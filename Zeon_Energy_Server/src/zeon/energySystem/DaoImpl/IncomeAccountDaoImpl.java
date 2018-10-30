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
import zeon.energySystem.common.dao.IncomeAccountDao;
import zeon.energySystem.common.model.IncomeAccount;
import zeon.energySystem.util.HibernateUtil;
/**
 *
 * @author ZeonIT
 */
public class IncomeAccountDaoImpl extends UnicastRemoteObject implements IncomeAccountDao{

    public IncomeAccountDaoImpl()throws RemoteException{
        
    }
    @Override
    public boolean addIncomeAccount(IncomeAccount incomeAccount) throws RemoteException, SQLException, ClassNotFoundException {
         SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.save(incomeAccount);
        transaction.commit();
        return true;
    }

    @Override
    public boolean updateIncomeAccount(IncomeAccount incomeAccount) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteIncomeAccount(int id) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<IncomeAccount> getAllIncomeAccount() throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<IncomeAccount> getAllIncomeAccountByDate(String convertFrom, String convertTo) throws RemoteException, SQLException, ClassNotFoundException {
         SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM IncomeAccount WHERE date BETWEEN '"+convertFrom+"' AND '"+convertTo+"' ";
        Query query = session.createQuery(hql);
        List results = query.list();
       
        transaction.commit();
        return results;
    }
    
}
