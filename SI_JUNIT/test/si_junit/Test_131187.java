/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package si_junit;

import java.util.NoSuchElementException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 131187
 */
public class Test_131187 {
    
    public Test_131187() {
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
    @Test(expected = NoSuchElementException.class)
    public void testBubbleSort() {
        System.out.println("---BubbleSort---");
        int[] num = null;
        SI_JUNIT instance = new SI_JUNIT();
        int[] expResult = new int[5];
        int[] result = instance.BubbleSort(num);
        
        try {
            assertArrayEquals(expResult, result);
        } catch(NoSuchElementException e) {
            System.out.println("NoSuchElementException caught!");
        }
        
        num = new int[5];
        
        num[0] = 4;
        num[1] = 10;
        num[2] = 1;
        num[3] = 14;
        num[4] = 7;
        expResult[0] = 1;
        expResult[1] = 4;
        expResult[2] = 7;
        expResult[3] = 10;
        expResult[4] = 14;
        result = instance.BubbleSort(num);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of eParenTricifren method, of class SI_JUNIT.
     */
    @Test
    public void testEParenTricifren() {
        System.out.println("---eParenTricifren---");
        int number = 0;
        SI_JUNIT instance = new SI_JUNIT();
        boolean expResult = false;
        boolean result = instance.eParenTricifren(number);
        assertEquals(expResult, result);
        
        number = 312;
        expResult = true;
        result = instance.eParenTricifren(number);
        assertEquals(expResult, result);
        
        number = 111;
        result = instance.eParenTricifren(number);
        assertFalse(result);
        
        number = 112;
        result = instance.eParenTricifren(number);
        assertTrue(result);
    }
}