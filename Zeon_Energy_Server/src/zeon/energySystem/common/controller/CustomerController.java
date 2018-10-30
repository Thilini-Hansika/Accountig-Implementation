/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeon.energySystem.common.controller;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.List;
import zeon.energySystem.common.model.Customer;
import zeon.energySystem.common.observer.CustomerObserver;


/**
 *
 * @author Zeon-IT
 */
public interface CustomerController extends Remote{
    public boolean addCustomer(Customer customer)throws RemoteException,SQLException, ClassNotFoundException;
    public boolean updateCustomer(Customer customer)throws RemoteException,SQLException, ClassNotFoundException;    
    public boolean deleteCustomer(int id)throws RemoteException,SQLException, ClassNotFoundException;
    public Customer searchCustomer(int id)throws RemoteException,SQLException, ClassNotFoundException;
    public List<Customer>getAllCustomers()throws RemoteException,SQLException, ClassNotFoundException;
    public boolean setLockedCustomer(String id)throws RemoteException,SQLException, ClassNotFoundException;
    public boolean removeLockedCustomer(String id)throws RemoteException,SQLException, ClassNotFoundException;
    public void addCustomerObserver(CustomerObserver customerObserver)throws RemoteException,SQLException, ClassNotFoundException;
    public void removeCustomerObserver(CustomerObserver customerObserver)throws RemoteException,SQLException, ClassNotFoundException;
    public List<Customer> searchByName(String nameSearch)throws RemoteException,SQLException, ClassNotFoundException;
    public Customer getCustomerByName(String custName)throws RemoteException,SQLException, ClassNotFoundException;
    public Customer getCustomerByCompanyName(String companyName)throws RemoteException,SQLException, ClassNotFoundException;
    
}
