/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import testarjunit.MyMath2;

/**
 *
 * @author Samme
 */
public class MyMath2Test {
    
    public MyMath2Test() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of convertToFarenheit method, of class MyMath2.
     */
    @Test
    public void testConvertToFarenheit() {
        System.out.println("convertToFarenheit");
        double c = 0.0;
        MyMath2 instance = new MyMath2();
        double expResult = 0.0;
        double result = instance.convertToFarenheit(c);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class MyMath2.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        int a = 0;
        int b = 0;
        MyMath2 instance = new MyMath2();
        int expResult = 0;
        int result = instance.compareTo(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
