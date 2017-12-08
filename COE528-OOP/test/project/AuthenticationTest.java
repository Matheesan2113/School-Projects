/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class AuthenticationTest {
    
    public AuthenticationTest() {
    }
    

    /**
     * Test of login method, of class Authentication.
     */
    @Test
    public void testLogin() throws Exception {
        System.out.println("login");
        File file = new File("./logindata.txt");
        String user = "admin";
        String pass = "admin";
        Authentication instance = new Authentication (file);
        instance.Write2Text(instance.getBw(), "admin", "admin");
        boolean expResult = true;
        boolean result = instance.login(user, pass);
        assertEquals(expResult, result);
    }

    /**
     * Test of Write2Text method, of class Authentication.
     */
    @Test
    public void testWrite2Text() {
        System.out.println("Write2Text");        
        File file = new File("./logindata.txt");
        String user = "admin";
        String pass = "admin";
        Authentication instance = new Authentication (file);
        instance.Write2Text(instance.getBw(), "admin", "admin");
        boolean expResult = true;
        boolean result=false;
        try {
            result = instance.login(user, pass);
        } catch (IOException ex) {
            Logger.getLogger(AuthenticationTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult, result);
    }

    /**
     * Test of getBw method, of class Authentication.
     */
    @Test
    public void testGetBw() {
        System.out.println("getBw");
        File file = new File("./logindata.txt");
        Authentication instance = new Authentication (file);
        BufferedWriter expResult = instance.bw;
        BufferedWriter result = instance.getBw();
        assertEquals(expResult, result);
    }
    
}
