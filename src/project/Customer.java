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

    public Customer(String user, String pass, double bal, int cardNum, int s) {
        super(user, pass);
        card = new MembershipCard(bal, cardNum, s);
    }

    /**
     * @return the card
     */
    public MembershipCard getCard() {
        return card;
    }

    public void addFunds(double amount) {
        card.loadCard(amount);
    }
}
