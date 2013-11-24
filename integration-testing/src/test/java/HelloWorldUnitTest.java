import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.sparktale.sample.HelloWorld;

public class HelloWorldUnitTest
{
	HelloWorld hw;
	
	@Before
	public void init()
	{
		hw = new HelloWorld();
	}
	
	@Test
	public void testGet1()
	{
		assertEquals(1, hw.get1());
	}
	
	@Test
	public void testGet1_2()
	{
		try
		{
			Thread.sleep(5000);
		}
		catch (Exception e)
		{
			
		}
		
		assertTrue(hw.get1() > 0);
	}
}
