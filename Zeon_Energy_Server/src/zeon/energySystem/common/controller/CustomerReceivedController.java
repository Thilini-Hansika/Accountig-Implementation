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
import zeon.energySystem.common.model.CustomerReceived;

/**
 *
 * @author ZeonIT
 */
public interface CustomerReceivedController extends Remote{
    public boolean addCustomerReceived(CustomerReceived accountReceivable)throws RemoteException,SQLException, ClassNotFoundException;
    public boolean updateCustomerReceived(CustomerReceived accountReceivable)throws RemoteException,SQLException, ClassNotFoundException;    
    public boolean deleteCustomerReceived(int id)throws RemoteException,SQLException, ClassNotFoundException;
   
    public List<CustomerReceived>getAllCustomerReceived()throws RemoteException,SQLException, ClassNotFoundException;
    public List<CustomerReceived> searchReceivedByCustId(int custId)throws RemoteException,SQLException, ClassNotFoundException;
    public CustomerReceived searchReceivedByCompanyId(String invoiceCompanyId)throws RemoteException,SQLException, ClassNotFoundException;

    public List<CustomerReceived> getAllCustomerReceivedByAccNo(int accNO)throws RemoteException,SQLException, ClassNotFoundException;
    
}
