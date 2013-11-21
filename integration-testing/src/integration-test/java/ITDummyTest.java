import org.junit.Test;

import static junit.framework.Assert.assertTrue;

/**
 * @author Petri Kainulainen
 */
public class ITDummyTest {

    @Test
    public void dummyTest() {
        assertTrue(true);
    }
    
    @Test
    public void longTest2() {
    	try
    	{
    		Thread.sleep(10000);
    	}
    	catch (Exception e)
    	{
    		
    	}
    	
    	assertTrue(true);
    }
}
