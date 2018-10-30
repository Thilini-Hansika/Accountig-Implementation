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
import zeon.energySystem.DaoImpl.EmployeeDaoImpl;
import zeon.energySystem.common.controller.EmployeeController;
//import zeon.energySystem.model.Employee;
import zeon.energySystem.common.model.Employee;
/**
 *
 * @author Zeon-IT
 */
public class EmployeeControllerImpl extends UnicastRemoteObject implements EmployeeController{
private final EmployeeDaoImpl daoImpl = new EmployeeDaoImpl();

    public EmployeeControllerImpl()throws RemoteException{
        
    }
    @Override
    public boolean addEmployee(Employee employee) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.addEmployee(employee);
    }

    @Override
    public boolean updateEmployee(Employee employee) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteEmployee(int id) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Employee searchEmployee(int id) throws RemoteException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Employee> getAllEmployee() throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.getAllEmployee();
    }

    @Override
    public Employee searchEmployeeByName(String employee) throws RemoteException, SQLException, ClassNotFoundException {
        return daoImpl.searchEmployeeByName(employee);
    }
    
}
