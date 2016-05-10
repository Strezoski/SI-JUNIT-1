/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package si_junit;

import java.util.NoSuchElementException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 143010
 */
public class Test_143010 {
    
    public Test_143010() {
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
    @Test(expected = NoSuchElementException.class)
    public void testBubbleSort() {
        System.out.println("BubbleSort");
        int[] num = null;
        SI_JUNIT instance = new SI_JUNIT();
        int[] expResult = null;
        int[] result = instance.BubbleSort(num);
        assertArrayEquals(expResult, result);
        
        int[] num1 = {5, 2, 3};
        int[] expResult1 = {2, 3, 5};
	int[] result1 = instance.BubbleSort(num1);
        assertArrayEquals(expResult1, result1);
        
        int[] num2 = {0};
        int[] expResult12= {0};
	int[] result2 = instance.BubbleSort(num2);
        assertArrayEquals(expResult12, result2);
        
         int[] num3 = {0, 0};
        int[] expResult3= {0, 0};
	int[] result3 = instance.BubbleSort(num3);
        assertArrayEquals(expResult3, result3);
        
         int[] num4 = {2, 5, 6, 89, 34, 5};
        int[] expResult4= {2, 5, 5, 6, 34, 89};
	int[] result4 = instance.BubbleSort(num4);
        assertArrayEquals(expResult4, result4);
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
        //boolean expResult = false;
        //boolean result = instance.eParenTricifren(number);
        //assertEquals(expResult, result);
        
        assertFalse(instance.eParenTricifren(number));
	number = -5;
	assertFalse(instance.eParenTricifren(number));
	number = 5;
	assertFalse(instance.eParenTricifren(number));
	number = 99;
	assertFalse(instance.eParenTricifren(number));
	number = 1000;
	assertFalse(instance.eParenTricifren(number));
	number = 100;
	assertTrue(instance.eParenTricifren(number));
	number = 999;
	assertFalse(instance.eParenTricifren(number));
        number = 12386;
	assertFalse(instance.eParenTricifren(number));
		
	number = 235;
	assertFalse(instance.eParenTricifren(number));
	number = 1500;
	assertFalse(instance.eParenTricifren(number));
	number = 120;
	assertTrue(instance.eParenTricifren(number));
        number = 168;
	assertTrue(instance.eParenTricifren(number));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
