package com.preventthreadexecution;

public class ThreadSleepDemo //SlideRrotator
{
	public static void main(String[]args)throws InterruptedException
	{
		for (int i= 0; i<5; i++) // for loop
		{
			System.out.println("Slide-"+i);
			Thread.sleep(2000);
		}
	}
}

/**
 * sleep() : If a thread don't want to perform any operation for a particular amount of time then we should go for sleep().
 * durga vid no. 83
 */