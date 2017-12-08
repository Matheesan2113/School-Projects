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

    /**
     *
     * @param user
     * @param pass
     */
    public UserProfile(String user, String pass) {
        username=user;
        password=pass;
    }
    
    /**
     *
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     *
     * @param amount
     */
    public abstract void addFunds (double amount);

}
