import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

import org.junit.Test;

import com.sparktale.sample.HelloWorld;

public class HelloWorldUnitTest
{
	@Test
	public void testGet1()
	{
		assertEquals(1, HelloWorld.get1());
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
		assertTrue(HelloWorld.get1() > 0);
	}
}
