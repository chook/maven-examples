import static junit.framework.Assert.assertTrue;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sparktale.sample.HelloWorld;

public class ITDummyTest
{
	private static int nonce9 = 2;
	
	private static Logger logger = LoggerFactory.getLogger(ITDummyTest.class);
	//	private static Logger logger = Logger.getLogger(ITDummyTest.class.getName());
	
	HelloWorld hw;
	
	@Before
	public void init()
	{
		hw = new HelloWorld();
	}
	
	@Test
	public void dummyTest()
	{
		assertTrue(true);
	}
	
	@Test
	public void longTest2()
	{
		hw.boom();
		
		Random random = new Random();
		
		for (int i = 0; i < 101; i++)
		{
			internalTest2(random);
		}
		
		assertTrue(true);
	}
	
	private void internalTest2(Random random)
	{
		System.out.println("it2");
		
		try
		{
			Thread.sleep(3002);
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
		
		if (random.nextBoolean())
		{
			logger.error("Severe message " + random.nextDouble());
		}
	}
}
