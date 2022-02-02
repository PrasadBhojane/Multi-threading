package com.preventthreadexecution;

class MyThread7 extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0; i<10; i++)
			{
				System.out.println("I am lazy Thread");
				Thread.sleep(1500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("I got interrupted");
		}
	}
}

public class SleepThreadInterruptDemo 
{
	public static void main(String[]args)
	{
		MyThread7 t = new MyThread7();
		t.start();
		t.interrupt();  //Interrupt method - main thread interrupt child thread.
		//System.out.println("End of Main Thread");
	}
}
/**
 * durga vid no. 83
 * by using interrupt() a thread can interrupt another sleeping or waiting thread.
 */
