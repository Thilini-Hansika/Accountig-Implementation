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
import zeon.energySystem.DaoImpl.FixedAssetDaoImpl;
import zeon.energySystem.common.controller.FixedAssetController;
import zeon.energySystem.common.model.FixedAsset;
/**
 *
 * @author Zeon-IT
 */
public class FixedAssetControllerImpl extends UnicastRemoteObject implements FixedAssetController {
    private final FixedAssetDaoImpl daoImpl = new FixedAssetDaoImpl();
    public FixedAssetControllerImpl()throws RemoteException{
        
    }
    @Override
    public boolean addFixedAsset(FixedAsset asset) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.addFixedAsset(asset);
    }

    @Override
    public boolean updateFixedAsset(FixedAsset asset) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.updateFixedAsset(asset);
    }

    @Override
    public FixedAsset searchFixedAsset(String assetId) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.searchFixedAsset(assetId);
    }

    @Override
    public boolean deleteFixedAsset(int assetId) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<FixedAsset> getAllAsset() throws RemoteException, SQLException, ClassNotFoundException {
       return daoImpl.getAllAsset();
    }
    
}
