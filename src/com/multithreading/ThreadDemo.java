package com.multithreading;

class MyThread extends Thread                       // {
{
	public void run()                               // run method
	{
		for (int i = 0; i<10; i++) //Job of thread  //  
		{
			System.out.println("Child Thread");    // Executed by child thread. 
		}
	}                                              //
}                                                  // } DEFINES A THREAD

public class ThreadDemo 
{
	public static void main (String[]args)
	{
		MyThread t = new MyThread(); //Thread Instantiation
		
		t.start(); //Starting of a new thread, which is responsible to execute run()
		
		for (int i = 0; i < 10; i++)
		{
			System.out.println("MainThread"); //Executed by main thread.
		}
	}
}
/**
 * Multithreading
 * durga vid no. 79
 * In multithreading we can't expect exact order execution and exact output each time.
 * That's why Multithreading is only used where each task is a separate independent part of the program.
 */
