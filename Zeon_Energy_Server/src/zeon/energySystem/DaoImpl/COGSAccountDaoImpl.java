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
import zeon.energySystem.common.dao.COGSAccountDao;
import zeon.energySystem.common.model.COGSAccount;
import zeon.energySystem.util.HibernateUtil;
/**
 *
 * @author ZeonIT
 */
public class COGSAccountDaoImpl extends UnicastRemoteObject implements COGSAccountDao{

    public COGSAccountDaoImpl()throws RemoteException{
        
    }

    @Override
    public boolean addCOGSAccount(COGSAccount cOGSAccount) throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.save(cOGSAccount);
        transaction.commit();
        return true;
    }

    @Override
    public boolean updateCOGSAccount(COGSAccount cOGSAccount) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteCOGSAccount(int id) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<COGSAccount> getAllCOGSAccount() throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<COGSAccount> getCOGSByDateRange(String convertFrom, String convertTo) throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM COGSAccount WHERE date BETWEEN '"+convertFrom+"' AND '"+convertTo+"' ";
        Query query = session.createQuery(hql);
        List results = query.list();
        transaction.commit();
        return results;
    }

   
    
}
