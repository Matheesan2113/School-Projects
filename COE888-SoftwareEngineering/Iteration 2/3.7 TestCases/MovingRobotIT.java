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
public class MovingRobotIT {
    
    public MovingRobotIT() {
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
     * Test of toString method, of class MovingRobot.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        MovingRobot instance = new MovingRobot(100);
        String expResult = "Moving Robot ";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
