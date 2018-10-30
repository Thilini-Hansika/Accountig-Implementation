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
import zeon.energySystem.DaoImpl.PaymentItemDaoImpl;
import zeon.energySystem.common.controller.PaymentItemController;
import zeon.energySystem.common.model.PaymentItem;
/**
 *
 * @author Zeon-IT
 */
public class PaymentItemControllerImpl extends UnicastRemoteObject implements PaymentItemController{

    private final PaymentItemDaoImpl daoImpl = new PaymentItemDaoImpl();
    public PaymentItemControllerImpl()throws RemoteException{
        
    }
    @Override
    public boolean addPaymentItem(PaymentItem item) throws RemoteException, SQLException, ClassNotFoundException {
       return daoImpl.addPaymentItem(item);
    }

    @Override
    public boolean updatePaymentItem(PaymentItem item) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PaymentItem searchPaymentItem(String itemId) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.searchPaymentItem(itemId);
    }

    @Override
    public boolean deletePaymentDelete(int itemId) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PaymentItem> getAllPaymentItem() throws RemoteException, SQLException, ClassNotFoundException {
       return daoImpl.getAllPaymentItem();
    }
    
}
