package com.preventthreadexecution;

class MyThread5 extends Thread
{
	public void run()
	{
		for (int i = 0; i<10; i++)
		{
			System.out.println("Child Thread");
			Thread.yield(); //due to yield() child thread will execute after main thread execution.
		}
	}
}

public class ThreadYieldDemo 
{
	public static void main(String[]args)
	{
		MyThread5 t = new MyThread5();
		t.start();
		for (int i = 0; i<10; i++)
		{
			System.out.println("Main Thread");
		}
	}
}
/**
 * If we comment '//' yield method then both threads will execute simultaneously and we cant expect which thread will complete first.
 * Preventing Thread execution by using 'yield()' method.
 * durga vid no. 82
 */
