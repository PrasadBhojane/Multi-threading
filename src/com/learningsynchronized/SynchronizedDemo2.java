package com.learningsynchronized;

class Display2
{
	public synchronized void displayA() //synchronized displayA() method
	{
		for (int i=0; i<10; i++)
		{
			System.out.print(i);
			try
			{
					Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				
			}
		}
	}
	public synchronized void displayB() //synchronized displayB() method
	{
		for (int i=65; i<=75; i++)
		{
			System.out.print((char)i);
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				
			}
		}
	}
}
class MyThread9 extends Thread
{
	Display2 d ;
	MyThread9(Display2 d)  //MyThread9 constructor
	{
		this.d = d;
	}
	public void run()
	{
		d.displayA();
	}
}
class MyThread10 extends Thread
{
	Display2 d ;
	MyThread10(Display2 d)  //MyThread10 constructor
	{
		this.d = d;
	}
	public void run()
	{
		d.displayB();
	}
}
public class SynchronizedDemo2 
{
	public static void main(String[]args)
	{
		Display2 d = new Display2();
		MyThread9 t1 = new MyThread9(d);
		MyThread10 t2 = new MyThread10(d);
		t1.start();
		t2.start();
	}
}
/**
 * Both methods executing on the same object simultaneously. 
 * Only one thread allowed to operate at a time.
 * durga vid no. 85
 */
