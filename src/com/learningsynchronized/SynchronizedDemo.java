package com.learningsynchronized;

class Display 
{
	public synchronized void wish(String name) //synchronized keyword //wish method
	{
		for (int i=0; i<5; i++)
		{
			System.out.print("Have a Good Day:");//'print' method prints the string but does not move the cursor to a new line,-
		                                         //-while the 'println' method prints the string and moves the cursor to a new line
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{		
		}
		System.out.println(name);
		}
	}
}
class MyThread8 extends Thread
{
	Display d;
	String name;
	MyThread8(Display d, String name)
	{
		this.d = d;
		this.name = name;
	}
	public void run()
	{
		d.wish(name);
	}
}
class SynchronizedDemo 
{
	public static void main(String[]args)
	{
		Display d = new Display(); //Display object created
		MyThread8 t1 = new MyThread8(d,"Dhoni");
		MyThread8 t2 = new MyThread8(d,"Virat");
		MyThread8 t3 = new MyThread8(d,"Sachin");
		t1.start();
		t2.start();
		t3.start();
	}
}

/*
 * If we declare this method as synchronized then at a time only one method is allowed to execute 'wish' method and given 'Display' object.
 * hence we will get regular output.
 * durga vid no. 84
 */
