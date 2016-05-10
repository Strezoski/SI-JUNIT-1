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
 * @author 138007
 */
public class Test_138007Test {
    
    public Test_138007Test() {
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
        //int[] expResult = null;
        //int[] result = instance.BubbleSort(num);
        int[] a = {1,2,3,4};
        int[] b = {2,1,4,3};
        
        assertArrayEquals(a, instance.BubbleSort(b));
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eParenTricifren method, of class SI_JUNIT.
     */
    @Test
    public void testEParenTricifren() {
        System.out.println("eParenTricifren");
        int number = 0;
        SI_JUNIT instance = new SI_JUNIT();
        boolean expResult = false;
        boolean result = instance.eParenTricifren(number);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}