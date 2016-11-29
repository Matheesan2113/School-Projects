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
     @Test
    public void testInvalidConstructor() {
        boolean gotEx = false;
        try {
             Customer s = new Customer("Toronto","Ottowa", -65.9, 321,41);
        }
        catch(IllegalArgumentException ert) {
            gotEx = true;
        }
        assertFalse(gotEx);
    }

    @Test
    public void testValidConstructor() {
        boolean gotEx = true;
        try {
             Customer s = new Customer("Toronto","Ottowa", 65, 321,41);
        }
        catch(IllegalArgumentException e) {
            gotEx = false;
        }
        assertTrue(gotEx);
    }

    /**
     * Test of getCard method, of class Customer.
     */
    @Test
    public void testGetCard() {
        System.out.println("getCard");
        Customer instance = new Customer("user","pass",100,300,1);
        double expResult = 100;
        double result = instance.getCard().getBalance();
        assertEquals(expResult,result,100);
    }

    /**
     * Test of addFunds method, of class Customer.
     */
    @Test
    public void testAddFunds() {
        System.out.println("addFunds");
        double amount = 10;
        Customer instance = new Customer("user","pass",100,3001,2);
        instance.addFunds(amount);
        System.out.println("Balance is now $"+instance.getCard().getBalance());
    }
    
}
