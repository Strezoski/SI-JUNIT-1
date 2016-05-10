/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import si_junit.SI_JUNIT;

/**
 *
 * @author 143026
 */
public class Test_143026_Test {
    
    public Test_143026_Test() {
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
        int[] num = {9,6,3};
        SI_JUNIT instance = new SI_JUNIT();
        int[] expResult = {3,6,9};
        int[] result = instance.BubbleSort(num);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of eParenTricifren method, of class SI_JUNIT.
     */
    @Test
    public void testEParenTricifren() {
        System.out.println("eParenTricifren");
        assertEquals(true, SI_JUNIT.eParenTricifren(102));
        
        assertTrue(SI_JUNIT.eParenTricifren(204));
        assertTrue(SI_JUNIT.eParenTricifren(506));
        
        assertFalse(SI_JUNIT.eParenTricifren(503));
        assertFalse(SI_JUNIT.eParenTricifren(767));
        
    }
}