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
import zeon.energySystem.DaoImpl.VendorPaymentDaoImpl;
import zeon.energySystem.common.controller.VendorPaymentController;
import zeon.energySystem.common.model.VendorPayment;
/**
 *
 * @author ZeonIT
 */
public class VendorPaymentControllerImpl extends UnicastRemoteObject implements VendorPaymentController{
private final VendorPaymentDaoImpl daoImpl = new VendorPaymentDaoImpl();
    public VendorPaymentControllerImpl()throws RemoteException{
        
    }
    @Override
    public boolean addVendorPayment(VendorPayment vendorPayment) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.addVendorPayment(vendorPayment);
    }

    @Override
    public boolean updateVendorPayment(VendorPayment vendorPayment) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteVendorPayment(int id) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VendorPayment searchVendorPayment(int id) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<VendorPayment> getAllVendorPayment() throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<VendorPayment> getAllVendorPaymentByDate() throws RemoteException, SQLException, ClassNotFoundException {
       return daoImpl.getAllVendorPaymentByDate();
    }
    
}
