package com.learningsynchronized;

class Display4
{
	public void wish(String name)
	{
		;;;;//1 lakh lines of code
		synchronized (Display4.class) //synchronized block - class level lock
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
class MyThread12 extends Thread
{
	Display4 d;
	String name;
	MyThread12(Display4 d, String name)
	{
		this.d = d;
		this.name = name;
	}
	public void run()
	{
		d.wish(name);
	}
}
public class SynchronizedBlock2 
{
	public static void main(String[]args)
	{
		Display4 d1 = new Display4(); //1) d1 object
		Display4 d2 = new Display4(); //2) d2 object
		MyThread12 t1 = new MyThread12(d1,"Prasad..");
		MyThread12 t2 = new MyThread12(d2,"Chinmay..");
		t1.start();
		t2.start();
	}
}
/**
 * class level synchronization block
 * durga vid no. 86
 */
