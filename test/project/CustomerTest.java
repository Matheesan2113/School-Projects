/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mathe
 */
public class CustomerTest {
    
    public CustomerTest() {
    }
     @Test (expected = IllegalArgumentException.class)
    public void testInvalidConstructor() {
        Customer s = new Customer("Toronto","Ottowa", -5.6, 321,41);
    }

    /**
     * Test of getCard method, of class Customer.
     */
    @Test
    public void testGetCard() {
        System.out.println("getCard");
        Customer instance = null;
        MembershipCard expResult = null;
        MembershipCard result = instance.getCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addFunds method, of class Customer.
     */
    @Test
    public void testAddFunds() {
        System.out.println("addFunds");
        double amount = 0.0;
        Customer instance = null;
        instance.addFunds(amount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
