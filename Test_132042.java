/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Test_132042;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import si_junit.SI_JUNIT;

/**
 *
 * @author 132042
 */
public class SI_JUNITTest {
    
    public SI_JUNITTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of BubbleSort method, of class SI_JUNIT.
     */
    @Test
    public void testBubbleSort() {
        System.out.println("BubbleSort");
        int[] num = {4, 1, 3};
        SI_JUNIT instance = new SI_JUNIT();
        int[] expResult = {1, 3, 4};
        int[] result = instance.BubbleSort(num);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eParenTricifren method, of class SI_JUNIT.
     */
    @Test
    public void testEParenTricifren() {
        System.out.println("eParenTricifren");
        int number = 202;
        SI_JUNIT instance = new SI_JUNIT();
        boolean expResult = true;
        boolean result = instance.eParenTricifren(number);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}