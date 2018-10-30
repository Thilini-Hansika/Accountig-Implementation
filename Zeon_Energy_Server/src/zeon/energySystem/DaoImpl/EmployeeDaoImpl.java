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
import zeon.energySystem.common.controller.EmployeeController;
import zeon.energySystem.common.dao.EmployeeDao;
//import zeon.energySystem.model.Employee;
import zeon.energySystem.common.model.Employee;
import zeon.energySystem.util.HibernateUtil;
/**
 *
 * @author Zeon-IT
 */
public class EmployeeDaoImpl extends UnicastRemoteObject implements EmployeeDao{

    public EmployeeDaoImpl()throws RemoteException{
        
    }
    @Override
    public boolean addEmployee(Employee employee) throws RemoteException, SQLException, ClassNotFoundException {
         SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.save(employee);
        transaction.commit();
        return true;
    }

    @Override
    public boolean updateEmployee(Employee employee) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteEmployee(int id) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Employee searchEmployee(int id) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Employee> getAllEmployee() throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM Employee";
        Query query = session.createQuery(hql);
        List results = query.list();
        transaction.commit();
        return results;
    }

    @Override
    public Employee searchEmployeeByName(String employee) throws RemoteException, SQLException, ClassNotFoundException {
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM Employee WHERE empFirstName = '"+employee+"'";
        Query query = session.createQuery(hql);
        Employee e = (Employee) query.uniqueResult();
        transaction.commit();
        return e;
    }
    
}
