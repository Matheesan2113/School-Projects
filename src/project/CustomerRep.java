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
public class CustomerRep extends UserProfile {
   
    Customer you;

    public CustomerRep(String user, String pass) {
       super(user, pass);
    }

    public Customer CreateCustomer(String user, String pass, double bal, int cardNum, int s) {
        Customer you = new Customer(user, pass, bal, cardNum, s);
        return you;
    }
     
     public void addFunds (double amount){
         you.getCard().loadCard(amount);
     }
}
//
