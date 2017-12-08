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
public class ProductManagerIT {
    
    public ProductManagerIT() {
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
     * Test of setMessage method, of class ProductManager.
     */
    @Test
    public void testSetMessage() {
        System.out.println("setMessage");
        String message = "hello";
        ProductManager instance = new ProductManager("foo","ola");
        instance.setMessage(message);
    }

    /**
     * Test of getMessage method, of class ProductManager.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        ProductManager instance = new ProductManager("foo","ola");
        String expResult = "hello";
        instance.setMessage("hello");
        String result = instance.getMessage();
        assertEquals(expResult, result);
    }
    
}
