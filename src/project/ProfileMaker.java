/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Owner
 */
public class ProfileMaker {
    private UserProfile customer;
    private UserProfile customerRep;
    
    public ProfileMaker(String user, String pass, double bal, int cardNum, int s) {
        customer=new Customer(user, pass, bal, cardNum, s);
    }
    
    public ProfileMaker(String user, String pass) {
        customerRep=new CustomerRep(user, pass);
    }
    
    public void addFundsByRep(double amount) {
        customer.addFunds(amount);
    }
    
      public void addFundsByCustomer(double amount) {
        customerRep.addFunds(amount);
    }
}
