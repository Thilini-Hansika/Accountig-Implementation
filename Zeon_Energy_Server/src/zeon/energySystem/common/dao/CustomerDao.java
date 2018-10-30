/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeon.energySystem.common.dao;


import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import zeon.energySystem.common.model.Customer;


/**
 *
 * @author Zeon-IT
 */
public interface CustomerDao extends Remote{
    public boolean addCustomer(Customer customer)throws SQLException, ClassNotFoundException;
    public boolean updateCustomer(Customer customer)throws SQLException, ClassNotFoundException;    
    public boolean deleteCustomer(int id)throws SQLException, ClassNotFoundException;
    public Customer searchCustomer(int id)throws SQLException, ClassNotFoundException;
    public List<Customer>getAllCustomers()throws SQLException, ClassNotFoundException;
    public List<Customer> searchByName(String nameSearch)throws RemoteException,SQLException, ClassNotFoundException;
    public Customer getCustomerByName(String custName)throws RemoteException,SQLException, ClassNotFoundException;
    public Customer getCustomerByCompanyName(String companyName)throws RemoteException,SQLException, ClassNotFoundException;
   

}
