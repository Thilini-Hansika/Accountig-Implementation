/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeon.energySystem.main;

import java.rmi.AlreadyBoundException;
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
 * @author Zeon-IT
 */
public class Main {
     public static void main(String[] args) throws AlreadyBoundException {
        try {
            Registry zeonRegistry=LocateRegistry.createRegistry(5050);
            SessionFactory sessionFactory = HibernateUtil.getInstnce();
            zeonRegistry.rebind("zeonServer", new RemoteFactoryImpl());
        } catch (RemoteException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
