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
import zeon.energySystem.common.model.PettyDetail;
import zeon.energySystem.common.dao.PettyDetailDao;
import zeon.energySystem.util.HibernateUtil;

/**
 *
 * @author Zeon-IT
 */
public class PettyDetailDaoImpl extends UnicastRemoteObject implements PettyDetailDao{
    
    public PettyDetailDaoImpl()throws RemoteException{
        
    }

    @Override
    public List<PettyDetail> getAllprettyCash() throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PettyDetail> getPettyDateRange(String convertFrom, String convertTo) throws RemoteException, SQLException, ClassNotFoundException {
          SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM PettyDetail WHERE date BETWEEN '"+convertFrom+"' AND '"+convertTo+"' ";
        Query query = session.createQuery(hql);
        List results = query.list();
        System.out.println(results.size());
        transaction.commit();
        return results;
    }

   

    
    
}
