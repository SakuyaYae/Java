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
import testarjunit.MyMath;

/**
 *
 * @author Samme
 */
public class MyMathTest {
    
    public MyMathTest() {
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
     * Test of add method, of class MyMath.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        String a = "";
        String b = "";
        MyMath instance = new MyMath();
        int expResult = 0;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEqual method, of class MyMath.
     */
    @Test
    public void testIsEqual() {
        System.out.println("isEqual");
        int a = 0;
        int b = 0;
        MyMath instance = new MyMath();
        boolean expResult = false;
        boolean result = instance.isEqual(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of difference method, of class MyMath.
     */
    @Test
    public void testDifference_int_int() {
        System.out.println("difference");
        int a = 0;
        int b = 0;
        MyMath instance = new MyMath();
        int expResult = 0;
        int result = instance.difference(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of difference method, of class MyMath.
     */
    @Test
    public void testDifference_String_String() {
        System.out.println("difference");
        String a = "";
        String b = "";
        MyMath instance = new MyMath();
        int expResult = 0;
        int result = instance.difference(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
