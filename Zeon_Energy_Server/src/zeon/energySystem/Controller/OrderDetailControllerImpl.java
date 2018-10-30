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
import zeon.energySystem.DaoImpl.OrderDetailDaoImpl;
import  zeon.energySystem.common.controller.OrderDetailController;
import zeon.energySystem.common.model.OrderDetails;
/**
 *
 * @author ZeonIT
 */
public class OrderDetailControllerImpl extends UnicastRemoteObject implements OrderDetailController{
    public final OrderDetailDaoImpl daoImpl = new OrderDetailDaoImpl();
    public OrderDetailControllerImpl()throws RemoteException{
    
    }
    @Override
    public List<OrderDetails> getAllDetails() throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.getAllDetails();
    }

    @Override
    public List<OrderDetails> getDetailsFromAccNo(int accNo) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.getDetailsFromAccNo(accNo);
    }

    @Override
    public List<OrderDetails> getDetailByInvoiceId(String invoiceCompanyId) throws RemoteException, SQLException, ClassNotFoundException {
       return daoImpl.getDetailByInvoiceId(invoiceCompanyId);
    }

    @Override
    public boolean deleteItem(int orderId) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.deleteItem(orderId);
    }

   
    
}
