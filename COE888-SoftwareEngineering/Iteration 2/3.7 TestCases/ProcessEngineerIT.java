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
public class ProcessEngineerIT {
    
    public ProcessEngineerIT() {
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
     * Test of createworkop method, of class ProcessEngineer.
     */
    @Test
    public void testCreateworkop() {
        System.out.println("createworkop");
        String uname = "bob";
        String pword = "bob";
        DBConnector a = new DBConnector();
        ArrayList<WorkOP> workop = a.startupWorkOP();
        ProcessEngineer instance = new ProcessEngineer("ele","639");
        ArrayList<WorkOP> expResult = workop;
        expResult.add(new WorkOP(uname, pword));
        ArrayList<WorkOP> result = instance.createworkop(uname, pword, workop, a);
        assertEquals(expResult, result);
    }

    /**
     * Test of deleteworkop method, of class ProcessEngineer.
     */
    @Test
    public void testDeleteworkop() {
        System.out.println("deleteworkop");
        String uname = "hola";
        DBConnector a = new DBConnector();
        ArrayList<WorkOP> workop = a.startupWorkOP();       
        ProcessEngineer instance = new ProcessEngineer("ele","639");
        ArrayList<WorkOP> expResult = workop;
        for (int y = 0; y < expResult.size(); y++) {
            if (expResult.get(y).getUname().equalsIgnoreCase(uname)) {
                expResult.remove(y);
            }
        ArrayList<WorkOP> result = instance.deleteworkop(uname, workop, a);
        assertEquals(expResult, result);
    }
    }
    
}
