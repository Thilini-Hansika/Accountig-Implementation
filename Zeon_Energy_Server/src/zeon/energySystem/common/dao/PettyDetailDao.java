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
import zeon.energySystem.common.model.PettyDetail;

/**
 *
 * @author Zeon-IT
 */
public interface PettyDetailDao extends Remote{
    public List<PettyDetail>getAllprettyCash()throws RemoteException,SQLException, ClassNotFoundException;
    public List<PettyDetail> getPettyDateRange(String convertFrom, String convertTo)throws RemoteException,SQLException, ClassNotFoundException;
}
