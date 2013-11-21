import static junit.framework.Assert.assertTrue;

import org.junit.Test;

import com.sparktale.sample.HelloWorld;

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
    	for (int i=0; i< 10; i++)
    	{
	    	try
	    	{
	    		Thread.sleep(10000);
	    	}
	    	catch (Exception e)
	    	{
	    		
	    	}
	    	
	    	HelloWorld.get1();
    	}
    	
    	assertTrue(true);
    }
}
