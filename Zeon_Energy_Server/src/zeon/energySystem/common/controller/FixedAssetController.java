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
import zeon.energySystem.common.model.FixedAsset;

/**
 *
 * @author Zeon-IT
 */
public interface FixedAssetController extends Remote{
    public boolean addFixedAsset(FixedAsset asset)throws RemoteException,SQLException,ClassNotFoundException;
    public boolean updateFixedAsset(FixedAsset asset)throws RemoteException,SQLException,ClassNotFoundException;
    public FixedAsset searchFixedAsset(String assetId)throws RemoteException,SQLException,ClassNotFoundException;
    public boolean deleteFixedAsset(int assetId)throws RemoteException,SQLException,ClassNotFoundException;
    public List<FixedAsset> getAllAsset()throws RemoteException,SQLException,ClassNotFoundException;
}
