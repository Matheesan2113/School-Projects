/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Mathe 
 * Overview:A ProfileMaker is an immutable Object representing an
 * object that creates Customers or Service Representatives
 * <p>
 * Abstraction function: The ProfileMaker works with the abstract type of
 * UserProfile which is extended by Customer and Service Rep
 * <p>
 * Rep invariant: Customer can't have duplicates because of username conflicts
 */
public class ProfileMaker {

    /**
     * Using Polymorphism allows for Customer to be called in as a User Profile
     * to be used in this class
     */
    protected UserProfile customer;
    /**
     * Using Polymorphism allows for Service Rep to be called in as a User
     * Profile to be used in this class
     */
    private UserProfile customerRep;

    /**
     * Constructor Requires: Non-negative Balance, Username not already taken
     *
     * @param user Must be String taken from textField in UI, Must Not have a
     * Duplicate
     * @param pass Must be String taken from textField in UI
     * @param bal Must be Double that can be converted to String, taken from
     * textField in UI
     * @param cardNum Must be Integer taken by incrementing CardCount
     * @param s Must be Integer taken from CheckBox in UI
     */
    public ProfileMaker(String user, String pass, double bal, int cardNum, int s) {
        customer = new Customer(user, pass, bal, cardNum, s);
    }

    /**
     * Constructor Requires: Known Username to client Running Application
     *
     * @param user Must be String set by UI as "Admin"
     * @param pass Must be String set by UI as "Admin"
     */
    public ProfileMaker(String user, String pass) {
        customerRep = new CustomerRep(user, pass);
    }

    /**
     * Modifies:Modifies Balance for Customer's Card Through Service Rep 
     * Requires: positive amount taken from
     * item-box in UI which is always set as String which can be converted to
     * Double 
     * Effects:Adjusts card balance by desired amount of Money set by
     * Service Rep
     * @param amount set as 50,100,200 or 500 in item-box from UI, gets sent to
     * method as Double
     */
    public void addFundsByRep(double amount) {
        getCustomer().addFunds(amount);
    }

    /**
     * Modifies:Modifies Balance for Customer's Card{
     * Requires: positive amount taken from
     * item-box in UI which is always set as String which can be converted to
     * Double Effects:Adjusts card balance by desired amount of Money
     * @param amount set as 50,100,200 or 500 in item-box from UI, gets sent to
     * method as Double
     */
    public void addFundsByCustomer(double amount) {
        customerRep.addFunds(amount);
    }

    /**
     * Effects: Returns Customer
     *
     * @return Returns Abstract version of Customer (User Profile) to be later
     * casted as Customer by UI
     */
    protected UserProfile getCustomer() {
        return customer;
    }
}
