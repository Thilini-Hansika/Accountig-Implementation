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
import zeon.energySystem.common.model.Invoice;

/**
 *
 * @author ZeonIT
 */
public interface InvoiceDao extends Remote{
     public boolean addInvoice(Invoice invoice)throws RemoteException,SQLException, ClassNotFoundException;
    public boolean updateInvoice(Invoice invoice)throws RemoteException,SQLException, ClassNotFoundException;    
    public boolean deleteInvoice(int id)throws RemoteException,SQLException, ClassNotFoundException;
    public Invoice searchInvoice(int id)throws RemoteException,SQLException, ClassNotFoundException;
    public List<Invoice>getAllInvoice()throws RemoteException,SQLException, ClassNotFoundException;
    public Invoice getLastInvoice()throws RemoteException,SQLException, ClassNotFoundException;
    public Invoice searchInvoiceByReceiveId(String receiveTypeId)throws RemoteException,SQLException, ClassNotFoundException;
   
}
