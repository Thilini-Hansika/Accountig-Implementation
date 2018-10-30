/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeon.energySystem.common.controller;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Zeon-IT
 */
public interface RemoteFactory extends Remote{
    public CustomerController getCustomerController()throws RemoteException;
    public VendorController getVendorController()throws RemoteException;
    public TermsController getTermsController()throws RemoteException;
    public TaxController getTaxController()throws RemoteException;
    public UserController getUserController()throws RemoteException;
    public UserTypeController getUserTypeController()throws RemoteException;
    public FixedAssetController getFixedAssetController()throws RemoteException;
    public DiscountItemController getGetDiscountItemController()throws RemoteException;
    public GroupItemController getGroupItemController()throws RemoteException;
    public NonInventoryItemController getNonInventoryItemController()throws RemoteException;
    public OtherChargeItemController getOtherChargeItemController()throws RemoteException;
    public PaymentItemController getPaymentItemController()throws RemoteException;
    public SaleTaxGroupItemController getSaleTaxGroupItemController()throws RemoteException; 
    public SaleTaxItemController getSaleTaxItemController()throws RemoteException;
    public SubTotalItemController getSubTotalItemController()throws RemoteException; 
    public ServiceItemController getServiceItemController()throws RemoteException;   
    public EmployeeController getEmployeeController()throws RemoteException;
    public InvoiceController getInvoiceController()throws RemoteException;
    public CustomerReceivedController getCustomerReceivedController()throws RemoteException;
    public PaymentController getPaymentController()throws RemoteException;  
   
    public InventoryItemController getInventoryItemController()throws RemoteException; 
    public PurchaseController getPurchaseController()throws RemoteException;
    public VendorPaybleController getVendorPaybleController()throws RemoteException;
    public VendorPaymentController getVendorPaymentController()throws RemoteException;
    public ExpenceController getExpenceController()throws RemoteException;
    public PettyCashController getPettyCashController()throws RemoteException;
    public PettyDetailController getPettyDetailController()throws RemoteException;
    public BankAccountController getBankAccountController()throws RemoteException;
    public ExpenceAccountController getExpenceAccountController()throws RemoteException;
    public AccountController getAccountController()throws RemoteException;
    public ItemTypeController getItemTypeController()throws RemoteException;
    public DiscountController getDiscountController()throws RemoteException;
    public JournalController getJournalController()throws RemoteException;
    public ChequeController getChequeController()throws RemoteException;
    public TransferController getTransferController()throws RemoteException;
    public OrderDetailController getOrderDetailController()throws RemoteException;
    public ChequeDetailController getChequeDetailController()throws RemoteException;
    public IncomeAccountController getIncomeAccountController()throws RemoteException;
    public COGSAccountController getCOGSAccountController()throws RemoteException;
    public PurchaseItemController getPurchaseItemController()throws RemoteException;
    
    
}
