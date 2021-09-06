/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testarjunit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 *
 * @author Elev
 */
public class MyMathTest {
    @Rule
    public ExpectedException exception = ExpectedException.none();
    
    public MyMathTest() {
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
     * Test of add method, of class MyMath.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        String a = "12";
        String b = "12";
        MyMath instance = new MyMath();
        int expResult = 24;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testAdd_Exception(){
        System.out.println("add exceptions");
        exception.expect(NumberFormatException.class);
        exception.expectMessage("Du måste ha siffror");
        String a = "fyra";
        String b = "noll";
        MyMath instance = new MyMath();
        instance.add(a, b);
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
        boolean expResult = true;
        boolean result = instance.isEqual(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of difference method, of class MyMath.
     */
    @Test
    public void testDifference_int_int() {
        System.out.println("difference");
        int a = 2;
        int b = 4;
        MyMath instance = new MyMath();
        int expResult = 2;
        int result = instance.difference(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of difference method, of class MyMath.
     */
    @Test
    public void testDifference_String_String() {
        System.out.println("difference");
        String a = "4";
        String b = "2";
        MyMath instance = new MyMath();
        int expResult = 2;
        int result = instance.difference(a, b);
        assertEquals(expResult, result);
    }
    
}
