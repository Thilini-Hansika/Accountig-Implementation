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
//import zeon.energySystem.model.Employee;
import zeon.energySystem.common.model.Employee;

/**
 *
 * @author Zeon-IT
 */
public interface EmployeeController extends Remote{
    public boolean addEmployee(Employee employee)throws RemoteException,SQLException, ClassNotFoundException;
    public boolean updateEmployee(Employee employee)throws RemoteException,SQLException, ClassNotFoundException;    
    public boolean deleteEmployee(int id)throws RemoteException,SQLException, ClassNotFoundException;
    public Employee searchEmployee(int id)throws RemoteException,SQLException, ClassNotFoundException;
    public List<Employee>getAllEmployee()throws RemoteException,SQLException, ClassNotFoundException;
    public Employee searchEmployeeByName(String employee)throws RemoteException,SQLException, ClassNotFoundException;
}
