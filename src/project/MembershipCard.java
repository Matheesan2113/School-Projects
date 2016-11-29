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
public class MembershipCard {

    private double balance;
    private int cardNumber;
    private int status;
    private int tripCounter=0;

    public MembershipCard(double bal, int cardNum, int s) {
        balance = bal;
        cardNum = cardNumber;
        status = s;    
    }
    
    public void loadCard (double amount) {
        balance=balance+amount;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public double BalacePay(double cost) {
        balance=balance-cost;
        return balance;
    }
    
    public int getNumber() {
        return cardNumber;
    }
        
    public int getStatus() {
         return status;
        }
    
}
