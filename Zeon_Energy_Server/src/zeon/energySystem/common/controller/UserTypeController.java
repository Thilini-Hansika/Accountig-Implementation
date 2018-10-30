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
import zeon.energySystem.common.model.UserType;

/**
 *
 * @author Zeon-IT
 */
public interface UserTypeController extends Remote{
    public boolean addUserType(UserType userType)throws RemoteException,SQLException, ClassNotFoundException;
    public boolean updateUserType(UserType userType)throws RemoteException,SQLException, ClassNotFoundException;    
    public boolean deleteUserType(int id)throws RemoteException,SQLException, ClassNotFoundException;
    public UserType searchUserType(String nic)throws RemoteException,SQLException, ClassNotFoundException;
    public List<UserType>getAllUserType()throws RemoteException,SQLException, ClassNotFoundException;
}
