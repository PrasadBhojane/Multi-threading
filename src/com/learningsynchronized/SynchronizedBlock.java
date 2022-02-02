package com.learningsynchronized;

class Display3
{
	public void wish(String name)
	{
		;;;;//1 lakh lines of code
		synchronized (this) //synchronized block - object level synchronization
		{
			for (int i=0; i<10; i++)
			{
				System.out.print("Good Morning:");
				try
				{
					Thread.sleep(1000);
				}
				catch(InterruptedException e) {}
				System.out.println(name);
			}
		}
		;;;;//1 lakh lines of code
	}
}
class MyThread11 extends Thread
{
	Display3 d;
	String name;
	MyThread11(Display3 d, String name)
	{
		this.d = d;
		this.name = name;
	}
	public void run()
	{
		d.wish(name);
	}
}
public class SynchronizedBlock 
{
	public static void main(String[]args)
	{
		Display3 d = new Display3();
		MyThread11 t1 = new MyThread11(d,"Prasad");
		MyThread11 t2 = new MyThread11(d,"Chinmay");
		t1.start();
		t2.start();
	}
}
/**
 * object level synchronization block
 * durga vid no. 86
 */
