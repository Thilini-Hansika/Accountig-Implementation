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
import zeon.energySystem.DaoImpl.DiscountDaoImpl;
import zeon.energySystem.common.controller.DiscountController;
import zeon.energySystem.common.model.Discount;
/**
 *
 * @author ZeonIT
 */
public class DiscountControllerImpl extends UnicastRemoteObject implements DiscountController{
private final DiscountDaoImpl daoImpl = new DiscountDaoImpl();
    public DiscountControllerImpl()throws RemoteException{
        
    }
    @Override
    public boolean addDiscount(Discount discount) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.addDiscount(discount);
    }

    @Override
    public boolean updateDiscount(Discount discount) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Discount searchDiscount(String discount) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteDiscount(int discountId) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Discount> getAllDiscount() throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
