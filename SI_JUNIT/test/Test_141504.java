import java.util.NoSuchElementException;
import org.junit.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import si_junit.SI_JUNIT;

   
public class Test_141504 {
    
    @BeforeClass
    public void setUpClass() {
        System.out.println("Start Tests!");
    }
    
    @AfterClass
    public void tearDownClass() {
        System.out.println("Tests done!");
    }
    
    @Before
    public void setUp() {
        System.out.println("Starting tests...");
    }
    
    @After
    public void tearDown() {
        System.out.println("Finished...");
    }
    
    @Test
    public void eParenTricifrenTest() {
        SI_JUNIT sj = new SI_JUNIT();
        Assert.assertEquals(false, sj.eParenTricifren(1));
        Assert.assertEquals(false, sj.eParenTricifren(99));
        Assert.assertEquals(false, sj.eParenTricifren(111));
        Assert.assertEquals(false, sj.eParenTricifren(0));
        Assert.assertEquals(false, sj.eParenTricifren(22));
        Assert.assertEquals(false, sj.eParenTricifren(-110));
        Assert.assertEquals(false, sj.eParenTricifren(1000));
        Assert.assertEquals(false, sj.eParenTricifren(5400));
        Assert.assertEquals(false, sj.eParenTricifren(2882));
        Assert.assertEquals(true, sj.eParenTricifren(102));
        Assert.assertEquals(true, sj.eParenTricifren(564));
        Assert.assertEquals(false, sj.eParenTricifren(368));
    }
    
    @Test
    public void BubbleSortTest() {
        SI_JUNIT sj = new SI_JUNIT();
        int [] a = {1, 2, 3};
        int [] b = {3, 2, 1};
        int [] c = {2, 3, 1};
        int [] d = {2, 1, 3};
        int [] e = {3, 1, 2};
        int [] f = {1, 3, 2};
        Assert.assertArrayEquals(a, sj.BubbleSort(a));
        Assert.assertArrayEquals(a, sj.BubbleSort(b));
        Assert.assertArrayEquals(a, sj.BubbleSort(c));
        Assert.assertArrayEquals(a, sj.BubbleSort(d));
        Assert.assertArrayEquals(a, sj.BubbleSort(e));
        Assert.assertArrayEquals(a, sj.BubbleSort(f));
    }
    
    @Test (expected = NoSuchElementException.class)
    public void BubbleSortExceptionTest() {
        SI_JUNIT sj = new SI_JUNIT();
        sj.BubbleSort(null);
    }
    
}