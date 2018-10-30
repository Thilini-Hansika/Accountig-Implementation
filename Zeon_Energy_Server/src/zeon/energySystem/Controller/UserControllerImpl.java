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
import java.util.logging.Level;
import java.util.logging.Logger;
import zeon.energySystem.DaoImpl.UserDaoImpl;
import zeon.energySystem.common.controller.UserController;
import zeon.energySystem.common.model.Users;
import zeon.energySystem.observerble.UserObserverble;
import zeon.energySystem.reservation.UserReserver;
/**
 *
 * @author Zeon-IT
 */
public class UserControllerImpl extends UnicastRemoteObject implements UserController{
    private static final UserReserver USER_RESERVER = new UserReserver();
    private final UserDaoImpl daoImpl = new UserDaoImpl();
    private static final UserObserverble USER_OBSERVERBLE = new UserObserverble();
    public UserControllerImpl()throws RemoteException{
        
    }
    @Override
    public boolean addUser(Users user) throws RemoteException, SQLException, ClassNotFoundException {
    final boolean isAdded = daoImpl.addUser(user);
        new Thread(){
            @Override
            public void run() {
               if(isAdded){
                   try {
                       USER_OBSERVERBLE.setMessage("User Added Success...!!");
                   } catch (RemoteException ex) {
                       Logger.getLogger(UserControllerImpl.class.getName()).log(Level.SEVERE, null, ex);
                   }
               }
            }
            
        }.start();
        return isAdded;

    }

    @Override
    public boolean updateUser(Users user) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteUser(int id) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Users searchUser(String nic) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.searchUser(nic);
    }

    @Override
    public List<Users> getAllUser() throws RemoteException, SQLException, ClassNotFoundException {
       return daoImpl.getAllUser();
    }

    
}
