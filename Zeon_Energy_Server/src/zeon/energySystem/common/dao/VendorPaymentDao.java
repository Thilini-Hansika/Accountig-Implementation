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
import zeon.energySystem.common.model.VendorPayment;

/**
 *
 * @author ZeonIT
 */
public interface VendorPaymentDao extends Remote{
    public boolean addVendorPayment(VendorPayment vendorPayment)throws RemoteException,SQLException, ClassNotFoundException;
    public boolean updateVendorPayment(VendorPayment vendorPayment)throws RemoteException,SQLException, ClassNotFoundException;    
    public boolean deleteVendorPayment(int id)throws RemoteException,SQLException, ClassNotFoundException;
    public VendorPayment searchVendorPayment(int id)throws RemoteException,SQLException, ClassNotFoundException;
    public List<VendorPayment>getAllVendorPayment()throws RemoteException,SQLException, ClassNotFoundException;
    public List<VendorPayment> getAllVendorPaymentByDate()throws RemoteException,SQLException, ClassNotFoundException;

}
