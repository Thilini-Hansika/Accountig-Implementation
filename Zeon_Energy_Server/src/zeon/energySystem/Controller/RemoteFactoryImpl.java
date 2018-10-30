/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeon.energySystem.Controller;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import zeon.energySystem.common.controller.AccountController;
import zeon.energySystem.common.controller.BankAccountController;
import zeon.energySystem.common.controller.COGSAccountController;
import zeon.energySystem.common.controller.ChequeController;
import zeon.energySystem.common.controller.ChequeDetailController;

import zeon.energySystem.common.controller.CustomerController;
import zeon.energySystem.common.controller.ExpenceAccountController;
import zeon.energySystem.common.controller.VendorPaybleController;
import zeon.energySystem.common.controller.CustomerReceivedController;
import zeon.energySystem.common.controller.DiscountController;
import zeon.energySystem.common.controller.DiscountItemController;
import zeon.energySystem.common.controller.EmployeeController;
import zeon.energySystem.common.controller.ExpenceController;
import zeon.energySystem.common.controller.FixedAssetController;
import zeon.energySystem.common.controller.GroupItemController;
import zeon.energySystem.common.controller.IncomeAccountController;
import zeon.energySystem.common.controller.InventoryItemController;
import zeon.energySystem.common.controller.InvoiceController;
import zeon.energySystem.common.controller.ItemTypeController;
import zeon.energySystem.common.controller.JournalController;
import zeon.energySystem.common.controller.NonInventoryItemController;
import zeon.energySystem.common.controller.OrderDetailController;
import zeon.energySystem.common.controller.OtherChargeItemController;
import zeon.energySystem.common.controller.PaymentController;
import zeon.energySystem.common.controller.PaymentItemController;
import zeon.energySystem.common.controller.PettyCashController;
import zeon.energySystem.common.controller.PettyDetailController;
import zeon.energySystem.common.controller.PurchaseController;
import zeon.energySystem.common.controller.PurchaseItemController;
import zeon.energySystem.common.controller.RemoteFactory;
import zeon.energySystem.common.controller.SaleTaxGroupItemController;
import zeon.energySystem.common.controller.SaleTaxItemController;
import zeon.energySystem.common.controller.ServiceItemController;
import zeon.energySystem.common.controller.SubTotalItemController;
import zeon.energySystem.common.controller.TaxController;
import zeon.energySystem.common.controller.TermsController;
import zeon.energySystem.common.controller.TransferController;
import zeon.energySystem.common.controller.UserController;
import zeon.energySystem.common.controller.UserTypeController;
import zeon.energySystem.common.controller.VendorController;
import zeon.energySystem.common.controller.VendorPaymentController;


/**
 *
 * @author Zeon-IT
 */
public class RemoteFactoryImpl extends UnicastRemoteObject implements RemoteFactory{

     public RemoteFactoryImpl()throws RemoteException{
        
    } 
    
    @Override
    public CustomerController getCustomerController() throws RemoteException {
        return new CustomerControllerImpl();
    }

    @Override
    public VendorController getVendorController() throws RemoteException {
        return new VendorControllerImpl();
    }

    @Override
    public TermsController getTermsController() throws RemoteException {
        return new TermsControllerImpl();
    }

    @Override
    public TaxController getTaxController() throws RemoteException {
        return new TaxControllerImpl();
    }

    @Override
    public UserController getUserController() throws RemoteException {
        return new UserControllerImpl();
    }

    @Override
    public UserTypeController getUserTypeController() throws RemoteException {
        return new UserTypeControllerImpl();
    }

    @Override
    public FixedAssetController getFixedAssetController() throws RemoteException {
        return new FixedAssetControllerImpl();
    }

    @Override
    public DiscountItemController getGetDiscountItemController() throws RemoteException {
        return new DiscountItemControllerImpl();
    }

    @Override
    public GroupItemController getGroupItemController() throws RemoteException {
        return new GroupItemControllerImpl();
    }

