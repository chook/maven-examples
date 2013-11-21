package com.sparktale.sample;

public class HelloWorld
{
	public static void main(String[] args)
	{
		get1();
	}
	
	public static int get1()
	{
		System.out.println("Jenkins env:" + System.getenv("JOB_NAME"));
		
		return 1;
	}
}
