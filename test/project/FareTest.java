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
public class FareTest {
    
    public FareTest() {
    }
    
    /**
     * Test of calcfare method, of class Fare.
     */
    @Test
    public void testCalcfare() {
        System.out.println("calcfare");
        double amount = 10.0;
        CalcAdultFare f = new CalcAdultFare();
        Fare instance = new Fare(f);
        double expResult = 10.0;
        double result = instance.calcfare(amount);
        assertEquals(expResult, result, 10.0);

    }
    
}