    @Override
    public NonInventoryItemController getNonInventoryItemController() throws RemoteException {
        return new NonInventoryItemControllerImpl();
    }

    @Override
    public OtherChargeItemController getOtherChargeItemController() throws RemoteException {
        return new OtherChargeItemControllerImpl();
    }

    @Override
    public PaymentItemController getPaymentItemController() throws RemoteException {
        return new PaymentItemControllerImpl();
    }

    @Override
    public SaleTaxGroupItemController getSaleTaxGroupItemController() throws RemoteException {
        return new SaleTaxGroupItemControllerImpl();
    }

    @Override
    public SaleTaxItemController getSaleTaxItemController() throws RemoteException {
        return new SaleTaxItemControllerImpl();
    }

    @Override
    public SubTotalItemController getSubTotalItemController() throws RemoteException {
        return new SubTotalItemControllerImpl();
    }

    @Override
    public ServiceItemController getServiceItemController() throws RemoteException {
        return new ServiceItemControllerImpl();
    }

   

    @Override
    public EmployeeController getEmployeeController() throws RemoteException {
        return new EmployeeControllerImpl();
    }

    @Override
    public InvoiceController getInvoiceController() throws RemoteException {
       return new InvoiceControllerImpl();
    }

    @Override
    public CustomerReceivedController getCustomerReceivedController() throws RemoteException {
        return new CustomerReceivedControllerImpl();
    }

    @Override
    public PaymentController getPaymentController() throws RemoteException {
       return new PaymentControllerImpl();
    }

    @Override
    public InventoryItemController getInventoryItemController() throws RemoteException {
       return new InventoryItemControllerImpl();
    }

   

    @Override
    public PurchaseController getPurchaseController() throws RemoteException {
        return new PurchaseControllerImpl();
    }

    @Override
    public VendorPaybleController getVendorPaybleController() throws RemoteException {
        return new VendorPaybleControllerImpl();
    }

    @Override
    public VendorPaymentController getVendorPaymentController() throws RemoteException {
        return new VendorPaymentControllerImpl();
    }

    @Override
    public ExpenceController getExpenceController() throws RemoteException {
        return new ExpenceControllerImpl();
    }

    @Override
    public BankAccountController getBankAccountController() throws RemoteException {
        return new BankAccountControllerImpl();
    }

    @Override
    public ExpenceAccountController getExpenceAccountController() throws RemoteException {
        return new ExpenceAccountControllerImpl();
    }
   

    @Override
    public ItemTypeController getItemTypeController() throws RemoteException {
        return new ItemTypeControllerImpl();
    }

    @Override
    public DiscountController getDiscountController() throws RemoteException {
        return new DiscountControllerImpl();
    }

    @Override
    public JournalController getJournalController() throws RemoteException {
        return new JournalControllerImpl();
    }

    @Override
    public ChequeController getChequeController() throws RemoteException {
        return new ChequeControllerImpl();
    }

    @Override
    public TransferController getTransferController() throws RemoteException {
       return new TransferControllerImpl();
    }

    @Override
    public OrderDetailController getOrderDetailController() throws RemoteException {
        return new OrderDetailControllerImpl();
    }

    @Override
    public PettyCashController getPettyCashController() throws RemoteException {
       return new PettyCashControllerImpl();
    }

    @Override
    public PettyDetailController getPettyDetailController() throws RemoteException {
        return new PettyDetailControllerImpl();
    }

    @Override
    public ChequeDetailController getChequeDetailController() throws RemoteException {
       return new ChequeDetailControllerImpl();
    }

    @Override
    public IncomeAccountController getIncomeAccountController() throws RemoteException {
       return new IncomeAccountControllerImpl();
    }

    @Override
    public COGSAccountController getCOGSAccountController() throws RemoteException {
        return new COGSAccountControllerImpl();
    }

    @Override
    public PurchaseItemController getPurchaseItemController() throws RemoteException {
       return new PurchaseItemControllerImpl();
    }

    @Override
    public AccountController getAccountController() throws RemoteException {
        return new AccountControllerImpl();
    }


    
}
