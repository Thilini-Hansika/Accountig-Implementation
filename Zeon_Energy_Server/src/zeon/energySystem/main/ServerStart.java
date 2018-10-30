/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeon.energySystem.main;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.SessionFactory;
import zeon.energySystem.Controller.RemoteFactoryImpl;
import zeon.energySystem.util.HibernateUtil;

/**
 *
 * @author ZeonIT
 */
public class ServerStart {

    private static Registry registry = null;

    public boolean serverStart() {
        try {
            registry = LocateRegistry.createRegistry(5050);
            SessionFactory sessionFactory = HibernateUtil.getInstnce();
            registry.rebind("zeonServer", new RemoteFactoryImpl());
           
            return true;
        } catch (RemoteException ex) {
           
        }
        return false;
    }
}
