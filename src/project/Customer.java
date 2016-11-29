package project;

/**
 *
 * @author Owner
 */
public class Customer extends UserProfile {
    /**
     * Overview: A customer is an immutable object representing the person using the application to use public transit service
     * Abstraction function: a customer has a transit membership card that contains details of their balance, card number
     * and status 
     * Rep invariant: the balance cannot be negative
     */
    
    //rep
    private MembershipCard card;

    /**
     * Constructor
     * Requires: non negative double for bal
     * Modifies: this
     */
    public Customer(String user, String pass, double bal, int cardNum, int s) {
        super(user, pass);
        card = new MembershipCard(bal, cardNum, s);
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

