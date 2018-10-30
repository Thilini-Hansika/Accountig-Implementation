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
import zeon.energySystem.common.model.VendorPayble;
import zeon.energySystem.common.model.Customer;

/**
 *
 * @author ZeonIT
 */
public interface VendorPaybleDao extends Remote{
    public boolean addVendorPayble(VendorPayble accountPayble)throws RemoteException,SQLException, ClassNotFoundException;
    public boolean updateVendorPayble(VendorPayble accountPayble)throws RemoteException,SQLException, ClassNotFoundException;    
    public boolean deleteVendorPayble(int id)throws RemoteException,SQLException, ClassNotFoundException;
    public VendorPayble searchVendorPayble(int id)throws RemoteException,SQLException, ClassNotFoundException;
    public List<VendorPayble>getAllVendorPayble()throws RemoteException,SQLException, ClassNotFoundException;
    public List<VendorPayble> searchPaybleByVendorId(int custId)throws RemoteException,SQLException, ClassNotFoundException;
    public VendorPayble searchPaybleByCompanyId(String CompanyId)throws RemoteException,SQLException, ClassNotFoundException;
    public List<VendorPayble> getAllVendorPaybleByVendor(int vendorId)throws RemoteException,SQLException, ClassNotFoundException;
    public List<VendorPayble> getAllExpenceData()throws RemoteException,SQLException, ClassNotFoundException;
    public List<VendorPayble> searchExpencePaybleByCustomer(int custId)throws RemoteException,SQLException, ClassNotFoundException;
    public List<VendorPayble> searchExpencePaybleByVendor(int vendorId)throws RemoteException,SQLException, ClassNotFoundException;
    public List<VendorPayble> getAllVendorPaybleByAcc(int accNO)throws RemoteException,SQLException, ClassNotFoundException;
    
}
