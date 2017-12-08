/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author matheesan
 */
public class UserIT {
    
    public UserIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getUname method, of class User.
     */
    @Test
    public void testGetUname() {
        System.out.println("getUname");
        User instance = new User();
        instance.setUname("bob");
        String expResult = "bob";
        String result = instance.getUname();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPword method, of class User.
     */
    @Test
    public void testGetPword() {
        System.out.println("getPword");
        User instance = new User();
        instance.setPword("bob");
        String expResult = "bob";
        String result = instance.getPword();
        assertEquals(expResult, result);
    }

    /**
     * Test of getId method, of class User.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        User instance = new User();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class User.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        User instance = new User();
        String expResult = instance.getUname();
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
