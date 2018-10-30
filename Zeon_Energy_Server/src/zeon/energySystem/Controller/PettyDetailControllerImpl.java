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
import zeon.energySystem.DaoImpl.PettyDetailDaoImpl;
import zeon.energySystem.common.model.PettyDetail;
import zeon.energySystem.common.controller.PettyDetailController;

/**
 *
 * @author Zeon-IT
 */
public class PettyDetailControllerImpl extends UnicastRemoteObject implements PettyDetailController {

    private final PettyDetailDaoImpl daoImpl = new PettyDetailDaoImpl();
    public PettyDetailControllerImpl()throws RemoteException{
        
    }

    @Override
    public List<PettyDetail> getAllprettyCash() throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PettyDetail> getPettyDateRange(String convertFrom, String convertTo) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.getPettyDateRange(convertFrom, convertTo);
    }

   
    
    
}
