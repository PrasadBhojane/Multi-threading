package com.multithreading;

class MyRunnable implements Runnable // defining a thread by implementing 'Runnable Interface'
{
	public void run()
	{
		for (int i = 0; i<10; i++);
		{
			System.out.println("Child Thread"); // executed by child thread
		}
	}
}

public class ThreadDemo2 
{
	public static void main(String[]args)
	{
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r); // '(r)' to target runnable
		t.start();
		for (int i = 0; i<10; i++);
		{
			System.out.println("Main Thread"); // Executed by main thread
		}
	}
}

/**
 * we wont get exact output
 * durga vid no.80
 */
