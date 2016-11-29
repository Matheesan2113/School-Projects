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
public abstract class UserProfile {
    private String username;
    private String password;

    public UserProfile(String user, String pass) {
        username=user;
        password=pass;
    }
    
    public String getUsername() {
        return username;
    }

    public abstract void addFunds (double amount);

}
