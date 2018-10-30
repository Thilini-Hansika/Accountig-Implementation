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
import zeon.energySystem.common.dao.FixedAssetDao;
import zeon.energySystem.common.model.FixedAsset;
import zeon.energySystem.util.HibernateUtil;

/**
 *
 * @author Zeon-IT
 */
public class FixedAssetDaoImpl extends UnicastRemoteObject implements FixedAssetDao{
    
    
    public FixedAssetDaoImpl()throws RemoteException{
        
    }
    @Override
    public boolean addFixedAsset(FixedAsset asset) throws RemoteException, SQLException, ClassNotFoundException {
         SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.save(asset);
        transaction.commit();
        return true;
    }

    @Override
    public boolean updateFixedAsset(FixedAsset asset) throws RemoteException, SQLException, ClassNotFoundException {
         SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.update(asset);
        transaction.commit();
        return true;
    }

    @Override
    public FixedAsset searchFixedAsset(String assetId) throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM FixedAsset WHERE assetName = '"+assetId+"'";
        Query query = session.createQuery(hql);
        FixedAsset asset = (FixedAsset) query.uniqueResult();
        transaction.commit();
        return asset;
    }

    @Override
    public boolean deleteFixedAsset(int assetId) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<FixedAsset> getAllAsset() throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM FixedAsset";
        Query query = session.createQuery(hql);
        List results = query.list();
        transaction.commit();
        return results;
    }
    
}
