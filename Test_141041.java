import java.util.Arrays;

import junit.framework.TestCase;


/* 141041 Stojan Ilieski */

public class Test_141041 extends TestCase {
	SI_JUNIT instance;
	
	protected void setUp() throws Exception {
		instance = new SI_JUNIT();
	}
	
	//@Test
	public void eParenTricifren(){
		
		assertTrue(instance.eParenTricifren(106));
		
		assertFalse(instance.eParenTricifren(105));
		assertFalse(instance.eParenTricifren(98));
		assertFalse(instance.eParenTricifren(1006));
	}
	
	//@Test
	public void testBubble(){
		int[] actual = instance.BubbleSort(new int[] {3,2,1});
		int[] expected = new int[] {1,2,3};
		
		assertTrue(Arrays.equals(actual, expected));
		
		actual = instance.BubbleSort(new int[] {1,2,3});
		assertTrue(Arrays.equals(actual, expected));
		
		actual = instance.BubbleSort(new int[] {2,3,1});
		assertTrue(Arrays.equals(actual, expected));
		
		actual = instance.BubbleSort(new int[] {1,3,2});
		assertTrue(Arrays.equals(actual, expected));
	}
	
}
