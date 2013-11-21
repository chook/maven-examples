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
    	try
    	{
    		Thread.sleep(10000);
    	}
    	catch (Exception e)
    	{
    		
    	}
    	
    	HelloWorld.get1();
    	
    	assertTrue(true);
    }
}
