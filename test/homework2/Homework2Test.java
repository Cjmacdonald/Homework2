
package Homework2;

import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author camma
 */
public class Homework2Test {
    
    public Homework2Test() {
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
     * Test of Input method, of class Homework2.
     */
    @Test
    public void testGetNumbs_Scanner() {
        Homework2 app = new Homework2();
        Scanner in = new Scanner("11 15");
        int[] terms = new int[2];

        terms = app.GetNumbs(in);
        assertEquals(terms[0], 11);
        assertEquals(terms[1], 15);
    }
    
    @Test
    public void testCheckRange() {
        Homework2 app = new Homework2();
        assertEquals(false,app.checkRange(-1001));
        assertEquals(true,app.checkRange(-1000));
        assertEquals(true,app.checkRange(1000));
        assertEquals(false,app.checkRange(1001));
        assertEquals(true,app.checkRange(100));
    }  
    
    @Test
    public void testIsLess() {
        Homework2 app = new Homework2();
        assertEquals(false,app.isLess(4, 3));
        assertEquals(true,app.isLess(11, 15));
    } 
    
    @Test
    public void testMaths()
    {
        Homework2 app = new Homework2();
        int r1, r2, s;
        r1 = 4;
        s = 3;
        r2 = 2;
        
        assertEquals(r2, app.maths(r1, s));
       
    }
}
