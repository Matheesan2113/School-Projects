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
public class AlarmIT {
    
    public AlarmIT() {
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
     * Test of AlarmDone method, of class Alarm.
     */
    @Test
    public void testAlarmDone() {
        System.out.println("AlarmDone");
        Alarm instance = new Alarm(0);
        boolean expResult = true;
        boolean result = instance.AlarmDone();
        assertEquals(expResult, result);
    }

    /**
     * Test of AlarmRun method, of class Alarm.
     */
    @Test
    public void testAlarmRun() {
        System.out.println("AlarmRun");
        long l = 10000;
        Alarm instance = new Alarm(l);
        instance.AlarmRun(l);
    }

    /**
     * Test of setB method, of class Alarm.
     */
    @Test
    public void testSetB() {
        System.out.println("setB");
        long b = 10000;
        Alarm instance = new Alarm(b);
        instance.setB(b);
    }

    /**
     * Test of getB method, of class Alarm.
     */
    @Test
    public void testGetB() {
        System.out.println("getB");
        Alarm instance = new Alarm(100);
        long expResult = 100;
        long result = instance.getB();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Alarm.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Alarm instance = new Alarm(600);
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
