package project;

import java.io.*;
import java.util.*;

import java.lang.*;
/**
 *
 * Overview: A customer is an immutable object representing the
 * person using the application to use public transit service Abstraction
 * function: a customer has a transit membership card that contains details of
 * their balance, card number and status Rep invariant: the balance cannot be
 * negative
 */
public class Customer extends UserProfile {

    //rep
    private MembershipCard card;

    /**
     * Constructor Requires: non negative double for bal Modifies: this
     * @param user
     * @param pass
     * @param bal
     * @param cardNum
     * @param s
     */
    public Customer(String user, String pass, double bal, int cardNum, int s)  {
        super(user, pass);
        try{
            if((bal<0)||(s>3)||(s<1))
                throw new IllegalArgumentException();  
            else
             card = new MembershipCard(bal, cardNum, s);           
        }
        catch (IllegalArgumentException jlh){           
        }
       
    }

    /**
     * Effects: returns card object
     */
    public MembershipCard getCard() {
        return card;
    }

    /**
     * Requires:non negative double for amount to be added 
     * Effects:adds input amount to balance on the card
     */
    public void addFunds(double amount) {
        card.loadCard(amount);
    }
}
