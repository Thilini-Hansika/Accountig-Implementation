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
import zeon.energySystem.common.model.Vendor;

/**
 *
 * @author Zeon-IT
 */
public interface VendorDao extends Remote{
     public boolean addVendor(Vendor vendor)throws RemoteException,SQLException, ClassNotFoundException;
    public boolean updateVendor(Vendor vendor)throws RemoteException,SQLException, ClassNotFoundException;    
    public boolean deleteVendor(int id)throws RemoteException,SQLException, ClassNotFoundException;
    public Vendor searchVendor(int id)throws RemoteException,SQLException, ClassNotFoundException;
    public List<Vendor>getAllVendor()throws RemoteException,SQLException, ClassNotFoundException;
    public Vendor searchVendorByName(String vendorName)throws RemoteException,SQLException, ClassNotFoundException;
    public Vendor searchByCompanyName(String companyName)throws RemoteException,SQLException, ClassNotFoundException;
}
