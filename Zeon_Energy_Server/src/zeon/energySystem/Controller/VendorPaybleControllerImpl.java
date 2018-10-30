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
import zeon.energySystem.DaoImpl.VendorPaybleDaoImpl;
import zeon.energySystem.common.model.VendorPayble;
import zeon.energySystem.common.controller.VendorPaybleController;
/**
 *
 * @author ZeonIT
 */
public class VendorPaybleControllerImpl extends UnicastRemoteObject implements VendorPaybleController{
private final VendorPaybleDaoImpl daoImpl = new VendorPaybleDaoImpl();
    public VendorPaybleControllerImpl()throws RemoteException{
        
    }

    @Override
    public boolean addVendorPayble(VendorPayble accountPayble) throws RemoteException, SQLException, ClassNotFoundException {
        return  daoImpl.addVendorPayble(accountPayble);
    }

    @Override
    public boolean updateVendorPayble(VendorPayble accountPayble) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.updateVendorPayble(accountPayble);
    }

    @Override
    public boolean deleteVendorPayble(int id) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VendorPayble searchVendorPayble(int id) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<VendorPayble> getAllVendorPayble() throws RemoteException, SQLException, ClassNotFoundException {
       return daoImpl.getAllVendorPayble();
    }

    @Override
    public List<VendorPayble> searchPaybleByVendorId(int custId) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.searchPaybleByVendorId(custId);
    }

    @Override
    public VendorPayble searchPaybleByCompanyId(String CompanyId) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.searchPaybleByCompanyId(CompanyId);
    }

    @Override
    public List<VendorPayble> getAllVendorPaybleByVendor(int vendorId) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.getAllVendorPaybleByVendor(vendorId);
    }

    @Override
    public List<VendorPayble> getAllExpenceData() throws RemoteException, SQLException, ClassNotFoundException {
       return daoImpl.getAllExpenceData();
    }

    @Override
    public List<VendorPayble> searchExpencePaybleByCustomer(int custId) throws RemoteException, SQLException, ClassNotFoundException {
        return  daoImpl.searchExpencePaybleByCustomer(custId);
    }

    @Override
    public List<VendorPayble> searchExpencePaybleByVendor(int vendorId) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.searchExpencePaybleByVendor(vendorId);
    }

    @Override
    public List<VendorPayble> getAllVendorPaybleByAcc(int accNO) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.getAllVendorPaybleByAcc(accNO);
    }
   
}
