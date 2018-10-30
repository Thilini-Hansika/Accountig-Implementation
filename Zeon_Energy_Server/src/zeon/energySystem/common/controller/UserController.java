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
import zeon.energySystem.common.model.Users;

/**
 *
 * @author Zeon-IT
 */
public interface UserController extends Remote{
    public boolean addUser(Users user)throws RemoteException,SQLException, ClassNotFoundException;
    public boolean updateUser(Users user)throws RemoteException,SQLException, ClassNotFoundException;    
    public boolean deleteUser(int id)throws RemoteException,SQLException, ClassNotFoundException;
    public Users searchUser(String nic)throws RemoteException,SQLException, ClassNotFoundException;
    public List<Users>getAllUser()throws RemoteException,SQLException, ClassNotFoundException;
}
