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
public class Customer extends UserProfile {
    private MembershipCard card;
    
    public Customer(String user, String pass, MembershipCard c) {
        super(user, pass, "customer");
        card=c;
    }
    
}
