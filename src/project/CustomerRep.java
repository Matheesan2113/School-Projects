/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * Overview: A customerRep is an immutable object representing the
 * Representative controlling the administration process to serve customers
 * Abstraction function: a customerRep is a user with login credentials
 * such as username and password
 * Rep invariant: both Username and Password must be "admin"
 */
public class CustomerRep extends UserProfile {
   
    Customer you;
    //Rep
private String user="admin";
private String pass="admin";
    /**
     * Constructor 
     * Requires: set to admin both username and password
     * Modifies: this
     */
    public CustomerRep(String user, String pass) {
       super(user, pass);
       this.user=user="admin";
       this.pass=pass="admin";
    }

    /**
     *Requires: username must not be duplicate, balance non-negative
     * Modifies: Customer Object you
     * Effects: Returns Customer Object
     * @return-return Customer Object
     */
    public Customer CreateCustomer(String user, String pass, double bal, int cardNum, int s) {
        Customer you = new Customer(user, pass, bal, cardNum, s);
        return you;
    }
         /**
     * Requires:non negative double for amount to be added 
     * Effects:adds input amount to balance on the card
     */
     public void addFunds (double amount){
         you.getCard().loadCard(amount);
     }
}
//
