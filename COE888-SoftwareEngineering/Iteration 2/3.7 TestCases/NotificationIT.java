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
public class NotificationIT {
    
    public NotificationIT() {
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
     * Test of Notify method, of class Notification.
     */
    @Test
    public void testNotify() {
        System.out.println("Notify");
        Notification instance = new Notification (new Alarm(0));
        boolean expResult = true;
        boolean result = instance.Notify();
        assertEquals(expResult, result);
    }
    
}
