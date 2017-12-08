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
public class MembershipCardTest {
    
    public MembershipCardTest() {
    }
    /**
     * Test of loadCard method, of class MembershipCard.
     */
    @Test
    public void testLoadCard() {
        System.out.println("loadCard");
        double amount = 20.0;
        MembershipCard instance = new MembershipCard(100,3005,2);
        instance.loadCard(amount);
    }

    /**
     * Test of getBalance method, of class MembershipCard.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        MembershipCard instance = new MembershipCard(40,500056,3);
        double expResult = 40.0;
        double result = instance.getBalance();
        assertEquals(expResult, result, 40.0);
    }

    /**
     * Test of BalacePay method, of class MembershipCard.
     */
    @Test
    public void testBalacePay() {
        System.out.println("BalacePay");
        double cost = 90.0;
        MembershipCard instance = new MembershipCard(100,345,1);
        double expResult = 10.0;
        double result = instance.BalacePay(cost);
        assertEquals(expResult, result, 90.0);

    }

    /**
     * Test of getNumber method, of class MembershipCard.
     *
    @Test
    public void testGetNumber() {
        System.out.println("getNumber");
        MembershipCard instance = null;
        int expResult = 0;
        int result = instance.getNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class MembershipCard.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        MembershipCard instance = new MembershipCard(100,243,2);
        int expResult = 2;
        int result = instance.getStatus();
        assertEquals(expResult, result);
    }
    
}
