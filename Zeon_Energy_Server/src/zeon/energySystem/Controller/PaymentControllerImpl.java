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
import zeon.energySystem.DaoImpl.PaymentDaoImpl;
import zeon.energySystem.common.controller.PaymentController;
import zeon.energySystem.common.model.Payment;
/**
 *
 * @author ZeonIT
 */
public class PaymentControllerImpl extends UnicastRemoteObject implements PaymentController{

    private final PaymentDaoImpl daoImpl = new PaymentDaoImpl();
    public PaymentControllerImpl()throws RemoteException{
        
    }
    @Override
    public boolean addPayment(Payment payment) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.addPayment(payment);
    }

    @Override
    public boolean updatePayment(Payment payment) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.updatePayment(payment);
    }

    @Override
    public boolean deletePayment(int id) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public List<Payment> getAllPayment() throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.getAllPayment();
    }

    @Override
    public Payment searchPaymentByCustId(int custId) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.searchPaymentByCustId(custId);
    }

    @Override
    public List<Payment> getAllPaymentByDate() throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.getAllPaymentByDate();
    }

    @Override
    public List<Payment> getAllPaymentByDateRange(String fromDate, String toDate) throws RemoteException, SQLException, ClassNotFoundException {
       return daoImpl.getAllPaymentByDateRange(fromDate, toDate);
    }

    @Override
    public List<Payment> getAllPaymentByVendorId(int index) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.getAllPaymentByVendorId(index);
    }

    @Override
    public List<Payment> getAllPaymentByCustId(int custId) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.getAllPaymentByCustId(custId);
    }

    @Override
    public Payment getLastPayment() throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.getLastPayment();
    }

   
    
}
