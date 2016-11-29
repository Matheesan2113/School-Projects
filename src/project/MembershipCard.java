/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 *
 * Overview: A Membership Card is an mutable object representing account details of a customer
 * for them to use the transit service
 * Abstract function: A membership card contains account details which 
 * include the customer's balance card number, and age status 
 * Rep invariant: the balance cannot be negative, Card Number must not be duplicate
 */

public class MembershipCard {

    private double balance;
    private int cardNumber;
    private int status;
    private int tripCounter=0;

    /**
     *Constructor
     * Requires: non-negative balance, Non-duplicate card Number
     * Modifies: this
     * @param bal
     * @param cardNum
     * @param s
     */
    public MembershipCard(double bal, int cardNum, int s) {
        balance = bal;
        cardNum = cardNumber;
        status = s;    
    }
    
    /**
     *Requires: non-negative double amount to be added
     *Modifies: changes Balance
     * effects: Adds input amount to balance
     * @param amount
     */
    public void loadCard (double amount) {
        balance=balance+amount;
    }
    
    /**
     * effects: returns card balance
     * @return balance
     */
    public double getBalance() {
        return balance;
    }
    
    /**
     *Requires: non-negative double amount to be deducted
     *Modifies: changes Balance
     * effects: Deducts cost from balance and returns balance
     * @param cost
     * @return balance
     */
    public double BalacePay(double cost) {
        balance=balance-cost;
        return balance;
    }
    
    /**
     * effects: Returns card Number
     * @return card Number
     */
    public int getNumber() {
        return cardNumber;
    }
        
    /**
     * effects: returns status as an integer
     * @return status
     */
    public int getStatus() {
         return status;
        }
    
}
