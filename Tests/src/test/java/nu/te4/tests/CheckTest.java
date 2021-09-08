/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Samme
 */
public class CheckTest {
    
    public CheckTest() {
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
     * Test of IsPalindrome method, of class Check.
     */
    @Test
    public void testIsPalindrome() {
        System.out.println("IsPalindrome");
        String input = "sax";
        Check instance = new Check();
        boolean expResult = false;
        boolean result = instance.IsPalindrome(input);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testNull(){
        System.out.println("IsNull");
        Check check = new Check();
        assertThrows(IllegalArgumentException.class, ()->{check.IsPalindrome(null)});
    
    }
}
