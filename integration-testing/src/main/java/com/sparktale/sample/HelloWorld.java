package com.sparktale.sample;

public class HelloWorld
{
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
			// nothing
		}
		
		return x;
	}
}
