/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeon.energySystem.Controller;

import zeon.energySystem.common.controller.CustomerController;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import zeon.energySystem.DaoImpl.CustomerDaoImpl;
import zeon.energySystem.common.model.Customer;
import zeon.energySystem.common.observer.CustomerObserver;
import zeon.energySystem.observerble.CustomerObserverble;
import zeon.energySystem.reservation.CustomerReserver;

/**
 *
 * @author Zeon-IT
 */
public class CustomerControllerImpl extends UnicastRemoteObject implements CustomerController{
    private static final CustomerReserver customerReserver = new CustomerReserver();
    private final CustomerDaoImpl daoImpl = new CustomerDaoImpl();
    private static final CustomerObserverble customerObserverble = new CustomerObserverble();

    public CustomerControllerImpl() throws RemoteException {
    }
    
    @Override
    public boolean addCustomer(Customer customer) throws RemoteException, SQLException, ClassNotFoundException {
        final boolean isAdded = daoImpl.addCustomer(customer);
        new Thread(){
            @Override
            public void run() {
               if(isAdded){
                   try {
                       customerObserverble.setMessage("Customer Added Success...!!");
                   } catch (RemoteException ex) {
                       Logger.getLogger(CustomerControllerImpl.class.getName()).log(Level.SEVERE, null, ex);
                   }
               }
            }
            
        }.start();
        return isAdded;
    }

    @Override
    public boolean updateCustomer(Customer customer) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.updateCustomer(customer);
    }

    @Override
    public boolean deleteCustomer(int id) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.deleteCustomer(id);
    }

    @Override
    public Customer searchCustomer(int id) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.searchCustomer(id);
    }

    @Override
    public List<Customer> getAllCustomers() throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.getAllCustomers();
    }

    @Override
    public boolean setLockedCustomer(String id) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeLockedCustomer(String id) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addCustomerObserver(CustomerObserver customerObserver) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeCustomerObserver(CustomerObserver customerObserver) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Customer> searchByName(String nameSearch) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.searchByName(nameSearch);
    }

    @Override
    public Customer getCustomerByName(String custName) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.getCustomerByName(custName);
    }

    @Override
    public Customer getCustomerByCompanyName(String companyName) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.getCustomerByCompanyName(companyName);
    }
    
}
