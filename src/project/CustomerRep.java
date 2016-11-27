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
    
    public CustomerRep(String user, String pass) {
        super(user, pass, "customer representative");
    }
}
