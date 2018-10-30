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
import zeon.energySystem.common.dao.AccountDao;
import zeon.energySystem.common.model.Account;
import zeon.energySystem.common.model.Customer;
import zeon.energySystem.util.HibernateUtil;
/**
 *
 * @author ZeonIT
 */
public class AccountDaoImpl extends UnicastRemoteObject implements AccountDao{

    public AccountDaoImpl()throws RemoteException{
        
    }
    @Override
    public boolean addAccount(Account account) throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.save(account);
        transaction.commit();
        return true;
    }

    @Override
    public boolean updateAccount(Account account) throws RemoteException, SQLException, ClassNotFoundException {
       SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.update(account);
        transaction.commit();
        return true;
    }

    @Override
    public boolean deleteAccount(int id) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Account> getAllAccount() throws RemoteException, SQLException, ClassNotFoundException {
         SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM Account";
        Query query = session.createQuery(hql);
        List results = query.list();
        transaction.commit();
        return results;
    }

    @Override
    public Account getAccountByNo(int accountNo) throws RemoteException, SQLException, ClassNotFoundException {
         SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM Account WHERE uniqAccountId = '"+accountNo+"'";
        Query query = session.createQuery(hql);
        Account account = (Account) query.uniqueResult();
        transaction.commit();
        return account;
    }

    @Override
    public Account getLastRow(int accountNo,String type) throws RemoteException, SQLException, ClassNotFoundException {
       SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "From Account WHERE accountType = '"+type+"' ORDER BY uniqAccountId DESC";
        Query query = session.createQuery(hql).setMaxResults(1);
        Account account = (Account) query.uniqueResult();
        transaction.commit();
        return account;
    }

    @Override
    public Account searchAccountByName(String expenseName) throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM Account WHERE accountName = '"+expenseName+"'";
        Query query = session.createQuery(hql);
        Account account = (Account) query.uniqueResult();
        transaction.commit();
        return account;
    }
}