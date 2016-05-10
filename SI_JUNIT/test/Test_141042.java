import java.util.Arrays;
import java.util.NoSuchElementException;

import junit.framework.TestCase;
/*
 * Методите ги направив статички
*/
public class SI_JUNITTest extends TestCase 
{
	public void testBubbleSortException()
	{
		try
		{
			SI_JUNIT.BubbleSort(null);
		}
		catch(NoSuchElementException ex)
		{
			assertEquals(true, true);
		}
	}
	
	public void testBubbleSort()
	{
		int [] expected = {1, 2, 3};
		int [] toSort = {2, 3, 1};
		
		toSort = SI_JUNIT.BubbleSort(toSort);
		
		boolean areEqual = Arrays.equals(expected, toSort);
		assertEquals(true, areEqual);
	}
	
	public void testIsParenTricifren()
	{
		assertEquals(SI_JUNIT.eParenTricifren(100), true);
		assertEquals(SI_JUNIT.eParenTricifren(501), false);
		assertEquals(SI_JUNIT.eParenTricifren(5000), false);
	}
}