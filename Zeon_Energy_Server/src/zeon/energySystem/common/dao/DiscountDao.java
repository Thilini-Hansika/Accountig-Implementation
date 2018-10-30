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
import zeon.energySystem.common.model.Discount;

/**
 *
 * @author ZeonIT
 */
public interface DiscountDao extends Remote{
    public boolean addDiscount(Discount discount)throws RemoteException,SQLException,ClassNotFoundException;
    public boolean updateDiscount(Discount discount)throws RemoteException,SQLException,ClassNotFoundException;
    public Discount searchDiscount(String discount)throws RemoteException,SQLException,ClassNotFoundException;
    public boolean deleteDiscount(int discountId)throws RemoteException,SQLException,ClassNotFoundException;
    public List<Discount>getAllDiscount()throws RemoteException,SQLException, ClassNotFoundException;
}
