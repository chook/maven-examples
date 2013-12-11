package com.sparktale.sample;

public class HelloWorld
{
	int nonce2 = 1;
	
	public int get1()
	{
		return 1;
	}
	
	public int boom()
	{
		int x = get1();
		
		try
		{
			if (x / (x-1) > 0)
			{
				return 0;
			}
		}
		catch (Exception e)
		{
			System.err.println(e.getMessage());
		}
		
		return x;
	}
}
