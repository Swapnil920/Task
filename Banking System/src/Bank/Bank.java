/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;

import Customer.Customer;
import Accounts.Accounts;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Dell
 */
public class Bank {
    private Map<Integer, Customer> customers;
    private Map<Integer, Accounts> accounts;

    public Bank() {
        this.customers = new HashMap<>();
        this.accounts = new HashMap<>();
    }

    public void addCustomer(Customer customer) {
        customers.put(customer.getCustomerID(), customer);
    }

    public void createAccount(int accountNumber, int customerId) {
        Customer customer = findCustomer(customerId);
        if (customer != null) {
            Accounts account = new Accounts(accountNumber, customer);
            accounts.put(accountNumber, account);
        }
    }

    public void performTransaction(int accountNumber, double amount, boolean isDeposit) {
        Accounts account = findAccount(accountNumber);
        if (account != null) {
            if (isDeposit) {
                account.deposit(amount);
            } else {
                account.withdraw(amount);
            }
        }
    }

    public void displayAccountDetails(int accountNumber) {
        Accounts account = findAccount(accountNumber);
        if (account != null) {
            Customer customer = account.getAccountHolder();
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Account Holder: " + customer.getName());
            System.out.println("Balance: " + account.getBalance());
        }
    }

    private Customer findCustomer(int customerId) {
        return customers.get(customerId);
    }

    private Accounts findAccount(int accountNumber) {
        return accounts.get(accountNumber);
    }
}

        
   

