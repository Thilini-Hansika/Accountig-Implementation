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
import zeon.energySystem.common.model.PaymentItem;

/**
 *
 * @author Zeon-IT
 */
public interface PaymentItemController extends Remote{
    public boolean addPaymentItem(PaymentItem item)throws RemoteException,SQLException,ClassNotFoundException;
    public boolean updatePaymentItem(PaymentItem item)throws RemoteException,SQLException,ClassNotFoundException;
    public PaymentItem searchPaymentItem(String itemId)throws RemoteException,SQLException,ClassNotFoundException;
    public boolean deletePaymentDelete(int itemId)throws RemoteException,SQLException,ClassNotFoundException;
    public List<PaymentItem>getAllPaymentItem()throws RemoteException,SQLException, ClassNotFoundException;
}
