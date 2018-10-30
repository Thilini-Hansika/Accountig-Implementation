/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeon.energySystem.Controller;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.List;
import zeon.energySystem.DaoImpl.CustomerReceivedDaoImpl;

import zeon.energySystem.common.model.CustomerReceived;
import zeon.energySystem.common.controller.CustomerReceivedController;
/**
 *
 * @author ZeonIT
 */
public class CustomerReceivedControllerImpl extends UnicastRemoteObject implements CustomerReceivedController{

    private final CustomerReceivedDaoImpl daoImpl = new CustomerReceivedDaoImpl();
    public CustomerReceivedControllerImpl()throws RemoteException{
        
    }
    @Override
    public boolean addCustomerReceived(CustomerReceived accountReceivable) throws RemoteException, SQLException, ClassNotFoundException {
       return daoImpl.addCustomerReceived(accountReceivable);
    }

    @Override
    public boolean updateCustomerReceived(CustomerReceived accountReceivable) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteCustomerReceived(int id) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CustomerReceived> getAllCustomerReceived() throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.getAllCustomerReceived();
    }

    @Override
    public List<CustomerReceived> searchReceivedByCustId(int custId) throws RemoteException, SQLException, ClassNotFoundException {
       return daoImpl.searchReceivedByCustId(custId);
    }

    @Override
    public CustomerReceived searchReceivedByCompanyId(String invoiceCompanyId) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.searchReceivedByCompanyId(invoiceCompanyId);
    }

    @Override
    public List<CustomerReceived> getAllCustomerReceivedByAccNo(int accNO) throws RemoteException, SQLException, ClassNotFoundException {
       return daoImpl.getAllCustomerReceivedByAccNo(accNO);
    }

   
}
