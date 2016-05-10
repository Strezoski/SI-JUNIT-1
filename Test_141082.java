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
public class Test_141082 {
    
    SI_JUNIT test;
    public Test_141082() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        test = new SI_JUNIT();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of BubbleSort method, of class SI_JUNIT.
     */
    @Test()
    public void testBubbleSort() {
        try{
            int[] array = null;
            test.BubbleSort(array);
            assertEquals(new int[] {1,2,3}, test.BubbleSort(new int[]{1,3,2}));
            assertEquals(new int[] {}, test.BubbleSort(new int[]{}));
            assertEquals(new int[] {0,0,0}, test.BubbleSort(new int[]{0,0,0}));
            assertEquals(new int[] {5,6,7}, test.BubbleSort(new int[]{5,6,7}));
            assertEquals(new int[] {1}, test.BubbleSort(new int[]{1}));
            fail("Expected NoSuchElementException exception");
        }catch(NoSuchElementException ex){
            
        }
    }

    /**
     * Test of eParenTricifren method, of class SI_JUNIT.
     */
    @Test()
    public void testEParenTricifren() {
       
        assertFalse(test.eParenTricifren(1000));
        assertFalse(test.eParenTricifren(99));
        assertTrue(test.eParenTricifren(106));
        assertFalse(test.eParenTricifren(10));
        assertFalse(test.eParenTricifren(-511)); 
        assertTrue(test.eParenTricifren(-212));
        assertFalse(test.eParenTricifren('a'));
    }
}