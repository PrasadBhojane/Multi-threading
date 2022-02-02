package com.preventthreadexecution;

class MyThread6 extends Thread
{
	public void run()
	{
		for(int i=0; i<10; i++) //for loop
		{
			System.out.println("Child Method");
			try
			{
				Thread.sleep(2000); //(2000 millisecond) // child thread is sleeping for few time i.e.2000ms
			}
			catch(InterruptedException e)
			{				
			}
		}
	}
}

public class ThreadJoinDemo
{
	public static void main(String[]args)throws InterruptedException //instead of throws keyword we can surround join() by try catch
	{
		MyThread6 t = new MyThread6();
		t.start();
		t.join(); //main thread calls join() on child thread object, hence main thread has to wait until child thread completion //or -  t.join(10000)
		for(int i=0; i<10; i++) //for loop
		{
			System.out.println("Main Method");
		}
	}
}
/**
 * Preventing Thread execution by using 'join()' method.
 * durga vid no. 82
 */
