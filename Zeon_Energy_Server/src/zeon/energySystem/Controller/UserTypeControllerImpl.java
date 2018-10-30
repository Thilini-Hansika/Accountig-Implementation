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
import zeon.energySystem.DaoImpl.UserTypeDaoImpl;
import zeon.energySystem.common.controller.UserTypeController;
import zeon.energySystem.common.model.UserType;
/**
 *
 * @author Zeon-IT
 */
public class UserTypeControllerImpl extends UnicastRemoteObject implements UserTypeController {

    UserTypeDaoImpl daoImpl = new UserTypeDaoImpl();
    public UserTypeControllerImpl()throws RemoteException{
        
    }
    
    @Override
    public boolean addUserType(UserType userType) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.addUserType(userType);
    }

    @Override
    public boolean updateUserType(UserType userType) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteUserType(int id) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UserType searchUserType(String nic) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<UserType> getAllUserType() throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.getAllUserType();
    }
    
}
