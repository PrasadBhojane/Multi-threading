package com.interthreadcommunication;

public class ThreadA
{
	public static void main(String[]args) throws Exception //to avoid RE: IllegalMonitorStateException
	{
		ThreadB b= new ThreadB();
		b.start(); // after this line there are 2 threads, i.e. main and child thread.
		synchronized(b)
		{
			System.out.println("Main thread trying to call wait() method");
			b.wait(); //wait(), notify(), notifyall() method can be called only from synchronized area.
			System.out.println("Main thread got notification");
			System.out.println(b.total);
		}
	}
}
class ThreadB extends Thread
{
	int total = 0;
	public void run() //run() method
	{
		synchronized(this)
		{
			System.out.println("Child thread starts calculation..");
			for(int i = 1; i<=100; i++) // for loop
			{
				total = total+i; //((n*(n+1))/2)=((100*(100+1))/2)=5050
				//The sum of numbers 1 to 100 is 5050
			}
			System.out.println("Child thread trying to give notification..");
			this.notify(); //wait(), notify(), notifyall() method can be called only from synchronized area.
		}
	}
}
/**
 * durga vid no. 88
 */
