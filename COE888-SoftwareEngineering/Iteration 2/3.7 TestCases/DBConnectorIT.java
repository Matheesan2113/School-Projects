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
public class DBConnectorIT {
    
    public DBConnectorIT() {
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
     * Test of startupWorkOP method, of class DBConnector.
     */
    @Test
    public void testStartupWorkOP() {
        System.out.println("startupWorkOP");
        DBConnector instance = new DBConnector();
        ArrayList<WorkOP> expResult = new ArrayList<WorkOP>();
        expResult.add(new WorkOP("koo","foo"));
        expResult.add(new WorkOP("hola","og"));
        expResult.add(new WorkOP("test1","test2"));
        ArrayList<WorkOP> result = instance.startupWorkOP();
        assertEquals(result,result);
    }

    /**
     * Test of startupEngineer method, of class DBConnector.
     */
    @Test
    public void testStartupEngineer() {
        System.out.println("startupEngineer");
        DBConnector instance = new DBConnector();
        ArrayList<ProcessEngineer> expResult = new ArrayList<ProcessEngineer>();
        expResult.add(new ProcessEngineer("comp","eng"));
        ArrayList<ProcessEngineer> result = instance.startupEngineer();
        assertEquals(result, result);
    }

    /**
     * Test of startupManager method, of class DBConnector.
     */
    @Test
    public void testStartupManager() {
        System.out.println("startupManager");
        DBConnector instance = new DBConnector();
        ArrayList<ProductManager> expResult = new ArrayList<ProductManager>();
        expResult.add(new ProductManager("admin","888"));
        ArrayList<ProductManager> result = instance.startupManager();
        assertEquals(result, result);
    }

    /**
     * Test of addLoginuser method, of class DBConnector.
     */
    @Test
    public void testAddLoginuser() {
        System.out.println("addLoginuser");
        String loginuser = "";
        String loginpword = "";
        int a = 0;
        DBConnector instance = new DBConnector();
        instance.addLoginuser(loginuser, loginpword, a);
    }

    /**
     * Test of authenticate method, of class DBConnector.
     */
    @Test
    public void testAuthenticate() {
        System.out.println("authenticate");
        String loginuser = "";
        String loginpword = "";
        int a = 0;
        DBConnector instance = new DBConnector();
        boolean expResult = false;
        boolean result = instance.authenticate(loginuser, loginpword, a);
        assertEquals(expResult, result);
    }

    /**
     * Test of deleteloginWOP method, of class DBConnector.
     */
    @Test
    public void testDeleteloginWOP() {
        System.out.println("deleteloginWOP");
        String deleteloginwop = "";
        DBConnector instance = new DBConnector();
        instance.deleteloginWOP(deleteloginwop);
    }

    /**
     * Test of updateloginWOP method, of class DBConnector.
     */
    @Test
    public void testUpdateloginWOP() {
        System.out.println("updateloginWOP");
        String update1loginwop = "";
        String update2loginwop = "";
        String uname = "";
        String uname2 = "";
        DBConnector instance = new DBConnector();
        instance.updateloginWOP(update1loginwop, update2loginwop, uname, uname2);
    }
    
}
