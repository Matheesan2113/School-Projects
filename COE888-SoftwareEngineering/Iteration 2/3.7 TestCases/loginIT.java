/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import java.util.ArrayList;
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
public class loginIT {
    
    public loginIT() {
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
     * Test of checkarrays method, of class login.
     */
    @Test
    public void testCheckarrays() {
        System.out.println("checkarrays");
        login instance = new login();
        instance.checkarrays();
    }

    /**
     * Test of findwop method, of class login.
     */
    @Test
    public void testFindwop() {
        System.out.println("findwop");
        String username = "";
        login instance = new login();
        WorkOP expResult = null;
        WorkOP result = instance.findwop(username);
        assertEquals(expResult, result);
    }

    /**
     * Test of findEngineer method, of class login.
     */
    @Test
    public void testFindEngineer() {
        System.out.println("findEngineer");
        String username = "";
        login instance = new login();
        ProcessEngineer expResult = null;
        ProcessEngineer result = instance.findEngineer(username);
        assertEquals(expResult, result);
    }

    /**
     * Test of findManager method, of class login.
     */
    @Test
    public void testFindManager() {
        System.out.println("findManager");
        String username = "";
        login instance = new login();
        ProductManager expResult = null;
        ProductManager result = instance.findManager(username);
        assertEquals(expResult, result);
    }
    /**
     * Test of getA method, of class login.
     */
    @Test
    public void testGetA() {
        System.out.println("getA");
        login instance = new login();
        instance.setA(0);
        int expResult = 0;
        int result = instance.getA();
        assertEquals(expResult, result);
    }

    /**
     * Test of setA method, of class login.
     */
    @Test
    public void testSetA() {
        System.out.println("setA");
        int a = 0;
        login instance = new login();
        instance.setA(a);
    }

    /**
     * Test of getPeArray method, of class login.
     */
    @Test
    public void testGetPeArray() {
        System.out.println("getPeArray");
        login instance = new login();
        ArrayList<ProcessEngineer> expResult = new ArrayList<ProcessEngineer>();
        ArrayList<ProcessEngineer> result = instance.getPeArray();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPeArray method, of class login.
     */
    @Test
    public void testSetPeArray() {
        System.out.println("setPeArray");
        ArrayList<ProcessEngineer> peArray = null;
        login instance = new login();
        instance.setPeArray(peArray);
    }

    /**
     * Test of getPmArray method, of class login.
     */
    @Test
    public void testGetPmArray() {
        System.out.println("getPmArray");
        login instance = new login();
        ArrayList<ProductManager> expResult = new ArrayList<ProductManager>();
        ArrayList<ProductManager> result = instance.getPmArray();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPmArray method, of class login.
     */
    @Test
    public void testSetPmArray() {
        System.out.println("setPmArray");
        ArrayList<ProductManager> pmArray = null;
        login instance = new login();
        instance.setPmArray(pmArray);
    }

    /**
     * Test of getWorkopArray method, of class login.
     */
    @Test
    public void testGetWorkopArray() {
        System.out.println("getWorkopArray");
        login instance = new login();
        ArrayList<WorkOP> expResult = new ArrayList<WorkOP>();
        ArrayList<WorkOP> result = instance.getWorkopArray();
        assertEquals(expResult, result);
    }

    /**
     * Test of setWorkopArray method, of class login.
     */
    @Test
    public void testSetWorkopArray() {
        System.out.println("setWorkopArray");
        ArrayList<WorkOP> workopArray = null;
        login instance = new login();
        instance.setWorkopArray(workopArray);
    }
    
}
