/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package si_junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 131174
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
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of BubbleSort method, of class SI_JUNIT.
     */
    @Test
    public void testBubbleSort() {
        System.out.println("BubbleSort");
        int[] num = null;
        SI_JUNIT instance = new SI_JUNIT();
        int[] expResult = {1,2,3,4};
        int[] niza = {3,4,1,2};
        int[] result = instance.BubbleSort(niza);
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
        int number = 0;
        SI_JUNIT instance = new SI_JUNIT();
        boolean expResult = true;
        boolean result = instance.eParenTricifren(568);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}