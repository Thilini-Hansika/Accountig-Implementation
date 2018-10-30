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
import zeon.energySystem.common.model.Vendor;
import zeon.energySystem.common.observer.CustomerObserver;

/**
 *
 * @author Zeon-IT
 */
public interface VendorController extends Remote{
    public boolean addVendor(Vendor vendor)throws RemoteException,SQLException, ClassNotFoundException;
    public boolean updateVendor(Vendor vendor)throws RemoteException,SQLException, ClassNotFoundException;    
    public boolean deleteVendor(int id)throws RemoteException,SQLException, ClassNotFoundException;
    public Vendor searchVendor(int id)throws RemoteException,SQLException, ClassNotFoundException;
    public List<Vendor>getAllVendor()throws RemoteException,SQLException, ClassNotFoundException;
    public boolean setLockedVendor(String id)throws RemoteException,SQLException, ClassNotFoundException;
    public boolean removeLockedVendor(String id)throws RemoteException,SQLException, ClassNotFoundException;
    public void addVendorObserver(CustomerObserver customerObserver)throws RemoteException,SQLException, ClassNotFoundException;
    public void removeVendorObserver(CustomerObserver customerObserver)throws RemoteException,SQLException, ClassNotFoundException;
    public Vendor searchByCompanyName(String companyName)throws RemoteException,SQLException, ClassNotFoundException;
    public Vendor searchVendorByName(String vendorName)throws RemoteException,SQLException, ClassNotFoundException;
}
