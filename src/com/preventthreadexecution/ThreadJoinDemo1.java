package com.preventthreadexecution;

class MyThread extends Thread
{
	static Thread mt;
	public void run()
	{
		try
		{
			mt.join(); //child thread calls join method on main thread object.
		}
		catch(InterruptedException e)
		{
			
		}
		for (int i=0; i<10; i++) // for loop
		{
			System.out.println("Child Thread");
		}
	}
}

public class ThreadJoinDemo1 
{
	public static void main(String[]args)throws InterruptedException
	{ 
		MyThread.mt = Thread.currentThread(); //mt assigned with the 'main thread' i.e. Thread.currentThread.
		MyThread t = new MyThread(); //starting of child thread
		t.start();
		for (int i=0; i<10; i++) //for loop
		{
			System.out.println("Main Thread");
			Thread.sleep(1000);
		}
	}
}
/**
 * waiting of child thread until completing main thread.
 * durga vid no. 83
 */
