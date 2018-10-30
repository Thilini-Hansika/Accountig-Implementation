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
import zeon.energySystem.common.model.Payment;

/**
 *
 * @author ZeonIT
 */
public interface PaymentDao extends Remote{
    public boolean addPayment(Payment payment)throws RemoteException,SQLException, ClassNotFoundException;
    public boolean updatePayment(Payment payment)throws RemoteException,SQLException, ClassNotFoundException;    
    public boolean deletePayment(int id)throws RemoteException,SQLException, ClassNotFoundException;
    
    public List<Payment>getAllPayment()throws RemoteException,SQLException, ClassNotFoundException;
    public Payment searchPaymentByCustId(int custId)throws RemoteException,SQLException, ClassNotFoundException;
    public List<Payment> getAllPaymentByDate()throws RemoteException,SQLException, ClassNotFoundException;
    public List<Payment> getAllPaymentByDateRange(String fromDate, String toDate)throws RemoteException,SQLException, ClassNotFoundException;
    public List<Payment> getAllPaymentByVendorId(int index)throws RemoteException,SQLException, ClassNotFoundException;
    public List<Payment> getAllPaymentByCustId(int custId)throws RemoteException,SQLException, ClassNotFoundException;
    public Payment getLastPayment()throws RemoteException,SQLException, ClassNotFoundException;
}
