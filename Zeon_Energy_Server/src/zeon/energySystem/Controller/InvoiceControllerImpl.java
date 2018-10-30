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
import zeon.energySystem.DaoImpl.InvoiceDaoImpl;
import zeon.energySystem.common.controller.InvoiceController;
import zeon.energySystem.common.model.Invoice;
/**
 *
 * @author ZeonIT
 */
public class InvoiceControllerImpl extends UnicastRemoteObject implements InvoiceController{

    private final InvoiceDaoImpl daoImpl = new InvoiceDaoImpl();
    public InvoiceControllerImpl()throws RemoteException{
        
    }
    @Override
    public boolean addInvoice(Invoice invoice) throws RemoteException, SQLException, ClassNotFoundException {
       return daoImpl.addInvoice(invoice);
    }

    @Override
    public boolean updateInvoice(Invoice invoice) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteInvoice(int id) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Invoice searchInvoice(int id) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Invoice> getAllInvoice() throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.getAllInvoice();
    }

    @Override
    public List<Invoice> searchInvoiceByCustId(int custId) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.searchInvoiceByCustId(custId);
    }

    @Override
    public Invoice getLastInvoice() throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.getLastInvoice();
    }

    @Override
    public Invoice searchInvoiceByReceiveId(String receiveTypeId) throws RemoteException, SQLException, ClassNotFoundException {
       return daoImpl.searchInvoiceByReceiveId(receiveTypeId);
    }
    
}
