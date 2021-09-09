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
        String input = "sas";
        Check instance = new Check();
        boolean expResult = true;
        boolean result = instance.IsPalindrome(input);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testNull(){
        System.out.println("IsNull");
        Check check = new Check();
        assertThrows(IllegalArgumentException.class, ()->{
            check.IsPalindrome(null);
                    });
    
    }
    
    
    @Test
    public void testNotPalindrome(){
        System.out.println("IsNull");
        Check check = new Check();
        assertEquals(check.IsPalindrome("NOT"), false);
    }

    /**
     * Test of isPrimeNumber method, of class Check.
     */
    @Test
    public void testIsPrimeNumber() {
        System.out.println("isPrimeNumber");
        Check instance = new Check();
        assertEquals(instance.isPrimeNumber(3), true);
        
    }
    
    @Test
    public void testNotPrimeNumber(){
        System.out.println("IsNull");
        Check check = new Check();
        assertEquals(check.isPrimeNumber(8), false);
    }
    @Test
    public void testOOR(){
        System.out.println("IsOOR");
        Check check = new Check();
        assertThrows(IllegalArgumentException.class, ()->{
            check.isPrimeNumber(-1);
                    });
    
    }
}
