import static junit.framework.Assert.assertTrue;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import com.sparktale.sample.HelloWorld;

/**
 * @author Petri Kainulainen
 */
public class ITDummyTest {

	HelloWorld hw;
	
	@Before
	public void init() {
		hw = new HelloWorld();
	}
	
    @Test
    public void dummyTest() {
        assertTrue(true);
    }
    
    @Test
    public void longTest2() {
    	hw.boom();
    	
    	Random random = new Random();
    	
    	for (int i=0; i< 20; i++)
    	{
	    	try
	    	{
	    		Thread.sleep(10000);
	    	}
	    	catch (Exception e)
	    	{
	    		
	    	}
	    	
	    	if (random.nextBoolean())
	    	{
	    		hw.get1();
	    	}
	    	else
	    	{
	    		hw.boom();
	    	}
    	}
    	
    	assertTrue(true);
    }
}
