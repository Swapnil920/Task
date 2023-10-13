/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer;

/**
 *
 * @author Dell
 */
public class Customer {
    private int customerID;
    private String name;
    private String contactInfo;

    public Customer(int customerID, String name, String contactInfo) {
        this.customerID = customerID;
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public int getCustomerID() {
        return customerID;
    }

    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }
}

