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
import nu.te4.tests.MyMath2;
import org.junit.Rule;
import org.junit.rules.ExpectedException;


/**
 *
 * @author Samme
 */
public class MyMath2Test {
    @Rule
    public ExpectedException exception = ExpectedException.none();
    public MyMath2Test() {
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
     * Test of convertToFarenheit method, of class MyMath2.
     */
    @Test
    public void testConvertToFarenheit() {
        System.out.println("convertToFarenheit");
        double c = 10.0;
        MyMath2 instance = new MyMath2();
        double expResult = 50.0;
        double result = instance.convertToFarenheit(c);
        assertEquals(expResult, result, 0.0);
    }
    
   @Test
    public void testError(){
            System.out.println("add exceptions");
        exception.expect(NumberFormatException.class);
        exception.expectMessage("Du måste ha siffror");
        MyMath2 instance = new MyMath2();
        instance.convertToFarenheit(280.0);
    
    }
    /**
     * Test of compareTo method, of class MyMath2.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        int a = 44;
        int b = 0;
        MyMath2 instance = new MyMath2();
        int expResult = 1;
        int result = instance.compareTo(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCompareTo_alt() {
        System.out.println("compareTo");
        int a = 0;
        int b = 0;
        MyMath2 instance = new MyMath2();
        int expResult = 0;
        int result = instance.compareTo(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCompareTo_alternet() {
        System.out.println("compareTo");
        int a = 0;
        int b = 4;
        MyMath2 instance = new MyMath2();
        int expResult = -1;
        int result = instance.compareTo(a, b);
        assertEquals(expResult, result);
    }
}