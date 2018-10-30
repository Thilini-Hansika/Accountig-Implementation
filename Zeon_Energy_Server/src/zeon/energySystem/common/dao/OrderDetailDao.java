/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeon.energySystem.common.dao;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.List;
import zeon.energySystem.common.model.OrderDetails;

/**
 *
 * @author ZeonIT
 */
public interface OrderDetailDao extends Remote{
   public List<OrderDetails>getAllDetails()throws RemoteException,SQLException, ClassNotFoundException; 
   public List<OrderDetails> getDetailsFromAccNo(int accNo)throws RemoteException,SQLException, ClassNotFoundException;
   public List<OrderDetails> getDetailByInvoiceId(String invoiceCompanyId)throws RemoteException,SQLException, ClassNotFoundException;
   public boolean deleteItem(int orderId)throws RemoteException,SQLException, ClassNotFoundException;
   
}
